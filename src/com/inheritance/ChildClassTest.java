package com.inheritance;

public class ChildClassTest extends ParentClassTest {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void print(String s) {
		System.out.println("CHILD...");
	}
	
	public static void main(String[] args) {
		ParentClassTest parentClassTest = new ChildClassTest();
		parentClassTest.print("hello");
		
		
		final ChildClassTest c = new ChildClassTest();
		c.setName("xyz");
		c.setName("pqr");
		System.out.println(c.name);

	}

}

class ParentClassTest {
	
	public void print(Object obj) {
		System.out.println("PARENT...");
	}
	
}
