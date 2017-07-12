package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTreeTraversalUsingQueue {

	Node root;
	
	public BFSTreeTraversalUsingQueue() {
		this.root = null;
	}
	
	public static void main(String[] args) {
		BFSTreeTraversalUsingQueue bfsTree = new BFSTreeTraversalUsingQueue();
		bfsTree.root = new Node(1);
		bfsTree.root.left = new Node(2);
		bfsTree.root.right = new Node(3);
		bfsTree.root.left.left = new Node(4);
		bfsTree.root.left.right = new Node(5);
		System.out.println("Breath First Search Tree Traversal");
		//bfsTree.printLevelOrder();
		bfsTree.printLevelOrderLineByLine();

	}

	public void printLevelOrder() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(queue.size() > 0) {
			//Dequeue
			Node node = queue.poll();
			System.out.print(node.data + " ");
			
			//Enqueue left
			if(node.left != null) {
				queue.add(node.left);
			}
			//Enqueue right
			if(node.right != null) {
				queue.add(node.right);
			}
		}
	}
	
	public void printLevelOrderLineByLine() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(true) {
			int count = queue.size();
			if(count == 0) 
				break;
						
			while(count > 0) {
				//Dequeue
				Node node = queue.poll();
				System.out.print(node.data + " ");
				
				//Enqueue left
				if(node.left != null) {
					queue.add(node.left);
				}
				//Enqueue right
				if(node.right != null) {
					queue.add(node.right);
				}
				count--;
			}
			System.out.println();
		}
		
	}
	
}
