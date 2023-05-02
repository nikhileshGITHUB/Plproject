package page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import PBase.base;
import Utils.propertyfile;

public class Invoice  extends base{

    @FindBy(xpath="//img[@class= 'menuIcon']")private WebElement menu;
	
	@FindBy(xpath="//a[@id='10_Invoices']")private WebElement invoice;
	
	@FindBy(xpath="//a[@id='MainContent_lstMatter_lnkReceive_0']")private WebElement invoiceclick;
	
	@FindBy(xpath="//a[@id='SubMenuName']")private WebElement invoicelabel;

	@FindBy(xpath="//select[@id='MainContent_drpOffice']")private WebElement selectoffice;
	
	@FindBy(xpath="//select[@id='rbListGSTType1']")private WebElement selectsttype;
	
	@FindBy(xpath="//a[text()='Set Activities']")private WebElement setactivity;
	
	@FindBy(xpath="//input[@id='MainContent_lstBilling_txtRate_0']")private WebElement amount;

	@FindBy(xpath="//input[@id='btnInvoice']")private WebElement genrate;

	@FindBy(xpath="//a[text()='Draft']")private WebElement draft;
	
	@FindBy(xpath="//a[@id='MainContent_lstInvoice_lnkApprove_0']")private WebElement final1;
	
	@FindBy(xpath="//label[text()='Approve Invoice']")private WebElement aprrove;
	
	@FindBy(xpath="//a[@id='MainContent_lstInvoice_lnkFinal_0']")private WebElement final2;
	
	
	@FindBy(xpath="//label[text()='Final Invoice']")private WebElement approvefinal;
	
	@FindBy(xpath="//input[@id='btnActConfirm']")private WebElement confirmactivity;
	
	@FindBy(xpath="//input[@id='txtMatterTitle']")private WebElement invoicesearch;

	
	@FindBy(xpath="//input[@id='MainContent_btnSearch']")private WebElement invoicesearchclick;
	
	@FindBy(xpath="//img[@title='Generate Invoice']")private WebElement invoicegenrate;
	
	@FindBy(xpath="//input[@id='txtClient']")private WebElement invoicedraft;
	
	@FindBy(xpath="//input[@id='MainContent_btnSearch']")private WebElement invoicedraftsearch;
	
	@FindBy(xpath="//img[@id='MainContent_lstInvoice_imgApprove_0']")private WebElement firststdraftclick;
	@FindBy(xpath="//*[@id=\"MainContent_lstInvoice_lnkFinal_0\"]/img")private WebElement seconddraftclick;

	
	public Invoice()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createInvoice() throws Exception 
	{
		menu.click();
		Thread.sleep(3000);
		invoice.click();
		Thread.sleep(3000);
		invoicesearch.sendKeys(propertyfile.readpropertyfile("tit"));
		Thread.sleep(3000);
		invoicesearch.sendKeys(Keys.ENTER);
		invoicesearchclick.click();
		Thread.sleep(3000);
		invoicegenrate.click();
		Thread.sleep(3000);
		Select s = new Select(selectoffice);
		s.selectByVisibleText("Mumbai");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,80)", "");
		Select d = new Select(selectsttype);
		d.selectByVisibleText("Forward Charge");
		Thread.sleep(3000);
		JavascriptExecutor jas = (JavascriptExecutor) driver;
		jas.executeScript("window.scrollBy(0,80)", "");
		setactivity.click();
		JavascriptExecutor jas1 = (JavascriptExecutor) driver;
		jas1.executeScript("window.scrollBy(0,100)", "");
		confirmactivity.click();
		JavascriptExecutor jas11 = (JavascriptExecutor) driver;
		jas11.executeScript("window.scrollBy(0,400)", "");
		amount.sendKeys("2222");
		Thread.sleep(2000);
		//amount.clear();
		//Thread.sleep(2000);
		//amount.sendKeys("4444");
		genrate.click();
		
	}
	public void createfinalinvoice() throws Exception
	{
		menu.click();
		
		invoice.click();

		invoicelabel.click();
	
		draft.click();
		Thread.sleep(3000);
		
		invoicedraft.sendKeys(propertyfile.readpropertyfile("company"));
		Thread.sleep(3000);
		invoicedraft.sendKeys(Keys.ARROW_DOWN);
		invoicedraft.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		invoicedraftsearch.click();
		Thread.sleep(3000);
		firststdraftclick.click();
		Thread.sleep(3000);
		//final1.click();
		aprrove.click();
		genrate.click();
//		menu.click();
//		Thread.sleep(3000);
//		invoice.click();
//		Thread.sleep(3000);
		invoicelabel.click();
		Thread.sleep(3000);
		draft.click();
		Thread.sleep(3000);
		invoicedraft.sendKeys(propertyfile.readpropertyfile("company"));
		Thread.sleep(3000);
		invoicedraft.sendKeys(Keys.ARROW_DOWN);
		invoicedraft.sendKeys(Keys.ENTER);
		invoicedraftsearch.click();
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", seconddraftclick);
//		seconddraftclick.click();
		//Thread.sleep(3000);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
		
		approvefinal.click();
		Thread.sleep(3000);
		genrate.click();
		
	}

}
