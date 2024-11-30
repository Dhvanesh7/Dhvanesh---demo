package typecastings;

class Dadaji{
	int x = 10;
	void Arram(){
		System.out.println("Dada Arram Kare che");
	}
	
}
class Pitaji extends Dadaji{
	int y = 20;
	void Mahenat() {
		System.out.println("Piasa Kamay che");
	}
	
}
class Pota extends Pitaji{
	int z = 30;
	void Udana() {
		System.out.println("Uthadi Dese");
	}
	
}

public class Upcatinganddowncasting {

	public static void main(String[] args) {

		Dadaji d1 = new Pota(); 		// DWON CASTING
		System.out.println(d1.x);
		d1.Arram();
	
		System.out.println("--------------------");
		Pota p1 = (Pota)d1;
		System.out.println(p1.x);
		System.out.println(p1.y);
		System.out.println(p1.z);
		System.out.println("--------------------");
		p1.Arram();
		p1.Mahenat();
		p1.Udana();
		
		System.out.println("--------------------");
		Dadaji d2 = new Pitaji();		// UP CASTING 
		System.out.println(d2.x);
		d2.Arram();
		
	}

}
