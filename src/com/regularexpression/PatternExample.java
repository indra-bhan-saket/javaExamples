package com.regularexpression;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		PatternExample example = new PatternExample();
		System.out.println(example.validateString("ASD"));
		
		System.out.println(Pattern.matches("[a-z]{5}", "hello"));

	}
	
	boolean validateString(String str) {
		Pattern p = Pattern.compile("[A-Z]");
		Matcher m = p.matcher(str);
		if(m.find()) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

}
