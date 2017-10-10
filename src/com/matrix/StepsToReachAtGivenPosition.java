package com.matrix;

import java.util.Scanner;

public class StepsToReachAtGivenPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 3;//sc.nextInt();
		
		int a = 0;//sc.nextInt();
		int b = 0;//sc.nextInt();
		int x = 0;//sc.nextInt();
		int y = 2;//sc.nextInt();
		
		
		System.out.println("value: " + getCount(a, b, x, y));
		
	
		

	}
	
	private static int getCount(int a, int b, int x, int y) {
		if(a==x && b==y) {
			return 0;
		}
		
		if(a<x) {
			return 1+getCount(a+1, b, x, y);
		}
		if(b<y) {
			return 1+getCount(a, b+1, x, y);
		}
		return 0;
		
	}

}
