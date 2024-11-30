package box5;

public class OptimusPrime {

	static boolean isprime(int num) {
		if (num<=1) {
			return false;
			
		}
		for (int i =2; i<num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		System.out.println("P Start");
		
		int num = 15;
		
		if(isprime(num)) {
			System.out.println(num+ " is Prime ");
			
		}else {
			System.out.println(num +" is Not - Prime");
		}
		
		System.out.println("P End");
		
	}

}
