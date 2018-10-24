package com.Arrays;

public class ObjectArrayExample {

	public static void main(String[] args)
	{
		//Object []ArrayName = new Object[size];
		//Object ArrayName[] = new Object[size];
		
		
		Object a[] = new Object[3];
		
		a[0] = 10;
		a[1] = "Sridevi";
		a[2] = 10.124;
		
		
		/*for(int i=0;i<=2;i++)
		{
			System.out.println(a[i]);
		}*/
		
		// for each loop
		
		for(Object var:a)
		{
			System.out.println(var);
		}
		
		
		

	}

}
