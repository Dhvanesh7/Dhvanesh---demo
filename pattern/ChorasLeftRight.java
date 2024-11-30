package pattern;

import java.util.Scanner;


public class ChorasLeftRight { 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter total num of rows");
		int rn = sc.nextInt();
		System.out.println("Enter total num of Colluam");
		int cn = sc.nextInt();
		
		
		for (int r=1; r<=rn; r++) {
			for (int c=1; c<=cn; c++) {
				if (r==1 || c==1 || r==rn || c==cn || (r==c) || (r+c)==(rn+1))
						{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
}
}
