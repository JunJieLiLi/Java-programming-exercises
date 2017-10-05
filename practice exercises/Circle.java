import java.util.Scanner;
public class Circle {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("enter your radius:");
		double radius= in.nextDouble();
		double area= radius* Math.PI*radius;
		System.out.printf("%.2f", area);
		System.out.println(" miters");
		
		
	}

}

public class Perimiter{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("enter your radiues");
		double radiues=in.nextDouble();
		double perimeter= 2*Math.PI*radiues;
		System.out.printf("%2f", radiues);
		System.out.println(" miters");
	}
}