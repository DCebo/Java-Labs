import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CreateFile {

	public static void main(String[] args) {

		/*
		 * CREATE A FILE
		 */
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("FILE NAME.txt", "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		writer.println("The first line");
		writer.println("The second line");
		writer.close();

	}

}
