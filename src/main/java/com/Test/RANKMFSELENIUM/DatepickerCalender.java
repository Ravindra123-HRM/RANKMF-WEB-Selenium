package com.Test.RANKMFSELENIUM;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import RankmfBase.TestBase;




public class DatepickerCalender extends TestBase {
	@FindBy(xpath="//input[@id='date']")
	static
	WebElement calender;
	
	
	public DatepickerCalender(WebDriver driver)
    {

    	PageFactory.initElements(driver, this);
    	
    }
	
	
	public static void Clickon_Calender() throws InterruptedException
	{
		 Thread.sleep(2000);
		 WebElement calculate=driver.findElement(By.xpath("//input[@id='date']"));
		 calculate.click();
		    
       
	}
	
	public static void clickon_installementdate() throws InterruptedException
	{
		Thread.sleep(3000);
	     //Actions actions = new Actions(driver);
		 WebElement calculate=driver.findElement(By.xpath("//input[@id='smart_date']"));
	    // actions.moveToElement(driver.findElement(By.xpath("//input[@id='smart_date']"))).doubleClick().build().perform();
		 calculate.click();
		
		 //WebElement alert=driver.findElement(By.xpath("//div[@class='confirmation-btns']//button[contains(text(),'Ok')]"));
		//alert.click();
	 	System.out.println("Button is double clicked"); 
	}
	
	public static void clickon_startdatesip() throws InterruptedException
	{
		Thread.sleep(3000);
	     //Actions actions = new Actions(driver);
		 WebElement calculate=driver.findElement(By.xpath("//input[@id='date']"));
	    // actions.moveToElement(driver.findElement(By.xpath("//input[@id='smart_date']"))).doubleClick().build().perform();
		 calculate.click();
		
	}
	
	


public static void start_datepicker() throws InterruptedException
{
	//Log.info("calender is click");
	//Thread.sleep(2000);
	/*WebElement next=driver.findElement(By.xpath("//span[@class='fc-icon fc-icon-right-single-arrow']"));
	
	for(int count=1;count<=3;count++)
	{
		next.click();
		break;
		
	}*/

	Thread.sleep(2000);
	List<WebElement> Calender= driver.findElements(By.tagName("td"));
		for(WebElement cal:Calender)
		{
			String name=cal.getText();
			if(name.equalsIgnoreCase("28"))
			{
				cal.click();
				//Log.info("Date is selected");
				break;
				
			}
			//System.out.println(cal.getText());
			
		}
		
		
}

public static void start_smartsipdatepicker() throws InterruptedException
{
	//Log.info("calender is click");
	//Thread.sleep(2000);
/*WebElement next=driver.findElement(By.xpath("//button[@class='month-next']//*[name()='svg']"));
	
	for(int count=1;count<=3;count++)
	{
		next.click();
		break;
		
	}*/
	Thread.sleep(2000);
	List<WebElement> Calender= driver.findElements(By.xpath("//button[@class='datepicker-day-button']"));
		for(WebElement cal:Calender)
		{
			String name=cal.getText();
			
			if(name.equalsIgnoreCase("24"))
			{
				cal.click();
				//Log.info("Date is selected");
				break;
				
			}
			//System.out.println(name);
			
		}
}
		

public static void click_alertpopup() throws InterruptedException 
{
	
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//div[@class='pika-single']//div[2]//following::div[1]//div[1]//button[2]"));
	ele.click();
	//Alert al = driver.switchTo().alert();
      // click on OK to accept with accept()
      //al.accept();
}





public static void NSEdatepicker() throws InterruptedException

{	
	
	
	    List<WebElement> monthyear=driver.findElements(By.xpath("//input[@id='hdnMonthYear']"));
	  
	     String mydate=driver.findElement(By.xpath("//input[@id='hdnMonthYear']")).getText();
	     mydate="JUNE2022";
	     System.out.println("My date"+mydate);
	   	String currentmonth=driver.findElement(By.xpath("//input[@id='datepickerFromMonthlyReport']")).getText();
	   
	   //	if(!(mydate.equals("JUNE2022")))
	   	
	   	
	   	
	   	
			 WebElement a11 =driver.findElement(By.xpath("//input[@id='datepickerFromMonthlyReport']"));
			    Actions pick =new Actions(driver);
			    pick.moveToElement(a11).click().perform();
			    System.out.println("calender is click"+a11);
			
			 Thread.sleep(2000);
	
			 
			 while(true){
			   	    if(driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")).getText().equalsIgnoreCase("2013") && driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")).getText().equalsIgnoreCase("MAY")) {
			   	        break;
			   	    }
			   	    else {
			   	    	driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			   	        Thread.sleep(500);
			   	    }
			   
			   
			 }
		
     Thread.sleep(2000);
	driver.findElement(By.xpath( "//input[@id='mainInner_C017_btndailyreport']")).click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(1000,0)");
	 
	Thread.sleep(2000);
	 
	WebElement excel=driver.findElement(By.xpath("//a[@id='mainInner_C017_datalist_exportArchives_0']"));
	excel.click();
	
	
	


}
}


		  
		  
			 
				  
			 
		   
			
			  
		   
		   
		 
		   //Thread.sleep(2000);
			       
      /* WebElement prev= driver.findElement(By.xpath("//span[contains(text(),'Prev')]"));
        Select yer=new Select(driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")));
			 yer.selectByVisibleText("2013");
			 
		Select mon=new Select(driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")));
		 mon.selectByVisibleText("May");
		 
   
      for(int i=0;i<=5;i++)
      {
    	 
    		  prev.click();
      }*/
    		
    	
