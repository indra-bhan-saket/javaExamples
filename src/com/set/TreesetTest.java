package com.set;

import java.util.TreeSet;

public class TreesetTest {

	public static void main(String[] args) {
		/*TreeSet<String> set = new TreeSet<String>();
		set.add("abc");
		set.add("hh");
		set.add("abc");
		set.add("null");
		System.out.println(set.add("abc"));
		System.out.println(set);*/
		
		TreeSet<MyObject> set1 = new TreeSet<MyObject>();
		
		MyObject myObject1 = new MyObject(1, "xyz");
		MyObject myObject2 = new MyObject(1, "xyz");
		MyObject myObject3 = new MyObject(3, "sssdd");
		set1.add(myObject1);
		set1.add(myObject2);
		set1.add(myObject3);
		System.out.println(set1);
	}
	
}

class MyObject implements Comparable {
	int value;
	String name;
	
	public MyObject(int value, String name) {
		super();
		this.value = value;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		/*MyObject myObject = (MyObject) o;
		return this.name.compareTo(myObject.name);*/
		return 0;
	}
	
}