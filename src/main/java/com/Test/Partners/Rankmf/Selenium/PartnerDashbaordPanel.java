package com.Test.Partners.Rankmf.Selenium;


import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import RankmfBase.Logs;
import RankmfBase.PartnerTestBase;

public class PartnerDashbaordPanel extends PartnerTestBase {
	
	@FindBy(xpath="//input[@id='login_username']")
	static
	WebElement Email;
	@FindBy(xpath="//input[@id='login_password']")
	static
	WebElement password;
	
	@FindBy(xpath="//button[@id='common_login_btn']")
	static
	WebElement loginbutton;
	
	 
	
	
	public PartnerDashbaordPanel(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public static void Loginpage(String Emails,String Password) throws InterruptedException
	{
	 	   Thread.sleep(2000);
		   Email.sendKeys(Emails);
		   Logs.info("Enter Username");
		   password.sendKeys(Password);
		   Logs.info("Enter Password");
		   loginbutton.click();
		   Logs.info("click on sign button");
		   
		
	}
	
	public static void LoginButton() throws InterruptedException
	{
		
		Thread.sleep(2000);
		System.out.println("Current page title:" + driver.getTitle());
		WebElement Login=driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	      // elementToBeClickable expected criteria
	      wait.until(ExpectedConditions.elementToBeClickable (Login));
		Actions a =new Actions(driver);
		a.moveToElement(Login).build().perform();
		Login.click();
		
           	 
		
	}
	
	public static void Dashboardpage() throws InterruptedException
	{
		
		//Thread.sleep(3000);
		//System.out.println("This is home URL: " +driver.getCurrentUrl());
	//	WebElement smartsip=driver.findElement(By.xpath("//a[@id='smartsip_link']//span[@class='m-widget24__stats m--font-darkgray']"));
		//smartsip.click();
		//smartsip.click();
	//	System.out.println("No of smart sip orders: "+smartsip);
		//Thread.sleep(2000);
		/*String SIPorder=driver.findElement(By.xpath("//div[@class='m-portlet__body  m-portlet__body--no-padding']//following::div[2]//h4[contains(text(),'SIP Orders')]//following::span[1]")).getText();
		System.out.println("No of sip orders: "+SIPorder);
		
			String MFaccount=driver.findElement(By.xpath("//div[@class='m-portlet__body  m-portlet__body--no-padding']//following::div[2]//h4[contains(text(),'SIP Orders')]//following::span[3]")).getText();
			String Threein1account=driver.findElement(By.xpath("//div[@class='m-portlet__body  m-portlet__body--no-padding']//following::div[2]//h4[contains(text(),'SIP Orders')]//following::span[4]")).getText();
			String offlineaccounts=driver.findElement(By.xpath("//div[@class='m-portlet__body  m-portlet__body--no-padding']//following::div[2]//h4[contains(text(),'SIP Orders')]//following::span[5]")).getText();
			
			System.out.println("No of MFaccount: "+MFaccount);
			System.out.println("No of 3in1account: "+Threein1account);
			System.out.println("No of offline accounts: "+offlineaccounts);
			
			String underprocessaccount=driver.findElement(By.xpath("//div[@class='m-portlet__body  m-portlet__body--no-padding']//following::div[2]//h4[contains(text(),'SIP Orders')]//following::span[6]")).getText();
			System.out.println("No of Under Process Account: "+underprocessaccount);
			
			String Stepupsiporders=driver.findElement(By.xpath("//div[@class='m-portlet__body  m-portlet__body--no-padding']//following::div[2]//h4[contains(text(),'SIP Orders')]//following::span[8]")).getText();
			String Totalsiporders=driver.findElement(By.xpath("//div[@class='m-portlet__body  m-portlet__body--no-padding']//following::div[2]//h4[contains(text(),'SIP Orders')]//following::span[9]")).getText();
			System.out.println("No of Stepup sip orders: "+Stepupsiporders);
			System.out.println("No of Total sip orders: "+Totalsiporders);
			
			//String NetStepUpSIPBookAchieved1stJanuary2023tilldate=driver.findElement(By.xpath("//div[@class='m-portlet__body  m-portlet__body--no-padding']//following::div[2]//h4[contains(text(),'SIP Orders')]//following::span[12]")).getText();
			//System.out.println("Net Step Up SIP Book Achieved [1st January, 2023 till date]: "+NetStepUpSIPBookAchieved1stJanuary2023tilldate);
			Thread.sleep(3000);
			String Thisisaum=driver.findElement(By.xpath("//span[@id='amu_value_total']")).getText();
			System.out.println("This is AUM: " +Thisisaum);*/
			
			
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	        try {
	            // Wait until SIP Orders heading is visible
	            wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//h4[contains(text(),'SIP Orders')]")
	            ));

	            System.out.println("Dashboard Metrics:");
	            System.out.println("------------------");

	            // Now try to fetch the elements, using waits
	            Thread.sleep(2000);
	            String SIPorder=driver.findElement(By.xpath("//div[@class='m-portlet__body  m-portlet__body--no-padding']//following::div[2]//h4[contains(text(),'SIP Orders')]//following::span[1]")).getText();
	    		String MFaccount=driver.findElement(By.xpath("//div[@class='m-portlet__body  m-portlet__body--no-padding']//following::div[2]//h4[contains(text(),'SIP Orders')]//following::span[3]")).getText();
	            String Threein1account=driver.findElement(By.xpath("//div[@class='m-portlet__body  m-portlet__body--no-padding']//following::div[2]//h4[contains(text(),'SIP Orders')]//following::span[4]")).getText();
	    	    String offlineaccounts=driver.findElement(By.xpath("//div[@class='m-portlet__body  m-portlet__body--no-padding']//following::div[2]//h4[contains(text(),'SIP Orders')]//following::span[5]")).getText();
	    	        System.out.println("No of sip orders: "+SIPorder);
	    			System.out.println("No of MFaccount: "+MFaccount);
	    			System.out.println("No of 3in1account: "+Threein1account);
	    			System.out.println("No of offline accounts: "+offlineaccounts);
	    			
	    			String underprocessaccount=driver.findElement(By.xpath("//div[@class='m-portlet__body  m-portlet__body--no-padding']//following::div[2]//h4[contains(text(),'SIP Orders')]//following::span[6]")).getText();
	    			System.out.println("No of Under Process Account: "+underprocessaccount);
	    			
	    			String Stepupsiporders=driver.findElement(By.xpath("//div[@class='m-portlet__body  m-portlet__body--no-padding']//following::div[2]//h4[contains(text(),'SIP Orders')]//following::span[8]")).getText();
	    			String Totalsiporders=driver.findElement(By.xpath("//div[@class='m-portlet__body  m-portlet__body--no-padding']//following::div[2]//h4[contains(text(),'SIP Orders')]//following::span[9]")).getText();
	    			System.out.println("No of Stepup sip orders: "+Stepupsiporders);
	    			System.out.println("No of Total sip orders: "+Totalsiporders);
	    			
	    			//String NetStepUpSIPBookAchieved1stJanuary2023tilldate=driver.findElement(By.xpath("//div[@class='m-portlet__body  m-portlet__body--no-padding']//following::div[2]//h4[contains(text(),'SIP Orders')]//following::span[12]")).getText();
	    			//System.out.println("Net Step Up SIP Book Achieved [1st January, 2023 till date]: "+NetStepUpSIPBookAchieved1stJanuary2023tilldate);
	    			Thread.sleep(3000);
	    			String Thisisaum=driver.findElement(By.xpath("//span[@id='amu_value_total']")).getText();
	    			System.out.println("This is AUM: " +Thisisaum);

	        } catch (TimeoutException te) {
	            System.out.println("Element not found within timeout: " + te.getMessage());
	        } catch (NoSuchElementException ne) {
	            System.out.println("Element not found in DOM: " + ne.getMessage());
	        } catch (Exception e) {
	            System.out.println("Unexpected error: " + e.getMessage());
	        }
	    }

	    private static String getTextByXpath(WebDriverWait wait, String xpath) {
	        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).getText();
	    }
			
			
	}
	
			

	     	
		
	
	


