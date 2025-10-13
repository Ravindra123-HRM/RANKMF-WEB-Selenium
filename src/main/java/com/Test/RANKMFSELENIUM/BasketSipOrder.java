package com.Test.RANKMFSELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RankmfBase.TestBase;

public class BasketSipOrder extends TestBase {
	
	@FindBy(xpath="//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/button[2]")
	static
	WebElement SIP;
	
	@FindBy(xpath="//a[@id='basket_order_button']")
	static
	WebElement confirmandcontinue;
	
	public BasketSipOrder(WebDriver driver)
    {

    	PageFactory.initElements(driver, this);
    	
    }
	
	public static void clickonsip() throws InterruptedException
	{
		BasketlumpsumNetBanking.clickonBasket();
		
		//BasketlumpsumNetBanking.clickoninvest();
		
		//BasketlumpsumNetBanking.selectpaymentmode();
		

	}
	
	
	
	
	public static void click_SIP() throws InterruptedException
	{
		Thread.sleep(3000);
		SIP.click();
		
		
	}
	
	public static void clickOn_Quantity() throws InterruptedException
	   {
		
		   WebElement quantity= driver.findElement(By.xpath("//input[@id='basket_qty_sip']"));
		 for(int count=1;count<=3;count++)
		 {
			 Thread.sleep(3000);
  	    quantity.click();
  	   
		 }
	   }
	
	public static void clickon_StartDate() throws InterruptedException
	{
		DatepickerCalender.Clickon_Calender();
		DatepickerCalender.start_datepicker();
		
	
	
	}
	
	public static void Clickon_confrim() throws InterruptedException
	{
		
		Thread.sleep(2000);
		confirmandcontinue.click();
		
	}
	
	public static void Check_VerifyOTP() throws InterruptedException
	{
		//BasketlumpsumNetBanking.clickonVerifyOTP();
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static void Order_Place_popup() throws InterruptedException
	{
			Thread.sleep(3000);
			WebElement alert=driver.findElement(By.xpath("//body/div[11]/div[7]/div[1]/button[1]"));
			String text="Your monthly SIP order for Investment of ₹500-/ in UTI MASTERSHARE UNIT SCHEME - GROWTH PLAN on 19th of Each month beginning 19th October is placed.Till your mandate/auto-debit facility is not set up, your SIP amount shall not be executed.";
			if(!alert.equals(text))
			{
				System.out.println("Order is not placed :\n");
				alert.click();
				driver.navigate().refresh();
				
				
			}
			else if(alert.equals(text))
			{
				System.out.println("Order is placed sucessfully ");
				
			}
			
			
			
			
	}
      
	

}
