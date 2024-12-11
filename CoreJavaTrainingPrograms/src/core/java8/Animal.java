package core.java8;

//Class can implement n number of interfaces
public abstract class Animal implements Travel, Owner{

}

class Cat extends Animal{
	public int getSpeed() {
		return 40;
	}
	public String getOwnerName() {
		return "Sam1";
	}
}
class Dog extends Animal{
	public int getSpeed() {
		return 50;
	}
	public String getOwnerName() {
		return "Sam2";
	}
}
class Tiger extends Animal{
	public int getSpeed() {
		return 100;
	}
	public String getOwnerName() {
		return "Sam3";
	}
}