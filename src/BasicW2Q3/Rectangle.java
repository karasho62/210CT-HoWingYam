package BasicW2Q3;

public class Rectangle extends Shape {

    Point topLeft;
    double W, H;

    public Rectangle() {
        this(0, 0, 0, 0);
    }

    public Rectangle(double topLeftX, double topLeftY, double W, double H) {
        super("Rectangle");
        setWidth(W);
        setHeight(H);
        setTopLeft(new Point(topLeftX, topLeftY));
    }

    public void setWidth(double W) {
        W=Math.abs(W);
        this.W = W;
    }

    public double getWidth() {
        return W;
    }

    public void setHeight(double H) {
        H=Math.abs(H);
        this.H = H;
    }

    public double getHeight() {
        return H;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public double getArea() {
        return W * H;
    }

    public String toString() {
        return "TopLeft = " + topLeft + "; Height = " + H
                + "; Width = " + W;
    }
}
