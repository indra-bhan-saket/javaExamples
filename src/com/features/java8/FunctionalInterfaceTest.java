package com.features.java8;

@FunctionalInterface
public interface FunctionalInterfaceTest {

	void testabstractMethod();
	
	//Equals method belogs to Object class hence it is not considered as the abstract method of this interface
	boolean equals(Object obj);
	
	//Enabling below will give compile time error
	//void testabstractMethod1();
}
