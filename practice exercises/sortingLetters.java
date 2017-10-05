import java.util.Scanner;
public class sortingLetters {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter three string:");
		String a= in.next();
		String b= in.next();
		String c= in.next();
	
		if (a.compareTo(b)<=-1 && a.compareTo(c)<=-1 && b.compareTo(c)<=-1){   // a<b=-1 && a<c=-1 && b<=-1
			System.out.println(a);
		}
		else if (a.compareTo(b)>=1 && a.compareTo(c)>=1 && b.compareTo(c)>=1){
			System.out.println(a);               // abc
		}
		
		
	}

}