
public class Queue <T>{
	private int maxSize;
	private int front;
	private int back;
	private int currentSize;
	private T[] array;
	@SuppressWarnings("unchekced")
	public Queue(int maxSize) {
		array = (T[]) new Object[maxSize];
		front = 0;
	}
	
	public int getMaxSize() {
		return maxSize;
	}
	
	public int getCurrentSize() {
		return currentSize;
	}
	
	public boolean isEmpty() {
		return currentSize == 0;
	}
	
	public boolean isFull() {
		return currentSize == maxSize;
	}
	
	public T top() {
		return array[front];
	}
	public void enqueue(T data) {
		if(isFull()) {
			return;
		}
		back = (back+1) % maxSize;
	}
	
}
