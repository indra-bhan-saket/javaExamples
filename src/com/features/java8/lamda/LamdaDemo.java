package com.features.java8.lamda;

public class LamdaDemo {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			System.out.println("run method");
		};
		
		Thread t1 = new Thread(runnable);
		t1.start();
	}

}
