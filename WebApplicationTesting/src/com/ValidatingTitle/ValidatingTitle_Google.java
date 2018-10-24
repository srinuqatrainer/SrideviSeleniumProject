package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_Google {

	public static void main(String[] args)
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		String expected_Title="facebook"; // Client Requirement
		System.out.println("The Client Expected Title is : "+expected_Title);
		
		String actual_Title=driver.getTitle(); // Developer Developed Title
		System.out.println("The title of Google WebPage is: "+actual_Title);
		
		if(actual_Title.equalsIgnoreCase(expected_Title))
		{
			// True Block
			System.out.println("Title Matched -- PASS");
		}
		else
		{
			// false Block
			System.out.println("Title not Matched -- FAIL");
		}
		
		driver.close();
	}

}
