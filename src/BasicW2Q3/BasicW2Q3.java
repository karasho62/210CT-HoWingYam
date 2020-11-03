package BasicW2Q3;

import static java.lang.Double.parseDouble;
import java.util.*;

public class BasicW2Q3 {

    public static void main(String[] args) {
        Circle circle;
        Rectangle rectangle;
        for (;;) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number for using calating function.");
            System.out.println("1:Circle Area,  2:Retangle Area,    3:Both  4:Exit");
            int functionNo = sc.nextInt();
            if (functionNo == 1) {
                System.out.println("Please enter three numbers for centerX, centerY and radius with ',' to split.");
                String string1 = sc.next();
                String[] circleValue = string1.split(",", 3);
                double pX = parseDouble(circleValue[0]);
                double pY = parseDouble(circleValue[1]);
                double rValue = parseDouble(circleValue[2]);
                circle = new Circle(pX, pY, rValue);
                System.out.print(circle.getName() + ": " + circle.toString());
                System.out.println("; Area = " + circle.getArea());
            } else if (functionNo == 2) {
                System.out.println("Please enter four numbers for topLeftX, topLeftY, width and height with ',' to split.");
                String string1 = sc.next();
                String[] rectangleValue = string1.split(",", 4);
                double topLeftX = parseDouble(rectangleValue[0]);
                double topLeftY = parseDouble(rectangleValue[1]);
                double width = parseDouble(rectangleValue[2]);
                double height = parseDouble(rectangleValue[3]);
                rectangle = new Rectangle(topLeftX, topLeftY, width, height);
                System.out.print(rectangle.getName() + ": " + rectangle.toString());
                System.out.println("; Area = " + rectangle.getArea());
            } else if (functionNo == 3) {
                System.out.println("Please enter seven numbers as centerX, centerY and radius for circle, "
                        + "and topLeftX, topLeftY, width and height for rectangle with ',' to split.");
                String string1 = sc.next();
                String[] shapeValue = string1.split(",", 7);
                double pX = parseDouble(shapeValue[0]);
                double pY = parseDouble(shapeValue[1]);
                double rValue = parseDouble(shapeValue[2]);
                circle = new Circle(pX, pY, rValue);
                double topLeftX = parseDouble(shapeValue[3]);
                double topLeftY = parseDouble(shapeValue[4]);
                double width = parseDouble(shapeValue[5]);
                double height = parseDouble(shapeValue[6]);
                rectangle = new Rectangle(topLeftX, topLeftY, width, height);
                System.out.print(circle.getName() + ": " + circle.toString());
                System.out.println("; Area = " + circle.getArea());
                System.out.print(rectangle.getName() + ": " + rectangle.toString());
                System.out.println("; Area = " + rectangle.getArea());
            } else if (functionNo == 4) {
                System.out.println("Exit function.");
                break;
            } else {
                System.out.println("Error!!! Please enter a number for using calating function.");
                System.out.println("1:Circle Area,  2:Retangle Area,    3:Both  4:Exit");
            }
        }
    }
}
