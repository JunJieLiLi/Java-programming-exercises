
public class CountSpaces {
	public static void main(String[] args){
		int space=0;
		String str="oh my fucking god!";
		for (int i=0; i<str.length(); i++){
			char ch=str.charAt(i);
			if( ch==' '){
				space++;
			}
			
		}
		System.out.println(space);
	}

}
