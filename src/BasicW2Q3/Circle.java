/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicW2Q3;

/**
 *
 * @author cwitstudent
 */
public class Circle extends Shape {

    Point pcenter;
    double R;

    public Circle(double centerX, double centerY, double R) {
        super("Circle");
        setCenter(new Point(centerX, centerY));
        setRadius(R);
    }

    public void setRadius(double R) {
        R = Math.abs(R);
        this.R = R;
    }

    public double getRadius() {
        return R;
    }

    public void setCenter(Point pcenter) {
        this.pcenter = pcenter;
    }

    public Point getCenter() {
        return pcenter;
    }

    public double getArea() {
        return Math.PI * R * R;
    }

    public String toString() {
        return "Center = " + pcenter + "; Radius = " + R;
    }
}
