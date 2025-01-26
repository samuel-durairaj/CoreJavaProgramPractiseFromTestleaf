package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LearnList {

	public static void main(String[] args) {
		int[] array = new int[10];
		array[0] = 6; //Adding values in an array
		
		//Collections only use wrapper classes Ex: int as Integer, boolean as Boolean, etc
		//List is an enhanced array
		List<Integer> list = new ArrayList<>();
		list.add(24);
		list.add(33);
		list.add(12);
		list.add(21);
		list.add(12); // List Allows duplicate allows and maintains the insertion order
		list.add(2, 101); // Inserting a number in a desired index, also a method overloading
		
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println("***************************");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("***************************");
		for (Integer eachNums : list) {
			System.out.println(eachNums);
		}
		
		System.out.println(list.contains(24));
		
		//3 Methods to remove elements from the list: (remove() and clear() methods, using Iterator)
		list.remove(0);
		System.out.println(list);
		
		Collections.sort(list);//Sort the list in ascending order
		Collections.reverse(list);// Sort the list in descending order
		
		list.clear();
		System.out.println(list);
		
		List<String> list1 = new ArrayList<>(); 
		list1.add("banana");
		list1.add("orange");
		list1.add("apple");
		list1.add("banana");
		System.out.println(list1);
		
		list1.remove("apple");
		System.out.println(list1);
		
		System.out.println(list1.get(0));
		
		//Remove list using an Iterator
		Iterator<String> iterator = list1.iterator();
		while(iterator.hasNext()) {
			String fruit = iterator.next();
			if(fruit.equals("banana")) {
				iterator.remove();
			}
		}

		System.out.println(list1);
		
		Set<String> set = new HashSet<>();
		set.add("Sam");
		set.add("Daniel");
		set.add("Vinod");
		set.add("Vince");
		
		System.out.println(set);
		
		//Retriving an element from the Set using iterator
		Iterator<String> iterator1 = set.iterator();
		while(iterator1.hasNext()) {
			String name = iterator1.next();
			if(name.equals("Daniel")) {
				System.out.println(name);
			}
		}
		
		//Retriving an element from the Set by converting Set to List and retrieving using the index
		List<String> list2 = new LinkedList<>(set);
		System.out.println(list2.get(0));
		
		List<String> list3 = new LinkedList<>();
		list3.addAll(set);
		System.out.println(list3.get(1));
		
		System.out.println("*****************");
		List<String> list4 = new LinkedList<>();
		list4.add("Netflix");
		list4.add("Amazon");
		list4.add("Zee5");
		
		//Use forEach() method to print values
		list4.forEach(System.out::println);
		
	
		
	}

}
