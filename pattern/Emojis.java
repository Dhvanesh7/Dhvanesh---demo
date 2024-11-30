package pattern;

public class Emojis { // number with emojis

	public static void main(String[] args) {

		for ( int r = 1; r <= 50; r++ )
			 { 
					for (int c = 1; c<=50; c++)
				  { 
				 	if ((r+c)%2==0)
				  {
					  System.out.print( "😍 ");
				  }
				  else
				  {
					  System.out.print("❤️ ");
				  }
				  					 
				 }
			 
			 System.out.println();
				
			}
	}

}
