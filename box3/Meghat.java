package box3;

public class Meghat {

	public static void main(String[] args) {
	
		String d = "Ho Hello How Are You";
		char key = ' '; 
		int count= 0; 
		
		for (int  i=0; i<d.length(); i++) {
			if(d.charAt(i)==key) {
				count++;
			}
		}
			System.out.println("Num of Spance is " + count);
	}

}
