package BasicW5Q8Q9W6Q10;
import java.util.*;
public class BasicW5Q8Q9W6Q10 {

    public static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();
        int randomSize = (int) (Math.random() * 20);
        BinaryNode root;
        System.out.println(randomSize);
        int items[] = new int[randomSize];
        for (int a = 0; a < randomSize; a++) {
            int randomValue = (int) (Math.random() * 100);
            items[a] = randomValue;
            BST.insert(randomValue);
        }
        System.out.println(Arrays.toString(items));
        Scanner sc = new Scanner(System.in);
        int int1 = sc.nextInt();
        if (BST.search(int1) >= 0) {
            System.out.println(int1 + " is exit");
        } else {
            System.out.println(int1 + " is not exit");
        }
        System.out.print("PreOrder : ");
        BST.preorder();
        System.out.print("PostOrder : ");
        BST.postorder();
        BST.delete(int1);
        System.out.print("InOrder : ");
        BST.inorder();
    }
}
