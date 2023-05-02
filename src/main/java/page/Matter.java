package page;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import PBase.base;
import Utils.propertyfile;



public class Matter extends base {
	
	

		
		@FindBy(xpath="//a[text()=' Matters']")private WebElement Matter;
		@FindBy(xpath="//a[@class='addCircle']")private WebElement addbuttn;
		@FindBy(xpath="//input[@id='MainContent_txtFindContact']")private WebElement client;
		@FindBy(xpath="(//ul[@id='autoComplete1_completionListElem'])//li")private List<WebElement> clientlist;
		@FindBy(xpath="//li[text()='uja cement (C)']")private WebElement ambujacementclick;
		@FindBy(xpath="//textarea[@id='txtTitle']")private WebElement tittle;
		@FindBy(xpath="//li[text()='uja cement (C)']")private WebElement ambclick;
		@FindBy(xpath="")private WebElement MatterHead;
		@FindBy(xpath="//img[@class= 'menuIcon']")private WebElement menu;
		@FindBy(xpath="	//textarea[@name='ctl00$MainContent$txtTitle']")private WebElement mattertittle;
		@FindBy(xpath="//select[@id='drpMatterPracticeHead']")private WebElement Matterpracticehead;
		@FindBy(xpath="//select[@name='ctl00$MainContent$ddlPractiseArea']")private WebElement Practicearea;
		@FindBy(xpath="//select[@id='MainContent_ddlFileType']")private WebElement filetype;
		@FindBy(xpath="//input[@value='Create Matter']")private WebElement creatematterclick;

		@FindBy(xpath="//span[text()='test for timesheet open matter']")private WebElement matterclick;
		@FindBy(xpath="//div[@id='List7230']")private WebElement deleteswapnil;
		
		@FindBy(xpath="//a[@id='MainContent_ancEditMatter']")private WebElement editmattter;
		@FindBy(xpath="//a[@id='MainContent_lnkResourcing']")private WebElement resourcing;
		@FindBy(xpath="(//ul[@class='listDisplay'])//li[4]")private WebElement billing;
		
		@FindBy(xpath="//a[@id='lnkEditBill']")private WebElement editbilling;
		@FindBy(xpath="//input[@id='MainContent_btnSaveResourcing']")private WebElement addresorcing;

		@FindBy(xpath="//select[@name='ctl00$MainContent$drpBillTypes']")private WebElement billingtype;

		
		@FindBy(xpath="//div[@id='dvSaveBilling']")private WebElement savebilling;
		@FindBy(xpath="//select[@id='TimerControl_drpResource']")private WebElement resource;
		
		@FindBy(xpath="//a[@id='MainContent_lnkResourcing']")private WebElement resource1;
		
	
		@FindBy(xpath="//select[@name='TimerControl$ddlDescription']")private WebElement taskcategory;
		
		
		
		@FindBy(xpath="//input[@id='TimerControl_txtFromTime']")private WebElement timepick;
		
		
		@FindBy(xpath="//label[normalize-space(text()) = 'Custom']")private WebElement custom;

		
		@FindBy(xpath="//input[@name= 'TimerControl$txtRate']")private WebElement customprice;
		
		@FindBy(xpath="//textarea[@id= 'txtTimeNote']")private WebElement text;
		
		
		@FindBy(xpath="//input[@name= 'TimerControl$btmTimeEntry']")private WebElement savetime;
		
		
		@FindBy(xpath="//a[@href='PL_Matter_Expenses.aspx??enc=EOJisoXY9EZS3ybSMP/r03KhTiyeQIJ+hF4ozeghhqMy28MBbFGRL998VxYCXBvrfttJ5D7MReIdWHoSkJT3ZaVKpVKJJGPVZh/hoigGMQbrl0iNJmQWnsmAfZop3v3ci3t/JhuHz4iCV7JhF2u1VFs/J6tWWeyislNPjN7xN6eqawHfW5EeDRtjqWWg7hllgNlh8nCeNMXbzBrJUnqzPuxVUiD1ODcRrOUYgIcUcOQnv3Xo8Kru4Q1FbafdBM+XIle5RMRqSCzsfqEeL8Wj+NzvhIdPjdzJEEjh3h3s4cziDGM1pruT2d1c1qPz24AE5H0HVClEEZa5eBMXaAPLTKqS9dBCd9XhlL6YOX5Wlv+Y5oI042zSzA8G7/yLGLs/foFwgMWRYwFg8oeoz8KfKPa5jm8qClMsDgpdk3DAgU+3nH79F14+ZuiZjKTOPI3ODjf2FWvLnvtdZewCxY2eELX+pAbic9ZrQYi4UOqmrB0pJD3sUj3d3gQ5O/2IUOK0JUJe1J06ELEzxSBQHC68zcEUnpLhTdwvFxyhOcaw/f9om0GD3qgp320Wu5tQrgXhgRnZaqrzOTcIoP846xpOULnPQ0/W9O4VG6+yQVv8t0vg3XbNweNTvdDSaxmo0BTQ']")private WebElement expense;
		
