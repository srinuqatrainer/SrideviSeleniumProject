package com.ConditionalStatement;

public class NestedIfExample {

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b & a>c)
		{
			System.out.println("a is greater than b");
		}
		
		else
			if(b>c)
		{
			System.out.println("b is greater than c");
		}
			else
			{
				System.out.println("c is greater ");
			}

	}

}
