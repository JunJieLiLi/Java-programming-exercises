import java.util.Scanner;
public class lagestValue {
	public static void main(String[] args){
		System.out.println("plz enter a value:");
		Scanner in= new Scanner(System.in);
		double largest=in.nextDouble();
		double input=5.6;
		while(in.hasNextDouble()){
			if(input>largest){
				largest=input;
				System.out.println(largest);
			}
		
		}

		
	}

}
