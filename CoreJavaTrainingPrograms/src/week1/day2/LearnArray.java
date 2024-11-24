package week1.day2;

public class LearnArray {

	// It is mandatory to give the size of an array, big dis-advantage of an array
	// Causing memory expenses
	
	public static void main(String[] args) {
		
		int[] ages = {17,19,21,33,26};
		int len = ages.length; //length is not a method, it is a property
	    for(int i=0;i<len;i++)
	    {
	    	System.out.println(ages[i]);
	    }

	    String[] strArr = new String[5]; // Empty Array of a string
	    strArr[0] = "Samuel";
	    strArr[1] = "Sachin";
	    strArr[2] = "Sehwag";
	    strArr[3] = "Sourav";
	    strArr[4] = "Samuel";
	    
	    int strLen = strArr.length;
	    
	    for (int i=0; i<strLen; i++)
	    {
	    	System.out.println(strArr[i]);
	    }
	    System.out.println("---------------------------");
	    
	    //Enhanced for loop
	   for(String printNames: strArr)
	   {
		   System.out.println(printNames);
	   }
	}

}
