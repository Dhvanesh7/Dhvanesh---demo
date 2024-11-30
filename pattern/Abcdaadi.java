package pattern;

public class Abcdaadi {

	public static void main(String[] args) {
		char i;
		char j;
		{ 
			for (i='A' ; i<='Z'; i++) {
				for (j='A'; j<='Z'; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
	}

}
