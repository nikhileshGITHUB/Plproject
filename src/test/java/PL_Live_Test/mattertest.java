package PL_Live_Test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PBase.base;
import page.Login;
import page.Matter;


public class mattertest extends base{
	Matter m;
    Login l;
	
	//@SuppressWarnings("deprecation")
	@BeforeMethod
	public void before() throws Exception
	{
		
		initializations();
		l = new Login();
		l.verifylogin();
		m = new Matter();
		//  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	@Test(enabled = true, priority = 3, description = "Create New Matter")
	public void createmattertest() throws Exception
	{
		m.creatematter();
	}
	@Test(enabled = false)
	public void createresorcingtest() throws Exception
	{
	//	m.createresourcing();
	}
	
	
	@Test(priority = 4,enabled  =false)
	public void activitytest() throws Exception
	{
		m.createActivity();
	}
	@AfterMethod
	public void after()
	{
		driver.close();
	}
}
