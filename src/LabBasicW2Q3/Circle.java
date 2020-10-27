package LabBasicW2Q3;
// Definition of class Circle
public class Circle extends Shape {

   protected Point center;
   protected double radius;

   // default constructor
   public Circle() {
      this(0, 0, 0);
   }

   // Constructor
   public Circle( double centerX, double centerY, double radius ) {
      super("Circle");
      setRadius(radius);
      setCenter(new Point(centerX, centerY));
   }

   // Set radius of Circle
   public void setRadius( double radius )
      { this.radius = ( radius >= 0 ? radius : 0 ); }

   // Get radius of Circle
   public double getRadius() { return radius; }

   // Set center of Circle
   public void setCenter( Point p )
      { center = p; }

   // Get center of Circle
   public Point getCenter() { return center; }

   // Calculate area of Circle
   public double getArea() { return Math.PI * radius * radius; }

   // convert the Circle to a String
   public String toString()
      { return "Center = " + center + "; Radius = " + radius; }

}