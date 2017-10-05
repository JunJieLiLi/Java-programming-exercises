
public class CashRegister {
	private int item;
	private double price;
	
	
	public CashRegister( String i, double p){
	item=0;
	price=0;
	
	}
	
	public void addItem( double prices){
		item=item+1;
		price=price+prices;
	}
	public double getTotal(){
		return price;
	}
	public int getCount(){
		return item;
	}
	public void clear(){
		
	}
	public static void main (String [] args){
		CashRegister cash1= new CashRegister();
		cash1=addItem(0.1);
		
	}

}
