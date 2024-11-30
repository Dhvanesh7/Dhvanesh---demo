package arreys;
import java.util.Scanner;

public class VowelCount {
    private static int i;
	private static int j;

	@SuppressWarnings("null")
	public static void main(String[] args) {
 
    	@SuppressWarnings({ "resource" })
		Scanner sc = new Scanner (System.in);
    		System.out.println("Dhvanesh , Harsh, Darshna, Yamunesh, Avi ");
    		String inputString = sc.next();
    		char [] vowels = { 'a' , 'e' , 'i' , 'o' ,'u'};
    		int [] vowelCount = new int [vowels.length];
    		for ( int i = 0; i< inputString.length(); i++ );
    		char currentChar = Character.toLowerCase(inputString.charAt(i));
    		for ( int j = 0; j < vowels.length; j++);
    		if ( currentChar == vowels[j]) {
    			vowelCount[j]++;
    			    		
    		}
    		System.out.println("Vowel count:");    		    	
    		
    		for ( int i=0; i< vowels.length; i++) {
    			char[] vowel = null;
    			System.out.println(vowels[i] + " "+ vowel[i]);
    			
    		}
    		
	}
    


	
	
	
}