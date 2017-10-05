import java.util.Scanner;
public class SumOfNumberInputs {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter intger1:");
		
		// no need to make an user input here like : int value1=in.nextInt();
		
		int total=0;
		while (in.hasNextInt()){     //直接在这里读取 user's input
			int input=in.nextInt();
			total= input+total;  // keep update data
			System.out.println(total);
				
			
		}
		
	}

}
