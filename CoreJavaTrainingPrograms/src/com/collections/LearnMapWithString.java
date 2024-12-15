package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMapWithString {

	public static void main(String[] args) {

      Map<Character, Integer> map = new LinkedHashMap<>();
      String text = "Today is Sunday";
      for(int i=0;i<text.length();i++) {
    	  if(map.containsKey(text.charAt(i))) {
    		  Integer value = map.get(text.charAt(i));
    		  map.put(text.charAt(i), value+1);
    	  }
    	  else {
    		  map.put(text.charAt(i), 1);
    	  }
      }
      System.out.println(map);
	}

}
