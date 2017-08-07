package com.staticdemo;

public class StaticInheritance extends Parent {

	public static void printMsg() {
		System.out.println("child method");
	}
	
	public static void main(String[] args) {
		StaticInheritance.printMsg();
		Parent.printMsg();

	}

}

class Parent {
	
	public static void printMsg() {
		System.out.println("Parent method");
	}
	
	public static void printMsg(int i) {
		System.out.println("Parent method");
	}
}
