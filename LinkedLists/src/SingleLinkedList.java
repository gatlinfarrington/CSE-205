
public class SingleLinkedList <T>{
	public Node head = null;
	
	public class Node{
		//T is a generic data type. Can be Int, String, double, float, etc.
		private T data;
		private Node next;
		
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
	public void addNodeAtBeginning(T data) {
		System.out.println("Add a Node with data: " + data + " at the beginning.");
		Node newNode = new Node(data);
		
		if(this.head == null) {
			this.head = newNode;
		}else {
			newNode.next = this.head;
			this.head = newNode;
		}
	}
	
	public void addNodeAtEnd(T data) {
		System.out.println("Add a node with data: " + data + " at the end.");
		Node newNode = new Node(data);
		if(this.head == null) {
			this.head = newNode;
		}else {
			Node current = this.head;
			while(current != null) {
				current = current.next;
			}
			current = newNode;
			
		}
	}
	
	public void add(int position, T data) {
		System.out.println("Add a node with data: " + data + " at the position: " + position);
		Node newNode = new Node(data);
		Node current = this.head;
		Node previous = this.head;
		if(position == 1) {
			newNode.next = head;
			this.head = newNode;
			return;
		}
		while(current.next != null && --position > 0) {
			previous = current;
			current = current.next;
		}
		previous.next = newNode;
		newNode.next = current;
	}
	
	public void print() {
		if(this.head == null) {
			System.out.println("The list is empty");
		}else {
			System.out.println("The contents of the single linked are: ");
			Node current = this.head;
			while(current != null) {
				System.out.print(current.data + " -> ");
				current = current.next;
				
			}
			System.out.print(" null ");
		}
	}
	
}
