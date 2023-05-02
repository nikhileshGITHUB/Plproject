package PL_Live_Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PBase.base;
import page.Contact;
import page.Login;


public class contacttest extends base {
	Contact c;
	Login l;
	
	@BeforeMethod
	public void before() throws Exception
	{
		initializations();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		l = new Login();
		c= new Contact();
		l.verifylogin();
	}
      @Test(priority = 1,enabled = true, description = "Create new Company Contact")
      public void addcompanytest() throws Exception
      {
    	 c.addcompany();; 
      }
      @Test(enabled =false, priority = 2)
      public void deletecompanytest() throws Exception
      {
    	 c.deletecompanycontact();; 
      }
      @AfterMethod
      public void after()
      {
    	  driver.close();
      }
}
