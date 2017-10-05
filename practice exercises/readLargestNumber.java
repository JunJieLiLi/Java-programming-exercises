import java.util.Scanner;
public class readLargestNumber {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter three floating point numbers:");
		double number1= in.nextDouble();
		double number2= in.nextDouble();
		double number3= in.nextDouble();
		System.out.println(Math.max(number3,Math.max(number1, number2)));
		
			
	}

}
