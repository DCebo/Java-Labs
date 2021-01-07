import java.util.Random;

public class Lab1B_Part2 {
	public static void main(String[] args) {
		int[] data = new int[20];
		data = RandomFill(data);
		int target = 10;

		int indexOrinsertionPoint = BinarySearch(data, target);

		for (int i = 0; i < data.length; i++) {
			System.out.print("Value at [" + i + "]: " + data[i] + " || ");
		}
		System.out.println();

		System.out.println("The index of the item is: " + indexOrinsertionPoint);
	}

	public static int BinarySearch(int[] myArray, int target) {
		int highPoint = myArray.length;
		int lowPoint = 0;
		int midPoint = highPoint / 2;

		while (true) {
			if (myArray[midPoint] == target) {
				return midPoint;
			} else if (myArray[midPoint] > target) {
				highPoint = midPoint;
			} else {
				lowPoint = midPoint;
			}

			if (highPoint <= lowPoint) {
				return midPoint + 1;
			}

			midPoint = (lowPoint + highPoint) / 2;
		}
	}

	public static int[] RandomFill(int[] myArray) {
		Random rand = new Random();

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = rand.nextInt(201) - 100;
		}

		return myArray;
	}
}
