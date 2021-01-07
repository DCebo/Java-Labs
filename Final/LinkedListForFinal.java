
public class LinkedListForFinal {
	static class Main {
		public static void main(String[] args) {
			LinkedListClass list = new LinkedListClass();

			list.prepend(1);
			list.prepend(2);
			list.prepend(3);
			list.append(9);
			list.append(0);

			System.out.println(list.displayList());

			if (list.traverse(9))
				System.out.println("9 is in the list");

			if (list.isEmpty())
				System.out.println("list is empty");
			else
				System.out.println("list is not empty");

			list.removeNode(0);
			System.out.println(list.displayList());

			list.removeNode(1);
			System.out.println(list.displayList());

			list.removeNode(2);
			System.out.println(list.displayList());

			list.removeNode(9);
			System.out.println(list.displayList());

			list.removeNode(3);
			System.out.println(list.displayList());
		}
	}

}

class LinkedListClass {
	private Node head;

	public LinkedListClass() {
		head = null;
	}

	class Node {
		public int num;
		public Node next;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void prepend(int n) {
		Node temp = new Node();
		temp.num = n;
		temp.next = head;
		head = temp;
	}

	public void append(int n) {
		Node temp = new Node();
		temp.num = n;
		if (head == null) {
			head = temp;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = temp;
	}

	public void removeNode(int n) {
		if ((head != null) && (head.num == n)) {
			head = head.next;
			return;
		}
		Node current = head;
		Node previous = head;
		while (current != null) {
			if (current.num == n) {
				previous.next = current.next;
				return;
			} else {
				previous = current;
				current = current.next;
			}
		}
		return;
	}

	public boolean traverse(int n) {
		Node current = head;
		while (current != null) {
			if (current.num == n) {
				return true;
			} else {
				current = current.next;
			}
		}
		return false;
	}

	public String displayList() {
		Node current = head;
		String data = "List Data:";
		while (current != null) {
			data += " --> " + current.num;
			current = current.next;
		}
		return data;
	}
}
