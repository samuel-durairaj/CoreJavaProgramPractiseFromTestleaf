package week3.day1;

public class PaymentGateway {

	public void verifyCVV(int cvv) {
		MySecuredData data = new MySecuredData();
		if(data.getCVV()==cvv)
		{
			System.out.println("CVV is verified");
		}
		else
		{
			System.out.println("Please check the CVV");
		}
	}

	public void depositAmount(int money) {
		System.out.println("Before Deposit: "+MySecuredData.getBalance());
		MySecuredData.setBalance(money);
		System.out.println("After Deposit: "+MySecuredData.getBalance());
	}
	
	
	public static void main(String[] args) {
		new PaymentGateway().verifyCVV(123);
		new PaymentGateway().depositAmount(50000);
	}
	
}
