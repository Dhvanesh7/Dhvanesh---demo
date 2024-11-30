package arreys;

public class PelendromString {

	public static void main(String[] args) {

		
		String s = "d";
		
		String rev = "";
		
		for (int i=0; i<s.length(); i++){
			rev = s.charAt(i)+rev;
	
		}
			System.out.println("the revers is " + rev);
			
			if (s.equalsIgnoreCase(rev)) {
				System.out.println(s + " is pelendrom");
			}else {
				System.out.println(s + " is not pelendrom" );
			}
			
	}
	

}