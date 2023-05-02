package Trial;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class readexceldata {


	public static WebDriver driver;
	@Test
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
	}
	@DataProvider
  public Iterator<Object[]> getTestData() throws Exception{
  ArrayList<Object[]> testData = Testutil.getDatafromExcel();
	return testData.iterator();
		}
		@Test(dataProvider="getTestData")
		public void Registrationpage(String fullname, String email ,String pass, String repass , String loc , String school ,String college) throws Exception
		{
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys(fullname);
			driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(email);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
			driver.findElement(By.xpath("//input[@id='repass']")).sendKeys(repass);
			driver.findElement(By.xpath("//input[@id='signup_city']")).sendKeys(loc);
			driver.findElement(By.xpath("//input[@onfocus='validateSignupForm(4)']")).sendKeys(school);
			driver.findElement(By.xpath("//input[@id='college']")).sendKeys(college);
			
		}
		@AfterMethod
		public void after()
		{
			//driver.quit();
		}
}

