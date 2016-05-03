package com.pom;

import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	@FindBy(xpath="//span[contains(text(),'Select all')]")
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
	
	@FindBy(xpath="//span[contains(text(),'Select')]")
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
	
	@FindBy(xpath="//span[@class='gb_2a gbii']")
	private WebElement eleAcctIcn;
	public WebElement getEleAcctIcn()
	{
		return eleAcctIcn;
	}
	
	@FindBy(xpath="//a[contains(text(),'My')]")
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
	
	@FindBy(xpath="(//span[text()='Gmail'])[2]")
	private WebElement eleGmailIcn;
	public WebElement getEleGmailIcn()
	{
		return eleGmailIcn;
	}
	
	@FindBy(xpath="(//div[text()='Contacts'])")
	private WebElement eleGmailContactLnk;
	public WebElement getEleGmailContactLnk()
	{
		return eleGmailContactLnk;
	}
	
	@FindBy(xpath="//span[@class='Wr4Vqf']")
	private WebElement eleContactPopupNxtIcn;
	public WebElement getEleContactPopupNxtIcn()
	{
		return eleContactPopupNxtIcn;
	}
	
	@FindBy(xpath="//div[@class='EbKDJd']")
	private WebElement eleCntctPopupClseIcn;
	public WebElement getEleCntctPopupClseIcn()
	{
		return eleCntctPopupClseIcn;
	}
	
	@FindBy(xpath="(//div[@class='YkP4A'])")
	private WebElement eleContctsMailChkBx;
	public WebElement getEleContctsMailChkBx()
	{
		return eleContctsMailChkBx;
	}
	
	@FindBy(xpath="//div[@class='JkN31b']")
	private WebElement eleSelContctsMailIcn;
	public WebElement getSelContctsMailIcn()
	{
		return eleSelContctsMailIcn;
	}
	
	@FindBy(xpath="//div[@aria-label='Select all']")
	private WebElement eleSelAllCntctMailLnk;
	public WebElement getSelAllCntctMailLnk()
	{
		return eleSelAllCntctMailLnk;
	}
	
	@FindBy(xpath="//div[@class='HEryGf']")
	private WebElement eleDelCntctMailIcn;
	public WebElement getEleDelCntctMailIcn()
	{
		return eleDelCntctMailIcn;
	}
	
	@FindBy(xpath="(//div[@aria-label='Delete'])")
	private WebElement eleDelAllCntctMailLnk;
	public WebElement getEleDelAllCntctMailLnk()
	{
		return eleDelAllCntctMailLnk;
	}
	
	@FindBy(xpath="//a[text()='Manage passwords']")
	private WebElement eleMangeSavedPwdLnk;
	public WebElement getEleMangeSavedPwdLnk()
	{
		return eleMangeSavedPwdLnk;
	}
	
	@FindBy(xpath="//div[@aria-label='Remove password']")
	private List<WebElement> eleRmveSavedPwdLnk;
	public List<WebElement> getEleRmveSavedPwdLnk()
	{
		return eleRmveSavedPwdLnk;
	}
	
	@FindBy(xpath="//div[@class='De Hb Me Ct eba']")
	private WebElement eleNoSavedPwdAppTxt;
	public WebElement getEleNoSavedPwdAppTxt()
	{
		return eleNoSavedPwdAppTxt;
	}
	
	
	/*Description:Below method is to 'Login in to the cbtCrowd Gmail account'*/
	public void userLogin(String username, String password) throws InterruptedException
	{
		getEleEmailTxtFld().sendKeys(username);
		getEleNextBtn().click();
		getElePwdTxtFld().sendKeys(password);
		getEleSignInBtn().click();
		Thread.sleep(3000);
	}
	
	
	/*Description:Below method is to 'Delete all the mails of cbtCrowd Gmail account'*/
	public void deleteAllMails() throws InterruptedException
	{
		try
		{
		getEleMoreIcn().click();
		getEleAllMailsLnk().click();
		getEleSelChkBx().click();
		
			if(getEleAllMailDelLnk().isDisplayed())
			{
				getEleAllMailDelLnk().click();
				getEleDeletBtn().click();
				getEleAllMailDelOkBtn().click();
				getEleAllMailDelOkBtn().click();
				Thread.sleep(5000);
				getEleSearchTxtBx().sendKeys("in:trash" + Keys.ENTER);
				getEleSelTrashChkBx().click();
				getTrashDelAllMailLnk().click();
				getEleDelTrashBtn().click();
				getEleAllMailDelOkBtn().click();
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			getEleDeletBtn().click();
			getEleAllMailDelOkBtn().click();
			Thread.sleep(5000);
			getEleSearchTxtBx().sendKeys("in:trash" + Keys.ENTER);
			getEleSelTrashChkBx().click();
			getEleDelTrashBtn().click();
			Thread.sleep(3000);
		}
	}
	
	
	/*Description:Below method is to 'Remove Connected Apps to cbtCrowd Gmail account'*/	
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
	
	
	/*Description:Below method is to 'Remove Saved Password Apps to cbtCrowd Gmail account'*/
	public void removeSavedPwdApps(WebDriver driver,String passWord) throws InterruptedException
	{
		driver.navigate().back();
		getEleMangeSavedPwdLnk().click();
		getElePwdTxtFld().sendKeys(passWord);
		
		try
	    {
	    	if(getEleNoSavedPwdAppTxt().isDisplayed())
	    	{
	    		String message = getEleNoSavedPwdAppTxt().getText();
	    		System.out.println(message);
	    	}
	    }
	    catch(Exception e)
	    {	
	    	Loop1:for(int i = 0; i<=getEleRmveSavedPwdLnk().size();)
	    	{
	    		getEleRmveSavedPwdLnk().get(i).click();
	    		Thread.sleep(5000);
	    	try
	    	{
	    		if(getEleNoSavedPwdAppTxt().isDisplayed())
	    		{
	    		    String message = getEleNoSavedPwdAppTxt().getText();
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
		
	
	/*Description: Below method is to 'Change Password of cbtCrowd Gmail account'*/	
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
	    	Thread.sleep(3000);
	    	getEleAcctIcn().click();
	    	getEleSignOutLnk().click();
	   }	
}

