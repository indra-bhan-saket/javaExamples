package com.array;

import java.util.Arrays;
import java.util.Comparator;

public class ArrangeNumbersForBiggestNumber {

	public static void main(String[] args) {
		Integer[] arr = {54, 546, 548, 60};
		
		Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer n1, Integer n2) {
				String s1 = n1+""+n2;
				String s2 = n2+""+n1;
				return s1.compareTo(s2);
			}
		});
		
		for(Integer i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}

	}

}
