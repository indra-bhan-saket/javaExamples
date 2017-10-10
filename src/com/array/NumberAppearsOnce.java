package com.array;

public class NumberAppearsOnce {

	public static void main(String[] args) {
		int arr[] = {7, 7, 5, 4, 5, 3, 4};
		int result = arr[0];
		for(int i=1; i< arr.length; i++) {
			
			//XOR of a number with itself is 0
			//XOR of a number with 0 is number itself
			//5^5=0 (101 ^ 101 => 000)
			
			result = result ^ arr[i];
			
		}
		
		System.out.println(result);

	}

}
