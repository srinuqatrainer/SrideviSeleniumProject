package com.DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LogInTest
{

	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		 driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void logIn()
	{
		// <input type="text" size="10" name="userName">
		
				driver.findElement(By.name("userName")).sendKeys("tutorial");
				
				// <input type="password" size="10" name="password">
				
				driver.findElementByName("password").sendKeys("tutorial");
				
		// <input width="58" type="image" border="0" height="17" alt="Sign-In" 
//				src="/images/btn_signin.gif?osCsid=7fb031042a32d2b51901b09bbaf5e217" value="Login" name="login">
				
				driver.findElementByName("login").click();
				
				String expected_Title="Find";
				System.out.println("Title of NewTours After LogIn Successful is :"+ expected_Title);
				
				String actual_Title=driver.getTitle();
				System.out.println("Title of the WebPage is: "+ actual_Title);
								
				if(actual_Title.contains(expected_Title))
				{
					System.out.println("LogIN Successfull -- PASS");
				}
				else
				{
					System.out.println("LogIN Failed -- FAIL");
				}
				
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
}
