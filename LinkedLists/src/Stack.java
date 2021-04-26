
public class Stack <T>{
	private int maxSize;
	private int top;
	private T[] array;
	
	@SuppressWarnings("unchecked")
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.top = -1;
		array = (T[]) new Object[maxSize];
	}
	public int getMaxSize() {
		return maxSize;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public T top() {
		if(isEmpty()) {
			return null;
		}else {
			return array[top];
		}
	}
	
	public void push(T value) {
		if(isFull()) {
			System.out.println("Full!");
			return;
		}else {
			array[++top] = value;
		}
		
	}
	public T pop() {
		if(isEmpty()) {
			return null;
		}else {
			return array[top--];
		}
	}
	
}


