import java.util.Random;

public class Lab1A_Part2 {

	public static int[] nums = { 1, 4, 13, 43, -25, 17, 22, -37, 29 }; // class?

	public static int findLargest(int[] nums) { // return largest value in array

		int max = nums[0]; // start at first index of array

		for (int i = 1; i < nums.length; i++) {// can make nums static or give findLargest a parameter
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}

	public static int[] randomFill(int[] randomArray) {

		Random rand = new Random();

		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = rand.nextInt(201) - 100; // 201 because only one number and .nextInt is not inclusive, so
			// it goes to one number less than it (i.e. 0-100 ; 200-100)
		}
		return randomArray;
	}

}
