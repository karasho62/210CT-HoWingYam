package LabBasicW2Q3;

/**
 * Title: TestShapeArray.java Description: A simple test-drive program to work
 * on an array of shapes Company: ICT HKIVE(MH)
 *
 * @author Patrick TONG
 */

public class TestShapeArray {

    public static void main(String[] args) {
        Shape shapeArray[] = new Shape[GenLib.genInt(10, 20)];
        for (int i = 0; i < shapeArray.length; i++) {
            if (GenLib.genInt(0, 1) == 0) {
                shapeArray[i] = new Circle(GenLib.genInt(-10, 10),
                        GenLib.genInt(-10, 10),
                        GenLib.genInt(1, 100));
            } else {
                shapeArray[i] = new Rectangle(GenLib.genInt(-10, 10),
                        GenLib.genInt(-10, 10),
                        GenLib.genInt(1, 100),
                        GenLib.genInt(1, 100));
            }
        }
        for (int i = 0; i < shapeArray.length; i++) {
            System.out.println(shapeArray[i].getName() + ": "
                    + shapeArray[i] + "; Area = "
                    + shapeArray[i].getArea());
        }
        System.exit(0);
    }
}
