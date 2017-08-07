/**
 * 
 */
package com.error;

import java.util.HashMap;
import java.util.Map;

/**
 * @author indsaket
 *
 */
public class JVMErrorDemo {

	Map<Integer, Integer> map = new HashMap<>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JVMErrorDemo error = new JVMErrorDemo();
		//error.sampleStackOverFlowError();
		error.sampleOutOfMemoryError();

	}
	
	void sampleStackOverFlowError() {
		stackError();
	}

	private void stackError() {
		stackError();
		
	}
	
	void sampleOutOfMemoryError() {
		oomError2();
	}
	
	private void oomError1() {
		int i=0;
		while(true){
			map.put(i++, i++);
		}
	}
	
	private void oomError2() {
		Long maxMemory = Runtime.getRuntime().maxMemory();
		System.out.println(maxMemory);
		int[] matrix = new int[(int) (maxMemory + 0)];
		for (int i = 0; i < matrix.length; ++i)
			matrix[i] = i + 1;
	}

}
