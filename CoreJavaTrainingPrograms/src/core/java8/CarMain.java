package core.java8;

public class CarMain {

	public static void main(String[] args) {
				
		/*Object which does not have any object reference, then it will be Garbage collected.
		Assigning one reference to another results in two references to the same object. */
		
		Car car1 = null;
		if(car1==null) { // Object Reference Check
			car1 = new Car();
		}
		System.out.println("Car Created 111");
		
		//car1 = null;
		Car car2 = car1;
		car1 = null;
		
		/*Here, the object reference- car1 is null but since car2 is still having a reference for the object, 
		the object will not be garbage collected.*/
		
		//Encapsulation
		Car car3 = new Car();
		//car3.model = "BMW";
		if(car3.getSpeed()>55)
			car3.setSpeed(55);
	}

}
