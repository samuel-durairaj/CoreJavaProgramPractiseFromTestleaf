package com.polymorphism;

public class Dog extends AnimalSounds {

	public void Sound(){
		System.out.println("Dog says: bow wow ");
	}
	public void Sound(String angry) {
		System.out.println("Dog says: growl growl ");
		this.Sound();
	}
}
