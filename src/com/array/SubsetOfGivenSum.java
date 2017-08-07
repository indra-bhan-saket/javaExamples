/**
 * 
 */
package com.array;

import java.util.Stack;

import com.abstractclass.SampleAbstractClass;

/**
 * @author indsaket
 *
 */
public class SubsetOfGivenSum {

	/**
	 * @param args
	 */
	private Stack<Integer> stack = new Stack<>();
	
	int subsetSum;
	
	int GIVEN_SUM = 15;
			
	public static void main(String[] args) {
		int[] array = { 1, 3, 4, 5, 6, 2, 7, 8, 9, 10, 11, 13, 14, 15 };
		SubsetOfGivenSum subsetOfGivenSum = new SubsetOfGivenSum();
		subsetOfGivenSum.getSubset(array, 0, array.length);

	}

	private void getSubset(int []array, int start, int length) {
		
		for(int i=start; i<length; i++) {
			if(subsetSum == GIVEN_SUM) {
				System.out.println(stack);
				return;
			}
			
			if(subsetSum + array[i] <= GIVEN_SUM) {
				stack.push(array[i]);
				subsetSum+=array[i];
				
				getSubset(array, i+1, length);
				subsetSum-=stack.pop();
			}
		}
	}
}
