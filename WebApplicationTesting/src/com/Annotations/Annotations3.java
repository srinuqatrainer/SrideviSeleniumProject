package com.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3
{

	
	
	@Test(priority=0)
	public void inBox()
	{
		System.out.println(" Testing InBox Functionality ");
	}
	
	
	@Test(priority=1)
	public void composeMail()
	{
		System.out.println(" Testing Compose Mail FUnctionality ");
	}
	
	@AfterMethod
	public void applicationClose()
	{
		System.out.println(" Closing Gmail Application ");
	}
	
	@BeforeMethod
	public void applicationLaunchAndLogIn()
	{
		System.out.println(" Gmail Application Launch and LogIn ");
	}
	
	
	
}