		@FindBy(xpath="]")private WebElement time;
		

		@FindBy(xpath="//div[@id='divTab']")private WebElement iframe;

		@FindBy(xpath="//a[@href='PL_Matter_Time.aspx??enc=EOJisoXY9EZS3ybSMP/r03KhTiyeQIJ+hF4ozeghhqMy28MBbFGRL998VxYCXBvrfttJ5D7MReIdWHoSkJT3ZaVKpVKJJGPVZh/hoigGMQbrl0iNJmQWnsmAfZop3v3ci3t/JhuHz4iCV7JhF2u1VFs/J6tWWeyislNPjN7xN6eqawHfW5EeDRtjqWWg7hllgNlh8nCeNMXbzBrJUnqzPuxVUiD1ODcRrOUYgIcUcOQnv3Xo8Kru4Q1FbafdBM+XIle5RMRqSCzsfqEeL8Wj+NzvhIdPjdzJEEjh3h3s4cziDGM1pruT2d1c1qPz24AE5H0HVClEEZa5eBMXaAPLTKqS9dBCd9XhlL6YOX5Wlv+Y5oI042zSzA8G7/yLGLs/foFwgMWRYwFg8oeoz8KfKPa5jm8qClMsDgpdk3DAgU+3nH79F14+ZuiZjKTOPI3ODjf2FWvLnvtdZewCxY2eELX+pAbic9ZrQYi4UOqmrB0pJD3sUj3d3gQ5O/2IUOK0JUJe1J06ELEzxSBQHC68zcEUnpLhTdwvFxyhOcaw/f9om0GD3qgp320Wu5tQrgXhgRnZaqrzOTcIoP846xpOULnPQ0/W9O4VG6+yQVv8t0vg3XbNweNTvdDSaxmo0BTQ']")private WebElement time1;

		
		@FindBy(xpath="//input[@name='ctl00$MainContent$lstCustomGroup$ctrl0$lstCustomfield$ctrl0$txtCustomfield']") WebElement flid;
		//li[@id='MainContent_Mattertab5']
		
		
		@FindBy(xpath="//textarea[@id='MainContent_lstCustomGroup_lstCustomfield_0_txtCustomfield_1']") WebElement MTB;
		
		
		@FindBy(xpath="//select[@id='MainContent_lstCustomGroup_lstCustomfield_0_drpCustomfield_3']") WebElement dd;
		
		
		@FindBy(xpath="//input[@id='MainContent_lstCustomGroup_lstCustomfield_0_txtCustDate_6']") WebElement calender;
		
		@FindBy(xpath="//a[text()='29']") WebElement dateclick;
		
		
		@FindBy(xpath="//a[@tabindex='-1']") WebElement augtosugest;
		//span[text()='Select AutoSuggest']
		@FindBy(xpath="//input[@id='MainContent_lstCustomGroup_lstCustomfield_0_txtNumberCustom_7']") WebElement numericfiled;
		
		@FindBy(xpath="//select[@id='ddlResource']") WebElement selectresources;
		

		@FindBy(xpath="//input[@id='MainContent_btnAddResource']") WebElement add;
		
		@FindBy(xpath="//input[@id='MainContent_btnSaveResourcing']") WebElement resave;
		
	
		public Matter()
		{
			PageFactory.initElements(driver, this);
		}
		
		
		
