package core.java8;

public class Car {

	//State or Instance Variables
	private String model;
    int speed =100;
	
	public Car() {
		System.out.println("car empty cons");
	}
	public Car(String mod) {
		System.out.println("car 1 args cons");
		model = mod;
	}
	public void start() {
		speed = 5;
	}
	public void accelerate() {
		speed += 10;
	}
    public int getSpeed() {
    	return speed;
    }
    public void setSpeed(int speed) {
    	this.speed = speed;
    }
    public void brake() {
    	System.out.println("car brake ()");
    }
    
    //Method Overloading- Methods with same name and different arguments
    public void accelerate(int speed) {}
    public void accelerate(int speed, String model) {}
    public void accelerate(String model, int speed) {}
    public void accelerate(String model) {}
    
}
