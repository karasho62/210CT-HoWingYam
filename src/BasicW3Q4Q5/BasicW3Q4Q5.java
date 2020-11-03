package BasicW3Q4Q5;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class BasicW3Q4Q5 {

    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList();
        for (;;) {
            System.out.println("Please enter a number for using LinkedList function./nIf it is adding function, please enter one more string with ',' to split");
            System.out.println("1.Add to Head,  2.Add to Tail   3.Remove from Head  4.Remove from Tail  5.Exit");
            Scanner sc = new Scanner(System.in);
            String string1 = sc.next();
            if ((string1.contains("1,") || string1.contains("2,")) && string1.length() > 2) {
                String[] stringValue = string1.split(",", 2);
                int functionNo = parseInt(stringValue[0]);
                String words = stringValue[1];
                if (functionNo == 1) {
                    linkedList.addToHead(new String(words));
                } else if (functionNo == 2) {
                    linkedList.addToTail(new String(words));
                }
            } else if (string1.length() <= 2) {
                if (parseInt(string1) == 3) {
                    if (!linkedList.isEmpty()) {
                        linkedList.removeFromHead();
                    } else {
                        System.out.println("It is empty");
                    }
                } else if (parseInt(string1) == 4) {
                    if (!linkedList.isEmpty()) {
                        linkedList.removeFromTail();
                    } else {
                        System.out.println("It is empty");
                    }
                } else if (parseInt(string1) == 5) {
                    System.out.println("Exit function");
                    break;
                }
            } else {
                System.out.println("Error Number");
            }
            System.out.println(linkedList);
        }
    }
}
