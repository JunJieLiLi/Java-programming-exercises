import java.util.ArrayList;
import java.util.Scanner;
public class CashRegister {
	private double price;
	private int itemCount;
	
	public CashRegister( double pricee, int itemCountt){
	     price=pricee;
	     itemCount=itemCountt;
	}
	public double getPrice(){
		return price;
	}
	public int itemCount(){
		return itemCount;
	}
	public void setPrice( double priceee){
		price= priceee;
	}
	public void setItemCount( int item){
		itemCount=item;
	}
	public double getTotalPrice(){
		return price*itemCount;
	}
	
	public static void main ( String [] args){
		Scanner in = new Scanner(System.in);
		ArrayList<CashRegister> price= new ArrayList<CashRegister>();
		//ArrayList<String> item= new ArrayList <String>();
		CashRegister transaction1= new CashRegister(3.12,4);  //double price, int countNumber
		CashRegister transaction2= new CashRegister(1.25,8);
		CashRegister transaction3= new CashRegister(2.5, 4);
		CashRegister transaction4= new CashRegister(3.75,3);
		
		double sum=price.get(0).getTotalPrice();
		for ( int i=1; i<price.size();i++){
			sum=sum+price.get(i).getTotalPrice();
			
		}
		System.out.println("total price will be: "+sum);
		
		
	}

}
