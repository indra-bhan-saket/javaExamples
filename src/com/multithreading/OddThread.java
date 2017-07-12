package com.multithreading;

public class OddThread implements Runnable{

	private Integer odd = 1;
	private Object lock;
	
	public OddThread(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		while(odd<=100){
			synchronized (lock) {
				System.out.println("even: " + odd);
				odd = odd + 2;
				lock.notify();
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
