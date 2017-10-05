import java.util.ArrayList;
import java.util.Scanner;

public class Country {
	private String name;
	private int population;
	private double area;
	private double density;

	public Country(String n, int pop, double a, double d) {
		name = n;
		population = pop;
		area = a;
		density= d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}
	public double getDensity(){
		return density;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	public void setDensity( double d){
		density=d;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	public static void main(String [] args){
		ArrayList<Country> c= new ArrayList<Country>(); 
		Country c1= new Country ("Canada", 10, 15,8);
		Country c2= new Country ("usa", 11, 16,91);
		Country c3= new Country ( "china", 13,22,2);
		Country c4= new Country( "india",14,18,31);
		Country c5= new Country ("japan",19, 3,9);
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		c.add(c5);
		String largeName= c.get(0).getName();
		double largePop= c.get(0).getPopulation();
		for ( int i =1; i< c.size(); i++){
			if ( c.get(i).getPopulation()>largePop){
				largeName= c.get(i).getName();
				largePop= c.get(i).getPopulation();
			}
		}
		System.out.println("largest pop is "+ largeName);
		 largeName= c.get(0).getName();
		double largeArea= c.get(0).getArea();
		for ( int i =1; i< c.size(); i++){
			if ( c.get(i).getArea()>largeArea){
				largeName= c.get(i).getName();
				largeArea= c.get(i).getArea();
			}
			
		}
		System.out.println("the largesst area is: "+largeName+" "+largeArea);
		double largestDensity= c.get(0).getDensity();
		for ( int i=0; i<c.size();i++){
			if ( c.get(i).getDensity()>largestDensity){
				largestDensity=c.get(i).getDensity();
				largeName=c.get(i).getName();
				
			}
		}
		System.out.println("the largest density is: "+" "+largeName+" "+largestDensity);
		
	}
	

}