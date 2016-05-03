package com.script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseLib.BaseTestPage;
import com.baseLib.ExcelDataConfig;
import com.pom.CbtCrowdEmailPO;


public class CbtCrowdEmailTest extends BaseTestPage
{
	public String testcasename;
	CbtCrowdEmailPO cbtEmailPo ;

	
/*Description: Below method describes 
 * 1. User Login into CbtCrowd Gmail account.
 * 2. Delete all the Mails present in the Inbox,Sent Items,Draft,Imap,Spam,Trash.
 * 3. Removes the Apps which are associated to the emails under My Account Settings.
 * 4. Change Password of CbtCrowd acoount and verify the relogin with new password.
 * 5. Finally Logout from the CbtCrowd Account 	
 */
	
	@Test(dataProvider="testData")
	 public void cbtCrowdEmail(String testCaseName,String username,String password,String newPassword) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			cbtEmailPo.userLogin(username, password);
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, password, newPassword, newPassword);
			generic.writeResultToExcel("Pass", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Fail", testCaseName, e.toString());
		}	
	 }
		
	
/* Description: Below method reads data from the excel sheet and send it to above test method
 * 				in order to run the test script multiple times
 */	
	
	@DataProvider(name="testData")
	public Object[][] passData()
	{
		ExcelDataConfig config = new ExcelDataConfig(sDirPath+"\\ExcelFile\\InputData.xlsx");
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