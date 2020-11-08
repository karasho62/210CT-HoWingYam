package BasicW1Q1;


import java.util.*;

public class BasicW1Q1 {

    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the first string");
            String str1 = sc.nextLine();
            System.out.println("Please enter the second string");
            String str2 = sc.nextLine();
            System.out.println("You have enterd two Strings.\nFirst String :" + str1 + "\nSecond String :" + str2);
            if (str1.contains(str2)) {
                System.out.println("First string contains Second string");
            } else {
                System.out.println("First string does not contain Second string");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
