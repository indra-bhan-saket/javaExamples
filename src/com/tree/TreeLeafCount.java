package com.tree;

public class TreeLeafCount {

	Node root;
	
	public TreeLeafCount() {
		this.root = null;
	}
	
	public static void main(String[] args) {
		TreeLeafCount treeLeafCount = new TreeLeafCount();
		treeLeafCount.root = new Node(1);
		treeLeafCount.root.left = new Node(2);
		treeLeafCount.root.right = new Node(3);
		treeLeafCount.root.left.left = new Node(4);
		treeLeafCount.root.left.right = new Node(5);
		System.out.println("Leaf node count: " + treeLeafCount.getLeafNodeCount());

	}
	
	int getLeafNodeCount() {
		return getCount(root);
	}

	int getCount(Node node) {
		if(node == null)
			return 0;
		if(node.left == null && node.right == null)
			return 1;
		else {
			return getCount(node.left) + getCount(node.right);
		}
	}
}
