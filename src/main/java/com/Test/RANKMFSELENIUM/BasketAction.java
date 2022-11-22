package com.Test.RANKMFSELENIUM;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;

import RankmfBase.Email_sent;
import RankmfBase.Logs;
import RankmfBase.TestBase;
import otpPageTest.OTPPageTest;



public class BasketAction extends TestBase  {
		
	
public static void Enter_OTP() throws Exception
{
	
	OTPPageTest.otp_textboxnormallumpsumsip().sendKeys(Orderpopup.otp());
	NormalLumpsumOrder_Netbanking.Click_confirmPlaceOrder();
}

	
	public static void Enter_Otp_Number() throws Exception 
	{
		
		OTPPageTest.otp_textbox().sendKeys(Orderpopup.otp());
		OTPPageTest.clickonsubmit();
		 
	}
	
	
	
	public static void EnterOtpnumber() throws Exception 
	{
		
		OTPPageTest.otp_textboxsmartsip().sendKeys(Orderpopup.otp());
		
		 
	}
	
	public static void EnterOTPsmartswitch() throws Exception
	{
		
		OTPPageTest.otp_textboxsmartswitch().sendKeys(Orderpopup.otp1());
		
	}
	
	public static void childtoparent() throws InterruptedException
	{
		
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		}
		}
		
	}
	
	public static void fetchsmartsippalcedorder() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement text=driver.findElement(By.xpath("//*[@id=\"main_msg_success\"]/div/p"));
		System.out.println("Smart sip text for order placed:\n"+text.getText());
  Logs.info(" order placed sucessfully for SmartSip popup is displayed");
  driver.navigate().refresh();
		
	}
	
	public static void fetchnormalpalcedorder() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement text=driver.findElement(By.xpath("//*[@id='main_msg_success']/div/p"));
		System.out.println("Normal sip text for order placed:\n"+text.getText());
		 Logs.info(" order placed sucessfully for NormalSip popup is displayed");
		
	}
	
	

	
	public static void closepopupwindow() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement close=driver.findElement(By.xpath("//div[@id='smartsip_modal']//i[@class='far fa-times-circle']"));
		close.click();
		
		
	}
	
	public static void cancelsmartsiporder() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement myinvestment=driver.findElement(By.xpath("//ul[@id='nav-mobile']//a[normalize-space()='My Investments']"));
		myinvestment.click();
		
		WebElement sipcalender=driver.findElement(By.xpath("//a[contains(text(),'SIP Calendar')]"));
		sipcalender.click();

		List<WebElement> delete=driver.findElements(By.xpath("//table[@class='mdl-data-table']//following::tr[1]//td[5]//button"));
		
		
		for(int i=0;i<=delete.size();i++)
		
		{
			
			//String name=ele.getText();
			Thread.sleep(2000);
			delete.get(i).click();
			
			Thread.sleep(2000);
			WebElement alert=driver.findElement(By.xpath("//button[contains(text(),'Yes!')]"));
			alert.click();
			
			Thread.sleep(2000);
			WebElement close=driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
			close.click();
			break;
			
			}
	}
		
	
	public static void send_email()
	{
		Email_sent.Email_send();
		
		Email_sent.email_send();
		
		
		
		
	}
		
		
	}
	
	


