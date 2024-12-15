package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainAllList {

	public static void main(String[] args) {
		
		/*
		 * The retainAll() method in Java is used to retain only the elements 
		 * in a collection that are also present in another specified collection. 
		 * In other words, it removes all elements from the first collection that are 
		 * not present in the second collection.
		 */
		
		List<String> list1 = new ArrayList<>(Arrays.asList("Will","Smith","Ricky","Clarke"));
		List<String> list2 = new ArrayList<>(Arrays.asList("Walsh","Ambrose","Richie","Clarke"));

		System.out.println(list1);
		list1.retainAll(list2);
		System.out.println(list1);
	}

}
