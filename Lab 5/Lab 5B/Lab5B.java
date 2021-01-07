import java.util.Scanner;

public class Lab5B {

	public static void main(String[] args) {
		
		Stack<Clothes> stack1Clothes = new Stack<Clothes>();
		/*
		 *  Push without object
		 */
		stack1Clothes.Push(new Clothes("Blouse", "Red", false));
		/*
		 *  Push with object
		 */
		Clothes tempClothes1 = new Clothes("Shirt", "White", true);
		Clothes tempClothes2 = new Clothes("Pants", "Blue", true);
		Clothes tempClothes3 = new Clothes("Jacket", "Brown", false);
		stack1Clothes.Push(tempClothes1);
		stack1Clothes.Push(tempClothes2);
		stack1Clothes.Push(tempClothes3);
		/*
		 * Display stack
		 */
		System.out.println(stack1Clothes.Display());
		/*
		 * Pop off from top of stack
		 */
		stack1Clothes.Pop();
		System.out.println("-------\nPrinting again after pop:\n-------\n");
		/*
		 * Display stack
		 */
		System.out.println(stack1Clothes.Display());
	}

}
