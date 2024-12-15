package com.collections;

import java.util.*;

public class LearnSet {
public static void main(String[] args) {
	
	/*HashSet - will give a random output
	  TreeSet - will give the output in ASCII order
	  LinkedHashSet - will maintain insertion order*/
	
	/* Set - will not allow duplicate value, ignores the duplicate
	   Set interface does not have a 'get()' function
	   Random order is faster (HashSet)
	   For iterator cannot be used in set, since the index is not applicable in set*/
		
	/* HashSet:
	   Unique element, Does not maintain insertion order and Not thread safe
	   Allows only 1 null value
	   Provides constant time performance for basic operations like add, remove, contains and size.
	   Allows storing a single null value */
	 
	Set<String> obj = new HashSet<>();
	obj.add("bob");
	obj.add("cat");
	obj.add("pie");
	obj.add("pancake");
	obj.add("lollipop");
	obj.add(null); // Does not throw a null pointer exception
	obj.add(null); // Does not allow the second null value

	System.out.println(obj);
	
	//Iterating Set
//for (String string: obj) {
//	System.out.println(string);
//}
  //Converting a Set into a List
  //List<String> list = new ArrayList<>(obj); //Add Set name (here 'obj') into the constructor of the ArrayList (vice versa : List to set)
  
   // OR
  /*List<String> list = new ArrayList<>(obj);
  list.addAll(obj);*/
  
  //System.out.println(list);
  
  /* array.length - property - int value
   * String.length() - function or method - int value
   * List.size() -  method - int value
   * Set.size() - method - int value*/
   
    
    /* HashSet:
       Unique element, Maintains insertion order and Not thread safe
       Allows only 1 null value
       Provides constant time performance for basic operations like add, remove, contains and size (O(1) complexity)*/
	
    Set<String> obj1 = new LinkedHashSet<>();
    obj1.add("bob");
	obj1.add("cat");
	obj1.add("pie");
	obj1.add("pancake");
	obj1.add("lollipop");
	obj1.add(null); // Does not throw a null pointer exception
	obj1.add(null); // Does not allow the second null value
	
    System.out.println(obj1);
    
    /* TreeSet:
    Unique element, sorted order
    Does not allow null value (Throws null pointer exception)*/
    
	Set<String> obj2 = new TreeSet<>();
	obj2.add("bob");
	obj2.add("cat");
	obj2.add("pie");
	obj2.add("pancake");
	obj2.add("lollipop");
	//obj2.add(null); //Throws null pointer exception
	
	System.out.println(obj2);
}
}
