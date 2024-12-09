package week3.day2;

import java.util.*;

public class LearnSet {
public static void main(String[] args) {
	
	//HashSet - will give a random output
	//TreeSet - will give the output in ASCII order
	//LinkedHashSet - will maintain insertion order
	
	//Set - will not allow duplicate value, ignores the duplicate
	//Set interface does not have a 'get()' function
	//Random order is faster (HashSet)
	//For iterator cannot be used in set, since the index is not applicable in set
	
	//Set<String> obj = new LinkedHashSet<>();
	//Set<String> obj = new TreeSet<>();
	Set<String> obj = new HashSet<>();
	obj.add("bob");
	obj.add("cat");
	obj.add("pie");
	obj.add("pancake");
	obj.add("lollipop");

for (String string: obj) {
	System.out.println(string);
}
//Converting a Set into a List
  List<String> list = new ArrayList<>(obj); //Add Set name (here 'obj') into the constructor of the ArrayList (vice versa : List to set)
  
   // OR
  /*List<String> list = new ArrayList<>(obj);
  list.addAll(obj);*/
  
  System.out.println(list);
  
  /* array.length - property - int value
   * String.length() - function or method - int value
   * List.size() -  method - int value
   * Set.size() - method - int value
   */
  
}
}
