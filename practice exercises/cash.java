import java.util.Scanner;
import java.util.ArrayList;

public class cash {
	public static void main ( String [] args){
		ArrayList<String> items= new ArrayList<String>();
		ArrayList<Double> prices= new ArrayList<Double>();
		Scanner in = new Scanner ( System.in);
		System.out.println("enter -1 to stop or enter price: ");
		double price= in.nextDouble();
		
		
		while (price!=-1){
			System.out.println("enter item name:");
			String name= in.next();
			items.add(name);
			prices.add(price);
			System.out.println("enter price:");
		    price= in.nextDouble();	
		}
		
		System.out.printf("your total cost is: "+ "%.2f",total(prices));
		
	}
	public static double total (ArrayList<Double> money){
		double totall=0;
		for( int i=0; i<money.size();i++){
			totall= totall+money.get(i);
		}
		return totall;
	}
	

}
