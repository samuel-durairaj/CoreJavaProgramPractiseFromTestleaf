package com.collections;

import java.util.Arrays;

public class UtilExamples {

	public static void main(String[] args) {
		int one[] = {1,3,4};
		int two[] = new int[one.length];
		
		two = Arrays.copyOf(one,one.length);
	}

}
