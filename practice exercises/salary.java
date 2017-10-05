import java.util.Scanner;
public class salary {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter your worker's name:");
		String name=in.next();
		System.out.println("enter the working hours:");
		double hour= in.nextDouble();
		if (hour<40){
			double money= hour*9.24;
			System.out.printf("%.2f",money);
		}
		else if ( hour>40){
			double money2= 9.25*1.5*hour;
			System.out.printf("%.2f",money2);
		}
		
	}

}
