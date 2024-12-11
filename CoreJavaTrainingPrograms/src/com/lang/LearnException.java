package com.lang;

import java.net.MalformedURLException;
import java.net.URL;

public class LearnException {
	
	public LearnException() {
		
	}
	// Runtime exception
	public void runTimeExcep(int i) {
		if(i>100) {
			throw new IllegalArgumentException("illegal Argument i > 100");
		}
	}
	
// Compile time exceptions - Uses keywords 'throw' and 'throws'
	public void testThrows(int i) throws Exception{
		if(i>100) {
			throw new CustomException("i is less than 100");
		}
	}
	public void checkURL() {
		try {
			URL url = new URL("http://www.ebay.com");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	// 'finally' block is always executed, no way to bypass
	public void finallyBlock() {
		try {
			int i=10;
			i++;
			return;
			//throw new Exception("Exception");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally block is executed");
		}
	}
public static void main(String[] args) {
	LearnException ex = new LearnException();
	ex.finallyBlock();
	ex.checkURL();
	//Multiple catch blocks is also possible in exception handling
	try {
		ex.testThrows(10);
	} catch (Exception e) {
		e.printStackTrace();
	}
	ex.runTimeExcep(110);
	
}
}
