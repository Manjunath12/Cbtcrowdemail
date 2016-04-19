package DDT;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.baseLib.GenericExcel;

public class BasePage 
{
	public static WebDriver driver;
	
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
		generic=new GenericExcel();
		//dataSheetList =new ArrayList<String>();
		
	}
	

	@AfterMethod
	public void closeBrowser()
	{
//		driver.findElement(By.xpath("//span[@class='gb_1a gbii']")).click();
//		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		driver.close();	
	}	
}
