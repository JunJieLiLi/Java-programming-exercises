import java.util.Scanner;

public class ReadsInterger {
	Scanner in=new Scanner(System.in);
	System.out.println("enter your number:");
	int number= in.nextInt();
	if(number>0){
	System.out.println("this is positive");
	else if (number<0){
		System.out.println("this is negative");
		
			
		}
	else {
		System.out.println("this is zero");
	}
	}
	


}
