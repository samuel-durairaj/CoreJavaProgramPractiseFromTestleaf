package core.java8;

public class LearnStatic {

	/* Class Variable - static
	 * ------------------------
	 * In Class loading:
	 *  1) Class object will be created:
	 *     - all the static variable will be initialised
	 *     - all the static block will be executed
	 *     - the main() will be called by a thread called main thread
	 *     
	 *  2) Instance object will be created (by the developer using the keyword 'new')
	 * */
	
	static int count = 100;
	int i=100;
	public LearnStatic() {
		
	}
	public void test() {
		count++;
	}
	public static void statMethod() {
		count++;
	}
	static {
		count++;
		System.out.println("first static block "+count);
	}
	public static void main(String[] args) {
		//test();
		statMethod();
		LearnStatic objRef = new LearnStatic();
		objRef.i++;
		count++;
		System.out.println("main block "+count);
	}
	static {
		count++;
		System.out.println("second static block "+count);
	}
}
