package PPTBasicW5Q8;

public class BSTTest {

    public static void main(String[] args) {
        int data = 0;
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("Inserting :");
        for (int k = 1; k <= 10; k++) {
            data = (int) (Math.random() * 100);
            System.out.print(data + " ");
            tree.insert(data);
        }
        System.out.println();
        System.out.print("inorder:");
        tree.inorder();
        tree.delete(data); // delete the last inserted
        System.out.print("preorder:");
        tree.preorder();
        System.out.print("postorder:");
        tree.postorder();
        System.out.println(tree.size());
        System.out.println(tree.height());
        System.out.println(tree.isEmpty());
    }
}
