import java.util.Scanner;
public class doloopCheckNumber {
	public static void main(String[] args){
	  Scanner in= new Scanner(System.in);
	   
	  
	  int number;
	  do{
		  
	  
	  System.out.println("enter a nunber that <0 and >100:");
	  number= in.nextInt();
	   
	  }
	  
	  while (number>0 && number<100);
	}
}
