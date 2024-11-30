package box4;

import java.util.Scanner; // BIO DATA PRECTICE

public class Aladin {

	public static void main(String[] args) {

		System.out.println("Program Start");
		
		System.out.println("--------------------------------");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your Name");
		String name = sc.next();
		
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		
		System.out.println("Enter Your Gender");
		char gender = sc.next().charAt(0);
		
		System.out.println("Enter Your Percentage");
		double per = sc.nextDouble();
		
		System.out.println("Enter Your Contect Number ");
		long phno = sc.nextLong();
		
		System.out.println("---------------------------------");
		
		System.out.println("The Name Is " + name);
		System.out.println("Age is " + age);
		System.out.println("Gender is " + gender);
		System.out.println("Percentage is " + per);
		System.out.println("Contect Nomber is " + phno);
	
		System.out.println("----------------------------------");
		
		System.out.println("Program End");

	}

}
