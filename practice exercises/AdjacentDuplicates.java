import java.util.Scanner;

/***
 * this class is a class checks the adjacent duplicates  
 * @author JunJie Li
 *
 */
public class AdjacentDuplicates {
	public static void main(String [] args){
		Scanner in= new Scanner (System.in);
		System.out.println("enter your long integer:");
		
		int input= in.nextInt();
		while ( in.hasNextInt()){
			int previous= input;
		    input= in.nextInt();
		    String IntString= ""+input;
		    for ( int i=0; i<=IntString.length(); i++){
		    	char ch= IntString.charAt(i);
		    	
		    	
		    
		    if ( input==previous){
		    	 System.out.println("duplicate input:");
		 
			}
		    else {
		    	 System.out.println(input);
		    }
		
		    }	
			
		}
		
	
	}

}
