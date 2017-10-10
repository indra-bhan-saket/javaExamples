package com.array;

public class MaximumSubarrayProduct {

	public static void main(String[] args) {
		int arr[] = {2, -3, 4, 0, 12, -4, -20, -3, 3};
		System.out.println(getMaxProduct(arr));

	}

	private static int getMaxProduct(int[] arr) {
		int max_product = 1;
		int current_prodcut = 1;
		int prev_product = 1;
		
		for(int i=0; i<arr.length; i++) {
			
			//If number is positive integer
			if(arr[i] > 0) {
				current_prodcut = current_prodcut*arr[i];
				prev_product = Math.min(current_prodcut*arr[i], 1);
			}
			
			if(arr[i] == 0) {
				current_prodcut = 1;
				prev_product = 1;
			} else {
				//If number is negative integer
				int tempPrev = current_prodcut;
				current_prodcut = Math.max(prev_product*arr[i], 1);
				prev_product = tempPrev*arr[i];
			}
			
			if(max_product < current_prodcut) {
				max_product = current_prodcut;
			}
			
		}
		
		return max_product;
	}

}
