package com.linkedList;

public class LinkedList {

	private Node head;
	
	static class Node {
		private String data;
		private Node next;
		
		public Node(String data) {
			super();
			this.data = data;
			this.next = null;
		}
		
		public Node(String data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

	}
	
	public static void main(String args[]) {
		LinkedList linkedList = new LinkedList();
		linkedList.head = new Node("abc");
		Node node1 = new Node("xyz");
		Node node2 = new Node("pqr");
		linkedList.head.next = node1;
		node1.next = node2;
		
		Node node = linkedList.head;
		while(node != null) {
			System.out.println("data: " + node.data);
			node = node.next;
		}
	}
	
	public void pushAtFirst(String str) {
		Node node = new Node(str);
		node.next = head;
		head = node;
	}
	
	public void pushAtLast(String str) {
		Node node = new Node(str);
		
		
	}
}
