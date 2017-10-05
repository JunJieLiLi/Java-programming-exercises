/**
 * This class stores the information of cans and computes the average surface area of a list of cans 
 * @author: JUN JIE LI
 */
import java.util.ArrayList;

public class SodaCan implements Measurable {
	private double radius;
	private double hight;
	
	public SodaCan( double r, double h){
		radius=r;
		hight=h;
	}
	/**
	 * this method is to culculates the surface area of a can object
	 * return doublle surface area
	 */
	public double getMeasure(){
		double area= (2*Math.PI*radius*hight)+(2*Math.PI*radius*radius);
		return area;
	}
	
	public static void main ( String  [] args){
		ArrayList <SodaCan> ListOfSoda= new ArrayList <SodaCan>(); 
		SodaCan s1= new SodaCan ( 1.2, 1.3);
		SodaCan s2= new SodaCan ( 1.1, 1.9);
		SodaCan s3= new SodaCan ( 0.3, 0.4);
		
		ListOfSoda.add(s1);
		ListOfSoda.add(s2);
		ListOfSoda.add(s3);
		
		double total = 0;
		for ( SodaCan soda: ListOfSoda){
			total += soda.getMeasure();
		}
		System.out.print("the average surface area is:");
		System.out.printf("%7.2f", total/ListOfSoda.size()); 
	}
	
	

}
