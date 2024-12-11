package com.lang;

import java.util.*;

public class LearnString {


			public static void main(String[] args) {
				
				//Whenever the JVM is booted up, pool of string objects are created
				String oneStr = "one";   //String literal
				String twoStr = new String(); //
				String threeStr = "one"; //Creating a string with same value, point to the object of the previously created string object
				
				System.out.println(oneStr==threeStr);
				System.out.println(oneStr.equals(threeStr));
			
				String fourStr = oneStr+threeStr; //Conactenated new string will be formed, new object will be assigned
				
				//Strings are immutable - string value cannot be changed in the same object
				oneStr = oneStr + "two";
				System.out.println(oneStr); //"onetwo"
				
				//String Buffer - Mutable datatype (older and not recommended)
				StringBuffer sb = new StringBuffer("one");
				System.out.println(sb.hashCode()); //Object reference value before changing the string
				sb.append("two");
				sb.append("three");
				System.out.println("String Buffer: "+sb.toString());
				System.out.println("String Buffer: "+sb.hashCode()); //Object reference value after changing the string
				
				//String Builder  - Mutable datatype (Recommended)
//				StringBuilder sbuid = StringBuilder("two");
//				sbuild.append("one");
//				System.out.println(sbuild);
			}

}
