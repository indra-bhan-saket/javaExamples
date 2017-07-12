/**
 * 
 */
package com.sorting;

import java.util.Arrays;

/**
 * @author indsaket
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		int[] arr = {14, 3, 51, 6, 11, 23, 30, 8};
		System.out.println("BEFORE: " + Arrays.toString(arr));
		mergeSort.mergesort(arr, 0, arr.length-1);
		System.out.println("AFTER: " + Arrays.toString(arr));
	}

	private void mergesort(int[] arr, int low, int high) {
		if(low < high) {
			int mid = (low + high)/2; 
			mergesort(arr, low, mid);
			mergesort(arr, mid+1, high);
			merge(arr,low, mid, high);
		}
		
	}

	private void merge(int[] arr, int low, int mid, int high) {
		//copy to temp array
		int[] temp = new int[high+1]; 
		for(int i=low; i<=high; i++) {
			temp[i] = arr[i];
		}
		
		int i=low;
		int j=mid+1;
		int k=low;
		while(i<=mid && j<=high) {
			if(temp[i] < temp[j]) {
				arr[k] = temp[i];
				i++;
			} else {
				arr[k] = temp[j];
				j++;
			}
			k++;
		}
		
		while(i<=mid) {
			arr[k] = temp[i];
			k++;
			i++;
		}
		
	}

}
