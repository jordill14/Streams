import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise1 {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileInputStream in2 = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("fitxer1.txt");
			in2 = new FileInputStream("fitxer2.txt");
			File test = new File("sortida.txt");
			if (test.exists()) throw new Exception("Fitxer de sortida ja existeix"); 
			out  = new FileOutputStream("sortida.txt");
			copia (in, out);
			copia (in2, out);
		} catch (FileNotFoundException e) {
			System.out.println("Fitxer no trobat");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if (in2 != null)
				try {
					in2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if (out != null)
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	static void copia(FileInputStream entrada, FileOutputStream sortida) throws IOException {
		int x;
		while ( (x=entrada.read())>-1){
			sortida.write(x);
		}
	}
}