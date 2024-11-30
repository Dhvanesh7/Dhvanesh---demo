package box3;

public class Scoot {

	public static void main(String[] args) {

		String d = "Mortal Combate";
		int ucount = 0;
		int lcount = 0;
		
		
		for ( int i=0; i<d.length(); i++) {
			
			int ch = d.charAt(i);
			if(ch>=68 && ch<=96){
				ucount++;
				
			}else if (ch>=97 && ch<=122) {
				lconut++;
			}
		}
			System.out.println("Total Uppaer case Letter are " + ucount);
			System.out.println("Total lower case Letter are " + lcount);
	}

}
