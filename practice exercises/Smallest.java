import java.util.Scanner;
public class Smallest {
	public static void main ( String [] args){
		Scanner in =  new Scanner ( System.in);
		System.out.println("enter number: ");
		double input=in.nextDouble();
		int count=0;
		double sum=0;
		double smallest= Integer.MAX_VALUE;
		//while ( in.hasNextDouble()){
			//input=in.nextDouble();
			//count++;
			//sum=sum+input;
			//if (input< smallest){
				//smallest=input;
			//}
			
		//}
		//System.out.println(smallest);
		//System.out.println(sum/count);: 
		while ( input!=-1){
			System.out.println("enter number: ");
			//input=in.nextDouble();
			count++;
			sum=input+sum;
			if (input< smallest){
				smallest=input;
			}
			input=in.nextDouble();
			
		}
		System.out.println("avg"+sum/count);
		System.out.println("smalleset value is: "+smallest);
	}

}
