
public class SmallestFloatingNumber {
	
	
	/**
	 * computes the smallest of the three numbers
	 * @param number1
	 * @param number2
	 * @param number3
	 * @return smallest number
	 */
	
	public static double floating( double number1,double number2, double number3){
	double smallest = number1;
		if (number1<number2 && number1<number3){
			smallest=number1;
		}
		else if (number2<number3 && number2>number1){
			smallest = number2;
		}
		else if (number3>number2 && number3>number1){
			smallest=number3;
		}
		return smallest;
	}
	
	public static void main(String [] args){
		double largerst= floating(1,2,3);
		System.out.println("the smallest number will be:"+largerst);
	}

}
