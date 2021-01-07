import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class REDO {

	public static void main(String[] args) {
		FileInputStream input = null;
		Scanner userInput = new Scanner(System.in);
		try {
			System.out.println("Enter a file name.");
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found.\nTry again.");
		}
	}

}
