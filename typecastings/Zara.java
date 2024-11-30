package typecastings;

class Father{
	int a = 10;
	void work() {
		System.out.println("Hard Working ");
	}
}

class Son extends Father{
	int b = 20;
	void play() {
		System.out.println("Playing PUBG");
	}
}

public class Zara {

	public static void main(String[] args) {
		
		Father f = new Son();		// UP Casting Example
		System.out.println(f.a);		
		f.work();				
		
		System.out.println("-----------------------");
		
		Son s = (Son)f;				// Down Casting Example
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println("-----------------------");
		s.work();
		s.play();
		
	}

}
