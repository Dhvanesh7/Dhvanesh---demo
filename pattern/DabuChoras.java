package pattern;

import java.util.Scanner;

public class DabuChoras {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Total Number Of Raw");
		int rn = sc.nextInt();
		System.out.println("Enter Total Number Of Colluam");
		int cn = sc.nextInt();
		
		for (int r=1; r<=rn; r++) {
			for (int c = 1; c<=cn; c++) {
				if( c==1|| r==rn||r==c || r==(rn/2)+1 || c==(cn/2)+1) {
				System.out.print("  ");
			}else{
				System.out.print("* ");
			}
		}System.out.println();
	}
	}
}
