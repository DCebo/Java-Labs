
public class DavidArrayList {

	int[] myArray;
	int size;
	int count;

	public DavidArrayList() {
		this.myArray = new int[10];
		this.size = 10;
		this.count = 0;
	}

	public DavidArrayList(int size) {
		this.myArray = new int[size];
		this.size = size;
		this.count = 0;
	}

	public void AddLast(int item) {

		if (this.size == this.count) {
			int[] tempArray = new int[this.size * 2];
			this.size *= 2;
			// myArray = tempArray; //shallow copy does not let size increase
			for (int i = 0; i < myArray.length; i++) { // deep copy where value for value gets put into tempArray
				tempArray[i] = myArray[i];
			}
			myArray = tempArray;
		}

		for (int i = myArray.length - 1; i >= 0; i--) {
			if (myArray[i] == 0) {
				myArray[i] = item; // best to move item to left as well, research
				this.count++;
				return;
			}
		}
		// this.myArray[myArray.length - 1] = item;
	}

	public void AddFront(int item) {
		if (this.size == this.count) {
			int[] tempArray = new int[this.size * 2];
			this.size *= 2;
			// myArray = tempArray; //shallow copy does not let size increase
			for (int i = 0; i < myArray.length; i++) { // deep copy where value for value gets put into tempArray
				tempArray[i] = myArray[i];
			}
			myArray = tempArray;
		}

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == 0) {
				myArray[i] = item; // best to move item to right as well, research
				this.count++;
				return;
			}
		}
		// this.myArray[0] = item;
	}

	public void Insert(int index, int item) { // research when inserting how to move over
		if (this.size == this.count) {
			int[] tempArray = new int[this.size * 2];
			this.size *= 2;
			// myArray = tempArray; //shallow copy does not let size increase
			for (int i = 0; i < myArray.length; i++) { // deep copy where value for value gets put into tempArray
				tempArray[i] = myArray[i];
			}
			myArray = tempArray;
		}

		for (int i = index; i < myArray.length; i++) {
			if (myArray[i] == 0) {
				myArray[i] = item; // best to move item to right as well, research
			}
		}
	}

	public void RemoveLast() {
		this.size--;
		for (int i = myArray.length - 1; i >= 0; i--) {
			if (myArray[i] != 0) {
				this.count--;
				return;
			}
		}
	}

	public void RemoveFront() {
		this.size--;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] != 0) {
				myArray[i] = 0;
				return;
			}
		}
	}

	public void RemoveAt(int index) { // research when inserting how to move over
		this.size--;
		for (int i = index; i < myArray.length; i++) {
			if (myArray[i] != 0) {
				myArray[i] = 0;
				this.count--;
				return;
			}
		}
	}

	// Accessing
	public int ValueAt(int index) {
		return this.myArray[index];
	}

	/*
	 * operator overloading accessing with square brackets, write code in array list
	 * to overload so you can use square brackets research the shifting within
	 * methods of adding or removing array
	 */
}
