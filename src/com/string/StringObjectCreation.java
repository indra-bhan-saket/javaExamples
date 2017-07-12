package com.string;

public class StringObjectCreation {

	public static void main(String[] args) {
		StringObjectCreation stringObjectCreation = new StringObjectCreation();
		long usedBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("BEFORE: " + usedBefore);
		
		String str1 = "ABC";
		String str2 = new String("ABC");
		
		long usedAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("AFTER : " + usedAfter);
		System.out.println("Native implementation of hashcode : " + stringObjectCreation.hashCode());

	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
