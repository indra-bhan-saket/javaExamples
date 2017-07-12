package com.tree;

public class BinaryTreeHeight {

	Node root;
	
	public static void main(String[] args) {
		BinaryTreeHeight bth = new BinaryTreeHeight();
		bth.root = new Node(2);
		bth.root.left = new Node(5);
		bth.root.right = new Node(20);
		
		bth.root.left.left = new Node(8);
		bth.root.left.right = new Node(4);
		
		bth.root.right.right = new Node(3);
		bth.root.right.right.left = new Node(22);
		bth.root.right.right.left.left = new Node(11);
		
		int height = bth.height(bth.root);
		System.out.println("height: " + height);

	}

	private int height(Node node) {
		if(node == null) {
			return 0;
		}
		
		int lheight = height(node.left);
		int rheight = height(node.right);
		
		return 1+Math.max(lheight, rheight);
	}

}
