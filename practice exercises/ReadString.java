import java.util.Scanner;
public class ReadString {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter a string:");
		String isUp=" ";
		while (in.hasNext()){
			String input=in.next();
			int length= input.length();
			for ( int i=0; i<=length;i++){
				if (Character.isUpperCase(input.charAt(i))){
					char w=input.charAt(i);
					isUp=isUp+w+" ";
					
				}
			System.out.println("The uppercase characters are " + isUp);
			}
			
			}
			
			
		
	
		
			
			
		
	}

}
