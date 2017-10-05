import java.util.Scanner;
public class SetAvg {
	public static void main(String [] args){
		Scanner in= new Scanner(System.in);
		//System.out.println("enter numbers:");
		int number=in.nextInt();
		int sum=0;
		int count=0;
		int avg=0;
		int largest=(number);
		
		while(number!=-1){
			sum=sum+number;
			number=in.nextInt();
			count=count+1;
			if (number>largest){
				largest=number;
			}
			
		}
		System.out.println(sum);
		System.out.println(avg); //avg of the values
		System.out.println(largest);// set of the largest
	}

}