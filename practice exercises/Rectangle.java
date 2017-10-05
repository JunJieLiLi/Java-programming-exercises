import java.util.Scanner;
public class Rectangle {
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("enter your lenght:");
	double lenght=in.nextDouble();
	System.out.println("enter your width");
	double width= in.nextDouble();
	System.out.println("the area is:");
	double area= width*lenght;
	System.out.println(area);
  }
}