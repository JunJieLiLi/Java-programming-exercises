/**
 * This class is a sub class of Person Class. This class stores the information of employees
 * @author JUN JIE LI
 *
 */
public class Employee extends Person {
	private long employeeNum;
	private String date;   // hiring date
	
	public Employee( String name, String address, String birth,long employeenumber, String dateHire){
		super (name,address,birth);
		employeeNum=employeenumber;
		date=dateHire;
	}
	
	public long getEmployeeNum(){ 
		return employeeNum;
	}
	public String getDate(){
		return date;
	}
	public void setEmployeeNum( long e){
		employeeNum=e;
	}
	public void setDate( String d){
		date=d;
	}
	
	public double getSalary(){
		return 0;
	}

	public String toString (){
		return super.toString()+" EmployeeNum: "+ employeeNum+" "+ "Date of Hiring: "+date;
	}

}
