package BST;

public class MyMain {
	public static void main (String args[]) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(8);
		bst.insert(4);
		bst.insert(10);
		bst.insert(2);
		bst.insert(6);
		bst.insert(20);
		
		System.out.println("Inorder: ");
		bst.printInOrder();
		System.out.println();
		
		System.out.println("Preorder: ");
		bst.printPreOrder();
		System.out.println();
		
		System.out.println("Postorder: ");
		bst.printPostOrder();
		System.out.println();
		
		System.out.println("Min Value:" + bst.findMin());
		System.out.println("Max Value:" + bst.findMax());
		
		System.out.println("search found: " + bst.searchloop(2)); //search: iteration
		
	}
}
