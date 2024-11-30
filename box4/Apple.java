package box4;

import java.util.Scanner;


public class Apple { // ODD OR EVEN  NUMBER PRACTICE

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Number to Chack Even Or Odd");
		
		int Number = sc.nextInt();
		
		if(Number%2 ==0)
		
		{
			System.out.println(Number + " is Even");
		}
		
		else 
		{
			System.out.println(Number + " is Odd");
		}
		
	}

}
