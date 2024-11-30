package box1;

public class UnaryOprator {

	public static void main(String[] args) {
	/*	 
		int a = 17;
		int b = a++ + ++a;
		
		System.out.println(a);  // 19
		System.out.println(b);  // 36
		
		System.out.println("----------------------");
		
		int i = 45;
		int j = i++ - --i;
		System.out.println(i);  // 45
		System.out.println(j);  // 0

		System.out.println("----------------------");
		
//		int m = 15;
//		int n = m++ + --m - ++m + m--;
		
//		System.out.println(m);  // 15
//		System.out.println(n);  // 30
		
		System.out.println("--------------------------");
		
		int d = 75;
		int e = d++ - --d + d++ - d++;
		
		System.out.println(d);  //77
		System.out.println(e);  //-1
		
		System.out.println("---------------------------");
		
		int f = 8000;
		int g = f++ - ++f + f++ - ++f - f++ + --f;
		
		System.out.println(f);   // 8004
		System.out.println(g);  // -4
		
		System.out.println("------------------");
		
		
		int h = 9024;
		int k = --h - --h + ++h - --h + ++h - --h - h++;
		
		System.out.println(h);  // 9023
		System.out.println(k);  // -9019
		
		System.out.println("----------------------");
		
		int l = 980278;
		int o = i++ + --i - ++i + --i - ++i + --i;
		
		System.out.println(l); // 980278
		System.out.println(o); // 88

		System.out.println("-------------------------");
		
		int x = 8787;
		int y = x++ - ++x + --x - --x - x-- + ++x - --x + ++x;
		
		System.out.println(x); // 8787
		System.out.println(y); // 0
		
		System.out.println("------------------------");
		
		int s = 88664;
		int w = s++ - ++s + ++s - s-- + s-- + ++s;
		
		System.out.println(s); // 88666
		System.out.println(w); // 177330
		
		System.out.println("---------------------------");
		
		int v = 4545;
		int t = v-- + ++v - ++v + v++ - v++ + --v ;
		
		System.out.println(v); // 4547
		System.out.println(t); //9090
		
		System.out.println("----------------------------");
		
//		int r = 10;
//		int u = r++ - ++r + --r + ++r - r++ - r++;
		
//		System.out.println(r); // 14
//		System.out.println(u); //-4
		
		System.out.println("---------------------");
		
		int rk = 8;
		int uv = rk++ - ++rk + --rk + ++rk - rk++ - rk++;
		
		System.out.println(rk); // 12
		System.out.println(uv); //-4
		
		System.out.println("-------------------"); */
		
		int m = 5;
		int n = 2;
		
		int p = m++ - --n;
		int q = --m + 10 - n++;
		int r = n-- - (m+n);
		m++;
		p--;
		--n;
		
		System.out.println(m+"  "+n+"  "+p+"  "+q+"  "+r);
		
		
		System.out.println("----------------------");
		 
		int a = 3;
		int b = -5;
		int c = 1;
		
		int d = a++ - (b+3) + --c + b++;
		int e = (a+b+c-d)*2;
		int f = b++ - a++ - c++;
		
		++a;
		--c;
		System.out.println(a+"  "+b+"  "+c+"  "+d+"  "+e+"  "+f);
		
	}

}
