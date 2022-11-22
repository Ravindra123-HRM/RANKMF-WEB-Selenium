package com.Test.RANKMFSELENIUM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import RankmfBase.Logs;
import RankmfBase.TestBase;
import utility.util;

public class NormalSmartSipOrder extends TestBase {
	
	
	public NormalSmartSipOrder(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	public static void click_HomePage() throws Exception
	{
		
		HomepageTest.Click_HomePage();	
		Logs.info("Click on home page");
	}
	
	public static void click_Investsmartsip() throws Exception
	{
		
		HomepageTest.Investsmartsip();	
		Logs.info("Click on Invest in  smart sip");
	}
		
	public static void CLICK_smartsip() throws Exception
	{
		
		HomepageTest.click_smartsip();	
		Logs.info("Click on smart sip button");
		
	}	


		
	public static void click_continue() throws Exception
	{
		  Thread.sleep(2000);
		  String parent=driver.getWindowHandle();

		// This will return the number of windows opened by Webdriver and will return Set of St//rings
		Set<String>s1=driver.getWindowHandles();

		// Now we will iterate using Iterator
		Iterator<String> I1= s1.iterator();

		while(I1.hasNext())
		{

		   String child_window=I1.next();

		// Here we will compare if parent window is not equal to child window then we            will close

		if(!parent.equals(child_window))
		{
		driver.switchTo().window(parent);

		System.out.println(driver.switchTo().window(child_window).getTitle());

	//	driver.close();
		}

		}
		// once all pop up closed now switch to parent window
		//driver.switchTo().window(parent);

		Thread.sleep(2000);
     	  WebElement roundsmart=driver.findElement(By.xpath("//div[@class='col s12 l6 m6 mt_10 pull-l6 pull-m6']//article[@class='rounded_box smart_wo_topup']"));
     	       	roundsmart.click();
     	       		  Thread.sleep(2000);
     	       		 WebElement continues=driver.findElement(By.xpath("//div[@class='col s12 center']//button[@class='waves-effect waves-light blue btn btn-extralarge']"));	
     		        continues.click();
     		        Logs.info("Click on continue button");       
	}	
	
	public static void Installementdate() throws Exception
	{
		
		DatepickerCalender.clickon_installementdate();	
		Logs.info("Click on installement date");
	}	
	
	public static void startdatepicker() throws InterruptedException
	{
		
		DatepickerCalender.start_datepicker();
		Logs.info("select date picker");
	}
	
	public static void clickalert() throws InterruptedException
	{
		
		DatepickerCalender.click_alertpopup();
		Logs.info("click on ok button ");
		
	}
	
	public static void click_smartsipotp() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement checkbox=driver.findElement(By.xpath("//div[@class='col s2 l1']//label[1]"));
		checkbox.click();     
		Logs.info("Click on checkbox");
		WebElement verifyotp=driver.findElement(By.xpath("//a[@id='otp_click']"));
		verifyotp.click();
		Logs.info("Click on verify via otp button");
		
		
		
	}
	public static void confirmcontinue() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//a[@id='otp_submit']"));
		ele.click();
		Logs.info("Click on otp_submit button");
		
		
	}
	
	
	
	public static void closepopup() throws InterruptedException
	{
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(1000,0)");
		WebElement ele=driver.findElement(By.xpath("//body/div[1]/div[1]/div[5]/div[1]/button[1]/i[1]"));
		ele.click();
		Logs.info("Click on popup close button");
		
	}
	
	
	
		
		
		}
		
		
		
	
	
	


