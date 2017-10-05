import java.util.Scanner;
public class TotalCellphoneCast {
	public static void main(String [] args){
		Scanner in= new Scanner(System.in);
		System.out.println("plan or noplan:");
		String Dataplan= in.next();
		String data="plan";
		String nodata="noplan";
		
		if ( Dataplan.equals(data)){
			System.out.println("enter the price of your montly payment:");
			double monthlyfee= in.nextDouble();
			double Monthlyfee=monthlyfee*0.13+monthlyfee;
			System.out.println("enter the month of your plan:");
			double years=in.nextDouble();
			System.out.println("enter your cell phone price:");
			double cellphonePrice=in.nextDouble();
			double cellphoneinterest=cellphonePrice*0.13+cellphonePrice;
			double finalfees=cellphoneinterest+(years*Monthlyfee);
			System.out.println("your plan will be: "+finalfees);
			
			
		}
		
		if (Dataplan.equals(nodata)){
			System.out.println("enter yes or not if you want to cut off your Month to Month plan");
			String yess="yes";
			String noo= "no";
			String answer= in.next();
			if ( answer.equals(yess)){
				System.out.println("enter phone price:");
				double phonefeee=in.nextDouble();
				double phonefeeee=(phonefeee*0.13)+phonefeee;
				System.out.println(" enter month fees:");
				double monfee= in.nextDouble();
				double monfeee=monfee*0.13+monfee;
				System.out.println("enter unlock fee:");
				double unlockfee= in.nextDouble();
				double unlockfeee=unlockfee*0.13+unlockfee;
				double finallprice=phonefeee+monfeee+unlockfeee;
				System.out.println("your price of your phone , unlock fee after 1 month will be:"+finallprice);
				
				
			}
			System.out.println("enter the price of your montly payment:");
			double montlyCharge=in.nextDouble();
			double monthypay=montlyCharge*0.13+montlyCharge;
			System.out.println("enter your phone price:");
			double phonePrice=in.nextDouble();
			double phonefees=phonePrice*0.13+phonePrice;
			System.out.println("enter the month of your plan:");
			int yearr=in.nextInt();
			double price= monthypay*yearr+phonePrice;
			System.out.println("the total amount will be:"+price);
			
			
			
		}
		    
		
		
	}

}
