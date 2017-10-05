import java.util.Scanner;
public class b {
public static void main(String[] args){
	java.util.Scanner in= new Scanner(System.in);
	System.out.println("enter a number:");
	int digit= in.nextInt();
	if(digit==1){
		String one="one";
		System.out.println(one);
	}
	else if (digit==2){
		String two="two";
		System.out.println(two);
	}
	else{
		System.out.println("");
	}
}
}
