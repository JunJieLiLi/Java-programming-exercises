
public class P6point9 {
	public static void main(String [] args){
		int [] a= {1,2,3,4,5};
		int [] b= {1,2,8,4,5};
		System.out.println(equal(a,b));
		
	}
	/**
	 * this method returns true if two array has the same element in the same order
	 */
	public static boolean equal(int[] a, int [] b ){
		boolean aa= true;
		for ( int i=0; i<a.length-1;i++){
			if ( a[i]==(b[i])){
				if(a[i]<a[i+1]){  //to determine weather it is in order
					return true;
				}
				else{
					return false;
				}
		    }
			else{
				return false;
			}
		}
		return aa;
	}

}
