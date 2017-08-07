package com.features.java8.lamda;

import java.util.ArrayList;
import java.util.List;

public class IterateCollectionThroughLamda {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("SAS");
		list.add("java");
		list.add("lamda");
		list.add("collection");
		list.forEach(string -> System.out.println(string));

	}

}
