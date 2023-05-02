package PBase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class base {
public static WebDriver driver;
	
	
	//@SuppressWarnings("deprecation")
	public void initializations()
	{
	//	System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://law.practiceleague.com/Admin/Pl_Login.aspx");
		driver.manage().window().maximize();
		//  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
}
}
