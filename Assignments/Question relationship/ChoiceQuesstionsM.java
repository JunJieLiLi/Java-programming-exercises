import java.util.ArrayList;
/***
 * This class is to to calculate a mutiple question with multiple answer.
 * @author JUN JIE LI
 *
 */
public class ChoiceQuesstionsM extends Question{
	
	private ArrayList<String> choicesM;
	
	public ChoiceQuesstionsM(){
		super("","");
		choicesM=new ArrayList<String>();
	}
	public void addChoiceM(String choice , boolean correct){
		choicesM.add(choice);
		if ( correct){
			String choiceString=""+choicesM.size();
			setAnswer(choiceString);
		}
		
	}

	public void display(){
	
		System.out.println();
		System.out.println("M");
		for (int i =0;i<choicesM.size();i++){
			System.out.println(choicesM.get(i));
		}
	}


}
