package Praticeleague_dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.ExcelUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class matterdataprovider {
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

	}      
}
