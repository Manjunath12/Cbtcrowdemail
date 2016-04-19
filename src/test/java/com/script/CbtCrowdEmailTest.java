package com.script;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseLib.BaseTestPage;
import com.pom.CbtCrowdEmailPO;
import DDT.ExcelDataConfig;

public class CbtCrowdEmailTest extends BaseTestPage
{
	public String testcasename;
	CbtCrowdEmailPO cbtEmailPo ;
	
	@Test(dataProvider="testData")
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
		
	@DataProvider(name="testData")
	public Object[][] passData()
	{
		ExcelDataConfig config = new ExcelDataConfig("C:\\Manjunath_Rajeev\\Project_WorkSpace\\CbtCrowdEmail\\TestData\\InputData.xlsx");
		int rowCount=config.getRowCount(0);
		Object[][] data = new Object[rowCount][4];
		
		for(int i=0;i<rowCount;i++)
		{
			data[i][0]=config.getData(0, i, 0);
			data[i][1]=config.getData(0, i, 1);
			data[i][2]=config.getData(0, i, 2);
			data[i][3]=config.getData(0, i, 3);
		}	
		return data;
	 }
}