
public class letter {
	private String sender;
	private String recipient;
	private String Text;
	
	public letter( String from , String to, String text){
		sender= from;
		recipient=to;
		Text=text;
	}
	public void addLine( String line){  //how to insert a line?
		
		
	}
	public String getFrom(){
		return sender;
	}
	public String getRecipient(){
		return recipient;
	}
	public String getText(){
		return Text;
		
	}
	public static void main( String [] args){
		letter a= new letter( "Merry","John"," how are you");
		System.out.println(a.getFrom()+" "+ a.getRecipient()+" "+ a.getText());
	}

}
