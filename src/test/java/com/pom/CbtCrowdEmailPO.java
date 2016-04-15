package com.pom;

import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CbtCrowdEmailPO 
{
	public CbtCrowdEmailPO(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement eleEmailTxtFld;
	public WebElement getEleEmailTxtFld()
	{
		return eleEmailTxtFld;
	}
	
	@FindBy(xpath="//input[@id='next']")
	private WebElement eleNextBtn;
	public WebElement getEleNextBtn()
	{
		return eleNextBtn;
	}
	
	@FindBy(xpath="//input[@id='Passwd']")
	private WebElement elePwdTxtFld;
	public WebElement getElePwdTxtFld()
	{
		return elePwdTxtFld;
	}
	
	@FindBy(id="signIn")
	private WebElement eleSignInBtn;
	public WebElement getEleSignInBtn()
	{
		return eleSignInBtn;
	}
	
	@FindBy(xpath="(//span[text()='More'])[1]")
	private WebElement eleMoreIcn;
	public WebElement getEleMoreIcn()
	{
		return eleMoreIcn;
	}
	
	@FindBy(xpath="//a[text()='All Mail']")
	private WebElement eleAllMailsLnk;
	public WebElement getEleAllMailsLnk()
	{
		return eleAllMailsLnk;
	}
	
	@FindBy(xpath="(//span[@role='checkbox'])[2]")
	private WebElement eleSelChkBx;
	public WebElement getEleSelChkBx()
	{
		return eleSelChkBx;
	}
	
	@FindBy(xpath="(//span[@role='link'])[5]")
	private WebElement eleAllMailDelLnk;
	public WebElement getEleAllMailDelLnk()
	{
		return eleAllMailDelLnk;
	}
	
	@FindBy(xpath="//div[@data-tooltip='Delete']")
	private WebElement eleDeletBtn;
	public WebElement getEleDeletBtn()
	{
		return eleDeletBtn;
	}
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement eleAllMailDelOkBtn;
	public WebElement getEleAllMailDelOkBtn()
	{
		return eleAllMailDelOkBtn;
	}

	@FindBy(xpath="//span[@class='nU n1']")
	private WebElement eleSpamLnk;
	public WebElement getEleSpamLnk()
	{
		return eleSpamLnk;
	}
	
	@FindBy(xpath="(//input[@class='gbqfif'])[1]")
	private WebElement eleSearchTxtBx;
	public WebElement getEleSearchTxtBx()
	{
		return eleSearchTxtBx;
	}
	
	@FindBy(xpath="//a[@title='Trash']")
	private WebElement eleTrashLnk;
	public WebElement getEleTrashLnk()
	{
		return eleTrashLnk;
	}
	
	@FindBy(xpath="(//span[@role='checkbox'])[3]")
	private WebElement eleSelTrashChkBx;
	public WebElement getEleSelTrashChkBx()
	{
		return eleSelTrashChkBx;
	}
	
	@FindBy(xpath="(//span[@role='link'])[1]")
	private WebElement eleTrashDelAllMailLnk;
	public WebElement getTrashDelAllMailLnk()
	{
		return eleTrashDelAllMailLnk;
	}
	
	@FindBy(xpath="(//div[text()='Delete forever'])")
	private WebElement eleDelTrashBtn;
	public WebElement getEleDelTrashBtn()
	{
		return eleDelTrashBtn;
	}
	
	@FindBy(xpath="//span[@class='gb_1a gbii']")
	private WebElement eleAcctIcn;
	public WebElement getEleAcctIcn()
	{
		return eleAcctIcn;
	}
	
	@FindBy(xpath="//a[text()='My Account']")
	private WebElement eleMyAcctBtn;
	public WebElement getEleMyAcctBtn()
	{
		return eleMyAcctBtn;
	}
	
	@FindBy(xpath="(//a[text()='Connected apps & sites'])[2]")
	private WebElement eleConnctdAppsLnk;
	public WebElement getEleConnctdAppsLnk()
	{
		return eleConnctdAppsLnk;
	}
	
	@FindBy(xpath="(//a[text()='Manage apps'])")
	private WebElement eleManageAppsLnk;
	public WebElement getEleManageAppsLnk()
	{
		return eleManageAppsLnk;
	}
	
	@FindBy(xpath="//div[@class='Jy hY']")
	private WebElement eleNoAppsCnntcdMsg;
	public WebElement getEleNoAppsCnntcdMsg()
	{
		return eleNoAppsCnntcdMsg;
	}
	
	@FindBy(xpath="//div[@class='vo zG']")
	private List<WebElement> eleAppsCnntcdMsg;
	public List<WebElement> getEleAppsCnntcdMsg()
	{
		return eleAppsCnntcdMsg;
	}
	
	@FindBy(xpath="//span[text()='Remove']")
	private WebElement eleRemveAppsBtn;
	public WebElement getEleRemveAppsBtn()
	{
		return eleRemveAppsBtn;
	}
	
	@FindBy(xpath="(//span[text()='OK'])[2]")
	private WebElement eleRemveAppsOkBtn;
	public WebElement getEleRemveAppsOkBtn()
	{
		return eleRemveAppsOkBtn;
	}
	
	@FindBy(xpath="(//a[text()='Account overview'])[2]")
	private WebElement eleAccOvrvwLnk;
	public WebElement getEleAccOvrvwLnk()
	{
		return eleAccOvrvwLnk;
	}
	
	@FindBy(xpath="(//a[text()='View Dashboard'])")
	private WebElement eleVwDashBrdLnk;
	public WebElement getEleVwDashBrdLnk()
	{
		return eleVwDashBrdLnk;
	}
	
	@FindBy(xpath="//a[text()='Change Password']")
	private WebElement eleChngePwdLnk;
	public WebElement getEleChngePwdLnk()
	{
		return eleChngePwdLnk;
	}
	
	@FindBy(xpath="(//input[@class='wb Hj'])[1]")
	private WebElement eleNwPwdFld;
	public WebElement getEleNwPwdFld()
	{
		return eleNwPwdFld;
	}
	
	@FindBy(xpath="(//input[@class='wb Hj'])[2]")
	private WebElement eleConfrmPwdFld;
	public WebElement getEleConfrmPwdFld()
	{
		return eleConfrmPwdFld;
	}
	
	@FindBy(xpath="//span[text()='Change password']")
	private WebElement eleChngPwdBtn;
	public WebElement getEleChngPwdBtn()
	{
		return eleChngPwdBtn;
	}
	
	@FindBy(xpath="//a[text()='Sign out']")
	private WebElement eleSignOutLnk;
	public WebElement getEleSignOutLnk()
	{
		return eleSignOutLnk;
	}
	
	@FindBy(partialLinkText="Inbox")
	private WebElement eleInboxLnk;
	public WebElement geteleInboxLnk()
	{
		return eleInboxLnk;
	}

	@FindBy(xpath="//span/b[text()='Your password changed']")
	private WebElement elechngePwdTxt;
	public WebElement getElechngePwdTxt()
	{
		return elechngePwdTxt;
	}
	
	public void userLogin(String userName, String passWord) throws InterruptedException
	{
		getEleEmailTxtFld().sendKeys(userName);
		getEleNextBtn().click();
		getElePwdTxtFld().sendKeys(passWord);
		getEleSignInBtn().click();
		Thread.sleep(3000);
	}
	
	public void deleteAllMails() throws InterruptedException
	{
		getEleMoreIcn().click();
		getEleAllMailsLnk().click();
		getEleSelChkBx().click();
		try
		{
			if(getEleAllMailDelLnk().isDisplayed())
			{
				getEleAllMailDelLnk().click();
				getEleDeletBtn().click();
				getEleAllMailDelOkBtn().click();
				getEleAllMailDelOkBtn().click();
			}
		}
		catch(Exception e)
		{
			getEleDeletBtn().click();
			getEleAllMailDelOkBtn().click();
		}
		Thread.sleep(5000);
		getEleSearchTxtBx().sendKeys("in:trash" + Keys.ENTER);
		getEleSelTrashChkBx().click();
		
//		try
//		{
//			if(getTrashDelAllMailLnk().isDisplayed())
//			{
//				getTrashDelAllMailLnk().click();
//				getEleDelTrashBtn().click();
//				getEleAllMailDelOkBtn().click();
//			}
//		}
//		catch(Exception e)
//		{
//			getEleDelTrashBtn().click();
//			getEleAllMailDelOkBtn().click();
//		}
//		
		getEleDelTrashBtn().click();
	}
	
	public void removeConnectedApps(WebDriver driver) throws InterruptedException
	{
		getEleAcctIcn().click();
		getEleMyAcctBtn().click();
		Thread.sleep(5000);
		
		for (String childBrowser : driver.getWindowHandles()) 
		{
		   driver.switchTo().window(childBrowser);
		   String title = driver.getTitle();
		   if(title.equals("My Account"))
		    {
		    	getEleConnctdAppsLnk().click();
		    	getEleManageAppsLnk().click();
		    	Thread.sleep(3000);
		    try
		    {
		    	if(getEleNoAppsCnntcdMsg().isDisplayed())
		    	{
		    		String message = getEleNoAppsCnntcdMsg().getText();
		    		System.out.println(message);
		    	}
		    }
		    catch(Exception e)
		    {	
		    	Loop1:for(int i = 0; i<=getEleAppsCnntcdMsg().size();)
		    	{
		    		getEleAppsCnntcdMsg().get(i).click();
		    		getEleRemveAppsBtn().click();
		    		getEleRemveAppsOkBtn().click();
		    		Thread.sleep(5000);
		    	try
		    	{
		    		if(getEleNoAppsCnntcdMsg().isDisplayed())
		    		{
		    		    String message = getEleNoAppsCnntcdMsg().getText();
		    		    System.out.println(message);
		    		    break;
		    		}
		    	}
		    	catch (Exception e2) 
		    	{
		    		continue Loop1;
				}
		    	}
		    }	
		    }
		}
	}	
	
	public void changePassword(WebDriver driver,String passWord,String newPassword,String confrmPwd) throws InterruptedException
	{
		getEleAcctIcn().click();
		getEleMyAcctBtn().click();
		Thread.sleep(5000);
	    getEleAccOvrvwLnk().click();
	    getEleVwDashBrdLnk().click();
	    getEleChngePwdLnk().click();
	    getElePwdTxtFld().sendKeys(passWord);
	    getEleSignInBtn().click();
	    getEleNwPwdFld().sendKeys(newPassword);
	    getEleConfrmPwdFld().sendKeys(confrmPwd);
	    getEleChngPwdBtn().click();
	    Thread.sleep(5000); 
	    getEleAcctIcn().click();
	    getEleSignOutLnk().click();
	    Thread.sleep(5000);
	    getElePwdTxtFld().sendKeys(newPassword);
	    getEleSignInBtn().click();
	    Thread.sleep(5000);
	    String title = driver.getTitle();
		System.out.println(title);
	   
	    	if(title.equals("My Account"))
	    	{
	    		System.out.println("Password Successfully changed!!");
	    	}
	    	else
	    	{
	    		System.out.println("Password Was not Successfully changed??");
	    	}		
	   }	
}

