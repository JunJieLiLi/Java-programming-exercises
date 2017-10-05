/***
 * this class counts all of the vowels from  a string
 * @author jjl
 *
 */
public class P5point6 {
	public static void main(String [] args){
		int num= countVowels("abcedfghigk");
		System.out.println(num);
	}
	/***
	 * this method returns the number of vowels in a string 
	 * @param String str, where str is a string 
	 */

	public static int countVowels( String str){
		int sum=0;
		String convertion= str.toLowerCase();
		for (int i=0; i<str.length();i++){
			
			if ( convertion.charAt(i)=='a'){
				sum=sum+1;
			}
			else if (convertion.charAt(i)==('e')){
				sum=sum+1;
			}
			else if (convertion.charAt(i)==('o')){
				sum=sum+1;
			}
			else if (convertion.charAt(i)==('i')){
				sum=sum+1;	
			}
			else if (convertion.charAt(i)==('u')){
				sum=sum+1;
			}
						
		}
		return sum;
	}

}
