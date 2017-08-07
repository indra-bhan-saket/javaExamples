package com.tree;

public class ElementPositionJabong {

	int position=0;
	int sumAtGivenPosition;
	Node root;
	
	public static void main(String[] args) {
		ElementPositionJabong elementPositionJabong = new ElementPositionJabong();
		int[][] arr = {{3,4},{1,2}};
		int result = elementPositionJabong.getPosition(2, arr, 1);
		System.out.println(result);

	}

	public int getPosition(int length, int[][] arr, int currentPosition) {
		
		for(int i=0; i<length; i++) {
			int sum = arr[i][0] + arr[i][1];
			
			if(i == currentPosition) {
				sumAtGivenPosition = sum;
			}
			
			if(root == null) {
				root = new Node(sum);
			} else {
				if(root.data>sum) {
					root.left = new Node(sum);
				} else {
					root.right = new Node(sum);
				}
			}
			
		}
		
		inOrderTraversal(root);
		return position;
	}
	
	void inOrderTraversal(Node node) {
		if(node == null) {
			return;
		}
		
		inOrderTraversal(node.left);
		
		if(node.data != sumAtGivenPosition) {
			position++;
		} else {
			return;
		}
		inOrderTraversal(node.right);
	}
}

