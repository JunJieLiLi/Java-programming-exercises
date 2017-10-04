
import java.util.ArrayList;
/***
 * This class is the sub class of Question. It culculates a multiple question with single answer
 * @author JUN JIE LI
 *
 */
public class ChoiceQuestionS extends Question {
	
	
	private ArrayList<String> choices;
	
	public ChoiceQuestionS(){
		super("","");
		choices=new ArrayList<String>();
	}
	/***
	 * this method is to add an string type of value to an arraylist of choice and check wheater  it is correct or incorrect.
	 * @param choice
	 * @param correct
	 */
	public void addChoice(String choice , boolean correct){
		choices.add(choice);                                 // add string choice to an array of string named choices
		if ( correct){
			String choiceString=""+choices.size();  //convert from integer to string
			setAnswer(choiceString);
		
		}
	}

	/**
	 * this method is print out
	 */
	public void display(){
		super.toString();
		System.out.println();
		System.out.println("S");
		for (int i =0;i<choices.size();i++){
			int cn=i+1;
			System.out.println(cn+": "+choices.get(i));
		}
	}

}
