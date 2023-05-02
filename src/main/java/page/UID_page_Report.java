package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PBase.base;
import Utils.propertyfile;



public class UID_page_Report extends base{
	@FindBy(xpath="//span[text()='nikhilesh Khetmalis']")private WebElement profile;
	@FindBy(xpath="//a[@id='lnkSettingSub']")private WebElement setting ;
	@FindBy(xpath="//a[@id='14_Reports']")private WebElement report ;
	@FindBy(xpath="//img[@class= 'menuIcon']")private WebElement menu;
	@FindBy(xpath="//a[@id='MainContent_lnkTimesheetReportWithUID']")private WebElement UID;
	@FindBy(xpath="//input[@id='MainContent_txtMatter']")private WebElement search;
	@FindBy(xpath="	//input[@id='MainContent_btnSearch']")private WebElement searchclick;

	public UID_page_Report()
	{
		PageFactory.initElements(driver, this);
	}

	
	public void verify_UID_Report() throws Exception
	{ 
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-800)");
		
//		Actions b = new Actions(driver);
//		//Thread.sleep(5000);
//	b.moveToElement(profile).build().perform();
//		Thread.sleep(5000);
//		Actions a = new Actions(driver);
//		a.moveToElement(setting).click().build().perform();
		menu.click();
		Thread.sleep(2000);
		report.click();
		UID.click();
		
		search.sendKeys(propertyfile.readpropertyfile("tit"));
		Thread.sleep(5000);
		search.sendKeys(Keys.DOWN);
		search.sendKeys(Keys.ENTER);
		searchclick.click();
		Thread.sleep(3000);
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("window.scrollBy(0,350)");
	}
}
