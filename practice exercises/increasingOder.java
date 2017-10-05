import java.util.Scanner;
public class increasingOder {
	public static void main (String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter your first number:");
		int first= in.nextInt();
		System.out.println("enter your next number:");
		int second=in.nextInt();
		System.out.println("enter your thrid number:");
		int thrid= in.nextInt();
		
		if(first<second && second<thrid){
			System.out.println("increasing");
		}
		else if (first>second && second>thrid){
			System.out.println("decreasing");
		}
		else if (first>second && second<thrid){
			System.out.println("neither");
		}
		else if ( first<second && second>thrid){
			System.out.println("either");
		}
	
	}

}
