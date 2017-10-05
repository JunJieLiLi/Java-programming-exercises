import java.util.Scanner;
public class HybirdCar {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter your car price:");
		int carPrice= in.nextInt();
		System.out.println("enter your miles driving per year:");
		int miles= in.nextInt();
		System.out.println("enter your gas price:");
		double gasprice= in.nextDouble();
		System.out.println("enter the miles per gallon:");
		int milesPerGallen= in.nextInt();
		
		double totalValue= carPrice+miles*gasprice;
		System.out.println(totalValue);

	
	}

}
