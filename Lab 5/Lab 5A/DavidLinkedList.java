
public class DavidLinkedList {

	Node first; // first = head
	int size;
	int count;

	public DavidLinkedList() {
		// this.first = null;
		this.first = new Node(0);
		this.count = 0;
	}

	/*
	 * this constructor not typically done
	 */
	public DavidLinkedList(int size) {
		this.size = size;
		this.count = size;
		this.first = new Node(0);
		Node current = this.first;

		for (int i = 0; i < size; i++) {
			current.next = new Node(0);
			current = current.next;
		}
	}

	public void AddLastLinkedList(int item) {

		if (this.first == null) {
			this.first = new Node(item);
			this.count++;
			return;
		}

		Node current = this.first;

		while (current.next != null) {
			current = current.next;
		}

		current.next = new Node(item);
		this.count++;

		// how to do it with a for loop
		// for(int i = 0; i < this.count; i++) {
		// if(current.next == null) {
		// current.next = new Node(item);
		// this.count++;
		// this.size++;
		// }
		// current = current.next;
		// }
	}

	public void RemoveLastLinkedList(int item) {

		if (this.first == null) {
			// this.count--;
			return;
		}

		Node current = this.first;
		Node parentOfCurrent = current;

		while (current.next != null) {
			parentOfCurrent = current;
			current = current.next;
		}

		parentOfCurrent.next = null;
		current = null;
		this.count--;

	}

	public int Get(int index) {

		Node current = this.first;
		int counter = 0;

		// return 0 when index given is beyond the list
		if (this.count <= index) {
			return 0;
		}

		while (current.next != null && counter < index) {
			current = current.next;
			counter++;
		}
		if (current != null) {
			return current.data;
		}
		// Dead code
		return 0;
	}

	/*
	 * referencing cuts down on memory use
	 */
	public class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null; // not needed but to specify

		}
	}
}
