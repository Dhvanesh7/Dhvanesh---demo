package pattern;

import java.util.Scanner;

public class BharchakSlow {

	public static void main(String[] args) {
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
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
		}
		
	}

}
