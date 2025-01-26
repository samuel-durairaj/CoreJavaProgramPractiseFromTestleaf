package com.collections;

import java.util.*;
import java.util.Map.Entry;

public class LearnMap {
	
	//Map is a Two dimensional collection with <Key,Value> pair
	//Key- Unique (Set), Value- duplicates (List)
	//Map Interface- Implementaion class (Ex: HashMap, TreeMap, LinkedHashMap)
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("OnePlus", 45000);
		map.put("Samsung", 25000);
		map.put("iPhone", 75000);
		map.put("iPhone", 85000);
		map.put("iPhone", 95000);//Duplicate key, so the last value will be overridden
		
		System.out.println(map);
		System.out.println(map.get("Samsung"));//Retrieving data using the 'Key'
		System.out.println(map.get(25000)); // Cannot retrieve using 'Value' of a map, it throws 'null'
		
		System.out.println("*************************");
		
		//Iterate the Map using the for each loop
		for(Entry<String, Integer> entrySet:map.entrySet()) {
			System.out.println(entrySet);
		}
		
		System.out.println("*************************");
		
		//Iterate the Map and getting only the Key
		for(Entry<String, Integer> entrySet:map.entrySet()) {
			System.out.println(entrySet.getKey());
		}
		
		System.out.println("*************************");
		
		//Iterate the Map and getting only the Value
		for(Entry<String, Integer> entrySet:map.entrySet()) {
			System.out.println(entrySet.getValue());
		}
		
		System.out.println("*************************");
		
		//Iterate the Map and getting the Key using 'keySet()' and Value using 'get()'
		Set<String> keySet = map.keySet();
		for (String eachKey : keySet) {
			System.out.println(eachKey+ " -> " +map.get(eachKey));
		}
		
		System.out.println("*************************");
		
		Collection<Integer> values = map.values();
		System.out.println(values);
		
		System.out.println("*************************");
		
		//Checking the Key and Value contain in the map
		System.out.println(map.containsKey("Samsung"));
		System.out.println(map.containsValue(23423));
		
	}
}
