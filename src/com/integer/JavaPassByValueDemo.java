package com.integer;

public class JavaPassByValueDemo {

	int x = 10;
	int y = 20;
	
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		
		swap(a, b);
		System.out.println("A: " + a + " B:" + b);
		increment(a, b);
		System.out.println("A: " + a + " B:" + b);
		
		JavaPassByValueDemo demo = new JavaPassByValueDemo();
		System.out.println("------------------------");
		swap(demo.x, demo.y);
		System.out.println("A: " + demo.x + " B:" + demo.y);
		increment(demo.x, demo.y);
		System.out.println("A: " + demo.x + " B:" + demo.y);

	}
	
	public static void swap(int a , int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("swap A: " + a + " B:" + b);
	}
	
	public static void increment(int a, int b) {
		a = a + 10;
		b = b + 10;
		System.out.println("increment A: " + a + " B:" + b);
	}
	
}
