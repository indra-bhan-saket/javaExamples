package com.singleton;

public class SingletonWithDoubleNullCheck {

	public static void main(String[] args) {
		SingletonDoubleNullCheck instance = SingletonDoubleNullCheck.getInstance();
		instance = SingletonDoubleNullCheck.getInstance();

	}

}


class SingletonDoubleNullCheck {
	private static SingletonDoubleNullCheck instance;
	
	private SingletonDoubleNullCheck(){
		System.out.println("constructor called");
	}
	
	public static SingletonDoubleNullCheck getInstance(){
		if(instance == null) {
			synchronized (SingletonDoubleNullCheck.class) {
				if(instance == null) {
					instance = new SingletonDoubleNullCheck();
				}
			}
		}
		return instance;
	}
	
}