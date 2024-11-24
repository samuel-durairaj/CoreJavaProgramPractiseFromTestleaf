package week2.day1;

public class ParentClass {

   void getHouse(){
		System.out.println("My House - Parent");
	}
	
	public void getCar(){
		System.out.println("My Car - Parent");
	}
	public final void getBankBalance() { // This method cannot be overriden in the child class
		System.out.println("Get the Bank balance - Parent");
	}
	// 'final' keyword is used for restriction 
}
