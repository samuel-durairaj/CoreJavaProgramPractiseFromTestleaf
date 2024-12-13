package com.abstraction;

/*
 * - Abstract classes will have 0 or 1 abstract methods
 * - We cannot create an object for abstract class
 * - Abstract classes are also part of inheritance
 * - Partially implemented classes
 * - Create sub-class to abstract class and in the sub class we need to implement 
 *   all the abstract methods which is there in super class failure
 *   - Sub class will also be abstract
 *   Question: Can abstract class have a constructor ? 
 *   Answer: Yes
 *   Question: If there is a constructor in abs class with 10 line of code...when 
 *   that 10 line of code will be executed?
 *   Answer: whenever the child-class is getting instantiated the super class's abstract class constructors will get executed
 *   Question: Can abstract class have static methods, static variables, static block, main method (main methods are static) ?
 *   Answer: Yes (static methods, variables, etc are related to class objects)
 *   
 */


public abstract class CarAbstract {
	
	public abstract void brake();
	
	public void start() {
		
	}
	public void accelerate() {
		
	}
	public static void main(String[] args) {
		CarSubAbstract abs = new CarSubAbstract();
		abs.brake();
	}
}
