package com.executerservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceExample {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(3);
		executorService.submit(new MyThread());
		executorService.submit(new MyThread());
		executorService.submit(new MyThread());
		executorService.submit(new MyThread());
		executorService.shutdown();
	}

}

class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("#####starting thread#####");
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("!!!completed!!!");
	}
	
}