package com.enumtest;

public class EnumExampleMain {

	public static void main(String[] args) {
		System.out.println(EnumDemo.first.values()[0]);

	}

}

enum EnumDemo {

	first(10), second, third;
	
	private int value;
	
	private EnumDemo(int value) {
		this.value = value;
	}
	
	private EnumDemo() {
	}
}