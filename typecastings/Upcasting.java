package typecastings;

class Fathers{
	int a = 10;
	
}
class sons extends Fathers {
	int b = 20;
	
}
class Dougter extends Fathers{
	int c = 30;
	
}

public class Upcasting {

	public static void main(String[] args) {
	
		Father f1 = new Son();			// UP Casting
		System.out.println(f1.a);
		
//		Dougter d1 = (Dougter) f1;
		
		
	}
}
