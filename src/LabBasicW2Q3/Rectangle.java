package LabBasicW2Q3;// Definition of class Rectangle
public class Rectangle extends Shape {

   protected double length, width;
   protected Point topLeft;

   // default constructor
   public Rectangle() {
      this(0, 0, 0, 0);
   }

   // Constructor
   public Rectangle( double topX, double topY, double length, double width) {
      super("Rectangle");
      setTopLeft(new Point(topX, topY));
      setLength(length);
      setWidth(width);
   }

   // Get top left corner
   public Point getTopLeft() { return topLeft; }

   // Set top left corner
   public void setTopLeft( Point p ) { topLeft = p; }

   // Set length
   public void setLength( double l ) { length = l; }

   // Get length
   public double getLength() { return length; }

   // Set Width
   public void setWidth( double w) { width = w; }

   // Get Width
   public double getWidth() { return width; }

   // Calculate area of Rectangle
   public double getArea() { return width * length; }

   // convert the Circle to a String
   public String toString() {
	   return "TopLeft = " + topLeft + "; Length = " + length +
	   		  "; Width = " + width;
   }

}