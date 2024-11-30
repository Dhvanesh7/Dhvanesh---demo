package arreys;

public class ArreyDecandIns {

	public static void main(String[] args) {

		String []  menu = new String [5];
		System.out.println(menu[0]);
		System.out.println(menu[1]);
		System.out.println(menu[2]);
		System.out.println(menu[3]);
		System.out.println(menu[4]);
// 		System.out.println(menu[6]); upar na number accept nathi karvama aavata to error aavse
 
		System.out.println("-------------------");
		
		menu[2] = "Khichdi";
		menu[0] = "Rotlo";
		menu[1] = "Lenovo";
		System.out.println(menu[0]);
		System.out.println(menu[1]);
		System.out.println(menu[2]);
		System.out.println(menu[3]);
		System.out.println(menu[4]);
	}

}
