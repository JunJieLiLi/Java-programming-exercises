
public class LargerTwoIntegers {
	
	public static int larger( int a, int b){
	
		
		if (a<b){               // a<b ?
			return b;
		}else{
			return a;
		}
	
	}
	
	public static void main(String [] args){
		int largerNumber=larger(2,4);
		System.out.println("the larger number is:"+largerNumber);
	}

}