		//@SuppressWarnings("deprecation")
		public void creatematter() throws Exception
		{
			//  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//Thread.sleep(3000);
			menu.click();
			//Thread.sleep(3000);
			Matter.click();
			//Thread.sleep(3000);
			addbuttn.click();
			//Thread.sleep(3000);
			client.sendKeys("Sahara ");
			Thread.sleep(3000);
			
			
			
			client.sendKeys(Keys.ARROW_DOWN);
			client.sendKeys(Keys.ENTER);		
			
			
//			String value ="CoreInfra (C)";
//			List<String> def = new ArrayList<String>();
//
//		    for (int i = 0; i < clientlist.size(); i++)
//		    {
//
//		            //Get the values and store it in a list
//		            def.add(clientlist.get(i).getText());
//
//		        }
//
//		        if (def.contains(value))
//
//		        	clientlist.get(def.indexOf(value)).click();
//
//		        else
//		            System.out.println("Value not present");
			
			
			
			
			
			//String value ="ambuja cement (C)";
//			Actions a = new Actions(driver);
//			a.moveToElement(ambujacementclick).perform();
//			Thread.sleep(7000);
//			a.sendKeys(Keys.LEFT).perform();
//			for(int i=0;i<1;i++)
//			{
//				a.sendKeys(Keys.DOWN).build().perform();
//			}
//			a.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(3000);
			mattertittle.sendKeys(propertyfile.readpropertyfile("tit"));
			Thread.sleep(3000);
			Select s = new Select(Matterpracticehead);
			s.selectByVisibleText("Narayan Bade");
		//	Thread.sleep(3000);
			Select f = new Select(Practicearea);
			f.selectByVisibleText("ABCD");
			//Thread.sleep(4000);
//			Select o = new Select(filetype);
//			o.selectByVisibleText("Direct tax[DT]");
			Thread.sleep(3000);
		//	creatematterclick.click();
			Select f1 = new Select(filetype);
			f1.selectByVisibleText("Direct tax[DT]");
			//Thread.sleep(4000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,600)", "");
			
//			
//			flid.sendKeys(propertyfile.readpropertyfile("fl"));
//			Thread.sleep(3000);
//            MTB.sendKeys(propertyfile.readpropertyfile("mtb"));
//            Thread.sleep(3000);
//            
//            Select fg = new Select(dd);
//            fg.selectByVisibleText("dd1");
//            
//            Thread.sleep(3000);
//            calender.click();
//            
//            
//            
//            
//            
//            Thread.sleep(6000);
//            
//            dateclick.click();
//            Thread.sleep(6000);
//            
//            WebElement auto = driver.findElement(By.xpath("//span[text()='Select AutoSuggest']"));
//    		auto.click();
//       
//            Thread.sleep(3000);
//            augtosugest.sendKeys(Keys.ARROW_DOWN);
//            augtosugest.sendKeys(Keys.ENTER);
//            
//            numericfiled.sendKeys(propertyfile.readpropertyfile("num"));
//            
		
            creatematterclick.click();
            Thread.sleep(9000);
            
            JavascriptExecutor js2 = (JavascriptExecutor) driver;
    		js2.executeScript("window.scrollBy(0,-800)", "");
            
            resource1.click();
            Thread.sleep(3000);
            Select g = new Select(selectresources);
            g.selectByVisibleText("Nikhilesh Khetmalis[Associate]");
            Thread.sleep(3000);
            add.click();
           
            Thread.sleep(3000);
            Select g1 = new Select(selectresources);
          // g1.selectByVisibleText("Select Resource");
            g1.selectByVisibleText("Nilesh Ahtri[Partner]");;;
            Thread.sleep(5000);
            add.click();
            Thread.sleep(2000);
            resave.click();
            Thread.sleep(2000);
            
		//	billing.click();
		//	resourcing.click();
//	     	Thread.sleep(3000);
//			
//	     	addresorcing.click();
			
//	    	Thread.sleep(3000);
//	        editbilling.click();
//			
//	    	Select s1 = new Select(billingtype);
//		    s1.selectByVisibleText("Resource Specific Rate");
//			savebilling.click();
			
		}
//		public void createresourcing() throws Exception
//		{
//			Thread.sleep(3000);
//			menu.click();
//			Thread.sleep(3000);
//			Matter.click();
//			Thread.sleep(3000);
//			matterclick.click();
//			Thread.sleep(3000);
//			editmattter.click();
//			Thread.sleep(3000);
//			resourcing.click();
//			Thread.sleep(3000);
//			deleteswapnil.click();
//			Thread.sleep(3000);
//			driver.switchTo().alert().accept();
//			addresorcing.click();
//			Thread.sleep(5000);
//			billing.click();
//			Thread.sleep(3000);
//			editbilling.click();
//			Select s = new Select(billingtype);
//			s.selectByVisibleText("Resource Specific Rate");
//			savebilling.click();
//		}
	      
		
		
		public void createActivity() throws Exception
		{
		
		    menu.click();
			Thread.sleep(3000);
			Matter.click();
			Thread.sleep(3000);
			matterclick.click();
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,850)", "");
			
			Thread.sleep(3000);
			
//			//driver.switchTo().frame(iframe);
//			Thread.sleep(7000);
//			
//			time1.click();
//			//time1.click();
//			Set<String> s = driver.getWindowHandles();
//			System.out.println(s);
//			
//			ArrayList<String> m = new ArrayList<String>(s);
//			String Parentwindow =m.get(0);
//			
//			driver.switchTo().window(Parentwindow);
			Thread.sleep(3000);
			Select f = new Select(resource);
		f.selectByVisibleText("Gaurav Thakar");
			taskcategory.click();
			Select g = new Select(taskcategory);
			g.selectByVisibleText("12- udn [Hourly] (500)");
			Thread.sleep(3000);
			timepick.sendKeys("17:00");
			Thread.sleep(3000);
			custom.click();
			Thread.sleep(3000);
			customprice.sendKeys("5000");
			Thread.sleep(3000);
			text.sendKeys("text");
			savetime.click();
	     	Thread.sleep(3000);
		}
		
}



