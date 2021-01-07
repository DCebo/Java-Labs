import java.io.*;
//import java.io.FileReader;

public class Lab7A {

	public static void main(String[] args) throws Exception {

		// How to close the fr to prevent leak
		// pass path to file as parameter
		FileReader fr = new FileReader("C:\\Users\\Scara\\OneDrive\\School\\2019-2020\\Fall 2019\\CSE 1322L - "
				+ "Programming Problem Solving II Lab\\Labs\\Lab7A\\bin\\file.txt");

		int i = fr.read();
		String fullFile = "";
		while (i != -1) {
			fullFile += (char) i;
			System.out.print((char) i);
			i = fr.read();
		}
		fr.close();
		fullFile += "\r\nHello!";

		FileWriter fw = new FileWriter("C:\\Users\\Scara\\OneDrive\\School\\2019-2020\\Fall 2019\\CSE 1322L - "
				+ "Programming Problem Solving II Lab\\Labs\\Lab7A\\bin\\file.txt");

		fw.write(fullFile);
		fw.close();

		// File file = new File("")
		//
		// BufferedReader br = new BufferedReader(new FileReader(file));
		//
		// String st = br.readLine();
		// while (!= null){
		// System.out.println(st);
		// st = br.readLine();
		// }

	}

}
