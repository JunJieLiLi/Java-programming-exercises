import java.util.Scanner;
public class grade {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter your grade:");
		String grade= in.next();
		String a= "a";
		String a2="a-";
		String a3="a+";
		String b="b";
		String b2="b-";
		String b3="b+";
		String c="c";
		String c2="c-";
		String c3="c+";
		String d="d";
		String d2="d-";
	    String d3="d+";
		String f="f";
		if( grade.equals(a)){
			System.out.println("your grade is 4 ^_^");
		}
		else if (grade.equals(a2)){
			System.out.println("your grade is 3.7");
		}
		else if (grade.equals(a3)){
			System.out.println("your grade is 4");
		}
		else if (grade.equals(b2)){
			System.out.println("your grade is 2.7" );
		}
		else if( grade.equals(b3)){
			System.out.println("your grade is 3.3");
		}
		else if (grade.equals(b)){
			System.out.println("your grade is 3 ");
		}
		else if (grade.equals(c)){
			System.out.println("your grade is 2 ");
		}
		else if (grade.equals(c2)){
			System.out.println("your grade is 1.7");
		}
		else if (grade.equals(c3)){
			System.out.println("your grade is 2.3");
		}
		else if (grade.equals(d)){
			System.out.println("your grade is 1");
		}
		else if (grade.equals(d2)){
			System.out.println("your grade is 0.7");
		}
		else if (grade.equals(d3)){
			System.out.println("your grade is 1.3");
		}
		else if (grade.equals(f)){
			System.out.println("your grade is 0, fail!  -_-!!!");
		}
	}

}
