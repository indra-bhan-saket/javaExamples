package com.inheritance;

public class OveriddenMethodCalls {

	public static void main(String[] args) {
		ParentClass parentClass = new ChildClass();
		parentClass.myMethod(1);

	}

}

class ParentClass {
	
	public void myMethod(int a) {
		System.out.println("ParentClass myMethod with single argument");
		myMethod(1,2);
	}
	
	public void myMethod(int a, int b) {
		System.out.println("ParentClass myMethod with double argument");
	}
}

class ChildClass extends ParentClass {
	public void myMethod(int a, int b) {
		System.out.println("ChildClass myMethod with double argument");
	}
}