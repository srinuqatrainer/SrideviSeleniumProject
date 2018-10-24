package com.linksTesting;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Click {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		/*
		 
<a href="mercuryregister.php?osCsid=3533dabed8d3137db1be3aec121ff46a">REGISTER</a>

 a - tag - will only be used to develop a link on a webPage

 href - Attribute -- will always have a reference URL

 THe Element is of Type "LINK"

 When an element is of type LINK then use the locator as "linkText"

 Then the Selector is going to be the Name of the link "REGISTER"
 
		 */
		
		driver.findElementByLinkText("REGISTER").click();
		
		String actual_Title=driver.getTitle();
		System.out.println(actual_Title);
		
		driver.close();

	}

}
