package org.sample;

public class MutableImmutable {
	
	public static void main(String[] args) {
	
		
		
		System.out.println("mutable**********************");
		
		StringBuffer i1 = new StringBuffer("python");
		System.out.println(i1);
		int p = System.identityHashCode(i1);
		System.out.println(p);
		StringBuffer i2 = new StringBuffer ("selenium");		
		System.out.println(i2);
		
		int q = System.identityHashCode(i2);
		
	System.out.println(q);	
	StringBuffer append = i1.append(i2);
	System.out.println(append);
	
	int r = System.identityHashCode(append);
	System.out.println(r);
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
