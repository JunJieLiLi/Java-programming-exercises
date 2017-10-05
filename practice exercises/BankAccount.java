/***************************
 * author:li jun jie
 * 
 * this program simulates a bank transaction
 ***************************/

import java.util.Scanner;
public class BankAccount {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter your initial amount for checking:");
		double initialChecking= in.nextDouble();
		System.out.println("enter your initial amount for saving:");
		double initialSaving=in.nextDouble();
	
		if (initialChecking<0){
			System.out.println("no money in your balance!");
		}
		else if (initialChecking >0){
			System.out.println("withdrawal,deposit or transfer?");
			String answer= in.next();
			String with= "withdrawal";
			String deposit= "deposit";
			String transfer="transfer";
			
			if (answer.equals(with)){
				System.out.println("checking or saving?");
				String reply=in.next();
				String checking="checking";
				String saving= "saving";
				if(reply.equals(checking)){
					System.out.println("enter your amount:");
					double amount1= in.nextDouble();
					if (amount1>initialChecking){
						System.out.println("you are overdraw");
					}
					else if (amount1<initialChecking){
						double balance1=initialChecking-amount1;
						System.out.println("your checking balance is:"+balance1);
						double intialsav1=initialSaving;
						System.out.println("your saving balance is:"+initialSaving);
					}
					
				}
				else if (reply.equals(saving)){
					System.out.println("enter your amount:");
					double amount2=in.nextDouble();
					if (amount2>initialSaving){
						System.out.println("you are overdraw");
					}
					else if (amount2<initialSaving){
						double balance2=initialSaving-amount2;
						System.out.println("your saving balance is:"+balance2);
						System.out.println("your checking balance is:"+initialChecking);
					}
					
				}
			}
			else if (answer.equals(deposit)){
				System.out.println("checking or saving?");
				String replyy=in.next();
				String checkingg= "checking";
				String saving2="saving";
				if (replyy.equals(checkingg)){
					System.out.println("enter your amount:");
					double amount3=in.nextDouble();
					double balance3= amount3+initialChecking;
					System.out.println("your checking balance is:"+balance3);
					System.out.println("your saving balance is:"+initialSaving);
				}
				else if (replyy.equals(saving2)){
					System.out.println("enter your amount:");
					double amount4=in.nextDouble();
					double balance4= amount4+initialSaving;
					System.out.println("your saving balance is:"+balance4);
					System.out.println("your checking balance is:"+initialChecking);
				}			
		  			
			}
			else if (answer.equals(transfer)){
				System.out.println("checking or saving?");
				String reply3=in.next();
				String checking3="checking";
				String saving3= "saving";
				if (reply3.equals(checking3)){
					System.out.println("enter your amount:");
					double amount5= in.nextDouble();
					double balance5= initialChecking-amount5;
					double savingTrans= initialSaving+amount5;
					System.out.println("your checking balance is:"+balance5);
					System.out.println("your saving account is:"+savingTrans);
				}
				else if (reply3.equals(saving3)){
					System.out.println("enter your amount:");
					double amount6= in.nextDouble();
					double balance6= initialSaving-amount6;
					double checkingTrans=initialChecking+balance6;
					System.out.println("your saving balance is:"+balance6);
					System.out.println("your checking balance is:"+checkingTrans);
				}
			}
			
		}
	}

}
