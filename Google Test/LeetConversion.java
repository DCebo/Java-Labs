package test;

//Import for input read
//Map for comparison
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeetConversion {

    public static void main(String[] args) {
        // Variable for leet text generation
        String leet = "";
        // Scanner object for input read
        Scanner sc = new Scanner(System.in);
        // Prompt for input teaxt for conversion
        System.out.print("Enter a test for conversion: ");
        String text = sc.nextLine();
        // Call method to get length of the entered string
        int len = StringLength(text);
        // Loop unti end of the string to gete character by character
        for (int i = 0; i < len; i++) {
            // Call method to get correspoding leet code
            String str = getLeet(text.charAt(i));
            // If function return a code then add it into the leet
            if (str != null) {
                leet += str;
            }
            // Otherwise same character add into leet
            else {
                leet += text.charAt(i);
            }
        }
        // Display leet text
        System.out.println("Leet text of the given text is " + leet);

    }

    // Method to find length of the string
    public static int StringLength(String text) {
        return text.length();
    }

    // Method to find the leet form of a character
    public static String getLeet(char ch) {
        // MAp for mapping character and leet expression
        Map<Character, String> leetComp = new HashMap<Character, String>();
        leetComp.put('a', "4");
        leetComp.put('b', "B");
        leetComp.put('c', "(");
        leetComp.put('d', "D");
        leetComp.put('e', "3");
        leetComp.put('f', "Ph");
        leetComp.put('g', "9");
        leetComp.put('h', "|-|");
        leetComp.put('i', "1");
        leetComp.put('j', "j");
        leetComp.put('k', "|<");
        leetComp.put('l', "L");
        leetComp.put('m', "?/\\/\\");
        leetComp.put('n', "|\\|");
        leetComp.put('o', "O");
        leetComp.put('p', "P");
        leetComp.put('q', "Q");
        leetComp.put('r', "R");
        leetComp.put('s', "$");
        leetComp.put('t', "7");
        leetComp.put('u', "U");
        leetComp.put('v', "\\/");
        leetComp.put('w', "\\/\\/");
        leetComp.put('x', "><");
        leetComp.put('y', "'/");
        leetComp.put('z', "Z");
        // Loop for comparison
        for (char key : leetComp.keySet()) {
            if (key == ch) {
                return leetComp.get(key);
            }
        }
        return null;
    }

}