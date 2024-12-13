package com.interfaces;

public class InterfaceMain {

	public static void main(String[] args) {
		//Object Substitution
		Dog dog = new Dog();
		Travel travel = dog;
		Owner owner = dog;
		
		travel.getSpeed();
		owner.getOwnerName();
	}

}
