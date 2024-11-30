package arreys;

import java.util.Scanner;

public class SilverChamber{
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Size of array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter" +i+"  Element");
			arr [i] = sc.nextInt();
			
		}
		System.out.println("----------");
		
		for (int i=0; i<size; i++) {
			System.out.print(arr [i]+ " ");
		}
		
	}

}
