import  java.util.Scanner;
public class NextDouble {
	public static void main(String[] args){
		
	
	Scanner in= new Scanner(System.in);
	System.out.println("enter a number:");
	
	double total=0;
	int count=0;
	while (in.hasNextDouble()){
		double imput=in.nextDouble();
		total =total+imput;
		count=count+1;
	
	}
	System.out.println(total);

}
}