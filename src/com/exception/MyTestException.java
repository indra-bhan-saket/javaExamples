package com.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MyTestException {

	//static block
	static {
		System.out.println("static initializer_1111");
	}
	
	//instance initializer
	{
		System.out.println("instance initializer_3333");
	}
	
	public MyTestException() {
		System.out.println("constructor_4444");
	}
	public static void main(String[] args) throws IOException {
		System.out.println("before_2222");
		MyTestException myTestException = new MyTestException();
		System.out.println("after_5555");
		
		System.out.println(System.getProperty("java.path"));
		
		//checking implementation
		Map<String, String> hashMap = new HashMap<>();
		
		WeakHashMap<String, String> map = new WeakHashMap<>();
		Collections.synchronizedMap(map);
		
		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		

		InputStream fis = MyTestException.class.getResourceAsStream("/hello.txt");
		fis.read();
	}

}
