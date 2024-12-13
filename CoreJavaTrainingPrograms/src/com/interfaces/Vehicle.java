package com.interfaces;

//Class can implement n number of interfaces
public abstract class Vehicle implements Travel,Owner{

}

class Truck extends Vehicle{
	public int getSpeed() {
		return 80;
	}
	public String getOwnerName() {
		return "Sam1";
	}
}
class Bus extends Vehicle{
	public int getSpeed() {
		return 60;
	}
	public String getOwnerName() {
		return "Sam2";
	}
}
class Cycle extends Vehicle{
	public int getSpeed() {
		return 10;
	}
	public String getOwnerName() {
		return "Sam3";
	}
}