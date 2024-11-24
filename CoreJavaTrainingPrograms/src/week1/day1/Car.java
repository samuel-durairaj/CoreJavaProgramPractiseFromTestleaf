package week1.day1;

import week2.day2.Commute;

public class Car extends Commute{
public static void main(String[] args) {
	
	// Calling a static protected variable from Commute class out side the package with extends keyword
	System.out.println(carName); 
	
	// Using object, calling a non-static protected variable from Commute class out side the package with extends keyword
	Car obj = new Car();
	System.out.println(obj.newCarName);
}
}
