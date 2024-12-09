package core.java8;

public class Taxi extends Car{

	public Taxi() {
		//super("22"); // By default 'super' is called in the constructor
		System.out.println("taxi empty cons");
	}
	public Taxi(int i) {
		//super("test"); //Calling a super class constructor with an argument
		this(); //'this' and 'super' keywords can be called only in the first line of the constructor, so both cannot be used in a single constructor
		System.out.println("taxi 1 cons");
	}
	public static void main(String[] args) {
		Taxi t = new Taxi(100);
		
	}
}
