package com.matrix;

public class AllMovementPath {

	public static void main(String[] args) {
		int m=4;
		int n=4;
		boolean[][] arr = new boolean[m][n];
		/*for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = i*j;
			}
		}*/

		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println(getPath(m-1, n-1));
		
	}
	
	/*static int getPathWithAllMovement(int m, int n, boolean arr[][]) {
		if(m==1 || n==1)
			return 1;
		else {
			if(arr[m-1][n] == false) {
				getPathWithAllMovement(m-1, n, arr);
			}
		}
		
	}*/
	
	//When left and up movement are only allowed
	static int getPath(int m, int n) {
		if(m==1 || n==1)
			return 1;
		
		return getPath(m-1, n) + getPath(m, n-1);
	}

}
