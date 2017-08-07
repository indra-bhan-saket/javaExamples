package com.features.java8;

public class CustomInterfaceImplementation implements CustomInterface1, CustomInterface2 {

	@Override
	public void demo1() {
		System.out.println("demo1");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomInterfaceImplementation implementation = new CustomInterfaceImplementation();
		implementation.demo2();
	}

}
