
public class Node {
	int val;
	Node next;
	Node prev;
	public Node (int val) {
		this.val = val;
		next = null;
		prev = null;
	}
	
	
	public void setVal(int val) {
		this.val = val;
	}
	
	public int getVal() {
		return val;
	}
	
	public void setNext(Node n) {
		next = n;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setPrev(Node n) {
		prev = n;
	}
	
	public Node getPrev() {
		return prev;
	}
}
