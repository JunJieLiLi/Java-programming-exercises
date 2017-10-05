import java.util.Scanner;
public class MiterToInches {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter your number:");
		double number= in.nextDouble();
		double inches= number*39.37;
		System.out.printf("%.2f", inches);
		System.out.println(" inches");
		
	}

}
