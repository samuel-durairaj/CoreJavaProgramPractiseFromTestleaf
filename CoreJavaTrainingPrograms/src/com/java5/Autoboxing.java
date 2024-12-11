package com.java5;

public class Autoboxing {

	public static void main(String[] args) {
		//Wrapper Classes java.lang
		/* Values passed inside a primitive data type remains constant, the copy of its value can only be passed in the arguments
		 * Whereas, in wrapper classes of primitive data types, the original value itself can be changed
		 */
		int i = 10;
		Integer inter = new Integer(10);
		int j = i+inter;
		inter++;
		test(10);
		test(10,1,2,3,4);
		test(20,30);
		int num[] = new int[4];
		test(num);
	}
	// Variable Argument
    public static void test(int... number) {
    	for(int i=0;i<=number.length;i++)
    	{
    		System.out.println(number);
    	}
    }
}
