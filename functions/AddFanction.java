package functions;

public class AddFanction {

	static void add(int x, int y) {
	System.out.println(x+y);
	}
			
	static void square (int x) {
		System.out.println("Squarer of " +  x  + " is " + (x*x));
	}
	
	static void average(double a, double b, double c, double d, double e, double f) {
		double Ans = (a+b+c+d+e+f)/6;
		System.out.println("Average is " + Ans);
	}
	
	static void Subtraction(int d, int i) {
		System.out.println(d-i);
	}
	
	static void Multiplication(int f, int g) {
		System.out.println(f*g);
	}
	static void Division(int h, int j) {
		System.out.println(h/j);
	}
	
	static void choras(int side) {
		for( int r = 1; r <= side; r++) {
			for ( int c= 1; c <= side; c++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	static void piramid(int n) {
		for (int r=1; r<=n; r++) {
			for (int k=1; k<=(n-r); k++) {
				System.out.print("  ");
			}
			for (int s=1; s<=(2*r)-1; s++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void area(double redious) { 
		double res = 3.142 * redious * redious;
			System.out.println(res);
	}
	
	static void simpleintrest(double p, double t, double r) {
		double si = (p*t*r)/100;
		System.out.println("Intrest will be " + si);
	}
	
	
	public static void main(String[] args) {
	
	System.out.println("-------------------------");	
	System.out.println("program Start (Addition)");
	System.out.println();
	add (100,200);
	add (200,300);
	add (300,400);
	add (400,500);
	add (500,500);
	System.out.println();
	System.out.println("program End (Addition)");
	System.out.println("-------------------------");
	System.out.println("program Start (Square)");
	System.out.println();
	square(5);
	square(10);
	square(15);
	square(20);
	square(25);
	System.out.println();
	System.out.println("program End (Square)");
	System.out.println("-------------------------");
	System.out.println("program Start (Average)");
	System.out.println();
	average (10, 20, 30, 40, 50, 60);
	average (40, 50, 60, 70, 80, 90);
	average (78, 88, 91, 98, 54, 44);
	average (100, 110, 120, 110, 890, 222);
	average (130, 140, 150, 445, 250, 999);
	System.out.println();
	System.out.println("program End (Average)");
	System.out.println("-------------------------");
	System.out.println("program Start (Subtraction)");
	System.out.println();
	Subtraction (10, 20);
	Subtraction (4000, 50);
	Subtraction (78, 88);
	Subtraction (100, -11);
	Subtraction (130, 14);
	System.out.println();
	System.out.println("program End (Subtraction)");
	System.out.println("-------------------------");
	System.out.println("program Start (Multiplication)");
	System.out.println();
	Multiplication (100, 20);
	Multiplication (10, 50);
	Multiplication (78, 55);
	Multiplication (9, -11);
	Multiplication (1660, 14);
	System.out.println();
	System.out.println("program End (Multiplication)");
	System.out.println("-------------------------");
	System.out.println("program Start (Division)");
	System.out.println();
	Division (10, 210);
	Division (15, 80);
	Division (788, 555);
	Division (10, -11);
	Division (160, 14);
	System.out.println();
	System.out.println("program End (Division)");
	System.out.println("-------------------------");
	System.out.println("program Start ( Choras Pattern)");
	System.out.println();
	choras (10);
	System.out.println();
	System.out.println("program End (Choras Pattern)");
	System.out.println("-------------------------");
	System.out.println("program Start ( Piramid Pattern)");
	System.out.println();
	piramid (10);
	System.out.println();
	System.out.println("program End ( Piramid Pattern)");
	System.out.println("-------------------------");
	System.out.println("program Start ( Trigiya Pattern)");
	System.out.println();
	area (10);
	area (100);
	area (1000);
	area (10000);
	area (100000);
	System.out.println();
	System.out.println("program End ( Trigiya Pattern)");
	System.out.println("-------------------------");
	System.out.println("program Start ( Sadu Vyaj Pattern)");
	System.out.println();
	simpleintrest (100 , 2 , 3);
	simpleintrest (1000 , 5 , 6.9);
	simpleintrest (15100 , 1 , 7);
	simpleintrest (104870 , 6 , 1);
	simpleintrest (98728.350 , 4 , 6.58);
	System.out.println();
	System.out.println("program End ( Sadu Vyaj Pattern)");
	System.out.println("-------------------------");
	
	
	}
	
}
