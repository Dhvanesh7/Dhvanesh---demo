package thisOpretor;

class Toyota{
	String matirial;
	int size;
	String colour;
	int cc;
	
	public Toyota(String matirial, int size, String colour, int cc) {
	
		this.matirial = matirial;
		this.size = size;
		this.colour = colour;
		this.cc = cc;
	}
	
	void details() {
		System.out.println("Toyota Matirial is "+matirial+
							"Toyota Size is "+size+
							"Toyota Colour is "+colour+
							"Toyoya car cc is "+cc);
	}
	
}

public class Landcruiser {

	public static void main(String[] args) {
		Toyota s1 = new Toyota("Dimond " , 5 ,"Blue ", 1500);
		s1.details();
		Toyota s2 = new Toyota("Honyaki " , 8 ,"Black ", 1500);
		s2.details();
		Toyota s3 = new Toyota("Ouroboros " , 9 ,"White ", 1500 );
		s3.details();
		Toyota s4 = new Toyota("Nenohi " , 7 ,"Orange ", 1500);
		s4.details();
		Toyota s5 = new Toyota("Panther " , 1 ,"Pink ", 1500);
		s5.details();
		Toyota s6 = new Toyota("Gentak " , 4 ,"Sky blue", 1500);
		s6.details();
		Toyota s7 = new Toyota("Orient " , 9 ,"Yellow ", 1500);
		s7.details();
		
	}
}
