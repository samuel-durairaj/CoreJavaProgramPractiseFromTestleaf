package week3.day1;

public interface RBI extends GOI {

	//Interface does not have a private variable or a method
	//Variable inside an interface will be final or static by default
	//Method inside an interface will be abstract by default
	//All Abstract methods should be implemented somewhere
	//One interface can be implemented by multiple classes
	
	// Class To Class ('extends' keyword)
	// Interface to Interface ('extends' keyword)
	// Interface to Class ('implements' keyword)
	// Class to Interface (Not Possible)
	
	public int limit = 900000;
	public int minimumBalance = 5000;
	
	public void createDeposits();
	public void provideDebitCard(long cardNumber);
	public void provideHomeLoan();
	public static void lendLoansToTheBanks() {//Static methods inside the interface can be implemented and these are not abstract
		System.out.println("Lend loans to other banks");
	}
	
}

