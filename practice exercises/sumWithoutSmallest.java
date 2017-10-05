import java.util.ArrayList;
import java.util.Scanner;
public class sumWithoutSmallest {
	public static void main( String [] args){
		Scanner in = new Scanner (System.in);
		System.out.println("enter numbers, -99 to stop:");
		double input=in.nextDouble();
		ArrayList<Double> list1= new ArrayList<Double>();  
		double sum=0;
		
		while (input!=-99){
			list1.add(input);
			System.out.println("enter a number:");
			input=in.nextDouble();
			sum=sum+input;
		}
		
		double difference= sum-(sum-sml(list1));
		System.out.println("the difference is :"+difference);
	}

		public static double sml ( ArrayList<Double> list1){
			double small= list1.get(0);
			for (int i=0; i<list1.size();i++){
				if ( list1.get(i)<small){
					small=list1.get(i);
				}
			}
			return small;
		}
}
