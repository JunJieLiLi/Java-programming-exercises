
public class balance {
	public static void main(String []args){
		double balan= balance(0.13,100,5);
		System.out.println("the balance after n years with n interest is : "+balan);
		
	}
    public static double balance( double interest, double iniBalance, int years){
    	double Balance=0;
        Balance= iniBalance*interest+iniBalance*years;
    	return Balance;	
    	}
    }

