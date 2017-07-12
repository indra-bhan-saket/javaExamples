package com.tree;

public class BFSTreeTraversalUsingFunctions {

	Node root;
	
	public BFSTreeTraversalUsingFunctions() {
		this.root = null;
	}
	public static void main(String[] args) {
		BFSTreeTraversalUsingFunctions bfsTree = new BFSTreeTraversalUsingFunctions();
		bfsTree.root = new Node(1);
		bfsTree.root.left = new Node(2);
		bfsTree.root.right = new Node(3);
		bfsTree.root.left.left = new Node(4);
		bfsTree.root.left.right = new Node(5);
		System.out.println("Breath First Search Tree Traversal");
		bfsTree.printLevelOrder();

	}
	public void printLevelOrder() {
		int height = height(root);
		for(int i=1; i<=height; i++) {
			printGivenLevel(root, i);
		}
		
	}

	public int height(Node node) {
		if(node == null)
			return 0;
		else {
			int leftHeight = height(node.left);
			int rightHeight = height(node.right);
			
			if(leftHeight > rightHeight)
				return leftHeight + 1;
			else
				return rightHeight + 1;
		}
	}
	
	public void printGivenLevel(Node node, int level) {
		if(node == null) {
			return;
		}
		if(level == 1) {
			System.out.print(node.data + " ");
		} else if(level > 1) {
			printGivenLevel(node.left, level-1);
			printGivenLevel(node.right, level-1);
		}
	}
	
}

