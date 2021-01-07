import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FileOutput {

	public static void main(String[] args) {

		try {
			File file = new File("output.txt");
			FileOutputStream fileOut = new FileOutputStream(file);
			PrintStream printOut = new PrintStream(fileOut);

			System.out.println("Enter what you want to write to the file");
			Scanner userInput = new Scanner(System.in);
			String textToAdd = userInput.nextLine();
			printOut.print(textToAdd);

			printOut.flush();
			printOut.close();
			fileOut.close();
			userInput.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
