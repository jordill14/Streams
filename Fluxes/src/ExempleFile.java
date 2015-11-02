import java.io.File;

public class ExempleFile {
	public static void main(String[] args) {
		try {
			File file = new File("text1.txt");
			boolean exist= file.exists();
			if (exist){
				System.out.println("És un arxiu: " + file.isFile());
				System.out.println("Té permsos de lectura: " + file.canRead());
				System.out.println("Té permisos d'escriptura: " + file.canWrite());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			
			//e.printStackTrace();
		}
	}
}