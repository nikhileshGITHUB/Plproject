package page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import PBase.base;


public class Login extends base {

	@FindBy(xpath="//input[@name='Login1$UserName']")private WebElement login;
	@FindBy(xpath="//input[@name='Login1$Password']")private WebElement pass;
	//@FindBy(xpath="//input[@name='Login1$Password']")private WebElement pass;
	@FindBy(xpath="//input[@value='Log In']")private WebElement submit;
	//input[@value='Log In']
	@FindBy(xpath= "//input[@id='btnMUpDateTsPopUpOK']")private WebElement alert;
	
	@FindBy(xpath= "//select[@id='ddlCompany']")private WebElement select;
	
	@FindBy(xpath= "//input[@id='btnProceed']")private WebElement proces;
	
	//input[@id='btnProceed']
	public Login()
	{
		PageFactory.initElements(driver, this);
	}

	public void verifylogin() throws Exception
	{
	//	login.sendKeys(PropertyFile.readpropertyfile("login"));
	login.sendKeys("nkhetmalis@practiceleague.com");
	pass.sendKeys("Plp@2018");
		//pass.sendKeys(PropertyFile.readpropertyfile("pass"));
		submit.click();
	
//Select d = new Select(select);
//d.selectByVisibleText("resolut partners");
//proces.click();
//		Alert d = driver.switchTo().alert();
//		d.accept();
//		
//		alert.click();
//		Thread.sleep(7000);
	}
}
