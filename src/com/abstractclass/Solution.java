package com.abstractclass;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.getSubsequentSum(15));

	}
	
	int getSubsequentSum(long n) {
		int count = 0;
		for(long i=1; i<n ; i++) {
			
		long value = 0L;
			
			for(long j=i; j<n; j++) {
				
				if(value + j == n) {
					count++;
				} else {
					value = value + j;
				}
				
			}
		}
		
		return count;
	}

}
