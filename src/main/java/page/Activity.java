package page;

import javax.management.DescriptorKey;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import PBase.base;
import Utils.propertyfile;
import dev.failsafe.internal.util.Assert;



public class Activity  extends base{

	
	@FindBy(xpath="//img[@class= 'menuIcon']")private WebElement menu;
	
	@FindBy(xpath="//a[text()=' Matters']")private WebElement Matter;
	@FindBy(xpath="	//a[@id='MainContent_LinkButton6']")private WebElement billing;
	


	@FindBy(xpath="//select[@name='TimerControl$drpResource']")private WebElement selectresources;
	@FindBy(xpath="//select[@name='ctl00$MainContent$timeControl$drpResource']")private WebElement selectresourcesouter;

	@FindBy(xpath="//select[@id='ddlDescription']")private WebElement selectcategory;
	
	
	
	@FindBy(xpath="//input[@id='txtWorkedDuration']")private WebElement Hr;
	
	@FindBy(xpath="//input[@id='txtWorkMinutes']")private WebElement min;
	@FindBy(xpath="	//select[@id='drpExcel']")private WebElement excel;

	@FindBy(xpath="//textarea[@id='txtTimeNote']")private WebElement textaera;
	
	@FindBy(xpath="//a[@id='14_Reports']")private WebElement report ;
	@FindBy(xpath="//label[normalize-space(text()) ='Default']")private WebElement defalut ;
	
	@FindBy(xpath="(//label[normalize-space(text()) ='Custom'])[1]")private WebElement Custom ;
	@FindBy(xpath="//input[@value='Save']")private WebElement save ;
	
	@FindBy(xpath="//input[@name='ctl00$MainContent$btnSearch']")private WebElement submit ;
	
	@FindBy(xpath="//a[@id='MainContent_lstMatter_lnkAddTime_0']")private WebElement addactivity;
	@FindBy(xpath="//input[@id='txtRate']")private WebElement rate ;
@FindBy(xpath="//span[@id='MainContent_lstMatter_Label2_0']")private WebElement matterclick;
@FindBy(xpath="//li[@id='MainContent_Mattertab5']")private WebElement expense ;

@FindBy(xpath="//select[@id='ddlExpenseCategory']")private WebElement expensecategory ;

@FindBy(xpath="//input[@name='ExpenseTime$txtAmount']")private WebElement expenserate ;



@FindBy(xpath="//textarea[@rows='4']")private WebElement expensedesc ;

@FindBy(xpath="//input[@id='ExpenseTime_btnExpenseSubmit']")private WebElement expensesave ;

@FindBy(xpath="//a[@href='PL_Matter_Time.aspx??enc=v/6Y0TbBLNcj/TzmH5EhlbpXH0ca1sIJKzByqWikSvHGJ/W+Whs8jt8b7DflFvfr1bsA1lp/ICPslOFlB3yiMgYp5j2I0aAIpT48HhVF1elIdd5y43uL1cCYJ2DEIPaNEd/2InvWMRrzjvoqtwpAMaGI2hOX6cpBBgzM2xTh4gRncPClQqzIs6jvhq57dQz5tP5YCF0rAXm3J/JcSlyMcEwTYBsCJ19A6Y0BvFBARKtFi+2xRVwo1hp+wKdRvJhc3MLtE8zyZHeMDXucYvZJm+g2Kp4OcDNF/kjw2qL/KD64oO1+6ZcpcmFSY6n6MNhmyZIR/f1HrTvyTyoTBOAOR6neDKWJsTtR7dWoDReMw8dG84GxUkxIWr3ep0YDzdHoa5HyWvjR6qCpe2NM0X6d85gQpC2ozvdJkC91hBZXqkOwUiQsrScHMv99c4rFSP7fXEcfOQsVXzXl9N08USHtb386e4UaZLMkAZByu7n9WkWQcnC3fJZV741o0XhXBcOcpS3PPH70eHaoMh/anAB4fw6bqrzkqJtDAfH4Wj9Ct3ui8TxmjSuf0TyqpnmG/XHhxQ12MDfRIqDtUvLXQ95hy4dMK2UXIt/I3iwXjxFQD9I=']") private WebElement URL;
	public Activity()
	{
		PageFactory.initElements(driver, this);
	}

	@DescriptorKey(value = "timesheet activity outter tab outter tab")
	public void createactivityouter() throws Exception
	
