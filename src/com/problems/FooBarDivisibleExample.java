package com.problems;

public class FooBarDivisibleExample {

	public static void main(String[] args) {
		int number = 20;
		FooBarDivisibleExample example = new FooBarDivisibleExample();
		example.checkNumber(number);
		//example.checkNumberAnother(number);
	}
	
	private void checkNumber(int number) {
		for(int i=1; i<=number; i++) {
			if(i%3 == 0 &&  i%5 == 0) {
				System.out.println("FOOBAR");
			} else if(i%3 == 0 ) {
				System.out.println("FOO");
			} else if(i%5 == 0 ) {
				System.out.println("BAR");
			} else {
				System.out.println(i);
			}
		}
	}
	
	private void checkNumberAnother(int number) {
		for(int i=1; i<=number; i++) {
			if(i%3 == 0 ) {
				if(i%5 == 0) {
					System.out.println("FOOBAR");
				} else {
					System.out.println("FOO");
				}
			} else if(i%5 == 0) {
				if(i%3 == 0 ) {
					System.out.println("FOOBAR");
				} else {
					System.out.println("BAR");
				}
			} else {
				System.out.println(i);
			}
		}
	}

}
