import java.util.Scanner;
public class taxincome {
	public static void main (String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter your income:");
		int income= in.nextInt();
		if (income==50000 ){
			double a=income*0.01;
			System.out.printf("%.2f",a);
		}
		else if (income>50000 && income<75000){
			double b= income*0.02;
			System.out.printf("%.2f", b);
		}
		else if (income>75000 && income <1000000){
			double c= income*0.03;
			System.out.printf("%.2f",c);
		}
		else if ( income>1000000 && income <250000){
			double d= income * 0.04;
			System.out.printf("%.2f",d);
		}
		else if (income >250000 && income <500000){
			double e= income *0.05;
			System.out.printf("%.2f", e);
		}
		else if (income>500000){
			double f= income * 0.06;
			System.out.printf("%.2f",f);
		}

	}

}
