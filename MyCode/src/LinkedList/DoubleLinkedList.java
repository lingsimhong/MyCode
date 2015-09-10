package LinkedList;

public class DoubleLinkedList {

	Node headnode = null;
	Node tailnode = null;
	int size = 0;
	
	/* Insert */
	public void insert(int val) {
		if(headnode == null) {
			headnode = new Node(val);
			tailnode = headnode;
			
		} else {
			Node currnode = headnode;
			while(currnode.getNext() != null) {
				currnode = currnode.getNext();
			}
			Node newnode = new Node(val);
			currnode.setNext(newnode);
			newnode.setPrev(currnode);
			tailnode = newnode;
		}
		
		size++;
	}
	
	/* Remove */
	public int remove(int index) {
		int tempval = -1;
		if (headnode != null && index < size) {
			Node currnode = headnode;
			for (int i = 0; i < index; i++) {
				currnode = currnode.getNext();
			}
			Node prevnode = currnode.getPrev();
			Node nextnode = currnode.getNext();
			prevnode.setNext(nextnode);
			
			if (nextnode != null) {
				nextnode.setPrev(prevnode);
			} else {
				tailnode = prevnode;
			}
			
			tempval = currnode.getVal();
			size--;
		}
		
		return tempval;
	}
	
	/* Display */
	public void display() {
		Node currnode = headnode;
		while(currnode != null) {
			System.out.print(currnode.getVal() + ",");
			currnode = currnode.getNext();
		}
		System.out.println();
	}
	
	/* Reverse list: iteration */
	public void reverselist() {
		Node currnode = tailnode;
		while(currnode != headnode) {
			System.out.print(currnode.getVal() + ","); 
			currnode = currnode.getPrev();	
		}
		System.out.print(currnode.getVal() + ",");  //headnode
		System.out.println();
	}
	
	
}
