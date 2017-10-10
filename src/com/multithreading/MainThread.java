package com.multithreading;

public class MainThread {
	public static void main(String[] args) {
		new Thread(new SecondThread(), "gfg1").start();;
	}
}

class FirstThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());

	}

}

class SecondThread implements Runnable {
	
	@Override
	public void run() {
		new FirstThread().run();
		new Thread(new FirstThread(), "gfg2").run();;
		new Thread(new FirstThread(), "gfg3").start();;
	}
}