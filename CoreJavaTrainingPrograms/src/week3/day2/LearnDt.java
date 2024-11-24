package week3.day2;

public class LearnDt {

	/* Primitive Data Types and its corresponding wrapper classes
	 * int - Integer
	 * float - Float
	 * char - Character
	 * byte - Byte
	 * short - Short
	 * long - Long
	 * double - Double
	 * boolean - Boolean
	 * 
	 */
	
	public static void main(String[] args) {

		Object[] array = {1,2,3,4,5,"Sam",true,'a',8.777};//Object is the super most class in Java, this array can have values with different data types
        int a = 5;
        double c = a; // converted int to double
        System.out.println(a+" "); // " ", due to the double quotes now the integer is converted to string
        Integer b = 5;
        double value = b.doubleValue();
        System.out.println(value);

	}

}
