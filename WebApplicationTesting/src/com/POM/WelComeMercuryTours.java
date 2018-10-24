package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelComeMercuryTours
{
    // Object Repository
	
	/*WebElement signOn=driver.findElement(By.linkText("SIGN-ON"));
	signOn.click();*/
	
	@FindBy(linkText="SIGN-ON")
	WebElement signOn;
	
	public void SignOn()
	{
		signOn.click();
	}
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void Register()
	{
		register.click();
	}
	
	
	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement SignIn;
	
	
	public void logIn(String Uname,String Pwd)
	{
		UserName.sendKeys(Uname);
		Password.sendKeys(Pwd);
		SignIn.click();
	}
	
	
}
