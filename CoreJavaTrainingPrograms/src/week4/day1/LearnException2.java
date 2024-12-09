package week4.day1;

public class LearnException2 {

	public static void waitTime() throws InterruptedException {
		
		System.out.println("First");
		Thread.sleep(5000);
        System.out.println("Last");
	}
	
	public static void main(String[] args){
		//'throws' is an exception used to call once or more than once
		
	try {
		waitTime();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	//Manually we can throw an exception using the keyword 'throw'
	System.out.println("Start Execution");
	throw new ArrayIndexOutOfBoundsException();
	
	}
}
