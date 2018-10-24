package com.Annotations;

import org.testng.annotations.Test;

public class Annotations1 
{

	@Test(priority=0) // its a test case
	public void browserLaunch()
	{
		System.out.println(" Launching FireFox Browser ");
	}
	
	@Test(priority=1)
	public void logIn()
	{
		System.out.println(" LogIn to Gmail");
	}
	
	// enabled=false -- this Test case will be ignored during the Test Run
	@Test(enabled=false)
	public void composeMail()
	{
		System.out.println(" Testing Compose a Mail Functionality");
	}
	
	@Test(priority=2)
	public void inBox()
	{
		System.out.println(" Testing InBox Functionality");
	}
	
}
