import java.util.Scanner;
public class ReadFloat {
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("enter a float:");
	double floatt= in.nextDouble();
	if (floatt==0){
		System.out.println("zero");
	}
	else if (floatt<0){
		System.out.println("positive");
		
		if(Math.abs(floatt)<1){
			System.out.println("large");
		}
	}
	else if (floatt>0){
		System.out.println("negative");
		if (Math.abs(floatt)>1){
			System.out.println("large");
		}
	}
	
	
}
}
