import java.util.Scanner;
import java.util.ArrayList;
public class Score {
	private String firstNam;
	private String lastNam;
	private long StudentNum;
	private long dateBith;
	private String quiz;
	private String answer;

	public Score( String f, String l, long num, long date, String q, String a){
		firstNam=f;
		lastNam=l;
		StudentNum=num;
		dateBith=date;
		quiz=q;
		answer=a;
		
	}
	public String getFistName(){
		return firstNam;
	}
	public String getLastName(){
		return lastNam;
	}
	public long getStudentNum(){
		return StudentNum;
	}
	public long getDateBirh(){
		return dateBith;
	}
	public String getQuiz(){
		return quiz;
	}
	public String getAnswer(){
		return answer;
	}
	public double getGrade(){   // this method returns the grade of quiz
		int count=0;
		for( int i=0; i<answer.length();i++){
			if (quiz.charAt(i).equals(answer.charAt(i))){
				count++;
			}
		}
		return count/answer.length();
	}
	
	
	public static void main ( String [] args){
		ArrayList<String> array1= new ArrayList<String>();
		Scanner in = new Scanner ( System.in);
		System.out.println("enter correct letters for answer, enter 'stop' to stop:");
		String input= in.next();
		while ( input.compareTo("stop")!=0){    // an arraylist that stores the answer letter of the quiz
			System.out.println("enter answer letters:");
			array1.add(input);
			input=in.next();
		}
		Score student1= new Score("jun","li",123,1989,"abc",input);
		Score student2= new Score("angie","tan",345,1990,"ada",input);
		System.out.println("the grade for first student is :"+ student1.getGrade());
		System.out.println("the grade for first student is :"+ student2.getGrade());
		
		
		
	}
	
}
