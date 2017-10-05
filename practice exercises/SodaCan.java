/**
 * computes the surface area of a can
 * @author jjl
 *
 */
public class SodaCan {
	private double radius;
	private double height;
	
	/**
	 * create a constroctor for can
	 */
	public SodaCan( double radiuss , double high){
		radius=radiuss;
		height=high;	        
	}
	public double getSurfaceArea(){
		return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
	}
	public double getVolume(){
		return Math.PI*radius*radius*height;
	}
	public static void main( String [] args){
		SodaCan can1= new SodaCan(2.5,2.9);
		System.out.println("the s-area is: "+ can1.getSurfaceArea()+" "+"the volume is: "+can1.getVolume());
	}
	

}
