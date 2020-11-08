package BasicW4Q6;

import java.util.*;

public class BasicW4Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        String[] arr = {"Abby", "Boris", "Cat", "Dino", "Elvis"};
        Stack stack = new LinkedStack();
        System.out.println(stack.empty());
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.search("Cat"));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (String) stack.pop();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
