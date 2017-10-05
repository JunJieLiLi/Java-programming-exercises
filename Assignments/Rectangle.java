
public class Rectangle extends Shape{
	private double w, h;

    public Rectangle( double w, double h ) {
        this.w = w;
        this.h = h;
    }

    public double area() {
        return w*h;
    }

    public double boundingWidth() {
        return w;
    }

    public double boundingHeight() {
        return h;
    }

    public String toString() {
        return "Rectangle: " + w + " " + h;
    }



}
