/****
 * this program calculates the volume of a box
 * @author jjl
 *
 */
public class VolumeOfBox {
	public static void main(String [] args){
		double result1= Volume(2);
		double result2= Volume(3);
		System.out.println("the volume of the box with length 2 is:"+result1);
		System.out.println("The volume of the box with length 3 is :"+result2);
	}



/**
 * this method is to calculate the volume of a box
 * @param size the size of a box
 * return the volume of a box
 */
	
public static double Volume( double size){
	double volme= size*size*size;
	return volme;
   }
	
}
