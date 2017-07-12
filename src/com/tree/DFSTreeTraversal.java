package com.tree;

public class DFSTreeTraversal {

	Node root;
	
	public DFSTreeTraversal() {
		this.root = null;
	}
	
	public static void main(String[] args) {
		DFSTreeTraversal tree = new DFSTreeTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("PRE ORDER TRAVERSAL");
		tree.preorderTraversal(tree.root);
		
		System.out.println();
		System.out.println("POST ORDER TRAVERSAL");
		tree.postorderTraversal(tree.root);
		
		System.out.println();
		System.out.println("IN ORDER TRAVERSAL");
		tree.inorderTraversal(tree.root);

	}
	
	public void preorderTraversal(Node node) {
		if(node == null)
			return;
		
		System.out.print(node.data + " ");
		preorderTraversal(node.left);
		preorderTraversal(node.right);
	}

	public void postorderTraversal(Node node) {
		if(node == null)
			return;
		
		postorderTraversal(node.left);
		postorderTraversal(node.right);
		System.out.print(node.data + " ");
	}
	
	public void inorderTraversal(Node node) {
		if(node == null)
			return;
		
		inorderTraversal(node.left);
		System.out.print(node.data + " ");
		inorderTraversal(node.right);
	}
	
}

class Node {
	int data;
	Node left, right;
	
	Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}
