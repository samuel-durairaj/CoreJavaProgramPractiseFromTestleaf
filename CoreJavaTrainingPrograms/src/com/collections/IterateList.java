package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterateList {

	public static void main(String[] args) {
		
		//Iterating the List
		List<String> list = new LinkedList<>();
		list.add("rice");
		list.add("millet");
		list.add("dhall");
		list.add("rice");
		list.add("edible Oil");
		
		int len = list.size();
		
		//Simple For Loop
		for(int i=0;i<len;i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("*************");
		
		//Enhanced For Loop (for each loop)
		for(String prov : list) {
			System.out.println(prov);
		}
		System.out.println("*************");
		
		//Iterator
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("*************");
		
		//Java 8 Stream API:
		List<String> listItr = new ArrayList<>(Arrays.asList("ABC","DEF","GHI"));
		listItr.stream().forEach(element->System.out.println(listItr));
	}
	
}
