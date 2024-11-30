package box5;

public class Marvel {

	static void ironman() {
		System.out.println("Ironman Strat");
		hulk();
		System.out.println("Ironman End");
	}
	
	public static void main(String[] args) {

		System.out.println("P Start");
		ironman();
//		hulk();
		System.out.println("P End");
	}
	
	static void hulk() {
		System.out.println("Hulk Start");
		System.out.println("Hulk End");
	}

}
