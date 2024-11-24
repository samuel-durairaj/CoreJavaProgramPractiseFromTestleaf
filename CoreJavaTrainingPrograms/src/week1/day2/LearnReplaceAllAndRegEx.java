package week1.day2;

import java.util.Arrays;

public class LearnReplaceAllAndRegEx {

	public static void main(String[] args) {

		String rep = "I was Born on 1986";
		System.out.println(rep.replace('o','@'));
		System.out.println(rep.replaceAll("[^0-9]","")); //Print only the numbers
		System.out.println(rep.replaceAll("[^A-Z]","")); //Print only the Upper case alphabet

		String str = "Good Morning";
		char[] charArr = str.toCharArray();
		System.out.println(charArr[0]);
		System.out.println(charArr.length-1);
		System.out.println(Arrays.toString(charArr));
		
		String str2 = "I Love Mutton Biryani"; // Separated by space
		String[] split = str2.split(" ");
		System.out.println(Arrays.toString(split));
		
		String str3 = "I,Love,Mutton,Biryani"; // Separated by commas
		String[] split1 = str3.split(",");
		System.out.println(Arrays.toString(split1));
	}

}
