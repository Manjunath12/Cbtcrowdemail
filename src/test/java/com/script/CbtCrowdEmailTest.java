package com.script;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.baseLib.BaseTestPage;
import com.pom.CbtCrowdEmailPO;

public class CbtCrowdEmailTest extends BaseTestPage
{
	CbtCrowdEmailPO cbtEmailPo;
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=2,enabled=true)
	public void testCbtLogin142() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login2";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());
			Assert.fail();
		}
	}
	
	@Test(priority=3,enabled=true)
	public void testCbtLogin143() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login3";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
			Assert.fail();
		}
	}
	
	@Test(priority=4,enabled=true)
	public void testCbtLogin144() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login4";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());
			Assert.fail();
		}
	}
	
	@Test(priority=5,enabled=true)
	public void testCbtLogin145() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login5";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());
			Assert.fail();
		}
	}
	
	/*@Test(priority=6,enabled=true)
	public void testCbtLogin146() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login6";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=7,enabled=true)
	public void testCbtLogin147() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login7";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=8,enabled=true)
	public void testCbtLogin148() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login8";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=9,enabled=true)
	public void testCbtLogin149() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login9";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	
	@Test(priority=10,enabled=true)
	public void testCbtLogin150() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login10";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());
		}
	}
	
	@Test(priority=11,enabled=true)
	public void testCbtLogin151() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login11";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());
		}
	}
	
	@Test(priority=12,enabled=true)
	public void testCbtLogin152() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login12";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("failed", testCaseName, e.toString());
		}
	}
		
	
	@Test(priority=13,enabled=true)
	public void testCbtLogin153() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login13";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Fail", testCaseName, e.toString());
		}
	}
	
	@Test(priority=14,enabled=true)
	public void testCbtLogin154() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login14";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("fail", testCaseName, e.toString());
		}
	}
	
	@Test(priority=15,enabled=true)
	public void testCbtLogin155() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login15";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=16,enabled=true)
	public void testCbtLogin156() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login16";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=17,enabled=true)
	public void testCbtLogin157() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login17";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=18,enabled=true)
	public void testCbtLogin158() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login18";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=19,enabled=true)
	public void testCbtLogin159() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login19";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=20,enabled=true)
	public void testCbtLogin160() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login20";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=21,enabled=true)
	public void testCbtLogin161() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login21";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=22,enabled=true)
	public void testCbtLogin162() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login22";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=23,enabled=true)
	public void testCbtLogin163() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login23";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=24,enabled=true)
	public void testCbtLogin164() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login24";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=25,enabled=true)
	public void testCbtLogin165() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login25";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=26,enabled=true)
	public void testCbtLogin166() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login26";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=27,enabled=true)
	public void testCbtLogin170() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login27";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=28,enabled=true)
	public void testCbtLogin171() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login28";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=29,enabled=true)
	public void testCbtLogin172() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login29";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=30,enabled=true)
	public void testCbtLogin173() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login30";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=31,enabled=true)
	public void testCbtLogin174() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login31";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=32,enabled=true)
	public void testCbtLogin175() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login32";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=33,enabled=true)
	public void testCbtLogin176() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login33";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=34,enabled=true)
	public void testCbtLogin177() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login34";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=35,enabled=true)
	public void testCbtLogin178() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login35";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=36,enabled=true)
	public void testCbtLogin182() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login36";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=37,enabled=true)
	public void testCbtLogin183() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login37";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=38,enabled=true)
	public void testCbtLogin184() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login38";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=39,enabled=true)
	public void testCbtLogin185() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login39";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=40,enabled=true)
	public void testCbtLogin186() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login40";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=41,enabled=true)
	public void testCbtLogin189() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login41";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=42,enabled=true)
	public void testCbtLogin190() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login42";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=43,enabled=true)
	public void testCbtLogin191() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login43";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=44,enabled=true)
	public void testCbtLogin192() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login44";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=45,enabled=true)
	public void testCbtLogin193() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login45";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=46,enabled=true)
	public void testCbtLogin194() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login46";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=47,enabled=true)
	public void testCbtLogin195() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login47";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=48,enabled=true)
	public void testCbtLogin196() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login48";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=49,enabled=true)
	public void testCbtLogin197() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login49";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=50,enabled=true)
	public void testCbtLogin200() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login50";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=51,enabled=true)
	public void testCbtLogin201() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login51";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=52,enabled=true)
	public void testCbtLogin202() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login52";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=53,enabled=true)
	public void testCbtLogin203() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login53";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=54,enabled=true)
	public void testCbtLogin204() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login54";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=55,enabled=true)
	public void testCbtLogin205() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login55";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=56,enabled=true)
	public void testCbtLogin206() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login56";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=57,enabled=true)
	public void testCbtLogin207() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login57";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=58,enabled=true)
	public void testCbtLogin208() throws Exception
	{
	try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login58";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver, dataSheetList.get(2), dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}*/
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
	
	@Test(priority=1,enabled=true)
	public void testCbtLogin141() throws Exception
	{
		try
		{
			cbtEmailPo = new CbtCrowdEmailPO(driver);
			testCaseName="Login1";
			dataSheetList=generic.readDataFromExcel(testCaseName);
			cbtEmailPo.userLogin(dataSheetList.get(1), dataSheetList.get(2));
			cbtEmailPo.deleteAllMails();
			cbtEmailPo.removeConnectedApps(driver);
			cbtEmailPo.changePassword(driver,dataSheetList.get(2),dataSheetList.get(3), dataSheetList.get(3));
			generic.writeResultToExcel("Passed", testCaseName, "");	
		}
		catch(Exception e)
		{
			generic.writeResultToExcel("Failed", testCaseName, e.toString());	
		}
	}
}
