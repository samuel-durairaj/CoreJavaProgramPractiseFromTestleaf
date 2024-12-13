package com.interfaces;

public interface Travel {

	public int getSpeed();
	
	//From JDK 1.8 and above, interfaces are allowed to have static methods
	public static void getC() {
		
	}
	public static int getOne() {
		return 100;
	}
}
