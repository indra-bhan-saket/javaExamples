package com.array;

public class SubsequentSumEqualsToInputNumber {

	public static void main(String[] args) {
		
		SubsequentSumEqualsToInputNumber solution = new SubsequentSumEqualsToInputNumber();
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
