package com.singleton;

public class SingltonThroughEnum {

	public static void main(String[] args) {
		System.out.println(Singlton.INSTANCE);
		System.out.println(Singlton.INSTANCE);
	}

}

enum Singlton {
	INSTANCE;
	
	private Singlton(){
		System.out.println("private constructor called");
	}
}
