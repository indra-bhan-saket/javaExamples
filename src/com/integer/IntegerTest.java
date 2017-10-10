package com.integer;

public class IntegerTest {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		Integer i3 = new Integer(1);
		
		System.out.println(i1!=i2);
		System.out.println(i1>=i2);
		System.out.println(i1<=i3);
		
		int x = Integer.MAX_VALUE+10;
		System.out.println(x);
		
	}

}
