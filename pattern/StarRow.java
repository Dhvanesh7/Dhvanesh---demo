package pattern;

public class StarRow{
    public static void main(String[] args) {
	
    	int n=8;
    	
	{
        for (int r = n; r >= 1; r--) {
            for (int k = 1; k<=(n-r) ; k++) {
                System.out.print(" ");
            }
            for (int s= 1; s<= (2*r)-1; s++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        //----------------------------
       // for (int r=1; r<=n; r++) {
        //	for (int k=1; k<=n; k++) {
        	//	System.out.print();
        	//}
        
        }
    }
 }
    
