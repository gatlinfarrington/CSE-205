
public class DoubleLinkedList <T>{
	protected Node tail;
	protected Node head;
	private int size;
	public DoubleLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	public DoubleLinkedList(Node head, Node tail) {
		
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void insertAtBeginning(T data) {
		Node newNode = new Node(data, null, null);
		if(head == null) {
			head = newNode;
			tail = head;
		}else {
			head.setPrevious(newNode);
			newNode.setNext(head);
			head = newNode;
		}
		size++;
	}
	
	public void insertAtPosition(T data, int position) {
		Node newNode = new Node(data, null, null);
		if(position == 1) {
			insertAtBeginning(data);
			return;
		}
		Node current = head;
		for(int i = 2; i <= size; i++) {
			if(i == position) {
				Node temp = current.getNext();
				current.setNext(newNode);
				newNode.setPrevious(current);
				newNode.setNext(temp);
				temp.setPrevious(newNode);
			}
			current = current.getNext();
		}
		size++;
		
	}
	
	public void insetAtEnd(T data) {
		Node newNode = new Node(data, null, null);
		if(head == null) {
			head = newNode;
			tail = head;
		}else {
			newNode.setPrevious(tail);
			tail.setNext(newNode);
			tail = newNode;
		}
		size++;
	}
	
	public void print() {
		System.out.println("Double linked list = " );
		if(size == 0) {
			System.out.println("empty\n");
			return;
		}
		if(head.getNext() == null) {
			System.out.println(head.getData());
			return;
		}
		
		Node current = head;
		System.out.print(head.getData() + " <-> ");
		current = head.getNext();
		while(current.getNext() != null) {
			System.out.print(current.getData() + " <-> ");
			current = current.getNext();
		}
		System.out.print(current.getData() + "\n ");
	}
	
}
