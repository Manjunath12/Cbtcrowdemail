package com.baseLib;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListener implements ITestListener
{
	Date date = new Date();
	SimpleDateFormat dte=new SimpleDateFormat("dd-MM-yyyy_hh_mm_ss");
	String date1 = dte.format(date);
	String path = System.setProperty("Log",date1);
	public Logger logVariable=Logger.getLogger(this.getClass());

	public void onFinish(ITestContext result) 
	{
		System.out.println("Testng end");
	}

	public void onStart(ITestContext arg0) 
	{
		System.out.println("Testng starting");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) 
	{
		// TODO Auto-generated method stub
	}

	public void onTestFailure(ITestResult failure) 
	{
		String instanceName =failure.getInstanceName();
		String className = instanceName.substring(instanceName.lastIndexOf('.')+1);
		String methodName=failure.getName().toString();
		logVariable.info("Failed testcase:  "+failure.getName().toString());
		System.out.println(methodName+" Method got failed");
		Object object=failure.getInstance();
		BaseTestPage genric=(BaseTestPage)object;
		screenShot(genric.driver,methodName);
	}

	public void onTestSkipped(ITestResult skipped) 
	{
		System.out.println("Skipped testcase:  "+skipped.getName().toString());
		logVariable.warn("Skipped testcase:  "+skipped.getName().toString());
	}

	public void onTestStart(ITestResult arg0) 
	{
		// TODO Auto-generated method stub
	}

	public void onTestSuccess(ITestResult success) 
	{
		logVariable.warn("Success testcase:  "+success.getName().toString());
	}
	public void screenShot(WebDriver driver,String methodName)
	{
		
		File imgscr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			FileUtils.copyFile(imgscr, new File(BaseTestPage.sDirPath+"\\Results\\ScreenShot\\"+methodName+ "-"+date1+".png"));
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
