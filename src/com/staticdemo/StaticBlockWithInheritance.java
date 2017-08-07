package com.staticdemo;

public class StaticBlockWithInheritance extends ParentClass {

	{
		System.out.println("child initializer");
	}
	
	static {
		System.out.println("child static initializer");
	}
	
	public static void main(String[] args) {
		StaticBlockWithInheritance child1 = new StaticBlockWithInheritance();
		StaticBlockWithInheritance child2 = new StaticBlockWithInheritance();

	}

}

class ParentClass {
	{
		System.out.println("parent initializer");
	}
	
	static {
		System.out.println("parent static initializer");
	}
}
