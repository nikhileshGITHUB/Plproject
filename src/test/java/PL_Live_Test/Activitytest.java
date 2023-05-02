package PL_Live_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PBase.base;
import page.Activity;
import page.Contact;
import page.Login;
import page.Matter;



public class Activitytest extends base{
	
	Matter m;
    Login l;
    Activity A;
    Contact c;
	
	@BeforeMethod
	public void before() throws Exception
	{
		initializations();
		l = new Login();
		l.verifylogin();
//		m = new Matter();
		c = new Contact();
		//c.addcompany();
		m = new Matter();
	//	m.creatematter();
		A = new Activity();
		
	
	}
	@Test(priority = 3,description = "timesheet activity Outter tab", enabled = false)
	public void createactivityoutertest() throws Exception
	{
		
		A.createactivityouter();
		
	}
	@Test(priority = 4,description = "timesheet activity Inner tab", enabled = true)
	public void createactivitytestinner() throws Exception
	{
		
		A.createactivityInner();

	}
	@AfterMethod
	public void after()
	{
	driver.close();
	}

}
