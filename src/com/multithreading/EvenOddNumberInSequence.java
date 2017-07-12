package com.multithreading;

public class EvenOddNumberInSequence {

	public static void main(String args[]) throws InterruptedException {
		
		/*Object lock = new Object();
		Thread thread1 = new Thread(new EvenThread(lock));		
		Thread thread2 = new Thread(new OddThread(lock));		
		thread1.start();
		thread2.start();*/
		
		Object lock = new Object();
		Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<=100; i++) {
					synchronized (lock) {
						if(i%2 == 0) {
							System.out.println("Even: " + i);
						}
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
		});
		
		Thread thread4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<=100; i++) {
					synchronized (lock) {
						if(i%2 != 0) {
							System.out.println("Odd: " + i);
						}
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
		});
		
		thread3.start();
		thread4.start();
	}
	
	
}
