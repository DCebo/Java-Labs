
public class StacksForFinal {

	public static void main(String[] args) {
		Stack stack = new Stack();

		if (stack.isEmpty()) {
			System.out.println("stack is empty");
		} else {
			System.out.println("stack is not empty");
		}
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		stack.displayStack();

		stack.pop();
		stack.displayStack();

		stack.pop();
		stack.displayStack();

		if (stack.isEmpty()) {
			System.out.println("stack is empty");
		} else {
			System.out.println("stack is not empty");
		}
	}
}

class Stack {
	private Node top;

	public Stack() {
		top = null;
	}

	class Node {
		public int id;
		public Node next;
	}

	public boolean isEmpty() {
		return (top == null);
	}

	public int peek() {
		if (!isEmpty()) {
			return top.id;
		} else {
			return -1;
		}
	}

	public void push(int n) {
		Node newNode = new Node();
		newNode.id = n;
		newNode.next = top;
		top = newNode;
	}

	public void pop() {
		if (!isEmpty()) {
			int x = top.id;
			top = top.next;
			System.out.println("Popped node with Id: " + x);
		} else {
			System.out.println("Stack is empty.");
		}
	}

	public int pop_version2() {
		int x = top.id;
		top = top.next;
		return x;
	}

	public void displayStack() {
		Node current = top;

		while (current != null) {
			System.out.println(current.id);
			current = current.next;
		}
	}
}