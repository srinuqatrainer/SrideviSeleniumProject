package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args)
	{
		// List<dataType>ArrayName = new ArrayList<>();
		
		List<String>a = new ArrayList<>();
		
		a.add("Selenium"); // index 0
		a.add("LoadRunner"); // index 1
		a.add("QTP"); // index 2
		a.add("Jmeter"); // index 3
		
		// System.out.println(a);
		
		for(int i=0;i<a.size();i++)
		{
			String x=a.get(i);
			System.out.println(x);
		}
		
	}

}
