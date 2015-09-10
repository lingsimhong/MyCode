package LinkedList;

public class MyMain {
	public static void main (String args[]) {
		System.out.println("****single linked list****");
		SingleLinkedList ls = new SingleLinkedList();
		ls.insert(0);
		ls.insert(1);
		ls.insert(2);
		ls.insert(3);
		ls.insert(4);
		ls.insert(7);
		ls.insert(8);
		ls.insert(9);
		ls.insert(10);
		ls.insert(11);
		
		System.out.println("Insert sequence of numbers");
		ls.display();
		
		System.out.println();
		System.out.println("removed:" + ls.remove(10));
		System.out.println("removed:" + ls.remove(3));
		
		System.out.println("Print list:");
		ls.display();
		
		System.out.println();
		System.out.println("Reversed list:");
		ls.reverselist();
		ls.display();
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("****double linked list****");
		DoubleLinkedList ds = new DoubleLinkedList();
		ds.insert(0);
		ds.insert(1);
		ds.insert(2);
		ds.insert(3);
		ds.insert(4);
		ds.insert(7);
		ds.insert(8);
		ds.insert(9);
		ds.insert(10);
		ds.insert(11);
		
		System.out.println("Insert sequence of numbers");
		ds.display();
		
		System.out.println("removed:" + ds.remove(10));
		System.out.println("removed:" + ds.remove(3));
		
		System.out.println("Print list:");
		ds.display();
		
		System.out.println("Reversed list:");
		ds.reverselist();
		
	}
	
	
}
