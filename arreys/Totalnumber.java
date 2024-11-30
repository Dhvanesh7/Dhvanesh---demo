package arreys;

public class Totalnumber {

	public static void main(String[] args) {

		int [] arr = {55,22,14,15,18,79,5,3,888};
		
		int sum=0;
		
		for (int i = 0; i<arr.length; i++) {
			 
				sum+=arr[i];
			
		}
			
		System.out.println(" " + sum);
	}

}
