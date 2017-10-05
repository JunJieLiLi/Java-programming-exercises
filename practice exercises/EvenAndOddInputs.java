import java.util.Scanner;
public class EvenAndOddInputs {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println(" enter your integers:");
		
		while ( in.hasNextInt()){
			int input= in.nextInt();
			if ( input % 2 ==0){
				System.out.println("Even inputs are:"+input);
			}
			else if ( input % 2 <=1){
				System.out.println("Odd inputs are:"+input);
			}
		}
	}

}
