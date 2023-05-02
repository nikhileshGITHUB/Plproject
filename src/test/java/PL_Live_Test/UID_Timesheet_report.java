package PL_Live_Test;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PBase.base;
import page.Activity;
import page.Login;
import page.Matter;
import page.UID_page_Report;

public class UID_Timesheet_report extends base {
	Matter m;
    Login l;
    Activity A;
	UID_page_Report R;
	@BeforeMethod
	public void before() throws Exception
	{
		initializations();
		l = new Login();
		l.verifylogin();
//		m = new Matter();
		A = new Activity();
	//	A.createactivityInner();
		//A.createactivityouter();
		R = new UID_page_Report();
	}
	@Test(priority = 3,description = "timesheet activity Inner tab", enabled = true)
	public void uidreporinnertabttest() throws Exception
	{
		A.createactivityInner();
		R.verify_UID_Report();
		String actual = driver.findElement(By.xpath("(//div[@style='width:15.52mm;min-width: 15.52mm;'])[10]")).getText(); 
		 String exp = "56000";
		 Assert.assertEquals(actual, exp);
	}
	@Test(priority = 4, description = "timesheet activity outer tab")
	public void uidreportoutertest() throws Exception
	{
		A.createactivityouter();
		R.verify_UID_Report();
		String actual = driver.findElement(By.xpath("(//div[@style='width:15.52mm;min-width: 15.52mm;'])[14]")).getText(); 
		 String exp = "112000";
		 Assert.assertEquals(actual, exp);
	}
	@AfterMethod
	public void after()
	{
//	driver.close();
	}
}
