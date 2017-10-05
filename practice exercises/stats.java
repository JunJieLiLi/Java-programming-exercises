import java.util.ArrayList;
import java.util.Scanner;
public class stats {
	public static void main(String [] ars){
		Scanner in = new Scanner (System.in);
		ArrayList<Double> listA= new ArrayList<Double>();
		//System.out.println("enter value:");
		//double value= in.nextDouble();
		System.out.println("enter values,-1 to stop:");
		double values=in.nextDouble();
		while (values!=-1){
			
			
			for ( int i=0; i<listA.size(); i++){
				listA.add(values);
			}
			values= in.nextDouble();
		 }
			
		for ( int i=0; i<listA.size(); i++){
			System.out.print(listA.get(i));
		}
		
	}
}
	/*
	 * this method is to calulate the sum of input
	 */
	