	{
		menu.click();
		//Thread.sleep(3000);
		Matter.click();
		//Thread.sleep(3000);
//		addactivity.click();
		
		
		WebElement we = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$txtMatterTitleSearch']"));
		WebElement se = driver.findElement(By.xpath("//select[@id='drpFilter']"));
		Select  s = new Select(se);
		s.selectByVisibleText("Matter");
		Thread.sleep(3000);
		we.sendKeys(propertyfile.readpropertyfile("search"));
		Thread.sleep(3000);
		//we.sendKeys(Keys.ARROW_DOWN);
		we.sendKeys(Keys.ENTER);
		submit.click();	
		addactivity.click();	
		//Thread.sleep(3000);
		//selectresources.click();
		
		//1 Custom Rate
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,60)", "");
		
		
		Select s2 = new Select(selectresourcesouter);
		s2.selectByVisibleText("Narayan Bade");
		Thread.sleep(3000);	
		Select v = new Select(selectcategory);
		v.selectByVisibleText("1-Client Meeting-Office [Hourly] (10000)");
		Thread.sleep(3000);
		Custom .click();
		rate.clear();
		rate.sendKeys(propertyfile.readpropertyfile("crate"));
		Hr.sendKeys(propertyfile.readpropertyfile("hours"));
		min.sendKeys(propertyfile.readpropertyfile("minutes"));
	    textaera.sendKeys(propertyfile.readpropertyfile("text"));
	  //  Thread.sleep(3000);     
		
	    save.click();
	    Thread.sleep(3000);
		
		//2 Default rate
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("window.scrollBy(0,60)", "");
		// Thread.sleep(3000);
		 
	    Select s3 = new Select(selectresourcesouter);
		s3.selectByVisibleText("Nilesh Ahtri");
		Thread.sleep(3000);
		Select v1 = new Select(selectcategory);
		v1.selectByVisibleText("1-Client Meeting-Office [Hourly] (10000)");
		//Thread.sleep(3000);
	    textaera.sendKeys(propertyfile.readpropertyfile("text"));
	     //Thread.sleep(3000);
		 defalut.click();
		 Hr.sendKeys(propertyfile.readpropertyfile("hours"));
		min.sendKeys(propertyfile.readpropertyfile("minutes"));
		// Thread.sleep(2000);
	     save.click();
	     Thread.sleep(3000);
	  
	    
	    
	    //3 Default to Custom
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 js2.executeScript("window.scrollBy(0,60)", "");
		 
		 
	        Select s4 = new Select(selectresourcesouter);
	 		s4.selectByVisibleText("Gaurav thakar");
    		Thread.sleep(3000);
	 		Select v2 = new Select(selectcategory);
	 		v2.selectByVisibleText("11-Misc [Hourly] (10000)");
	 		//Thread.sleep(3000);
	 		 textaera.sendKeys(propertyfile.readpropertyfile("text"));
	 	     Thread.sleep(3000);
	 		Hr.sendKeys(propertyfile.readpropertyfile("hours"));
	 		min.sendKeys(propertyfile.readpropertyfile("minutes"));
	 		///Thread.sleep(2000);
	 		defalut.click();
	 	  	Custom.click();
	 	  	rate.clear();
			rate.sendKeys(propertyfile.readpropertyfile("crate"));
	 	     save.click();
	 	    Thread.sleep(3000);


