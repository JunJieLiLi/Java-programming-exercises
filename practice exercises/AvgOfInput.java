import java.util.Scanner;
public class AvgOfInput {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter integer values:");
		
		int count=0;
		int total=0;
		while (in.hasNextInt()){
			int input= in.nextInt();
			total=input+total;
			count=count+1;
			
		}
		double avg=0;
		if (count>0){
	    avg=total/count;
	    System.out.println(avg);
		}
		
	}

}
