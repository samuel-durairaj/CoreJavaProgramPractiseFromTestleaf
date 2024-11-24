package week1.day2;

public class LearnTwoDArray {

	public static void printArray(int[][] array)
	{
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+" ");
			}
		System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("First Array");
		printArray(arr1);
		
		int[][] arr2 = {{3,4,5},{7,8,9},{0,1,2}};
		System.out.println("Second Array");
		printArray(arr2);
		
		int[][] result = new int[arr1.length][arr1[1].length];
		
		int len = arr1.length;
		int len1 = arr1[1].length;
		
		System.out.println("Array1 Length: " +len);
		System.out.println("Array2 Length: " +len1);
		
		//Addition of Arrays: arr1 and arr2
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				result[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		printArray(result);
		
		
		int[] array2 = {1,2,3,4,5};
		int[] array1 = new int[5];
		
		int[][] array3 = new int[3][4];
		array3[0][1] = 1;
		array3[0][2] = 2;
		
		//int[][] array2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		  int[][] array = {{1,2,3,4},
						    {5,6,7,8},
						    {9,10,11,12}};
	      
		  //Print the number of rows and columns and its value
		  System.out.println("Number of Rows: " +array.length);
		  
		  for (int i = 0; i < array.length; i++) 
		  {
		     System.out.println("Column "+i+" Count: "+array[1].length);
		     for (int j = 0; j < array[i].length; j++) 
		     {
			System.out.println(array[i][j]);
		     }
		  }
		  System.out.println();
		  
		  //Print as Actual Matrix
		  System.out.println("Actual Matrix");
		  for (int i = 0; i < array.length; i++)
		  {
			for (int j = 0; j < array[i].length; j++) 
			{
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		  }
		  
		  //Transpose Matrix (Convert Row into Column and Column into Rows)
		  System.out.println("Transpose Matrix");
		  for (int i = 0; i < array.length; i++)
		  {
			for (int j = 0; j < array[i].length; j++) 
			{
				System.out.print(array[j][i]+"  ");
			}
			System.out.println();
		  }
		
	}
}
