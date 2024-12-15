package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/*
 * Collections API has 4 different type of Interface
 * 1. Collection
 *    - generic single dimension dynamic growable array, non- indexed,
 * 2. List
 *    - sub-interface of collection, single dimension dynamic growable array, indexed, allow duplicates
 *    (Implementations: ArrayList, LinkedList)
 * 3. Set
 *    - sub-interface of collection, single dimension dynamic growable array, not indexed or not in order, not allow duplicates
 *     (Implementations: HashSet, LinkedHashSet, TreeSet(sorted order array))
 * 4. Map
 *    - two dimension dynamic growable array (Key (unique), Value) pair
 */

public class LearnCollections {
	
	public static void main(String[] args) {
		
		List<String> listStr = new ArrayList<String>();
		listStr.add("Sam");
		System.out.println(listStr.get(0));
		
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("one");
		set.add("two");
		set.add("three");
		//System.out.println(set);
		
		TreeSet<String> treeSet = new TreeSet<String>(); //Sort the values
		treeSet.add("one");
		treeSet.add("zebra");
		treeSet.add("two");
		treeSet.add("three");
		//System.out.println(treeSet);
		
		//Key - Unique and it is maintained in Set, does not allow duplicates
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("One", 1);
		map.put("two", 2);
		map.put("One", 1);
		//System.out.println(map);
		
		//Iterating the collections
		for(String s: treeSet) {
			System.out.println(s);
		}
	}

}
