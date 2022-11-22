package com.Test.RANKMFSELENIUM;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import RankmfBase.TestBase;
import utility.util;

public class HomepageTest extends TestBase {
	
	@FindBy(xpath="//body[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[2]")
	static
	WebElement home;
	
	//private static WebElement element = null ;
	public HomepageTest(WebDriver driver)
    {

    	PageFactory.initElements(driver, this);
    	
    }
	
	public static void Click_HomePage() throws Exception
	{
		    Thread.sleep(2000);
		    WebElement smart=driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/nav[1]/div[1]/a[2]/img[1]"));
		    smart.click();
		    
		   	
	
		
	}
	
	public static void Investsmartsip() throws Exception
	{
		
			
		Thread.sleep(3000);
		WebElement smartsip=driver.findElement(By.xpath("//a[contains(text(),'Invest in SmartSIP Today')]"));
		smartsip.click();
		
    }
	
	public static void SearchMutualfunds() throws InterruptedException
	{
	
		WebElement smartsip=driver.findElement(By.xpath("//input[@id='search_funds']"));
		smartsip.sendKeys("uti",Keys.SPACE,"master");
		Thread.sleep(3000);
		smartsip.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		smartsip.sendKeys(Keys.ENTER);
		
		
		
	}
		
			
		
		

	

	@SuppressWarnings("unlikely-arg-type")
	public static void click_smartsip() throws Exception
	{
		
			//Thread.sleep(2000);
			
			Thread.sleep(2000);
		WebElement smartsip=driver.findElement(By.xpath("//a[contains(text(),'Uti Flexi Cap Fund-regular Plan-growth')]//following::div[2]"));
		smartsip.click();
		

		}
	
	public static void click_sipcontinuebtn() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement continues=driver.findElement(By.xpath("//button[@id='SIP']"));
		   WebDriverWait wt = new WebDriverWait(driver,6);
		      // elementToBeClickable expected criteria
		      wt.until(ExpectedConditions.elementToBeClickable (continues));
		      Actions a=new Actions(driver);
			   a.moveToElement(continues).build().perform();
			   continues.click();
		      System.out.println("Current page title:" + driver.getTitle());
		
		
	}

	
	public static void click_continue() throws InterruptedException
	{
		Thread.sleep(2000);
		
		 String mainWindowHandle = driver.getWindowHandle();
	        Set<String> allWindowHandles = driver.getWindowHandles();
	        Iterator<String> iterator = allWindowHandles.iterator();
	        while (iterator.hasNext())
	        {
	            String ChildWindow = iterator.next();
	                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow))
	                {
	                driver.switchTo().window(ChildWindow);
       WebElement continues=driver.findElement(By.xpath("//div[@class='col s12 center']//button[@class='waves-effect waves-light blue btn btn-extralarge']"));
                                                        //*[@id="modal-7627a8f2-f3eb-f535-769f-302512a9290b"]/div/div[2]/div[2]/div/button[2]
	   WebDriverWait wt = new WebDriverWait(driver,6);    //*[@id="modal-dcf7104a-b95d-2a60-b8a2-31687e7b2e6c"]/div/div[2]/div[2]/div/button[2]
	 //div[@class='row mb_0 padding_lr']//div[@class='col s12 center']//button[@class='waves-effect waves-light blue btn btn-extralarge']
	      // elementToBeClickable expected criteria
	      wt.until(ExpectedConditions.elementToBeClickable (continues));
	      Actions a=new Actions(driver);
		   a.moveToElement(continues).build().perform();
		   continues.click();
	      System.out.println("Current page title:" + driver.getTitle());
		
	}
	                
	        }
	        
	}
	
	public static void TotalInvestmentvalue() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement totalinvestment=driver.findElement(By.xpath("//div[@class='card-panel p_15 border_round light_blue_bg']"));
		System.out.println("Total investment value of current user is: \n"+totalinvestment.getText());
		
		
	}
	
	public static void click_ExploreRankmf() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement explore=driver.findElement(By.xpath("//ul[@id='nav-mobile']//a[normalize-space()='Explore All MF Ranks']"));
		    explore.click();
		
		
		
	}
}
	
	


