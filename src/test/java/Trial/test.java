package Trial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static WebDriver driver;
	@Test
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://192.168.168.73/Admin/PL_Login.aspx");
		driver.manage().window().maximize();
	}
}
