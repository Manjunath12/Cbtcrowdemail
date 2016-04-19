package DDT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.tree.ExpandVetoException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pom.CbtCrowdEmailPO;

public class DataDrivenForGmail extends BasePage
{
	public String testcasename;
	CbtCrowdEmailPO cbtEmailPo ;
	
	@Test(priority=1,enabled=true,dataProvider="wordpress")
	 public void loginToWord(String testCaseName,String username,String password,String newPassword) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		try
		{
		cbtEmailPo = new CbtCrowdEmailPO(driver);
		cbtEmailPo.userLogin(username, password);
		cbtEmailPo.removeConnectedApps(driver);
		cbtEmailPo.changePassword(driver, password, newPassword, newPassword);
		generic.writeResultToExcel("Pass", testCaseName, "");
		}
		catch(Exception e)
		{
		generic.writeResultToExcel("Fail", testCaseName, e.toString());
		}
		
	 }
		
	@DataProvider(name="wordpress")
	public Object[][] passData()
	{
		ExcelDataConfig config = new ExcelDataConfig("C:\\Manjunath_Rajeev\\Project_WorkSpace\\CbtCrowdEmail\\TestData\\InputData.xlsx");
		
		int rows=config.getRowCount(0);
		
		Object[][] data = new Object[rows][4];
	
		for(int i=0;i<rows;i++)
		{
			data[i][0]=config.getData(0, i, 0);
			data[i][1]=config.getData(0, i, 1);
			data[i][2]=config.getData(0, i, 2);
			data[i][3]=config.getData(0, i, 3);
		}

		
		return data;
		
	 }
}
