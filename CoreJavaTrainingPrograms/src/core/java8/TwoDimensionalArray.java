package core.java8;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		//Two Dimensional Array- Matrix (Print, Add, Subtract, Multiply)
		
		int row =3, column =3;
		int arr1[][] = {{2,5,4},{4,1,2},{8,9,2}};
		int arr2[][] = {{2,1,2},{9,1,0},{6,1,2}};
		int[][] result = new int[row][column];
		
		//Printing a 2D array
//		for(int i=0;i<row;i++)
//		{
//			for(int j=0;j<column;j++)
//			{
//				System.out.print(arr1[i][j]+ " ");
//			}
//			System.out.println();
//		}
		//Adding 2D array
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				result[i][j]=arr1[i][j]*arr2[i][j]; 
			}
			System.out.println();
		}
		//Displaying the result in an array
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
