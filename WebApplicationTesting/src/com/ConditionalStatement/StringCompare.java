package com.ConditionalStatement;

public class StringCompare {

	public static void main(String[] args)
	{
		String a="Hello";
		String b="chello";
		
		if(a.equals(b))
		{
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("Strings are not Equal");
		}
		
		String c="Hello";
		String d="hello";
		
		if(c.equals(d))
		{
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("Strings are not Equal");
		}
		
		String e="Hello";
		String f="hello ";
		
		if(e.equalsIgnoreCase(f))
		{
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("Strings are not Equal");
		}
		
		String g="Hello";
		String h="ello";
		
		if(g.contains(h))
		{
			System.out.println("ello is in Hello");
		}
		else
		{
			System.out.println("ello is not in Hello");
		}
		

	}

}
