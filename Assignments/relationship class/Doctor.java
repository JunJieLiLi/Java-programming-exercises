/**
 * This is a sub class of Employee class. This class stores the information of doctors
 * @author JUN JEI LI
 *
 */
public class Doctor extends Employee{
	private double salary;
	private String specialty;
	private int patientNum;
	
	public Doctor(String name, String address, String birth,long employeenumber, String dateOfHiring, double sala, String spe, int patient){
		super(name,address,birth,employeenumber,dateOfHiring);
		salary= sala;
	    specialty=spe;
		patientNum=patient;
	}
	
	public double getSalary(){
		return salary;
	}
	public String getSpecialty(){
		return specialty;
	}
	public int getPatientNum(){
		return patientNum;
	}
	public void setSalary( double s){
		salary=s;
	}
	public void setSpecialty( String s){
		specialty=s;
	}
	public void setPatientNum( int p){
		patientNum=p;
	}
	public String toString (){
		return super.toString()+"Salary: " + salary+" "+ "Specialty:"+" "+specialty+" "+"Patient Number: "+ patientNum+" "+"Salary: "+ getSalary();
	}

}
