import java.util.Scanner;
public class UpperCaseInputs {
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		System.out.println("enter your string:");
		
		
		while ( in.hasNext()){
			String input= in.next();
			for ( int i=0; i<=input.length(); i++){
				char strings = input.charAt(i);
				if (Character.isUpperCase(strings)){
					System.out.print(strings);
				}
				
			}
			
			
		}
	}

}
