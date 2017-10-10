package com.string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumberOfObjects {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		String s3 = s1.concat(s2);
		String s4 = "HelloWorld";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3 == s4);
		System.out.println(s4);
		
		
		Employee e1 = new Employee("ABC", 1);
		Employee e2 = new Employee("ABC", 1);
		System.out.println(e1);
		System.out.println(e2);
		e2=e1;
		e1=null;
		System.out.println(e1);
		System.out.println(e2);
		
	}

}

class Employee {
	String name;
	int id;
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
}
