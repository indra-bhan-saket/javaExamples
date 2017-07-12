package com.hackerrank.amazon;

import java.util.*;


public class ConnectedCellInGrid {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
*/
        //Scanner
        Scanner s = new Scanner(System.in);
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
        
        int maxCount=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] && !counted[i][j]){
                    int dfs = search(counted, matrix, m, n, i, j);
                    if(dfs>=maxCount) maxCount = dfs;
                }
            }
        }
        System.out.println(maxCount);
    }
    
    public static int search(boolean[][] visited, boolean[][] matrix, int maxRow, int maxCol, int row, int col){
        if(visited[row][col] || !matrix[row][col]) return 0;
        int count =1;
        
        visited[row][col] = true;
        
        if(row-1 >=0){
            count+=search(visited, matrix, maxRow, maxCol, row-1, col);
            if(col-1>=0) count+=search(visited, matrix, maxRow, maxCol, row-1, col-1);
            if(col+1<maxCol) count+=search(visited, matrix, maxRow, maxCol, row-1, col+1);
        }
        
        if(row+1<maxRow){
            count+=search(visited, matrix, maxRow, maxCol, row+1, col);
            if(col-1>=0) count+=search(visited, matrix, maxRow, maxCol, row+1, col-1);
            if(col+1<maxCol) count+=search(visited, matrix, maxRow, maxCol, row+1, col+1);
        }
        
        if(col-1>=0) count+=search(visited, matrix, maxRow, maxCol, row, col-1);
        if(col+1<maxCol) count+=search(visited, matrix, maxRow, maxCol, row, col+1);
        return count;
    }
}
