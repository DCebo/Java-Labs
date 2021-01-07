
public class Stack <Type>{
	
	Node<Type> first;
	int count;
	
	public Stack()	{
		this.first = null;
	}
	
	public void Push(Type item) {
		
		if(this.first == null) {
			this.first = new Node<Type>(item);
			this.count++;
			return;
		}
		
		Node<Type> current = this.first;
		
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = new Node<Type>(item);
		this.count++;
	}
	
	public void Pop() {
		
		if(this.first == null) {
			this.first = null;
			this.count--;
			return;
		}
		
		Node<Type> current = this.first;
		Node<Type> parentOfCurrent = current;
		
		while(current.next != null) {
			parentOfCurrent = current;
			current = current.next;
		}
		parentOfCurrent.next = null;
		current = null;
		this.count--;
	}
	
	public Type Peek() {
		
		if(this.first == null) {
			return null; 
		}
		
		Node<Type> current = this.first;
		
		while(current.next != null) {
			current = current.next;
		}
		return current.data;
	}
	
	public String Display() {
		
		String output = "";
		
		Node<Type> current = this.first;
		
		while(current != null) {
			output += current.data + "\n--------\n";
			current = current.next;
		}
		return output;	
	}
		
	
	public class Node<DataType>{
		
		DataType data;
		Node<DataType> next;
		
		public Node(DataType data) {
			this.data = data;
			this.next = null;
		}
	}
}
