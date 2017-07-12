/**
 * 
 */
package com.string;
/**
 * @author indsaket
 *
 */
public class StringPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "ABC";
		
		//First approach
		//permutations(str);
		
		//Second approach
		permutationsGFG(str, 0, str.length());
	}
	
	private static void permutations(String str) {
		permutate("", str);
	}

	//First approach
	private static void permutate(String dummy, String str) {
		if(str.isEmpty()) {
			System.out.println(dummy + str);
		}
		else {
			for(int i=0; i<str.length(); i++) {
				permutate(dummy+str.charAt(i), str.substring(0, i)+str.substring(i+1, str.length()));
			}
		}
	}
	
	//Second approach
	private static void permutationsGFG(String str, int start, int end) {
		if(start == end) {
			System.out.println(str);
		}
		else {
			for(int i=start; i<end; i++) {
				str = swap(str, start, i);
				permutationsGFG(str, start+1, end);
				str = swap(str, start, i);
			}
		}
	}
	
	private static String swap(String str, int firstIndex, int secondIndex) {
		char[] c=str.toCharArray();
		char temp = c[firstIndex];
		c[firstIndex] = c[secondIndex];
		c[secondIndex] = temp;
		return String.valueOf(c);
	}
}
