
public class Shape {
	public double area() {
        return 0.0;
    }

    public double boundingWidth() {
        return 0.0;
    }

    public double boundingHeight() {
        return 0.0;
    }

    public String toString() {
        return "shape";
    }

    public static void main( String[] args ) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Rectangle( 10.0, 5.5 );
        shapes[1] = new Shape();
        shapes[2] = new Rectangle( 3.0, 2.0 );
        shapes[3] = new Circle( 2.0 );

        // everything is a shape
        for( int i = 0 ; i < shapes.length; i++ ) {
            System.out.printf("%s %.3f%n",
                shapes[i].toString(), shapes[i].area() );
        }
    }


}
