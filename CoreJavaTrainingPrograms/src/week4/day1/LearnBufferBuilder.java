package week4.day1;

public class LearnBufferBuilder {

	public static void main(String[] args) {
		
		String str = "Testleaf";
		System.out.println(str);
		System.out.println(str.hashCode());//'hashcode()' to find the memory location
		
		System.out.println("****************************");
		
		String newText = str.concat(" in Chennai");
		System.out.println(newText);
		System.out.println(newText.hashCode()); // Different memory location after concatenation, so the strings cannot be replaced or immutable
		
		System.out.println("****************************");
		
		StringBuffer buf = new StringBuffer("Testleaf"); // StringBuffer will make the string mutable, so it allocates the same memory location
		System.out.println(buf.hashCode());
		buf.append(" in USA");
		System.out.println(buf);
		System.out.println(buf.hashCode());
		
		//CRUD operations using String Buffer - delete(), replace(), append() , etc...
		//String Buffer is available from Java 1
		
	}
}
