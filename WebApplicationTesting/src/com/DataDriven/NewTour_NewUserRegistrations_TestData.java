package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTour_NewUserRegistrations_TestData
{

//FirefoxDriver driver;
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		// driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivas1\\Desktop\\SrideviSelenium\\WebApplicationTesting\\driverFiles\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		driver.get("http://newtours.demoaut.com");
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=0)
	public void register()
	{
		// <a href="mercuryregister.php">REGISTER</a>
		
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	@Test(priority=1)
	public void newUserRegistration() throws IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\ApplicationTestDataFiles\\NewUserRegistrationTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowCount;i++)
		{
			Row r=sheet.getRow(i);
		
			driver.findElement(By.name("firstName")).clear();
			driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
			
			driver.findElement(By.name("lastName")).clear();
			driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
		
		// Converting Numeric dataType to String dataType -- this is called as TypeCasting
		double d=r.getCell(2).getNumericCellValue();
		long x=(long)d;
		String phoneNumber=Long.toString(x);
		
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys(phoneNumber);
		
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
		
		driver.findElement(By.name("address1")).clear();
		driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
		
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
		
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
		
		double p=r.getCell(7).getNumericCellValue();
		long y=(long)p;
		String postalCode=Long.toString(y);
		
		driver.findElement(By.name("postalCode")).clear();
		driver.findElement(By.name("postalCode")).sendKeys(postalCode);
		
		driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(r.getCell(9).getStringCellValue());
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
		
		driver.findElement(By.name("confirmPassword")).clear();
		driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
		
		driver.findElement(By.name("register")).click();
		
		String expected_UserName=r.getCell(9).getStringCellValue();
		
		String actual_RegistedUserName=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		
		System.out.println("Expected UserName is : "+expected_UserName);
		System.out.println("Registed userName is : "+ actual_RegistedUserName);
		
		if(actual_RegistedUserName.contains(expected_UserName))
		{
			System.out.println("User Registered Successfully -- PASS");
			r.createCell(12).setCellValue("User Registered Successfully -- PASS");
		}
		else
		{
			System.out.println("User Registration Failed -- FAIL");
			r.createCell(12).setCellValue("User Registration Failed -- FAIL");
		}
		
		FileOutputStream file1 = new FileOutputStream(System.getProperty("user.dir")+"\\src\\com\\ApplicationTestResultFiles\\NewUserRegistrationResult.xlsx");
		workBook.write(file1);
		
		driver.navigate().back();
	}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

	
	
	
	
	
}
