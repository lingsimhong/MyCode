package BST;

public class Node {
	int val;
	Node left;
	Node right;
	int duplicate;
	
	public Node(int val) {
		this.val = val;
		left = null;
		right = null;
		duplicate = 0;
	}
	
	public void setVal(int val) {
		this.val = val;
	}
	public int getVal(){
		return val;
	}
	public void setLeft(Node n) {
		left = n;
	}
	public Node getLeft(){
		return left;
	}
	public void setRight(Node n) {
		right = n;
	}
	public Node getRight(){
		return right;
	}
	public void setDuplicate(int d) {
		duplicate+=d;
	}
	public int getDuplicate(){
		return duplicate;
	}
}
