package com.abstractclass;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		Set<String> set = new HashSet<>();
		String[] str = args[0].split(",");
		for(String s : str) {
			set.add(s);
			
		}
		
		System.out.println(set.size());

	}

}
