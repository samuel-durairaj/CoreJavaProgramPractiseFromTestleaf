package week1.day2;

public class StringLiteralAndObject {

	public static void main(String[] args) {

		// String Literal vs String Object
		 
		  // 2 Types of memory in JVM - Heap (static) and Stack (dynamic-during runtime)
		 
		//Type 1 --> String class - Heap Memory - Slower
		String str1 = new String("testleaf");
		String str2 = new String("testleaf");
		System.out.println("Object comparison of 2 strings using == operator : "+(str1==str2));
		System.out.println("Object comparison of 2 strings using 'equals()' method: " +str1.equals(str2));
		       
		System.out.println();
		
	    // Type 2 --> String Literal - Stack Memory - Faster
		String str3 = "testleaf";
		String str4 = "testleaf";
		System.out.println("Literal comparison of 2 strings using == operator : "+(str3==str4));
		System.out.println("Literal comparison of 2 strings using 'equals()' method: " +str3.equals(str4));

		// String str = "Good Life is a boon";

		// String[] split = str.split(" ");
		// int len = split.length;

		// String part = split[len-1];

		// System.out.println(part);

		// for(int i=len-1;i>=0;i--)
		// {
		//   System.out.println(split[i]);
		// }

		System.out.println();
		
		// Reverse the string in the even index
		String str = "What goes out will come in another way";
		//Split it into array of words
		String[] array = str.split(" ");
		//Iterate the words
		for(int i=0; i<array.length; i++)
		{
		   //Check for even index
		   if(i%2!=0)
		   {
		       //Take the even index word
		       String text = array[i];
		       //Reverse the even index word and print it
		       for(int j=text.length()-1; j>=0; j--)
		       {
		           System.out.print(text.charAt(j));
		       }
		   }
		   else
		   {
		       //Print it as such
		       System.out.print(array[i]);
		   }
		   //Space between the words
		  System.out.print(" ");
		}
	}

}
