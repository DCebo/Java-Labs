
public class Lab1B_Part1 {
	public static void main(String[] args) {
		int[] nums = { 1, 4, 13, 43, -25, 17, 22, -37, 29 };

		int valueToSearchFor = 29;

		System.out.println("Searching for " + valueToSearchFor);

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == valueToSearchFor) {
				System.out.println("Index is: " + i);
				break;
			}
		}
	}
}
