package week3.day1;

public class ICICI implements RBI,ICICIHO{

	//Multiple Inheritance (this cannot be implemented in class, but this can be implemented only in Interface)
	
	public void createDeposits() {
		System.out.println("You can create a deposit with a minimum balance of : "+minimumBalance);
	}
	
	public void provideDebitCard(long cardNumber) {
		System.out.println("Provide debit card "+cardNumber);
	}
	
	public void loanToIT() {
		System.out.println("Plan by ICICI");
	}

	public void provideGoldLoans() {
		System.out.println("Provide Gold Loans");
	}

	public void holidays() {
		System.out.println("Work From Home");
	}

	public void provideHomeLoan() {
		System.out.println("Provide Home Loan");
	}

	public void reimburseLPGSubsidary() {
		
	}
}
