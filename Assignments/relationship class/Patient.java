/**
 * This class is a sub class of Person Class. This class stores the information of patients and prints out the list that contains person, doctor, patient, employee and stuff and computes the salary.
 * @author:Jun Jie Li
 */
import java.util.ArrayList;

public class Patient extends Person {
	private long MCP;
	private String admission;
	private int roomNum;
	
	public Patient(String name, String address, String birth, long mcp,String adm, int r){
		super(name, address,birth);
		MCP=mcp;
		admission=adm;
		roomNum=r;
	}
	
	public long getMcp(){
		return MCP;
	}
	public String getAdmission(){
		return admission;
	}
	public int getRoomNun(){
		return roomNum;
	}
	public void setMcp( long m){
		MCP=m;
	}
	public void setAdmission( String a){
		admission=a;
	}
	public void setRoomNum( int r){
		roomNum= r;
	}
	
	public String toString(){
		return super.toString()+" MCP: "+MCP+" "+"Date of Admission: "+" "+admission+" "+"Room Number: "+" "+roomNum; 
	}
	
	public static void main (String [] args){
		ArrayList<Person> person1= new ArrayList<Person>();
		Person p1= new Person("Paul"," 12 NewTown rd"," Jan 14, 1998");   // name, address, date of birth
		Employee em1= new Employee("Chris", "91 Mayor rd", "Feb 2, 1990 ", 1234, "Aug 27");  //name, address, date of birth, employee number and date of hiring
		Doctor d1= new Doctor(" Pablo","197 Elizabeth ave","Jan 19 1989", 4163,"Jan 20",100000, "Dentist",99);  //name, address, date of birth, salary, spectialty and petient number
		Staff s1= new Staff("Joe","11 Apple Street", " Feb 28 1889", 4166, " April 11", "TA","CS",12345,16);   
		Patient pp1=  new Patient("Tom","Stavenger ave", " Feb 26 1889", 201050961," Dec 21", 1200);
		
		person1.add(p1);
		person1.add(em1);
		person1.add(d1);
		person1.add(s1);
		person1.add(pp1);
	
		for ( Person person: person1){  // method to print out the list of person1 object
			System.out.println(person);
		}
		
		System.out.println("The total salary is " + CalSalary(person1));
	}
	/**
	 * this method is to check weather the array contains any doctor object or staff object and prints out the salary
	 * @param a
	 * @param doc
	 * @param staf
	 */
	public static double CalSalary(ArrayList<Person> a){
		
		double total = 0.0;
		for ( int i=0; i<a.size();i++){
			if(a.get(i) instanceof Employee){
				Employee e =  (Employee) a.get(i);
				total += e.getSalary();
			}
			
			}
			return total;
		
		}
		
	

}
