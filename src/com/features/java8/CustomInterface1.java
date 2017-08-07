package com.features.java8;

public interface CustomInterface1 {

	public void demo1();
	
	default void demo2() {
		demo1();
		System.out.println("demo2");
	}
	
	default void demo3() {
		demo1();
	}
}
