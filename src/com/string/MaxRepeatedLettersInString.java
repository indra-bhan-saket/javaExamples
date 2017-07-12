package com.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MaxRepeatedLettersInString {

	public static void main(String[] args) {
		String str = "abc";
		MaxRepeatedLettersInString object = new MaxRepeatedLettersInString();
		object.printRepeatedLetters(str);
	}

	private void printRepeatedLetters(String str) {
		char[] array = str.toCharArray();
		List<Character> list = new ArrayList<>();
		Map<Character, Integer> map = new HashMap<>();
		int maxOccurance = 0;
		for(char c : array) {
			if(c == ' ')
				continue;
			
			if(map.get(c) == null) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
			
			if(map.get(c) > maxOccurance) {
				maxOccurance = map.get(c);
			}
			
		}
		
		Set<Character> set = map.keySet();
		for(Character c : set) {
			if(map.get(c) == maxOccurance) {
				list.add(c);
			}
		}
		System.out.println(list);
	}

}
