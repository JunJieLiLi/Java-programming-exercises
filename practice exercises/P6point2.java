/**
 * this class swap the first element with the last element in the array.
 * @author jjl
 *
 */
public class P6point2 {
	public static void main ( String [] args){
		double [] array1= {1,5,2,8,6,7,9,12,11,16};
		for ( int i=0; i<array1.length-1;i++){
			double temp=array1[9];
			array1[9]=array1[0];
			array1[0]=temp;
		}
		for ( int i=0;i<array1.length;i++){
			System.out.print(array1[i]);
		}
	}
}
