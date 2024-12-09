package week4.day1;
public class LearnException {

	public static void main(String[] args) {
		//Errors and Exception are not same
		//All Exceptions are classes
		//5 Keywords for exception handling (try, catch, finally, throw, throws)
		//All the exceptions are already handled using multi-level inheritance
		//Cannot handle more than 1 exception at a time
		/*
		 * try -> catch
		 * try -> catch -> finally
		 * try -> finally
		 */
		
		try {
	    int a = 2;
		System.out.println(a/0);// This will throw Arithmatic exception
		}
		catch(ArithmeticException exp) {
			System.out.println("Divisible by 0 is not possible");
			exp.printStackTrace();// show the exception message
		}
		try {
		int a[] = {2,3};
		System.out.println(a[2]); // This will throw Index out of bound exception (applicable only in Array, List or Set)
		}
		catch(Exception exp)
		{
			System.out.println("If something goes wrong");
			exp.printStackTrace();  // show the exception message
		}
		finally {
			System.out.println("Life goes on");
		}
		
	}

}
