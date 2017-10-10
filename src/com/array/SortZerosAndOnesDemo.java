package com.array;

import java.util.Arrays;

public class SortZerosAndOnesDemo {

	static final int[] a;
	static {
		a = new int[2];
		a[0] = 2;
		a[1] = 3;
	}
	
	
	
	
	
	public static void main(String[] args) {
		SortZerosAndOnesDemo obj = new SortZerosAndOnesDemo();
		/*obj.test();
		obj.test1();*/
		
		int arr[] = {1,0,0,1,1,0,1,1,0,0,1};
		
		int i = 0;
		int j = arr.length - 1;
		System.out.println(Arrays.toString(arr));
		while(i < j) {
			boolean flag1 = true;
			boolean flag2 = true;
			if(arr[i] == 0) {
				i++;
				flag1 = false;
			}
			if(arr[j] == 1) {
				j--;
				flag1 = false;
			}
			
			if(flag1 && flag2) {
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
			
		}
		System.out.println(Arrays.toString(arr));

	}

	
	private int x=0;
	
	private int firstCheck(int a) {
		return ++x;
	}
	
	private int secondCheck(int x) {
		return x++;
	}
	
	private void test() {
		System.out.println(firstCheck(x));
		System.out.println(firstCheck(x));
		System.out.println(firstCheck(x) == firstCheck(x));
	}
	
	private void test1() {
		System.out.println(firstCheck(x));
		System.out.println(x);
	}
	
	
}

