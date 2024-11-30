package arreys;

import java.util.Scanner;


public class Silver {

	public static void main(String[] args) {

		int [] pipe = {10,20,30,40,50,10,10,20,20,10,10,20,10,2,0,10,10,1,0,1,0,10,1,0,10,10,1,0,10,1,01,01};
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		int count = 0;
	   
		for (int i=0; i<=pipe.length-1; i++) {
			if (pipe[i]==key) {
				count++;
			}
		}
			System.out.println(key+" has occured "+count+" times ");
	}

}
