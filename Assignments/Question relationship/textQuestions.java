/***
 * This class is a sub class of Question. It checks the answer for a text question 
 * @author JUN JIE LI
 *
 */
public class textQuestions extends Question{
	
	
	public textQuestions( ) {
		super("","");
	}
	/****
	 * this method is to check the text question from user wheater is correct or incorrect
	 * @param String response
	 */
	public boolean checkAnswer(String  response){
		
		boolean yy;
		if ( response.equals(super.getAnswer())){
			yy=true;
		
		}
		else{
			yy=false;
		}
		return yy;
	}
	
    /***
     * this method is to print out
     */
	public String toString(){
		
		return "T"+"\n"+super.toString()+"\n"+super.getAnswer();
	}
	

}
