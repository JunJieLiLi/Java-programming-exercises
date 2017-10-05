import java.util.Scanner;
public class LargestSmallestWay2 {
	public static void main(String[] args){
		
	Scanner in= new Scanner(System.in);
	System.out.println("enter an integer:");
	int value1= in.nextInt();
	System.out.println("enter another value:");
	int value2= in.nextInt();
	if (value1>value2){
		System.out.println("the largest is:"+value1);
	}
	else if (value1<value2){
		System.out.println("the largest is:"+value2);
	}
		
	
	}
}
