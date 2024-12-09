package core.java8;

public class ConsExample {
	//One constructor calling another constructor
	//Constructor Overloading
	int speed;
	String model;
	
	public ConsExample() {
		System.out.println("Zero arg cons");
	}
	public ConsExample(int speed) {
		this(); // calls the constructor with zero-argument
		System.out.println("1 arg cons");
		this.speed=speed;
	}
	public ConsExample(int speed, String model) {
		this(speed); // calls the constructor with 1 argument
		System.out.println("2 arg cons");
		//this.speed=speed;
		this.model=model;
	}

	public static void main(String[] args) {
		//ConsExample cons = new ConsExample();
		//ConsExample cons1 = new ConsExample(100);
		ConsExample cons2 = new ConsExample(100,"BMW");
	}

}
