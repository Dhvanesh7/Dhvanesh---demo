package ooppss;

class Granny{
	void love() {
		System.out.println("Grannys... Love");
	}
}

class Mom extends Granny {
	void care() {
		System.out.println("Moms... Care");
	}
}

class Doughter extends Mom{
	void Study() {
		System.out.println("Study of beti calss ");
	}
}

public class Parivar {
	
	public static void main(String[] args) {

		Doughter d1 = new Doughter();
		d1.love();
		d1.care();
		d1.Study();
		
		System.out.println("________________________________");
		
		Mom m1 = new Mom();
		m1.love();
		m1.care();
//		m1.Study();
		
		System.out.println("_________________________________");
	
		Granny g1 = new Granny();
		g1.love();
//		g1.care();
//		g1.Study();
	
	}

}
