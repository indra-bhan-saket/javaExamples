package com.stack;

public class Stack {

	int stack[] = new int[10];
	int top = -1;
	
	public void push(int value){
		if(top < stack.length) {
			stack[++top] = value;
		} else {
			System.out.println("stackoverflow");
		}
	}
	
	
	public int pop(){
		if(top < 0) {
			System.out.println("stack underflow");
			return 0;
		} else {
			int value = stack[top--];
			return value;
		}
		
	}
	
	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
        int m = Integer.parseInt(s.nextLine());
        int n = Integer.parseInt(s.nextLine());
        boolean[][] matrix = new boolean[m][n];
        boolean[][] counted = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                counted[i][j] = false;
                matrix[i][j] = s.nextInt()==1;
            }
        }
        int maxCount =0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(???){
                    int dfs = search(counted, matrix, m, n, i, j);
                    if(dfs>=maxCount) maxCount = dfs;
                }
            }
        }
        System.out.println(maxCount);*/
	}

	public static int search(boolean[][] visited, boolean[][] matrix, int maxRow, int maxCol, int row, int col){
        if(visited[row][col] || !matrix[row][col]) return 0;
        int count =1;
        //mark us as visited
        visited[row][col] = true;
        //check up
        if(row-1 >=0){
            count+=search(visited, matrix, maxRow, maxCol, row-1, col);
            if(col-1>=0) count+=search(visited, matrix, maxRow, maxCol, row-1, col-1);
            if(col+1<maxCol) count+=search(visited, matrix, maxRow, maxCol, row-1, col+1);
        }
        //check down
        if(row+1<maxRow){
            count+=search(visited, matrix, maxRow, maxCol, row+1, col);
            if(col-1>=0) count+=search(visited, matrix, maxRow, maxCol, row+1, col-1);
            if(col+1<maxCol) count+=search(visited, matrix, maxRow, maxCol, row+1, col+1);
        }
        //check left
        if(col-1>=0) count+=search(visited, matrix, maxRow, maxCol, row, col-1);
        if(col+1<maxCol) count+=search(visited, matrix, maxRow, maxCol, row, col+1);
        return count;
    }
	
}
