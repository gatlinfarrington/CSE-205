

public class Node {
    private int key;
	int height;
    Node left;
	Node right;
    public Node(int data){
        key = data;
        height = 1;
    }

    public int getKey()
    {
        return key;
    }

    public void setKey( int key )
    {
        this.key = key;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight( int height )
    {
        this.height = height;
    }

    public Node getLeft()
    {
        return left;
    }

    public void setLeft( Node left )
    {
        this.left = left;
    }

    public Node getRight()
    {
        return right;
    }

    public void setRight( Node right )
    {
        this.right = right;
    }
}


class AVLTree{
	Node root;

    public Node getRoot()
    {
        return root;
    }

    public void setRoot( Node root )
    {
        this.root = root;
    }

    public int height( Node n){
        if(n == null)
            return 0;
        return n.getHeight();
    }
    private void fixHeight(Node n){
        n.setHeight(max(height(n.getLeft()),height(n.getRight()))+1);
    }

    public int max( int a, int b){
        return (a>b) ? a : b;
    }
    public int maxHeight( Node a, Node b){
        return (a.getKey()>b.getKey()) ? a.getKey() : b.getKey();
    }

    public Node rightRotate(Node y)
    {
        Node x = y.getLeft();
        Node temp = x.getRight();

        x.setRight(y);
        y.setLeft(temp);

        fixHeight(y);
        fixHeight(x);

        return x;
    }

    public Node leftRotate(Node x)
    {
        Node y = x.getRight();
        Node temp = y.getLeft();

        y.setLeft(x);
        x.setRight(temp);

        fixHeight(y);
        fixHeight(x);

        return y;
    }

    public int getBalance(Node n)
    {
        if(n == null)
            return 0;
        return height(n.getLeft()) - height(n.getRight());
    }

    public Node insert(Node node, int key) {
        if(node == null)
            return new Node(key);

        if(key < node.getKey()){
            node.setLeft(insert(node.getLeft(),key));
        }else if(key > node.getKey()){
            node.setRight(insert(node.getRight(),key));
        }else{
            return node;
        }

        fixHeight(node);

        int balanced = getBalance(node);
        //Left Left Case
        if(balanced > 1 && key < node.getLeft().getKey())
            return rightRotate(node);

        //Right Right Case
        if(balanced < -1 && key > node.getRight().getKey())
            return leftRotate(node);

        //Left Right Case
        if(balanced > 1 && key > node.getLeft().getKey()) {
            node.setLeft(leftRotate(node.getLeft()));
            return rightRotate(node);
        }

        //Right Left Case
        if(balanced < -1 && key < node.getRight().getKey()) {
            node.setRight(rightRotate(node.getRight()));
            return leftRotate(node);
        }

        return node;
    }

    // Recursive
    // (Heavy on the stack, so not recommended).
    public void inOrder(Node node)
    {
        if(node == null)
            return;
        inOrder(node.getLeft());
        System.out.print(node.getKey()+" ");
        inOrder(node.getRight());
    }
}