	 	   //4 custom to default
	 	   JavascriptExecutor js3 = (JavascriptExecutor) driver;
	 		 js3.executeScript("window.scrollBy(0,60)", "");
	 	    
	 	    
	 	   Select s5 = new Select(selectresourcesouter);
	 		s5.selectByVisibleText("Nikhilesh Khetmalis");
	 		//Thread.sleep(3000);
	 		Select v3 = new Select(selectcategory);
	 		v3.selectByVisibleText("1-Client Meeting-Office [Hourly] (10000)");
	 		//Thread.sleep(3000);
	 		Hr.sendKeys(propertyfile.readpropertyfile("hours"));
	 		min.sendKeys(propertyfile.readpropertyfile("minutes"));
	 	    textaera.sendKeys(propertyfile.readpropertyfile("text"));
	 	    // Thread.sleep(3000);
	 	  	Custom.click();
	 	  	rate.clear();
	 	    defalut.click();
	 		 Thread.sleep(2000);
	 		 save.click();
		 	  Thread.sleep(3000);
	 		 
	 		 
	 	   
	 			
			
	}
	
	//@DescriptorKey(value = "timesheet activity outter tab Inner tab")
	public void createactivityInner() throws Exception
	
	{
		menu.click();
		//Thread.sleep(3000);
		Matter.click();
	//	Thread.sleep(3000);
		//addactivity.click();
		
		
		WebElement we = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$txtMatterTitleSearch']"));
		WebElement se = driver.findElement(By.xpath("//select[@id='drpFilter']"));
		Select  s = new Select(se);
		s.selectByVisibleText("Matter");
		Thread.sleep(3000);
		we.sendKeys(propertyfile.readpropertyfile("search"));
		Thread.sleep(3000);
		//we.sendKeys(Keys.ARROW_DOWN);
		we.sendKeys(Keys.ENTER);
		submit.click();	
		matterclick.click();
		
		
		//1 Custom Rate 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
//		
		//js.executeScript("document.querySelector('col3','::before');");
		
		

		WebElement iframe = driver.findElement(By.cssSelector("#TabFrame"));

		//Switch to the frame
		driver.switchTo().frame(iframe);
		
		Select s2 = new Select(selectresources);
		s2.selectByVisibleText("Narayan Bade");
		Thread.sleep(3000);	
		Select v = new Select(selectcategory);
		v.selectByVisibleText("1-Client Meeting-Office [Hourly] (10000)");
		Thread.sleep(3000);
		Custom .click();
		rate.clear();
		rate.sendKeys(propertyfile.readpropertyfile("crate"));
		Hr.sendKeys(propertyfile.readpropertyfile("hours"));
		min.sendKeys(propertyfile.readpropertyfile("minutes"));
	    textaera.sendKeys(propertyfile.readpropertyfile("text"));
	    Thread.sleep(3000);     
		
	    save.click();
	    Thread.sleep(3000);
//		report.click();
//		//Thread.sleep(3000);
//		billing.click();
//		Select o = new Select(excel);
//		o.selectByVisibleText("PDF");
		//2 Default rate
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		 js1.executeScript("window.scrollBy(0,100)", "");
		// Thread.sleep(3000);
		 
	    Select s3 = new Select(selectresources);
		s3.selectByVisibleText("Nilesh Ahtri");
		Thread.sleep(3000);
		Select v1 = new Select(selectcategory);
		v1.selectByVisibleText("1-Client Meeting-Office [Hourly] (10000)");
		Thread.sleep(3000);
	    textaera.sendKeys(propertyfile.readpropertyfile("text"));
	     Thread.sleep(3000);
		 defalut.click();
		 Hr.sendKeys(propertyfile.readpropertyfile("hours"));
		min.sendKeys(propertyfile.readpropertyfile("minutes"));
		 Thread.sleep(2000);
	     save.click();
	     Thread.sleep(3000);
	  
	    
	    
	    //3 Default to Custom
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		 js2.executeScript("window.scrollBy(0,100)", "");
//		 
		 
	        Select s4 = new Select(selectresources);
	 		s4.selectByVisibleText("Gaurav thakar");
    		Thread.sleep(3000);
	 		Select v2 = new Select(selectcategory);
	 		v2.selectByVisibleText("11-Misc [Hourly] (10000)");
	 		Thread.sleep(3000);
	 		 textaera.sendKeys(propertyfile.readpropertyfile("text"));
	 		Thread.sleep(3000);
	 		Hr.sendKeys(propertyfile.readpropertyfile("hours"));
	 		min.sendKeys(propertyfile.readpropertyfile("minutes"));
	 		Thread.sleep(3000);
	 	
	 	  	Custom.click();
	 		defalut.click();
	 		Custom.click();
	 	  	Thread.sleep(2000);
	 	  	rate.clear();
			rate.sendKeys(propertyfile.readpropertyfile("crate"));
	 	     save.click();
	 	    Thread.sleep(3000);


	 	   //4 custom to default
//	 	   JavascriptExecutor js3 = (JavascriptExecutor) driver;
//	 		 js3.executeScript("window.scrollBy(0,100)", "");
	 	    
	 	    
	 	   Select s5 = new Select(selectresources);
	 		s5.selectByVisibleText("Nikhilesh Khetmalis");
	 		Thread.sleep(3000);
	 		Select v3 = new Select(selectcategory);
	 		v3.selectByVisibleText("1-Client Meeting-Office [Hourly] (10000)");
	 		Thread.sleep(3000);
	 		Hr.sendKeys(propertyfile.readpropertyfile("hours"));
	 		min.sendKeys(propertyfile.readpropertyfile("minutes"));
	 	    textaera.sendKeys(propertyfile.readpropertyfile("text"));
	 	     Thread.sleep(3000);
	 	  	Custom.click();
	 	  	rate.clear();
	 	    defalut.click();
	 		 Thread.sleep(2000);
	 		 save.click();
		 	  Thread.sleep(3000);
		 	  
		 	 driver.switchTo().defaultContent();
		 	 expense.click();
				WebElement iframe2 = driver.findElement(By.cssSelector("#TabFrame"));

				//Switch to the frame
				driver.switchTo().frame(iframe2);
		 	  Select s6 = new Select(expensecategory);
		 		s6.selectByVisibleText("Outside printing ");
		 		Thread.sleep(3000);
		 		expenserate.sendKeys(propertyfile.readpropertyfile("crate"));
		 		Thread.sleep(3000);
		 		
		 		JavascriptExecutor jse = (JavascriptExecutor)driver;
		 		jse.executeScript("arguments[0].value='test';", expensedesc);
		 		//expensedesc.sendKeys("test");
		 		
		 		expensesave .click();
		 	  driver.switchTo().defaultContent();
	}
	}
	

