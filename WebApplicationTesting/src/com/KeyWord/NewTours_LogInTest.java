package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
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
	public void logIn() throws IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\newTours.properties");
		
		Properties pr = new Properties();
		pr.load(file);
		
		driver.findElement(By.name(pr.getProperty("username"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("pwd"))).sendKeys("tutorial");
		
		driver.findElement(By.name(pr.getProperty("signIn"))).click();
		
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
