package com.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args)
	{
		/*dataType [][]ArrayName = new dataType[size][size];
		dataType ArrayName[][] = new dataType[size][size]; */
		
		String [][]a = new String[2][2];
		
		a[0][0] = "Sridevi";
		a[0][1] = "Hello";
		
		a[1][0] = "Ram";
		a[1][1] = "Hi";
		
	//	for(int i=0;i<2;i++) // for All the Rows
		for(int i=0;i<a.length;i++)
		{
			//for(int j=0;j<2;j++) // for each and every Row , it internally runs for all the Columns
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
		

	}

}
