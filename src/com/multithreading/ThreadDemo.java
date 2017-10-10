package com.multithreading;

public class ThreadDemo extends Thread {
	
	private Integer result=0;

	@Override
	public void run() {
		System.out.println("running: " + result);
		result++;
	}

	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		t1.run();
		t1.run();

	}

}
