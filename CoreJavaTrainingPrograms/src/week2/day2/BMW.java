package week2.day2;

public class BMW extends Car {

	public void applyBrake() {
		System.out.println("Apply ABS Brake");
		System.out.println(Commute.carName);//Calling a static protected variable
		System.out.println(new Commute().newCarName);//Calling a non-static protected variable
	}
	
}
