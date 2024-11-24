package week1.day2;

public class LearnStrings {

	public static void main(String[] args) {
		
		//Type 1 --> String class
		String obj = new String("Samuel Durairaj");
		        System.out.println(obj);
		       
		         // Type 2 --> String Literal
		String text = "TestLeaf";
		String text1 = "Chennai";

		//Changing the string to Uppercase and lowercoase
		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());

		//Finding the length of the string
		int length = text.length();
		System.out.println(length);

		//Concatenate with '+' operator
		String concat1 = text+text1+length; //+ operator can Concatenate string with any datatype
		System.out.println(concat1);

		//Concatenate with 'concat()' method
		String concat2 = text.concat(text1);
		System.out.println(concat2);

		// '==' double equals operator does not work properly for strings

		//'equals()' method-- Boolean return Type
		System.out.println(text.equals(text1));

		//'equalsIgnoreCase()' method used to check the casesensitivity of the strings -- Boolean return type
		System.out.println(text.equalsIgnoreCase(text1));

		//'contains()' method-- Boolean return type
		System.out.println(concat1.contains("Chennai"));

		//'trim()' method is used to remove the empty space in the string
		String trimDemo = "   All is Well   ";
		System.out.println("Before Trimming: " +trimDemo);
		String trimmedText = trimDemo.trim();
		System.out.println("After Trimming: " +trimmedText);

		//'replace()' method
		System.out.println(trimmedText.replace('l','$'));

		//'substring(index)' method is used to cut the string
		System.out.println(trimmedText.substring(2)); // cuts the string from the index 0 to 3 and displays from 4th index
		System.out.println(trimmedText.substring(2,6)); //cuts the from start index and from the end index -1

		//'charAt(index)' - prints one character of the string with the datatype 'char'
		System.out.println(trimmedText.charAt(5));

	}

}
