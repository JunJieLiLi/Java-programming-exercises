import java.util.Scanner;
public class DigitsChecking {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
	    System.out.println("enter an integer:");
	    int number= in.nextInt();
	    if (number<0){
	    	number=number*-1;
	    }
	    if (number<=10){
	    	System.out.println("1 digits");
	    }
	    else if(number<=100){
	    	System.out.println("2 digits");
	    }
	    else if (number<=1000){
	    	System.out.println("3 digits");
	    }
	    else if (number<=10000){
	    	System.out.println("4 digits");
	    }
	    else if (number <=100000){
	    	System.out.println("5 digits");
	    }
	}
	

}
