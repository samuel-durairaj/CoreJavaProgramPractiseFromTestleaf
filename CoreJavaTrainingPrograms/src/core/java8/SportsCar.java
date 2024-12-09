package core.java8;

public class SportsCar extends Car{

	int speed = 300;
	public SportsCar() {
		
	}
	
	@Override
	public void brake() {
		//super().brake();
		System.out.println("Brake in sports car");
		//return 10;
	}
	public static void main(String[] args) {
		//Object substitution
		Car car = new SportsCar(); //A sub-class object reference can refer to any super-class object reference
		System.out.println(car.speed);//print the speed from the super class
		System.out.println(((SportsCar)car).speed); //Type cast and print the speed from SportCar.class file
		car.brake();
		brakeCar(car);
		brakeCar(new PoliceCar());
		brakeCar(new Taxi());
		
		final Car car1 = new Car(); // 'final' keyword, the Object reference cannot be changed
	}
    public static void brakeCar(Car c) {
    	c.brake();
    	//'instanceOf' operator
    	if(c instanceof SportsCar) {
    		System.out.println("Sports car instance");
    	}
    	if(c instanceof Taxi) {
    	System.out.println("Taxi Instance");	
    	}
    }	
}
