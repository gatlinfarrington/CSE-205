
public class RBTree {
	private RedBlackNode current, parent, grand, great, header;
	private static RedBlackNode nullNode;
	
	static {
		nullNode = new RedBlackNode(0);
		nullNode.left = nullNode;
	}
	
	public RBTree(int negInf) {
		header = new RedBlackNode(negInf);
		header.left = nullNode;
		header.right = nullNode;
	}
	
	public boolean isEmpty() {
		return header.right == nullNode;
	}
	
	public void makeEmpty() {
		header.right = nullNode;
	}
	
	public void insert(int item) {
		current = parent = grand = header;
		nullNode.element = item;
		while(current.element != item) {
			great = grand;
			grand = parent;
			parent = current;
			current = item<current.element ? current.left : current.right>;
			
			if(current.left.color == RED && current.right.color == RED)
					handleReorient(item);
		}
		
		if(current != nullNode)
			return;
	}
	
	private void handleReorient(int item) {
		current.color = RED;
		current.left.color = BLACK;
		current.right.color = BLACK;
		
		if(parent.color == RED) {
			grand.color = RED;
			if(item < grand.element != item < parent.element)
				parent = rotate(item, grand);
			current = rotate(item, great);
			current.color = BLACK;
		}
		header.color = BLACK;
	}
	
	private void postorder()
	{
		postorder();
	}	
}
