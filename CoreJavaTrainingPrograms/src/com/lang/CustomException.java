package com.lang;

public class CustomException extends Exception{

	//User defined or custom exceptions are not recommended or a good practise.
	//Always try to reuse the exception available in java.lang package
	public CustomException(String msg) {
		super(msg);
	}
}
