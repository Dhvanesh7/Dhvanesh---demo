package box3;

public class Bumble {

	// Dhvanessh revers with for loop and pelendrom
	
	public static void main(String[] args) {
		
		String d = "DhVaNesH";
		String rev = "";
		
		for(int i=0; i<d.length(); i++)
		{
		rev = d.charAt(i)+rev;
		
		}
		
	System.out.println("Reverse is " + rev);
		
	if(rev.equalsIgnoreCase(d)) {
		System.out.println(d +" is Pelendrom ");
	}else {
		System.out.println(d +" is not Pelendorm");
	}
		
	}
	
}
