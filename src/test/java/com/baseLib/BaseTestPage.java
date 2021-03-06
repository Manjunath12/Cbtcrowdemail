package com.baseLib;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestPage 
{
	public WebDriver driver;
	
	static public String sDirPath=System.getProperty("user.dir");
	public ArrayList<String> dataSheetList ;
	public String testCaseName;	
	public GenericExcel generic;
	
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dataSheetList =new ArrayList<String>();
		generic=new GenericExcel();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
//		driver.findElement(By.xpath("//span[@class='gb_1a gbii']")).click();
//		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		driver.quit();	
	}	
}
