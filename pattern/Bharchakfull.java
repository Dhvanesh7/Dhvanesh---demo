package pattern;

import java.util.Scanner;


public class Bharchakfull {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Total Number Of Raw");
		int rn = sc.nextInt();
		System.out.println("Enter Total Number of Columas");
		int cn = sc.nextInt();
		
		for (int r=1; r<=rn; r++) {
			for (int c=1; c<=cn; c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
