package core.java8;

public class DataTypeConversion {

	public static void main(String[] args) {
	
		/*
		 * Implicit data type conversion: Conversion of smaller data type to a larger data type
		 */
		int a = 100;
		System.out.println("int Representation: "+a);
		
		long b = a;
		System.out.println("long Representation: " +b);
		
		float c = b;
		System.out.println("float Representation: "+c);
		
		
		System.out.println();
		System.out.println("*****************************");
		/*
		 * Explicit data type conversion: Conversion of larger data type to smaller data type
		 */
		double d = 50.50;
		System.out.println("double Representation: "+d);
		
		float e = (float)d; //Type cast
		System.out.println("float Representation: " +e);
		
		long f = (long)e;
		System.out.println("long Representation: "+f);
		
		int g = (int)f;
		System.out.println("int Representation: "+f);

	}

}
