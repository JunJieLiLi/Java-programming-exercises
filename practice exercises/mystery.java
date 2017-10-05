
public class mystery {
	
	public static double mys( double x, double y){
		double points= (x+y)/(y-x);
		return points;
	}

public static void main (String [] args){
	double resurt= mys(2,3);
	System.out.println("the matry is :"+ resurt);
}
}
