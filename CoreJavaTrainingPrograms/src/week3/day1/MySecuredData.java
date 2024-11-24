package week3.day1;

public class MySecuredData {

	private final short cvv = 123;
	private static int balance = 0;

	public short getCVV() { // Setter for the private variable 'cvv'
		return cvv;
	}

	// Getter and Setter for the private static variable 'balance'
	public static int getBalance() {
		return balance;
	}

	public static void setBalance(int balance) {
		MySecuredData.balance = balance;
	}
	
}
