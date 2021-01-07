package Lab4B;

public class RecursionII {

	public static void main(String[] args) {
		String input = "madam";
		PalindromeCheck(input);

		if (PalindromeCheck(input) == true) {
			System.out.println(input + " is a palindrome.");
		} else {
			System.out.println(input + " is not a palindrone.");
		}
	}

	public static boolean PalindromeCheck(String input) {
		String reverse = PalindromeHelp(input);
		if (reverse == input) {
			return true;
		}
		return false;
	}

	public static String PalindromeHelp(String input) {
		if (input.length() <= 0) {
			return "";
		}
		return input + PalindromeHelp(input.substring(1));
	}
}
