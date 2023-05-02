package Praticeleague_dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.ExcelUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Contactdataprovider {

	@DataProvider
	public Object[][] getCCFTestData() {
		
		Object regData[][] = ExcelUtil.getTestData("Sheet1");
		return regData;
	}
	
	@Test(dataProvider = "getCCFTestData",enabled = true, priority = 2)
	public void addIndianListforClient2(String companyname, String Code ,String Address ,String Zip  ) throws InterruptedException {

		
		//System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe")
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://192.168.168.73/Admin/PL_Login.aspx");
		driver.manage().window().maximize(); 
		driver.findElement(By.xpath("//input[@name='Login1$UserName']")).sendKeys("abhishek@linklegal.inXXX");
		driver.findElement(By.xpath("//input[@name='Login1$Password']")).sendKeys("Plp@2017");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='btnMUpDateTsPopUpOK']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class= 'menuIcon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' Contacts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='addCircle']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space(text()) = 'Add Company']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtCompanyName']")).sendKeys(companyname);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtCompanyCode']")).sendKeys(Code);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='txtStreet']")).sendKeys(Address);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$txtZip']")).sendKeys(Zip);
		
		WebElement country =driver.findElement(By.xpath("//select[@id='MainContent_ddCountry']"));
		
	
		
		
		Thread.sleep(3000);
		Select s = new Select(country);
		Thread.sleep(3000);
		s.selectByVisibleText("India");
		Thread.sleep(5000);
		WebElement State1 =driver.findElement(By.xpath("//select[@name='ctl00$MainContent$ddlState']"));
		State1.click();
		Thread.sleep(5000);
		State1.sendKeys(Keys.ARROW_DOWN);
		State1.sendKeys(Keys.ENTER);
//		Select d = new Select(State1);
//		Thread.sleep(5000);
//		d.selectByVisibleText("Karnataka");
		Thread.sleep(5000);
		WebElement  City=driver.findElement(By.xpath("//select[@id='MainContent_drpCity']"));
		City.click();
		Thread.sleep(5000);
		City.sendKeys(Keys.ARROW_DOWN);
		City.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement email =driver.findElement(By.xpath("//input[@id='txtEmail']"));
		email.sendKeys("nkhetmalis@praticeleague.com");
		WebElement emailclick =driver.findElement(By.xpath("//input[@id='btnEmail']"));
		emailclick.click();
//		Select a= new Select(City);
//		Thread.sleep(3000);
//		a.selectByVisibleText("Pune");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
//		Thread.sleep(3000);
//		WebElement DDL = driver.findElement(By.xpath("//select[@id='MainContent_lstCustomGroup_lstCustomfield_0_drpCustomfield_0']"));
//		DDL.click();
//		Thread.sleep(5000);
//		DDL.sendKeys(Keys.ARROW_DOWN);
//		DDL.sendKeys(Keys.ENTER);
//		Select h= new Select(DDL);
		Thread.sleep(3000);
//		h.selectByVisibleText("DDL1");
		
//		Thread.sleep(4000);
//		WebElement dr = driver.findElement(By.xpath("//a[@class='chosen-single']"));
//		dr.click();
//		Thread.sleep(4000);
//		WebElement ff =driver.findElement(By.xpath("//li[text()='Pune']"));
//		Actions a = new  Actions(driver);
//		a.moveToElement(ff).click().build().perform();
//		Thread.sleep(7000);
		//dr.sendKeys(Keys.ARROW_DOWN);
		//dr.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//label[@for='MainContent_lstCustomGroup_lstCustomfield_1_rbtnCustomfield_0_0_0']")).click();
	//driver.findElement(By.xpath("//label[text()='Limited']")).click();
//	driver.findElement(By.xpath("//textarea[@name='ctl00$MainContent$lstCustomGroup$ctrl2$lstCustomfield$ctrl0$txtCustomfield']")).sendKeys(localadd);
	driver.findElement(By.xpath("//input[@id='btnSaveCompany']")).click();
		
		
		
	}
	
}
