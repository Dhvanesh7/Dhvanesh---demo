package arreys;

public class Reversnumber {

	public static void main(String[] args) {

		int d = 8214;
		int rev = 0;
		int last;
		
		while (d!=0) { 
		last = d%10;
		rev = (rev*10)+ last;
		d/=10;
		}
		System.out.println(rev);
	}

}
