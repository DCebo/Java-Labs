import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileIO {

	public static void main(String[] args) {
		// User inputs file name
		FileInputStream input = null;
		Scanner userInput = new Scanner(System.in);

		// Exception handling
		try {
			// Give user input to file name
			System.out.println("Enter file name to open:");
			String fileName = userInput.nextLine();
			input = new FileInputStream(fileName);
			// Print contents of file
			int d;
			char c;
			System.out.println("Printing contents of file:\n");
			while ((d = input.read()) != -1) {
				c = (char) d;
				System.out.print(c);

			}

			FileOutputStream fileOut = new FileOutputStream(fileName, true);
			PrintStream printOut = new PrintStream(fileOut);
			System.out.println("\n\nEnter what you want to write to the file.");
			String textToAdd = userInput.nextLine();
			byte[] textToAppend = textToAdd.getBytes();
			printOut.write(textToAppend);

			printOut.flush();
			printOut.close();
			fileOut.close();
			System.out.print("Added to file. You are now complete.");

		} catch (FileNotFoundException e) {
			// Error message
			System.out.println("File not Found.\nTry Again.\n");
			// Call main function again
			main(null);
		} catch (Exception e) {
			// Anything else goes wrong
			System.out.println("Something went wrong!");
		} finally {
			// close user input scanner
			userInput.close();
			if (input != null) {
				// to close input file stream
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
