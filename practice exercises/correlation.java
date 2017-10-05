import java.util.ArrayList;
import java.util.Scanner;
public class correlation {
	public static void main(String [] args){
		Scanner in= new Scanner (System.in);
		
		System.out.println("enter -1 to stop or enter x:");
		
		double x1=in.nextDouble();
		
		ArrayList<Double> xi= new ArrayList<Double>();
		
		ArrayList<Double> yi= new ArrayList<Double>();
		
		while ( x1!=-1){
			System.out.println("enter customer y1:");
			double y1=in.nextDouble();
			xi.add(x1);
			yi.add(y1);
			System.out.println("enter x1");	
			x1=in.nextDouble();
			
		}
		for ( int i=0; i<xi.size(); i++){
			System.out.println(xi);
			System.out.println(yi);
		}
	}
}
