
public class Node <T>{
	protected T data;
	protected Node next, previous;
	
	public Node() {
		next = null;
		previous = null;
		data=null;
	}
	
	public Node(T data, Node next, Node previous) {
		this.data = data;
		this.next = next;
		this.previous = previous;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}
}
