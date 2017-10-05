import java.util.Scanner;
public class CountSpaceUingLoop {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter a String:");
		String word= in.next();
		
		int count=0;
		int space=0;
		for(count=0; count<word.length();count++){
			char ch= word.charAt(count);
			if (ch==' '){
				space=space+1;
				
				
			}
			System.out.println(count);
		
			
		}
	}

}
