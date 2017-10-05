
public class student {
	private String name;
	private double score;
	private int quiz;
	
	private String A;
	private String B;
	private String C;
	private String D;
	private String F;	
	
	public student( String n, double scor){
		name=n;
		score=scor;
		quiz=1;
	}
	public student(String a,String b, String c, String d, String f){
		A=a;
		B=b;
		C=c;
		D=d;
		F=f;
	}
	public String getName(){   //assessor does not need refeerence
		return name;
	}
	public double gettotalScore(){
		return score;
	}
	public void addquiz(  double s){
		score=score+s;
		quiz++;
	}
	public double getAverageScore(){
	    return score/quiz;
	}
	public void transformedLetter( String a, String b, String c , String d, String f){
		if (A.equals(a)){
			A="4.0";
		}
		else if ( B.equals(b)){
			B="3.0";
		}
		else if (C.equals(c)){
			C="2.0";
		}
		else if (D.equals(d)){
			D="1.0";
		}
		else{
			F="0";
		}
	}
	public static void main(String [] args){
		student student1= new student("paul",80);
		student1.addquiz(70);
		student1.addquiz(0);
		System.out.println(student1.getName()+" "+student1.gettotalScore()+" "+student1.getAverageScore());
	}

}
