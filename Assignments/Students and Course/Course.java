import java.util.ArrayList;

/***
 * This class stores information of courses in to classes
 * computes a list of students with class name and studetn's mark
 * @author JUN JIE LI
 *
 */
public class Course {
	private String courseName;
	private long CRN;
	private String room;
	private int slotNum;
	
	private  ArrayList<Student>stu = new ArrayList<Student>();           // creating an array list of object Student, called stu.
	
	public Course( String cn, long crn, String roomm, int sn){
		courseName=cn;
		CRN=crn;
		room=roomm;
		slotNum=sn;
	}
	
	public String getCourseName(){
		return courseName;
	}
	public long getCRN(){
		return CRN;
	}
	public String getRoom(){
		return room;
	}
	public int slitNum(){
		return slotNum;
	}
	public void add(Student s ){
		stu.add(s);
	}
	public void setCourseName( String cn){
		courseName=cn;
	}
	public void setCRN( long crn){
		CRN=crn;
	}
	public void setRoom( String rooom){
		room=rooom;
	}
	public void setSlotNum( int sn){
		slotNum=sn;
	}
	
	/*****
	 * this method returns the class average of a class
	 * @param stu
	 * @return average mark
	 */
	public double getClassAverage(){
		double mark=0;
		for ( Student s: stu){
			mark= mark+s.getGrade();
		}
		return mark/stu.size();
	}
	/**
	 * this method prints out the list of all students in a class
	 */
	
	public void printClassList() {         // a toString method that prints out the student information
		for ( Student student: stu){
			System.out.println(student);
		}
	}
		
	public static void main ( String [] args){
		ArrayList<Course> c= new ArrayList<Course>();                // the name of the arraylist is "c"
		
		Course c1= new Course("cs 2710",001,"En2007",01 );
	
		Student s1= new Student("Paul Li",12345,90,90,90,90);        //name,id,quiz, assignments,midtems,finals
		Student s2= new Student("Tom Smith",54321,20,50,50,90);
		Student s3= new Student("Bell Atom",21345,20,10,40,50);
		Student s4= new Student("Jet Li",3125,70,70,30,10);
		Student s5= new Student("Vivian Wang",32145,60,40,50,60);
		Student s6= new Student("Joe Belly",34125,70,80,20,30);
		Student s7= new Student("Tom Cruth",35124,10,30,50,70);
		Student s8= new Student("Jim Bee",23451,40,50,60,70);
		Student s9= new Student("Pablo Tim",25134,80,80,30,60);
		Student s10= new Student("Shi Man",24315,20,30,70,20);
		
		c1.add(s1);      // all students in course c1
		c1.add(s2);
		c1.add(s3);
		c1.add(s4);
		c1.add(s5);
		c1.add(s6);
		c1.add(s7);
		c1.add(s8);
		c1.add(s9);
		c1.add(s10);
				
		c.add(c1);   // add courses objects into an arraylist of course.		
		System.out.println( " course name: "+c1.getCourseName()+" "+"room: "+c1.getRoom()+" "+"CRN number: "+c1.getCRN()+" "+" class average is: "+c1.getClassAverage());
		System.out.println();
		c1.printClassList();
		

		
	}
}


