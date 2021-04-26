
public class main {
	public static void main(String[] args) {
		SingleLinkedList<String> list = new SingleLinkedList<String>();
//		list.addNodeAtBeginning("Bob");
//		list.addNodeAtBeginning("Sam");
//		list.print();
//		
//		SingleLinkedList<Integer> list2 = new SingleLinkedList<Integer>();
//		list2.addNodeAtEnd(3);
//		list2.addNodeAtEnd(27);
//		list2.print();
//		
//		SingleLinkedList<Integer> list3 = new SingleLinkedList<Integer>();
//		list3.addNodeAtBeginning(2);
//		list3.add(1, 3);
//		list3.print();
		
		DoubleLinkedList<Integer> list4 = new DoubleLinkedList<Integer>();
		list4.insertAtBeginning(3);
		list4.insertAtBeginning(5);
		list4.insetAtEnd(7);
		list4.insetAtEnd(8);
		list4.insetAtEnd(9);
		list4.insertAtPosition(11, 3);
		list4.print();
		
		Stack<Integer> stack = new Stack<Integer>(5);
		System.out.println("Elements pushed in the stack: ");
		
		stack.push(34);
		stack.push(23);
		stack.push(56);
		stack.push(3);
		stack.push(13);
		stack.push(8);
		stack.push(88);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(3);
		System.out.println(stack.toString());
	}
}
