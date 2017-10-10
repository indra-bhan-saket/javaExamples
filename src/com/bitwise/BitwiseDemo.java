package com.bitwise;

public class BitwiseDemo {

	public static void main(String[] args) {
		
		//signed right shift(>>)
		int a = 3;
		a<<=2;
		System.out.println("11111> " + a);
		
		int b = 10;
		b>>=2;
		System.out.println("22222> " + b);
		
		//unsigned right shift(>>>)
		int c = 10;
		c>>>=2;
		System.out.println("22222> " + c);

	}

}
