package Lab4B;

public class Recurssion2 {

	public static void main(String[] args) {

		boolean x = PalindromeChecker("madam");
		boolean y = PalindromeChecker("hello");

		System.out.println("madam is: " + x);
		System.out.println("hello is: " + y);
	}

	public static boolean PalindromeChecker(String input) {
		if (input.length() <= 1) {
			return true;
		}
		if (input.charAt(0) != input.charAt(input.length() - 1))
			return false;

		String nextInput = input.substring(1, input.length() - 1);

		return PalindromeChecker(nextInput);
	}

}
