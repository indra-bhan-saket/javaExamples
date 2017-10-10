package com.array;

public class MaxumumSubarraySum {

	public static void main(String[] args) {
		int arr1[] = {2, -3, 4, 0, 12, -4, -20, -3, 3};
		System.out.println(getMaxSum(arr1));
		
		int arr2[] = {-1, -1, -14, -11, -12, -4, -20, -3, -3};
		System.out.println(getMaxSumWithOnlyNegativeIntegers(arr2));

	}
	
	
	private static int getMaxSum(int []arr) {
		int max_sum=0;
		int current_sum=0;
		
		for(int i=0; i<arr.length; i++) {
			current_sum = current_sum + arr[i];
			if(max_sum < current_sum) {
				max_sum = current_sum;
			}
			if(current_sum < 0) {
				current_sum = 0;
			}
		}
		return max_sum;
	}
	
	private static int getMaxSumWithOnlyNegativeIntegers(int []arr) {
		int max_sum=arr[0];
		int current_sum=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			current_sum = Math.max(current_sum + arr[i], arr[i]);
			max_sum = Math.max(max_sum, current_sum);
		}
		return max_sum;
	}

}
