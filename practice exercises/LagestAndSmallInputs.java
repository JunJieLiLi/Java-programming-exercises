import java.util.Scanner;
public class LagestAndSmallInputs {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("enter two  value:");
		int largestValue=in.nextInt();
		int smallest=largestValue;
		
		while (in.hasNextInt()){
			int input=in.nextInt();
			largestValue=Math.max(largestValue, input);
			smallest=Math.min(smallest,input);
				System.out.println("the largest number is:"+input);
			}
			
		}
		
		
		
	}

