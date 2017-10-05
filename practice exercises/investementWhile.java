import java.util.Scanner;
public class investementWhile {
	public static void main(String[] args){
	Scanner in= new Scanner(System.in);
	System.out.println("enter your year:");
	int year= in.nextInt();
	int i=0;
	double balance=50000;
	
	
	while (i<=year){
		i=i+1;
		double interest=balance*0.05;
		balance=balance+interest;
		
		System.out.printf("%,2f",balance);
		
		
		
	}
	

  }
}