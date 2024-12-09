package core.java8;

public class CoreJavaBasics {
	
	static void dataTypeProgs() {
		//Type Promotion
				byte a =10;
				byte b =20;
				
				int c = a + b;
				//any arithmetic operation will increrment the operand to int or long or double
				// in the above example a and b byte values are promoted to an integer
				System.out.println(c);
	}
	public static void loopsProg() {
		
		// '!' complement operator
				boolean bool = false;
				System.out.println(!bool); //! operator converts false to true

				for(int i=0;i<=10;i++) {
					if(i==2||i==5)
						continue;
					if(i==8)
						break;
					System.out.print(i);
				}
					System.out.println();
	}
				
	public static void labelledContinueBreak() {
		//Labelled continue and break
		one: for(int i=0;i<5;i++)
		{
			two:for(int j=0;j<5;j++)
			{
				if(i==3)
					continue one;
				if(j==1)
					break two;
				System.out.println(" i == "+i+" j== "+j);
			}
		}
		
	}
	public void arrayCreation() {
		
		//Arrays of Primitives:
		int[] squares; //Declaration
		squares = new int[3]; //Creation
		for(int i=0;i<3;i++) //Initialization
			squares[i] = i*i;
		
		//Arrays of Object Reference:
		Car[] cars;    // Declaration
		cars = new Car[3]; //Creation
		for(int i=0;i<3;i++) // Initialization
			cars[i] = new Car();
		
	}
	public static void main(String[] args) {
	
//		dataTypeProgs();
//		loopsProg();
		labelledContinueBreak();
			
		}
	


}
