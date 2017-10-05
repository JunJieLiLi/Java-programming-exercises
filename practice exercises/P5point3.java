
public class P5point3 {
	public static void main(String [] args){
		System.out.println(firstDigit(12345));
		System.out.println(lastDigit(12345));
		System.out.println(totalDigit(12345));
		
		
	}
	/***
	 * this method returns the first digit of an argument
	 * @param int n the value of the argument
	 */
	public static int firstDigit( int n){   //n=12345
		int first= n/10000;
		return first;
	}
	/***
	 * this method returns the last digit of an argument
	 * @param int n where n is the argument
	 */
	public static int lastDigit ( int n){
		int x=10000;
		
		for (int i=0; i<4;i++){
			n=n%x;
			x=x/10;
		}
		return n;		
		}
	/**
	 * this method returns the number of digits of argument
	 * @param int n where n is the argument
	 */
	public static int totalDigit( int n){
		int digits=0;
		int x=10000;
		for ( int i=0; i<=4;i++){
			n=n/x;
			digits=digits+1;	
		}
		return digits;
	}
	}

	


