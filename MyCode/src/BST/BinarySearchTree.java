package BST;

/*Policy:
 * left: smaller than root
 * right: larger than root
 * duplicate: increment 'duplicate' in Node */
public class BinarySearchTree {
	
	Node root = null;
	
	/* Insert element */
	public void insert(int val) {
		if (root == null) {
			root = new Node(val);
		} else {
			insertRecur(root, val);
		}
	}
	
	public void insertRecur (Node node, int val){
		if(val < node.getVal()) {
			if (node.getLeft() == null) {
				node.setLeft(new Node(val));
			}else{
				insertRecur(node.getLeft(), val);
			}
		} else if (val > node.getVal()) {
			if (node.getRight() == null) {
				node.setRight(new Node(val));
			} else {
				insertRecur(node.getRight(),val);
			}
		} else {
			node.setDuplicate(1); 
		}
	}
	
	
	/* Inorder traversal */
	public void printInOrder() {
		printInOrderRecur(root);
	}
	
	public void printInOrderRecur(Node node) {
		if (node != null) {
			printInOrderRecur(node.getLeft());
			System.out.print(node.getVal()+",");
			printInOrderRecur(node.getRight());
		} 
	}
	
	/* Preorder traversal */
	public void printPreOrder() {
		printPreOrderRecur(root);
	}
	public void printPreOrderRecur(Node node) {
		if (node != null) {
			System.out.print(node.getVal()+",");
			printPreOrderRecur(node.getLeft());
			printPreOrderRecur(node.getRight());
		}
	}
	
	/* Postorder traversal */
	public void printPostOrder(){
		printPostOrderRecur(root);
	}
	public void printPostOrderRecur(Node node) {
		if (node != null) {
			printPostOrderRecur(node.getLeft());
			printPostOrderRecur(node.getRight());
			System.out.print(node.getVal()+",");
		}
	} 
	
	
	/* Find Min value */
	public int findMin() {
		return findMinRecur(root).getVal();
	}
	public Node findMinRecur(Node node) {
		if (node.getLeft() == null) {
			return node;
		} 
		return findMinRecur(node.getLeft());
	}
	
	/* Find Max value */
	public int findMax() {
		return findMaxRecur(root).getVal();
	}
	public Node findMaxRecur(Node node) {
		if (node.getRight() == null) {
			return node;
		} 
		return findMaxRecur(node.getRight());
	}
	
	/* Search: recrusion */
	public void search(int val) {
		searchRecur(root, val);
	}
	
	public void searchRecur(Node node, int val) {
		if (val < node.getVal()) {
			if (node.getLeft() != null) {
				searchRecur(node.getLeft(), val);
			} else {
				System.out.println("not found");
			}
		} else if (val > node.getVal()) {
			if (node.getRight() != null) {
				searchRecur(node.getRight(), val);
			} else {
				System.out.println("not found");
			}
		} else {	//found
			System.out.println("found");
		}
	}
	
	/* Search: iteration */
	public boolean searchloop(int val) {
		Node currnode = root;
		while(currnode != null) {
			if (currnode.getVal() == val) {
				return true;
			} else if (val < currnode.getVal()) {
				currnode = currnode.getLeft();
			} else {
				currnode = currnode.getRight();
			}
		}
		return false;
		
	}
	
	
	
}
