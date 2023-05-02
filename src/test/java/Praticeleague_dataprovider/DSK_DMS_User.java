package Praticeleague_dataprovider;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.ExcelUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DSK_DMS_User {

	@DataProvider
	public Object[][] getCCFTestData() {
		Object regData[][] = ExcelUtil.getTestData("Sheet1");
		return regData;
	}
	
	@Test(dataProvider = "getCCFTestData", priority = 2)
	public void addIndianListforClient2(String FirsName, String LastName ,String Email ,String Password , String ConfirmPassword ) throws InterruptedException {

		
		//System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe")
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://appdocs.practiceleague.com/Admin/UberallDocs_Login.aspx");
		driver.manage().window().maximize(); 
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("aniketa@dsklegal.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
        driver.navigate().to("https://appdocs.practiceleague.com/UDAccount/PL_UDRegistration.aspx");
	
        
        driver.findElement(By.xpath("//input[@id='txtfName']")).sendKeys(FirsName);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='txtLname']")).sendKeys(LastName);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='txtEmaiId']")).sendKeys(Email);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Password);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='txtConfirmPassword']")).sendKeys(ConfirmPassword);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='MainContent_btnRegister']")).click();
        Thread.sleep(3000);
        driver.close();
//       
        
        
        
}
}

