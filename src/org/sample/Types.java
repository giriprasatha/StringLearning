package org.sample;

public class Types {
	public static void main(String[] args) {

		System.out.println("StringLiteral");

		String s = "java";
		System.out.println(s);

		int x = System.identityHashCode(s);

		System.out.println(x);
		

		String s1 = "java";
		System.out.println(s1);
		int y = System.identityHashCode(s1);
		System.out.println(y);
		
		String s2 = "Java";
		int z = System.identityHashCode(s2);
		System.out.println(z);
		
		
		System.out.println("nON LITERAL sTRING ************");
		
		String ns =new String("selenium");
		
		System.out.println(ns);
		int p = System.identityHashCode(ns);
		System.out.println(p);
		
		String ns1 =new String("selenium");
		System.out.println(ns1);
		
		int q = System.identityHashCode(ns1);
		System.out.println(q);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
