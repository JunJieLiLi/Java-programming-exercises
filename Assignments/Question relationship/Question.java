/**
 * This class has one question with a text and answer ( from textbook chapter 9 )
 * @author JUN JIE LI
 *
 */
import java.util.Scanner;

public class Question {
	private String text;
	private String answer;
	
	public Question(String t, String a){
		text="";
		answer="";	
	}
	public void setText( String  questionText){
		text= questionText;
	}
	public String getText(){
		return text;
	}
	public void setAnswer ( String correctResponse){
		answer= correctResponse;
	}
	public String getAnswer(){
		return answer;
	}
	public boolean checkAnswer(String  response){
		return response.equals(answer);
	}
	public String toString(){
		return text;
		
	}
	public static void main ( String  [] args){
		 ChoiceQuestionS first=new  ChoiceQuestionS();       // arraylist of choiceQuestions first.
		 ChoiceQuesstionsM second= new ChoiceQuesstionsM();
		 first.setText("what is the logo on the map of Canada: ");
		 first.addChoice("flog",false);
		 first.addChoice("apple",false);
         first.addChoice("maple leaf",true);
         presentQuestion(first);
         
         second.setText("Which of the following types are supertypes of Rectangle: ");
         second.addChoiceM("PrintStream",false);
         second.addChoiceM("Shape", true);
         second.addChoiceM("RectanglarShape", true);
         second.addChoiceM("Object",true);
         second.addChoiceM("String", false);
         presentQuestions(second);
		 
         textQuestions t1= new textQuestions();
         t1.setText("Which Java reserved word is used to declare a subclass?");
         t1.setAnswer("extends");
         textCheck(t1);
         
         NumQuestions n1= new NumQuestions();
         n1.setText("squre root of 2: ");
         n1.setAnswer("1.41421356");
         numCheck(n1);
         
        
      
	}
	public static void presentQuestion( ChoiceQuestionS q){
		
		System.out.println(q.getText());
		q.display();
		System.out.println("Your answer:");
		Scanner in= new Scanner(System.in);
		String response= in.nextLine();
		System.out.println(q.checkAnswer(response));
		
	}
	public static void presentQuestions( ChoiceQuesstionsM z){
		z.display();
		System.out.println("Your answer:");
		Scanner in= new Scanner(System.in);
		String res= in.nextLine();
		System.out.println(z.checkAnswer(res));
		
	}
	public static void textCheck(textQuestions t ){
		System.out.println(t.getText());
		System.out.println("your answer: ");
		Scanner in= new Scanner(System.in);
		String res= in.nextLine();
		System.out.println(t.checkAnswer(res));
		System.out.println(t.toString());
	}
	public static void numCheck( NumQuestions a){
		System.out.println(a.getText());
		System.out.println("your answer: ");
		Scanner in= new Scanner(System.in);
		String res= in.nextLine();
		System.out.println(a.checkAnswer(res));
		System.out.println(a.toString());
	}
	

}
