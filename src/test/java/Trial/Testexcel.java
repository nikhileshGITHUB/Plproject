package Trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.ExcelUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testexcel {

	@DataProvider
	public Object[][] getCCFTestData() {
		Object regData[][] = ExcelUtil.getTestData("Sheet1");
		return regData;
	}
	
	@Test(dataProvider = "getCCFTestData",enabled = true, priority = 2)
	public void addIndianListforClient2(String fullname, String email ,String pass, String repass , String loc , String school ,String college ) throws InterruptedException {

		
		//System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe")
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys(fullname);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@id='repass']")).sendKeys(repass);
		driver.findElement(By.xpath("//input[@id='signup_city']")).sendKeys(loc);
		driver.findElement(By.xpath("//input[@onfocus='validateSignupForm(4)']")).sendKeys(school);
		driver.findElement(By.xpath("//input[@id='college']")).sendKeys(college);
		driver.close();
		
	}
	
	
}
