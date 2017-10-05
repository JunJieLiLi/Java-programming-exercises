/***
 * this class counts how many words in a string
 * @author jjl
 *
 */
public class P5point7 {
	public static void main( String [] args){
		System.out.println(Count2("a big man kissed a dog"));
		
	}
	/**
	 * this method counts how many words are there in a string
	 * @param n string , where n is a string 
	 */
	public static int  Count( String word ){
		int sumSpace=0;
		for (int i=0; i<word.length();i++){
			if (word.charAt(i)==' '){
				sumSpace=sumSpace+1;
			}
		}
		return sumSpace + 1;
	}
	
	public static int Count2(String word) {
		return word.split(" ").length;
	}

}
