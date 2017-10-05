import java.util.ArrayList;
import java.util.Scanner;
public class FindLargestandSmallesst {
	public static void main(String [] args){
		Scanner in= new Scanner (System.in);
		ArrayList<Double> listA= new ArrayList<Double>();
		System.out.println("enter a decimal number:");
		double input=in.nextDouble();
		while (input!=-999){       
			listA.add(input);
			System.out.println("enter a number:");
			input= in.nextDouble();
		}
		System.out.println(larger(listA));
		System.out.println(smallest(listA));  // why it always return -999 as the smallest number?
	}
	/**
	 *this method is to calculates the largest number  from user
	 */
	public static double larger(ArrayList<Double> listA){
		double larger=listA.get(0);
		for ( int i=0; i<listA.size();i++){
			if ( listA.get(i)>larger){
				larger=listA.get(i);
			}
		}
		return larger;
	}
	/**
	 * this method calculates the smallest number from user
	 */
	public static double smallest (ArrayList<Double> listA){
		double smallest= listA.get(0);
		for (int i=0; i<listA.size();i++){
			if ( listA.get(i)<smallest){
				smallest=listA.get(i);
			}
		}
		return smallest;
	}

}
