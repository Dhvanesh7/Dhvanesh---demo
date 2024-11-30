package overloading;

class Animal{
	void noise () {
		System.out.println("Animal Making Sound");
	}
}

class Dog extends Animal{
	@Override
	void noise () {
		System.out.println("Bhow... Bhow...");
	}
}

class Cat extends Animal{
	@Override
	void noise() {
		System.out.println("Miaaau.....Miaaau...");
	}
}

class Snake extends Animal {
	@Override
	void noise () {
		System.out.println("Siss .. sisss");
	}
}

public class MethodOverLoadjing {

	
	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.noise();
//		System.out.println("---------------");
//		Dog d1 = new Dog();
//		d1.this.noice();
//		System.out.println("---------------");
//		Cat c1 = new Cat();
//		c1.noise();
//		System.out.println("----------------");
//		Snake s1 = new Snake();
//		s1.noise();
		}		
	}







