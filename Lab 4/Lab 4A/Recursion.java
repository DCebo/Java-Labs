package Lab4A;

public class Recursion {

	public static void main(String[] args) {

		int count = 0;
		String test = "Hello Worlds!";
		String test2 = "What are you up to out there?!";
		// System.out.println("The number of vowels is: " + Vowels(test, test.length() -
		// 1, count));
		String input = test.toLowerCase();
		System.out.println("The number of vowels is: " + Vowels(input, count));

	}
	//
	// public static int Vowels(String input, int i, int vowelCount) {
	//
	// if(i < 0) { //BASE CASE
	// return vowelCount;
	// }
	//
	// char vowel = input.charAt(i); // test[i]
	//
	// if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel =='o' || vowel ==
	// 'u') {
	// vowelCount++;
	// }
	//
	// return Vowels(input, i - 1, vowelCount); //Recursion occurs
	//
	// }

	public static int Vowels(String input, int vowelCount) {
		String vowel = input.substring(1); // test[i] // research substrings
		if (vowel.length() <= 0) { // BASE CASE
			return vowelCount;
		}
		// String vowel = input.substring(0, input.length() - 1); // test[i] // research
		// substrings

		if (vowel.charAt(0) == 'a' || vowel.charAt(0) == 'e' || vowel.charAt(0) == 'i' || vowel.charAt(0) == 'o'
				|| vowel.charAt(0) == 'u') {
			vowelCount++;
		}

		// return Vowels(input, i - 1, vowelCount); //Recursion occurs
		return Vowels(vowel, vowelCount); // Recursion occurs

	}

}
