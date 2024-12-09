package week4.day1;

import java.util.*;

//Lambda expression used to create more abstraction
//3 components for Lambda expressions: 
/*
 * (lambda operator)->{body}
 */
//functional interface (Interface having only one method is know as functional interface)
interface MobilePhone {
	public void makePayment(long cardNumber);
}


public class LearnLambdaExpressions {

	public static void main(String[] args) {
		
		/*MobilePhone obj = new MobilePhone()//Creating object for the interface mobile
		{
		public void makePayment(long cardNumber) {
					
				System.out.println("Make payment using: " +cardNumber);		
		}
	   };
	   obj.makePayment(19092384098L);*/
		
		MobilePhone obj = (long cardNumber) -> {System.out.println("Make payment using: " +cardNumber);};
		obj.makePayment(39874298472347L);
		
		
		List<String> list = new ArrayList<>();
		list.add("USA");
		list.add("Africa");
		list.add("Asia");
		list.add("Europe");
		
		System.out.println("********************");
		
		for(String eachList: list)
		{
			if(eachList.startsWith("A")) {
			System.out.println(eachList);
		}
		}
		
		System.out.println("********************");
		
		list.forEach((eachList)->{System.out.println(eachList);}); // foreach using the Lambda expression
		
	}
}
