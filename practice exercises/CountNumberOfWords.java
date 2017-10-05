import java.util.Scanner;
public class CountNumberOfWords {
	public static void main(String[] args){
		System.out.println("enter a string;");
		Scanner in= new Scanner(System.in);
		int word=0;
		while(in.hasNext()){
			String input=in.next();
			if (input.length()<=3){
				word=word+1;
			}
			System.out.print(word);
		}
	}

}
