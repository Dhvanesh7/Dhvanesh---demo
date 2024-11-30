package pattern;

import java.util.Scanner;

public class Dot {

	public static void main(String[] args) {

		Scanner sc = new Scanner ( System.in);
		
		System.out.println("Enter Total Number of Raw");
		int rn = sc.nextInt();
		System.out.println("Enter Total Number of Colluam");
		int cn = sc.nextInt();
		
		for ( int  r = 1; r <=rn; r++ ){
			for (int c = 1; c<=cn; c++) {
				
				if (r==1 ||  c==1 ||  r==rn || c==cn || (r==(rn/2)+1 && c==(cn/2)+1 ) ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
	}

}
