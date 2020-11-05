package BasicW5Q8;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();
        int randomSize = (int) (Math.random() * 20);
        System.out.println(randomSize);
        int items[] = new int[randomSize];
        for (int a = 0; a < randomSize; a++) {
            int randomValue = (int) (Math.random() * 100);
            items[a] = randomValue;
            BST.insert(randomValue);
        }
        System.out.println(Arrays.toString(items));
        BST.inorder();
        Scanner sc = new Scanner(System.in);
        int int1 = sc.nextInt();
        try {
            System.out.println("Include");
        } catch (Exception e) {
            System.out.println("Not included");
        }
    }
}
