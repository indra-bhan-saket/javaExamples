package com.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("a");
		queue.add("b");
		queue.add("c");
		queue.offer("c");
		
		System.out.println(queue.size());
		String s = queue.poll();
		System.out.println(s);
		System.out.println(queue.size());

	}

}
