import java.util.Scanner;
public class IndefiniteLooping {
	public static void main(String [] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter numbers:");
		int number=in.nextInt();
		int sum=0;
		
		while(number!=-1){
			sum=sum+number;
			number=in.nextInt();
			
		}
		System.out.println(sum);
	}

}