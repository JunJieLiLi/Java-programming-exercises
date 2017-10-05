import java.util.Scanner;
public class HightestTemp {
	public static void main(String [] args){
		System.out.println("enter your temp value:");
		Scanner in= new Scanner(System.in);
		double highestValue=in.nextDouble();
		int highestmonth=0;
		
		for (int currentMounth=2; currentMounth<=12; currentMounth++){
			double nextValue=in.nextDouble();
			if (nextValue>highestValue){
				highestValue=nextValue;
				highestmonth=currentMounth;
				
			}
				
			
		}
		System.out.println(highestmonth);
		
	}

}
