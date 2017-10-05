import java.util.Scanner;
public class MiterTest {

	public static void main(String[] args) {
		
	
			Scanner in = new Scanner(System.in);
			System.out.println("enter your number:");
			double number= in.nextDouble();
			double miles= number*0.000621371;
			System.out.printf("%.2f",miles);
			

		}

	}

