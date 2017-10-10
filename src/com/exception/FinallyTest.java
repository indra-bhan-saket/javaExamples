package com.exception;

public class FinallyTest {

	public static void main(String[] args) throws Exception {
		
		try{
			int i=9/0;
		}catch(Exception e) {
			System.out.println("exception catch");
			//System.exit(0);
			throw new Exception();
		}finally {
			System.out.println("finally");
			throw new Exception();
		}

	}

}
