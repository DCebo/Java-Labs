
public class QueuesForFinal {

	public static void main(String[] args) {
		Queue queue = new Queue();

		if (queue.isEmpty()) {
			System.out.println("queue is empty");
		} else {
			System.out.println("queue is not empty");
		}
		queue.enQueue2(1);
		queue.enQueue2(2);
		queue.enQueue2(3);
		queue.enQueue2(4);
		queue.enQueue2(5);

		queue.displayQueue();
		System.out.println("");

		queue.deQueue();
		queue.displayQueue();
		System.out.println("");

		queue.deQueue();
		queue.displayQueue();
		System.out.println("");

		queue.enQueue2(6);
		queue.displayQueue();
		System.out.println("");

		if (queue.isEmpty()) {
			System.out.println("queue is empty");
		} else {
			System.out.println("queue is not empty");
		}
	}
}

class Queue {
	private Node head;
	private Node tail;

	class Node {
		public int id;
		public Node next;
		/*
		 * THIS IS TO PEEK
		 */
		// private Node (int n){
		// this.id = n;
		// }
	}

	public Queue() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	/*
	 * THIS IS TO PEEK
	 */
	// public int peek(int n) {
	// return head.id;
	// }

	public void enQueue(int n) {
		Node newNode = new Node();
		newNode.id = n;
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void enQueue2(int n) {
		Node newNode = new Node();
		newNode.id = n;

		if (isEmpty()) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
		} else {
			int x = head.id;
			head = head.next;
			System.out.println("Removed node with Id: " + x);
		}
	}

	public void displayQueue() {
		Node current = head;
		while (current != null) {
			System.out.println(current.id);
			current = current.next;
		}
	}
}
