package arreys;

public class ReversString {

	public static void main(String[] args) {

		
		String s = "Rajkot";
		
		String rev = "";
		
		for (int i=0; i<s.length(); i++){
			rev = s.charAt(i)+rev;
	
		}
			System.out.println("the revers is " + rev);
	}
	

}
