/***
 * This class is a sub-class of Question. It checks the answer for text quesions
 * @author JUN JIE LI
 *
 */
public class NumQuestions extends Question {

    
	public NumQuestions() {
		super("","");
	}
	/**
	 * this method is to check the answer of square root is corect or incorect
	 * @param String response
	 */
	public boolean checkAnswer(String  response){
		double aa= Double.parseDouble(super.getAnswer());
		boolean check;
		if ( aa>=1.3 && aa<=1.5){
			check=true;
			
		}
		else {
			check=false;
		}
		return check;
    }
	
	/***
	 * this method is to print out 
	 */
	public String toString(){
		return super.toString()+"\n"+super.getAnswer();  //+"\n"+super.checkAnswer(super.getAnswer());
	}
}
