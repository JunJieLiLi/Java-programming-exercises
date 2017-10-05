
import java.util.Scanner;
public class sortingNumber {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter your first number:");
		int first=in.nextInt();
		System.out.println("enter your second number:");
		int second= in.nextInt();
		System.out.println("enter your thrid number:");
		int thrid= in.nextInt();
		if ( first<second && second<thrid){
			System.out.println("in order");
		}
		else if (first<second && second==thrid){
			System.out.println("in order");
		}
		else if ( first>second && second>first){
			System.out.println("in order");
		}
		else if (first<second && second>thrid){
			System.out.println("not in order");
		}
	}
}
