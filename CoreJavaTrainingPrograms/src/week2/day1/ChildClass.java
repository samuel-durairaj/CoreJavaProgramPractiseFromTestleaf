package week2.day1;

public class ChildClass extends ParentClass{

	public void getHouse()
	{
		System.out.println("My House - Child");
		super.getHouse(); // invokes the private method from the super class
		super.getCar(); // invokes the public method from the super class
	}

}
