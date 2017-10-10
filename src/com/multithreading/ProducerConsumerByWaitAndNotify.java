package com.multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumerByWaitAndNotify {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		Thread t1 = new Thread(new ProducerDemo(queue));
		Thread t2 = new Thread(new ConsumerDemo(queue));
		
		t1.start();
		t2.start();

	}

}

class ProducerDemo implements Runnable {

	Queue<Integer> queue;
	
	public ProducerDemo(Queue<Integer> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		while(true) {
			synchronized (queue) {
				if(queue.size() == 10000) {
					try {
						System.out.println("Queue is full, putting in waiting state");
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				Random random = new Random(); 
				int i = random.nextInt();
				System.out.println("Produced: " + i);
				queue.add(i);
				queue.notify();
			}
			
		}
		
	}
	
}

class ConsumerDemo implements Runnable {

	Queue<Integer> queue;
	
	public ConsumerDemo(Queue<Integer> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		while(true) {
			synchronized (queue) {
				if(queue.isEmpty()) {
					try {
						System.out.println("Queue is empty, putting in waiting state");
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Consumed: " + queue.remove());
			}
		}
		
	}
	
}