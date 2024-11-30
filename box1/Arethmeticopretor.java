package box1;

public class Arethmeticopretor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 50;
		int b = 10;
		String any = "Dhvanesh";
		boolean c = false;
		int d = 40;
		double e = 250;
		byte f = 30;
		long g = 8866888214L;
		
		

		System.out.println(a+b+any+c+d+e);//60Dhvaneshfalse40250
		System.out.println(a+any+c+d+e);//50Dhvaneshfalse40250
//		System.out.println(a+b+c+d+e);//Error only boolean not work , with String Work
		System.out.println(a+b+any+d+e);//60Dhvanesh40250
		System.out.println(a+b+any+c+e);//60Dhvaneshfalse250
		System.out.println(a+b+any+c+d);//60Dhvaneshfalse40
		
		System.out.println(a+b+any+c+d+e);//60Dhvaneshfalse40250
		System.out.println(b+any+c+d+e);//10Dhvaneshfalse40250
		System.out.println(any+c+d+e);//Dhvaneshfalse40250
//		System.out.println(c+d+e);//Only boolean not working 
		System.out.println(d+e);//290
		System.out.println(e);//250
		
		System.out.println(a+b+any+c+d);//60Dhvaneshfalse40
		System.out.println(a+b+any+c+e);//60Dhvaneshfalse250
		System.out.println(a+any+c+d+e);//50Dhvaneshfalse40250
		System.out.println(b+any+c+d+e);//10Dhvaneshfalse40250
		
		System.out.println(a+a);//100
		System.out.println(a+b);//60
		System.out.println(a+any);//50Dhvanesh
//		System.out.println(a+c);//with out any string boolean not working
		System.out.println(a+d);//90 
		System.out.println(a+e);//300 
		
		System.out.println(b+b);//20
		System.out.println(b+any);//10Dhvanesh
//		System.out.println(b+c);// with out any string boolean not working 
		System.out.println(b+d);//50
		System.out.println(b+e);//260

		System.out.println(any+a);//Dhvanesh50
		System.out.println(any+b);//Dhvanesh10
		System.out.println(any+any);//DhvaneshDhvanesh
		System.out.println(any+c);//Dhvaneshfalse
		System.out.println(any+e);//Dhvanesh250

//		System.out.println(c+a);// with out any String not working 		
//		System.out.println(c+b);// with out any String not working
		System.out.println(c+any);//falseDhvanesh
//		System.out.println(c+c);//with out any String not working
//		System.out.println(c+e);//with out any String not working
		
		System.out.println(d+a);//90
		System.out.println(d+b);//50
		System.out.println(d+any);//40Dhvanesh
//		System.out.println(d+c);//with out any String not working
		System.out.println(d+e);//290
		
		System.out.println(e+a);//300
		System.out.println(e+b);//260
		System.out.println(e+any);//250Dhvanesh
//		System.out.println(e+c);//300
		System.out.println(e+e);//500
		
		System.out.println(a+b+any+c+d+e+f+g);//60Dhvaneshfalse40250308866888214
		System.out.println(a+b+any+c+d+e+f);//60Dhvaneshfalse4025030
		System.out.println(a+b+any+c+d+e+g);//60Dhvaneshfalse402508866888214
		
		System.out.println(f+a);//80
		System.out.println(f+b);//40
		System.out.println(f+any);//30Dhvanesh
//		System.out.println(f+c);with out any String not working
		System.out.println(f+e);//280
		System.out.println(f+f);//60 
		System.out.println(f+g);//8866888244 

		System.out.println(g+a);// 8866888264
		System.out.println(g+b);// 8866888224
		System.out.println(g+any);// 8866888214Dhvanesh
//		System.out.println(g+c);// long ke sath boolean 
		System.out.println(g+d);// 8866888254
//		System.out.println(g+e);// 8.866888464E9 long and dooble total nathi thato
		System.out.println(g+f);// 8866888244
		System.out.println(g+g);// 17733776428
		
		System.out.println(a+any+b+c+d+e+f+g);//50Dhvanesh10false40250308866888214
//		System.out.println(a+e+b+c+d+any+f+g);//50Dhvanesh10false40250308866888214
//		System.out.println(a-any-b-c-d-e-f-g);
		
//		System.out.println(a*any+b+c%e+f/g);//Error
//		System.out.println(a/any*b+c-e%f/g);//Error
//		System.out.println(a+any*b*c*e%f%g);//Error
//		System.out.println(a+any*b%c%e%f%g);//Error
		System.out.println(a+any+b+c+e+f%g);//50Dhvanesh10false25030
//		System.out.println(a+any+b+c+e-f+g);//Error double or byte ko - nahi kar sakte
		
 
		
		
	}

}
