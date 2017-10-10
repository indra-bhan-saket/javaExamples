package com.string;

public class StringPassByValue {

	public static void main(String[] args) {
		//String is immutable
		String str = "ABC";
		modify(str);
		System.out.println(str);
		
		//Stringbuffer is mutable so that object is getting modified
		StringBuffer sb = new StringBuffer("TEST");
		System.out.println(sb);
		modify(sb);
		System.out.println(sb);

	}

	private static void modify(StringBuffer sb) {
		sb.append(" PASSED");
		
	}

	private static void modify(String str) {
		str = str.concat("XYZ");
		
	}

}
