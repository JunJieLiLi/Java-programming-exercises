import java.util.Scanner;
public class InHasNextExample {
	public static void main ( String [] args){
		Scanner in= new Scanner (System.in);
		//in.useDelimiter("[^A-Za-z]+");
		System.out.println("enter string values");
		
		while ( in.hasNext()){
			String input= in.next();
			System.out.println(input);
			
		}
	}

}
