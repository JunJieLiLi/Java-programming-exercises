/**
 * This class is a sub class of Employee class. It stores the imformation of employee and computes salary of stuff
 * @author JUN JIE LI
 *
 */
public class Staff extends Employee{
	private String title;
	private String department;
	private double salaray;
	private int hours;
	
	public Staff( String name, String address, String birth,long employeenumber, String dateOfHiring, String titlee, String depr, double salr,int hour){
		super (name, address, birth,employeenumber,dateOfHiring);
		title=titlee;
		department=depr;
		salaray=salr;
		hours=hour;
	}
	public String getTitle(){
		return title;
	}
	public String getDepartment(){
		return department;
	}
	public double gethourlySalary(){
		return salaray;
	}
	public int getHours(){
		return hours;
	}
	/*
	 * this method is to culculate the total salary of stuff in a week
	 */
	public double getSalary(){
		return salaray*hours;
	}
	public void setTitle( String t){
		title=t;
	}
	public void setDepartment( String d){
		department=d;
	}
	public void setSalary( double s){
		salaray= s;
	}
	public void setHours(int h){
		hours=h;
	}
	public String toString (){
		return super.toString()+" Title: "+ title+" "+ "Department: "+department+" "+"Salary:"+" "+salaray+" "+"Hours per week: "+" "+hours+" "+ "Salary: "+getSalary();
	}

}
