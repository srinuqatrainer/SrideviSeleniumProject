package com.Arrays;

public class SingleDimensional {

	public static void main(String[] args)
	{
		/*int a=10;
		a=30;
		System.out.println(a);*/
		
		/*dataType []ArrayName = new dataType[size];
		dataType ArrayName[] = new dataType[size]; */
		
		int a[] = new int[4];
		
		// index(Memory Location) of any Array always starts with 0
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		//a[3] = 40;
		
		
		//for(int i=0;i<3;i++)
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		

	}

}
