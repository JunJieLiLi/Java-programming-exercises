import java.util.Scanner;
public class threeNumberSame {
	public static void main(String[] args){
		System.out.println("enter your first integer:");
		Scanner in= new Scanner(System.in);
		int integer1= in.nextInt();
		System.out.println("enter your next integer:");
		int integer2= in.nextInt();
		System.out.println("enter your thrid integer:");
		int integer3= in.nextInt();
		if ( integer1==integer2 && integer2==integer3){
			System.out.println("they are same");
		}
		else if ( integer1 != integer2 && integer2!=integer3){
		    System.out.println("they are not same");
		}
		
		
		
	}

}
