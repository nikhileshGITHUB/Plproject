package PL_Live_Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PBase.base;
import page.Activity;
import page.Contact;
import page.Invoice;
import page.Login;
import page.Matter;


public class Invoicetest extends base {
	
	
	Matter m;
    Login l;
    Activity A;
    Invoice I;
    Contact C;
	
	@BeforeMethod
	public void before() throws Exception
	{
		initializations();
		l = new Login();
		l.verifylogin();
		//C = new Contact();
		//C.addcompany();
		m = new Matter();
		m.creatematter();
		A = new Activity();
		A.createactivityInner();
		I = new Invoice();
		I.createInvoice();
		
	}
	@Test(enabled = false , priority = 4, description = "create new draft Invoice")
	public void createinvoicetest() throws Exception
	{
		
		I.createInvoice();
	}

	@Test(priority = 5, enabled = true, description = "make draft Invoice to Final")
	public void createinvoicefinaltest() throws Exception
	{
		I.createfinalinvoice();
	}
	@AfterMethod
	public void after()
	{
		driver.close();
	}
}
