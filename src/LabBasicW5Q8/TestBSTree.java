package LabBasicW5Q8;

public class TestBSTree {

	public static void main(String [] args) {
	int data = 0;
	BinarySearchTree tree = new BinarySearchTree();

		int randomSize = (int)(Math.random()*20);
		System.out.println("Inserting " + randomSize + " nodes:");
		for (int k = 1; k <= randomSize; k++) {
			data = (int)(Math.random()*20);
			System.out.print(data + " ");
			tree.insert(data);
		}
		System.out.println();

		System.out.println("BST - size: " + tree.size() + " height: " + tree.height());
		tree.inorder();

		if (!tree.isEmpty()) { 
			System.out.println("Deleteing the last inserted: " + data);
			tree.delete(data); // delete the last inserted
		}

		System.out.println("BST - size: " + tree.size() + " height: " + tree.height());
		tree.inorder();
	}

} // class TestBSTree