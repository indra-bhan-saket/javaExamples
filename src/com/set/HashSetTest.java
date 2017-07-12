package com.set;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("abc");
		set.add("abc");
		set.add("xyz");
		set.add(null);
		System.out.println(set.add("sssss"));
		System.out.println(set.add("sssss"));
		System.out.println(set);
		
		
		Set<MyCustomObject> set1 = new HashSet<MyCustomObject>();
		set1.add(new MyCustomObject(1, "hello"));
		set1.add(new MyCustomObject(1, "hello"));
		set1.add(new MyCustomObject(5, "sdsd"));
		System.out.println(set1);
		
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
	}
	
	static String locate(String path) {
		String abspath = null;
		File file = new File(path);
		File[] list = file.listFiles();
		if (list != null) {
			for (File f : list) {
				if (f.isDirectory()) {
					abspath = locate(f.getAbsolutePath());
				} else {
					if (f.getName().equals("universe-formula")) {
						abspath = f.getAbsolutePath();
					}
				}
			}
		}
		return abspath;
	}


}

class MyCustomObject {
	int value;
	String name;
	
	public MyCustomObject(int value, String name) {
		super();
		this.value = value;
		this.name = name;
	}
}