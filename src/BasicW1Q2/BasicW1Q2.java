package BasicW1Q2;

import static java.lang.Float.parseFloat;
import java.util.*;

class BasicW1Q2 {

    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number");
            double number1 = sc.nextDouble();
            int totalCoins=0;
            double coins[][] = {{10, 0}, {5, 0}, {2, 0}, {1, 0}, {0.5, 0}, {0.2, 0}, {0.1, 0}};
            for (int a = 0; a < coins.length; a++) {
                coins[a][1] = (number1 - number1 % coins[a][0]) /coins[a][0] ;
                number1 = number1 % coins[a][0];
                if (number1 == 0) {
                    break;
                }
                totalCoins+=coins[a][1];
            }
            System.out.println("Total Coins=" + totalCoins);
            System.out.println("Ten dollar Coins=" + coins[0][1]);
            System.out.println("Five dollar Coins=" + coins[1][1]);
            System.out.println("Two dollar Coins=" + coins[2][1]);
            System.out.println("One dollar Coins=" + coins[3][1]);
            System.out.println("50 cents Coins=" + coins[4][1]);
            System.out.println("20 cents Coins=" + coins[5][1]);
            System.out.println("10 cents Coins=" + coins[6][1]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
