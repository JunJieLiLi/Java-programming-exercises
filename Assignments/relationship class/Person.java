/**
 * This class is the super Class of Employee, Patient, Doctor and Stuff . This class stores the information of person
 * 
 * @author JUN JIE LI
 *
 */
public class Person {
	private String name;
	private String address;
	private String birth;
	
	public Person ( String n, String a, String b){
		name=n;
		address=a;
		birth=b;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getBirth(){
		return birth;
	}
	
	public void setName( String n){
		name=n;
	}
	public void setAddress( String a){
		address=a;
	}
	public void setBirth( String b){
		birth=b;
	}
	
	public String toString (){
		return "Name: "+name+" "+"Address: "+address+" "+"Date of Birth: "+ birth;
	}
}


