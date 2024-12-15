package com.polymorphism;

/*
 * Polymorphism is mainly used to implement inheritance
 * Types: Compile Time and Run Time polymorphism
 */

public class AnimalMain {

	public static void main(String[] args) {
		AnimalSounds animal = new AnimalSounds();
		Cow cow = new Cow();
		Dog dog = new Dog();
		
		animal.Sound();
		cow.Sound();
		dog.Sound();
		dog.Sound("angry");
	}

}
