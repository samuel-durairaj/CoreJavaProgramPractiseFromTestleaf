package week1.day2;

public class Calculator {

	private String text = "Testleaf Calculator";
	
	 public int addTwoNumbers()
     {
     	int a =10, b = 20;
     	int sum = a+b;
     	return sum; // Return statement should be the last line of code inside the method
     }
	 public int addTwoNumbers(int a,int b)// Method with arguments
     {
     	int sum = a+b;
     	return sum; 
     }
	 public void clearScreen()
	 {
		 System.out.println("I have cleared the screen");
	 }
	
	public static void main(String[] args) {
		
		//Access Modifier ReturnType method name(args if needed)
       Calculator obj = new Calculator();
       System.out.println(obj.text);
       int result = obj.addTwoNumbers();
       int result1 = obj.addTwoNumbers(10,20);
       System.out.println(result);
       System.out.println(result1);
       obj.clearScreen();
		
	}
}
