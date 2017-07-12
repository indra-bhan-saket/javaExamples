package com.tree;

public class BinaryTreeDiamemter {

	Node root;
	
	public BinaryTreeDiamemter() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		BinaryTreeDiamemter btd = new BinaryTreeDiamemter();
		btd.root = new Node(2);
		btd.root.left = new Node(5);
		btd.root.right = new Node(20);
		
		btd.root.left.left = new Node(8);
		btd.root.left.right = new Node(4);
		
		btd.root.right.right = new Node(3);
		/*btd.root.right.right.left = new Node(22);
		btd.root.right.right.left.left = new Node(11);*/
		
		int diamemter = btd.diameter(btd.root);
		System.out.println("diameter: " + diamemter);
	}
	
	private int diameter(Node node) {
		if(node == null) {
			return 0;
		}
		int lheight = height(node.left);
		int rheight = height(node.right);
		
		int ldiameter = diameter(node.left);
		int rdiameter = diameter(node.right);
		
		return Math.max(1+lheight+rheight, Math.max(ldiameter,rdiameter));
	}
	
	int height(Node node) {
		if(node == null) {
			return 0;
		}
		return (1 + Math.max(height(node.left), height(node.right)));
	}

}
