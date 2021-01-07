// import java.util.Scanner;

public class Lab1A {

	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in); //creating a scanner object called
		// scan that is passing into it keyboard.

		// System.out.println("Enter your name: "); //asking user to input name
		// String userName = scan.nextLine(); //taking in user's name into string
		// userName
		// System.out.println("Enter your age: "); //asking user to input age
		// int userAge = scan.nextInt(); //taking in user's age into int userAge

		// System.out.println("Your name is " + userName + " and your age is " + userAge
		// + "."); //printing out everything

		int[] data = new int[20];// array is an object

		data = Lab1A_Part2.randomFill(data);

		int largestFromData = Lab1A_Part2.findLargest(data);

		int[] nums = Lab1A_Part2.nums;

		int largestFromNums = Lab1A_Part2.findLargest(Lab1A_Part2.nums);

		System.out.println("Largest from data: " + largestFromData);
		System.out.println("Largest from nums: " + largestFromNums + "\n");

		for (int i = 0; i < data.length; i++) {
			System.out.println("Data[" + i + "]: " + data[i] + "|| ");

		}

		System.out.println("");

		for (int i = 0; i < nums.length; i++) {
			System.out.println("Nums[" + i + "]: " + nums[i] + "|| ");

		}
		System.out.println("\nLongest series of positive numbers: " + longestPositiveSeries(data));

	}

	public static int longestPositiveSeries(int[] data) {

		int[] amountOfPosNumbers = new int[data.length];
		int index = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i] >= 0) {
				amountOfPosNumbers[index]++;
			} else {
				index++;
			}
		}
		int longestPos = Lab1A_Part2.findLargest(amountOfPosNumbers);
		return longestPos;
	}
}