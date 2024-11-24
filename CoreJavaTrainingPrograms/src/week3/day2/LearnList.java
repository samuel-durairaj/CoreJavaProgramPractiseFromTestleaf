package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		
		list.remove(0);
		System.out.println(list);
		
		Collections.sort(list);//Sort the list in ascending order
		Collections.reverse(list);// Sort the list in descending order
		
		list.clear();
		System.out.println(list);

	}

}
