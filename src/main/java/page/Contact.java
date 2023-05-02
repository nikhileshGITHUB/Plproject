package page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import PBase.base;
import Utils.propertyfile;



	public class Contact extends base {
		
		@FindBy(xpath="//img[@class= 'menuIcon']")private WebElement menu;
		@FindBy(xpath="//a[text()=' Contacts']")private WebElement contact;
		@FindBy(xpath="//a[@class='addCircle']")private WebElement addbttn;
		@FindBy(xpath="//a[normalize-space(text()) = 'Add Company']")private WebElement addcompany;
		@FindBy(xpath="//input[@id='txtCompanyName']")private WebElement CompanyName;
		@FindBy(xpath="//input[@id='txtCompanyCode']")private WebElement CompanynCode;
		@FindBy(xpath="//textarea[@id='txtStreet']")private WebElement Address;
		@FindBy(xpath="//select[@id='MainContent_ddCountry']")private WebElement country;
		@FindBy(xpath="//select[@id='MainContent_ddlState']")private WebElement State;
		@FindBy(xpath="//select[@id='MainContent_drpCity']")private WebElement City;
		@FindBy(xpath="//input[@id='txtZip']")private WebElement Zipcode;
		@FindBy(xpath="//select[@id='MainContent_lstCustomGroup_lstCustomfield_0_drpCustomfield_0']")private WebElement DDL;
		@FindBy(xpath="//span[text()='Select Other Office']")private WebElement Otheroffice;
		@FindBy(xpath="//div[@class='chosen-search']")private WebElement searchoffice;
		@FindBy(xpath="//ul[@class='chosen-results']")private WebElement Wagholi;
		@FindBy(xpath="//label[text()='Yes']")private WebElement checkbox;
		@FindBy(xpath="//input[@class='requiredCompany']")private WebElement SocialWork;
		@FindBy(xpath="//input[@value='Add Company Contacts']")private WebElement addcompanycontact;
		@FindBy(xpath="//input[@id='MainContent_txtPerson']")private WebElement search;
		@FindBy(xpath="//span[text()='ambu']")private WebElement searchclick;
		@FindBy(xpath="//ul[@id='autoCompleteContactListSearch_completionListElem']//li")private List<WebElement> sr;
		@FindBy(xpath="//input[@value='Search']")private WebElement submit;
		@FindBy(xpath="//img[@title='Delete Contact Details']")private WebElement deletecontact;
		@FindBy(xpath="//input[@id='txtEmail']")private WebElement email;
		@FindBy(xpath="//input[@id='btnEmail']")private WebElement emailclick;
		@FindBy(xpath="//a[@class='chosen-single']")private WebElement dr;
		@FindBy(xpath="//li[text()='Pune']")private WebElement ff;
		@FindBy(xpath="//input[@id='MainContent_lstCustomGroup_lstCustomfield_0_txtCustomfield_3']")private WebElement socialwork;
		@FindBy(xpath="//label[@for='MainContent_lstCustomGroup_lstCustomfield_1_rbtnCustomfield_0_0_0']")private WebElement yesclick;
		@FindBy(xpath="//label[text()='Limited']")private WebElement limitedclick;
		@FindBy(xpath="//textarea[@id='MainContent_lstCustomGroup_lstCustomfield_1_txtCustomfield_1']")private WebElement desc;
		
		@FindBy(xpath="//input[@id='btnSaveCompany']") WebElement save;
		
		@FindBy(xpath="//textarea[@name='ctl00$MainContent$lstCustomGroup$ctrl2$lstCustomfield$ctrl0$txtCustomfield']") WebElement add;
		public Contact()
		{
			PageFactory.initElements(driver, this);
		}
		
	//	@SuppressWarnings("deprecation")
		public void addcompany() throws Exception
		{
			
			//  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			menu.click();
			contact.click();
			//Thread.sleep(3000);
			addbttn.click();
			Thread.sleep(3000);
			addcompany.click();
			//Thread.sleep(4000);
			CompanyName.sendKeys(propertyfile.readpropertyfile("company"));
			CompanynCode.sendKeys(propertyfile.readpropertyfile("code"));
			Thread.sleep(3000);
			Address.sendKeys(propertyfile.readpropertyfile("add"));
			Thread.sleep(3000);
			Select s = new Select(country);
			//Thread.sleep(3000);
			s.selectByVisibleText("India");
			Thread.sleep(3000);
			Select d = new Select(State);
			d.selectByVisibleText("Maharashtra");
			Thread.sleep(3000);
			Select a= new Select(City);
			a.selectByVisibleText("Pune");
			//Thread.sleep(3000);
			Zipcode.sendKeys(propertyfile.readpropertyfile("zip"));
//			Thread.sleep(4000);
//			Select i = new Select(DDL);
//			i.selectByVisibleText("DDL1");
//			Thread.sleep(4000);
//			Otheroffice.click();
//			Thread.sleep(4000);
//			searchoffice.sendKeys("Wagholi");
//			Thread.sleep(4000);
//			Actions h = new Actions(driver);
//			h.moveToElement(Wagholi).build().perform();
//			Thread.sleep(4000);
//			checkbox.click();
//	Thread.sleep(3000);
			
		//	email.sendKeys(propertyfile.readpropertyfile("mail"));
			
			//emailclick.click();
			
			//Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,800)", "");
			//Thread.sleep(3000);
			//addcompanycontact.click();
			//Thread.sleep(3000);
//			
//			DDL.click();
//			Thread.sleep(5000);
//			DDL.sendKeys(Keys.ARROW_DOWN);
//			DDL.sendKeys(Keys.ENTER);
//			Thread.sleep(4000);
//			dr.click();
//			Thread.sleep(4000);
//			Actions a1 = new  Actions(driver);
//			a1.moveToElement(ff).click().build().perform();
//			Thread.sleep(7000);
//			socialwork.sendKeys(propertyfile.readpropertyfile("social"));
//			Thread.sleep(5000);
//			 yesclick.click();
//			 limitedclick.click();
//			desc.sendKeys(propertyfile.readpropertyfile("desc"));
		    add.sendKeys(propertyfile.readpropertyfile("add"));
		    save.click();
		   // Thread.sleep(3000);
		    driver.switchTo().alert().accept();
			//Thread.sleep(3000);
			
		
		}
		public void deletecompanycontact() throws Exception
		{
			
			menu.click();
			contact.click();
			Thread.sleep(3000);
//			search.sendKeys("am");
			
			
//			Actions h = new Actions(driver);
//			h.moveToElement(searchclick).build().perform();
//			Thread.sleep(4000);
//			submit.click();
			//Thread.sleep(4000);
			
			String exp ="CoreInfra(C)";
			search.sendKeys(propertyfile.readpropertyfile("company"));
			for(WebElement Singleelement :  sr)
			{
				String act =Singleelement.getText();
				if(act.equalsIgnoreCase(exp));
				{
					Singleelement.click();
					break;
				}
			}
			submit.click();
			Thread.sleep(3000);
			
			deletecontact.click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
		}
}
