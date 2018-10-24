package com.DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_NewUserRegistration
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
	
	@Test(priority=0)
	public void register()
	{
		// <a href="mercuryregister.php">REGISTER</a>
		
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	@Test(priority=1)
	public void newUserRegistration()
	{
		
		driver.findElement(By.name("firstName")).sendKeys("SriDevi");
		driver.findElement(By.name("lastName")).sendKeys("Hello");
		driver.findElement(By.name("phone")).sendKeys("5858554");
		driver.findElement(By.id("userName")).sendKeys("sri@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("HiTech");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("500001");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		
		driver.findElement(By.id("email")).sendKeys("Sriiiii");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
		
		driver.findElement(By.name("register")).click();
		
		String expected_UserName="Sriiiii";
		
		String actual_RegistedUserName=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		
		System.out.println("Expected UserName is : "+expected_UserName);
		System.out.println("Registed userName is : "+ actual_RegistedUserName);
		
		if(actual_RegistedUserName.contains(expected_UserName))
		{
			System.out.println(" User Registered Successfully -- PASS");
		}
		else
		{
			System.out.println("User Registration Failed -- FAIL");
		}
				
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
