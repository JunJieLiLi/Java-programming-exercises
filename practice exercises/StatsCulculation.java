/*
 * StatsCulculation culculates the mean, standard deviation and variance and correlation
 * author: Li Jun Jie
 */
import java.util.ArrayList;
import java.util.Scanner;
public class StatsCulculation {
	public static void main(String [] args){
		Scanner in = new Scanner (System.in);
		System.out.println("Mean=1, Standard deviation,verian=2");
		
		int selection= in.nextInt();
		if ( selection==1){
			System.out.println("enter values,-1 to stop:");
			double values=in.nextDouble();
		    double sum=0;
		    int count=0;
		    double avg=0;
		    while (values!=-1){
			    count=count+1;
			    sum=sum+values;
			    values=in.nextDouble();
			    }
		    avg=sum/count;
		    System.out.println("The average of samples is :"+avg);
		    System.out.println("The sum of samples is:"+sum);
		}
		else if ( selection==2){
			//System.out.println("enter sample size:");
			//double samplesize= in.nextInt();
			
			System.out.println("enter values,-1 to stop:");
			double valuess=in.nextDouble();
		    double summ=0;
		    double singlesum=0;
		    while (valuess!=-1){
		    	singlesum=valuess+singlesum;
			    valuess=valuess*valuess;
			    summ=summ+valuess;
			    valuess=in.nextDouble();
			    }
		    //double vriance= (1/(samplesize-1))*(summ-((singlesum)*(singlesum)/samplesize));
		    //double sd= Math.sqrt(vriance);
		   //System.out.println("The variance is :"+vriance);
		    //System.out.println("The standard deviation is :"+sd);
		    System.out.println(summ);
		    
		}
	}
	

}
