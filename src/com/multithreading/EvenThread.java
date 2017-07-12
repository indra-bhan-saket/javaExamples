package com.multithreading;


public class EvenThread implements Runnable{

	private Integer even = 0;
	private Object lock;
	
	public EvenThread(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		while(even<=100){
			synchronized (lock) {
				System.out.println("even: " + even);
				even = even + 2;
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
