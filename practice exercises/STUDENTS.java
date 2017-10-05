
public class STUDENTS {
	private String name;
	private double score;
	private int quiz;
	
	public STUDENTS( String n, double s, int q){
		name=n;
		score=s;
		quiz=q;
	}
	public String getName(){
		return name;
	}
	public double getScore(){
		return score;
	}
	public void addquize ( double s){
		score=score+quiz;
		
		
	}

}

