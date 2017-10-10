package com.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerByBlockingQueue {

	public static void main(String[] args) {
		BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);
		
		Thread t1 = new Thread(new Producer(blockingQueue));
		Thread t2 = new Thread(new Consumer(blockingQueue));
		
		t1.start();
		t2.start();
	}
}


class Producer implements Runnable {

	BlockingQueue<Integer> blockingQueue;

	public Producer(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				blockingQueue.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

class Consumer implements Runnable {

	BlockingQueue<Integer> blockingQueue;

	public Consumer(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println(blockingQueue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}