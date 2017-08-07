package com.features.java8;

public interface CustomInterface2 {

	public void demo1();
	
	default void demo222() {
		demo1();
	}
	
	default void demo333() {
		demo1();
	}
	
	public static void test() {
		System.out.println("test");
	}
	
}
