
public class SingleLinkedList {
	Node headnode = null;
	int size = 0;
	
	/* Insert */
	public void insert(int val) {
		if (headnode == null) {
			headnode = new Node(val);
		} else {
			Node curr = headnode; //headnode unchange
			while(curr.getNext() != null) {
				curr = curr.getNext();
			}
			Node newnode = new Node(val);
			curr.setNext(newnode);
		}
		size++;
		
	}
	
	/* Remove */
	public int remove(int index) {
		int tempval = -1;
		if (headnode != null && index < size) {
			Node curr = headnode;
			Node prev = null;
			
			for (int i = 0; i < index; i++) {
				prev = curr;
				curr = curr.getNext();
			}
			tempval = curr.getVal();
			prev.setNext(curr.getNext());
			size--;
		}
		
		
		return tempval;
		
	}

	/* Display: iteration */
	public void displayloop(){
		Node curr = headnode;
		
		while(curr != null) {
			System.out.print(curr.getVal() + ",");
			curr = curr.getNext();
		}
		System.out.println();
	}
	
	/* Display: recursion */
	public void display() {
		displayRecur(headnode);
	}
	
	public void displayRecur(Node node){
		if (node != null) {
			System.out.print(node.getVal() + ",");
			displayRecur(node.getNext());
		}
		
	}
	
	
	
	/* Reverse list: iteration */
	public void reverselistloop() {
		if (headnode.getNext() != null) {
			if (headnode.getNext().getNext() == null) {
				Node currnode = headnode.getNext();
				currnode.setNext(headnode);
				headnode.setNext(null);
				headnode = currnode;
			} else {
				Node prevnode = headnode;
				Node currnode = headnode.getNext();
				Node nextnode = currnode.getNext();
				while (nextnode != null) {
					if (prevnode == headnode)
						prevnode.setNext(null);
					currnode.setNext(prevnode);
					prevnode = currnode;
					currnode = nextnode;
					nextnode = nextnode.getNext();
				}
				currnode.setNext(prevnode);
				headnode = currnode;
			}
		}
	}
	
	
	/* Reverse list: recursion*/
	public void reverselist() {
		reverselistRecur(headnode);
	}
	
	public void reverselistRecur(Node node) {
		/*Based case*/
		if (node.getNext() == null) {
			headnode = node;	//set last node as head node
			return;
		}
		reverselistRecur(node.getNext());
		node.getNext().setNext(node);
		node.setNext(null);
	}
	
	
	
}
