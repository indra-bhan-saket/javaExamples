package com.inheritance;

public class ConstructorChaining extends Child {

	public ConstructorChaining() {
		System.out.println("ConstructorChaining constructor");
	}
	public static void main(String[] args) {
		ConstructorChaining chaining = new ConstructorChaining();

	}

}

class Parent {
	public Parent() {
		System.out.println("Parent constructor");
	}
}

class Child extends Parent {
	
	public Child() {
		System.out.println("Child constructor");
	}
	
	public Child(int a) {
		System.out.println("Child parameterized constructor");
	}
}