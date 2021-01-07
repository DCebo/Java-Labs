
public class Lab5A {

	public static void main(String[] args) {
		DavidArrayList myList = new DavidArrayList();

		/*
		 * Show total in array
		 */
		System.out.println("Count is: " + myList.count);

		for (int i = 0; i < myList.count; i++) {
			System.out.print(myList.ValueAt(i) + ", ");
		}
		/*
		 * Add to front of array
		 */
		myList.AddFront(14);
		myList.AddFront(12);
		myList.AddFront(10);
		System.out.println("Count is: " + myList.count);

		/*
		 * Prints list
		 */
		System.out.print("Printing the list: ");
		for (int i = 0; i < myList.count; i++) {
			System.out.print(myList.ValueAt(i) + ", ");

		}

		/*
		 * Remove from array
		 */
		myList.RemoveLast();
		System.out.println("\nCount is: " + myList.count);

		for (int i = 0; i < myList.count; i++) {
			System.out.print(myList.ValueAt(i) + ", ");
		}

		// Part 2
		DavidLinkedList linkedList = new DavidLinkedList();
		System.out.println("Printing list: ");
		for (int i = 0; i < linkedList.count; i++) {
			System.out.print(linkedList.Get(i) + " ");
		}
		System.out.println("\nDone printing list.");

	}

}
