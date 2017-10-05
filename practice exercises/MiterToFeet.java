import java.util.Scanner;
public class MiterToFeet {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter your number");
		double number= in.nextDouble();
		double feet= number*3.28;
		System.out.printf("%.2f",feet);
		System.out.println("feet");
		
		
	}

}
