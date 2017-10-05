import java.util.Scanner;
public class CountInput {
	public static void main(String[] args){
		System.out.println("enter an doble input:");
		Scanner in= new Scanner(System.in);
		double total=0;
		while (in.hasNextDouble()){
			double input=in.nextDouble();
			total=total+input;
			System.out.println(total);
		}
	}

}
