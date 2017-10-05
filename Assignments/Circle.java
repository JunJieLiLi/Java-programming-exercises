
public class Circle extends Shape{
	 private double r;

	    public Circle( double r ) {
	        this.r = r;
	    }

	    public double area() {
	        return 2.0*Math.PI*r*r;
	    }

	    public double boundingWidth() {
	        return 2.0*r;
	    }

	    public double boundingHeight() {
	        return 2.0*r;
	    }

	    public String toString() {
	        String v = String.format("%.4f", r );
	        return getClass().getName() + ": " + v;
	    }

	

}
