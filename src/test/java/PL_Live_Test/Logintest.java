package PL_Live_Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PBase.base;
import page.Login;


public class Logintest extends base{

	Login l;
	
	@BeforeMethod
	public void before()
	{
		initializations();
		 l = new Login();
		
	}
		
	
	@Test(priority = 0, description = "login on Practiceleague Url")
	public void logintest() throws Exception
	{
		l.verifylogin();
	}
	@AfterMethod
	public void after()
	{
		driver.close();
	}

}
