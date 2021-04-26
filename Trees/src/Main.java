

public class Main {

	public static void main(String[] args) {
		AVLTree tree = new AVLTree();
		
		//3, 7, 22, 15, 6, 34, 85, 12, 42, 8
		tree.root = tree.insert(tree.root, 3);
		tree.root = tree.insert(tree.root, 7);
		tree.root = tree.insert(tree.root, 22);
		tree.root = tree.insert(tree.root, 15);
		tree.root = tree.insert(tree.root, 6);
		tree.root = tree.insert(tree.root, 34);
		tree.root = tree.insert(tree.root, 85);
		tree.root = tree.insert(tree.root, 12);
		tree.root = tree.insert(tree.root, 42);
		tree.root = tree.insert(tree.root, 8);
		
		/*
		 *        22
		 *       /  \
		 * 
		 * */
		 
		System.out.println("in-Order traversal: ");
		
		tree.inOrder(tree.root);

	}

}
