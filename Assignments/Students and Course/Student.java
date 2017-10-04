
/***
 * this class is a class that store information of all students in class 
 * @author JunJie Li
 *
 */
public class Student {
	private String name;
	private long id;
	private double quiz;
	private double assignments;
	private double midtermMark;
	private double finalExamMark;
	
	public Student( String n, long idd, double quizz,double assing, double mid, double finalmark){
		name= n;
		id=idd;
		quiz=quizz;
		assignments=assing;
		midtermMark=mid;
		finalExamMark=finalmark;
	}
	
	public void setName( String nn){
		name=nn;
	}
	public void setID( long idd){
		id=idd;
	}
	public void setQuiz( int q){
		quiz=q;
	}
	public void setAssignments( double assingg){
		assignments=assingg;
	}
	public void setMidtemMark( double midt){
		midtermMark=midt;
	}
	public void setFinalMark( double finall){
		finalExamMark=finall;
	}
			
	public String getName(){
		return name;
	}
	public long getId(){
		return id;
	}
	public double getQuiz(){ 	
		return quiz;
	}
	public double getAssignments(){
		return assignments;
	}
	public double getMidterm(){
		return midtermMark;
	}
	public double getFinalMark(){
		return finalExamMark;
	}
	public String toString(){
		return "name: "+name+" "+" Id: "+id+" "+" mark: "+getGrade();    // cant just use grade, since it is not a instance variable, and have to invok the method by calling getGrade()
	}
	 /*
	 * this method returns the grade of a student
	 * @param assignment, quiz, midterm, finalmark
	 *
	 */
	public double getGrade(){
		double grade=(quiz*15/100)+(assignments*15/100)+(midtermMark*20/100)+(finalExamMark*50/100);
		return grade;
	}
	
	

}
