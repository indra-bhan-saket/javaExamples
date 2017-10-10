package com.matrix;

public class AllMovementPathInAllDirection {

	int count=0;
	
	public static void main(String[] args) {
		AllMovementPathInAllDirection object = new AllMovementPathInAllDirection();
		int m=4;
		int n=4;
		boolean arr[][] = new boolean[m][n];
		boolean current = arr[0][0] = true;
		object.getPath(arr, m, n, current, 0, 0);
		System.out.println(object.count);

	}
	
	private void getPath(boolean arr[][], int m, int n, boolean current, int iValue, int jValue) {
		
		for(int i=iValue; i<m; i++) {
			for(int j=jValue; j<n; j++) {
				
				if(i==m && j==n) {
					count = count + 1;
					System.out.println("came here");
				}
				
				if(arr[i][j] == false) {
					if(iValue < m)
						getPath(arr, m, n, current, iValue+1, jValue);
					else if(iValue > 0) 
						getPath(arr, m, n, current, iValue-1, jValue);
					else if(jValue < n)
						getPath(arr, m, n, current, iValue, jValue+1);
					else if(jValue > 0) 
						getPath(arr, m, n, current, iValue, jValue-1);
					
				} else {
					current = arr[i][j] = true;
				}
				
			}
		}
		
	}

}
