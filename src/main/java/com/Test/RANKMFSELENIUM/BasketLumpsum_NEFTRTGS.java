package com.Test.RANKMFSELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import RankmfBase.TestBase;

public class BasketLumpsum_NEFTRTGS extends TestBase {
	
	@FindBy(xpath="//*[@id='nav-mobile']/li[2]/a")
	static
	WebElement Baskets;
	@FindBy(xpath="//div[contains(text(),'Best funds for Tax Savings  – Conservative')]")
	static
	WebElement conservative;
	@FindBy(xpath="//button[contains(text(),'Invest')]")
	static
	WebElement Investbutton;
	@FindBy(xpath="//a[@id='basket_order_button']\r\n")
	static
	WebElement confirmcontinue;
	@FindBy(xpath="//input[@id='term_condition_checkbox']")
	static       
	WebElement otpcheckbox;
	@FindBy(xpath="//a[@id='basket_otp_click_normal']")
	static
	WebElement verifyotp;
	
	
	
	public BasketLumpsum_NEFTRTGS(WebDriver driver)
    {

    	PageFactory.initElements(driver, this);
    	
    }
	
	public static void clickonBasket() throws InterruptedException
	{
		
	    Thread.sleep(2000);
		Actions a=new Actions(driver);
	   	a.moveToElement(Baskets).build().perform();
	   	Baskets.click();
	    
	 }
	
	public static void clickonconservative() throws InterruptedException
	{
		
		Thread.sleep(3000);
	   	 conservative.click();
	}
	
	

	public static  void Clickoninvest() throws InterruptedException {
		// TODO Auto-generated method stub
        Thread.sleep(3000);
		
		//String parent=driver.getWindowHandle();
		Investbutton.click();
	}
	
	public static void selectpaymentmode() throws InterruptedException {
		Thread.sleep(2000);
		WebElement payementmode=driver.findElement(By.xpath("//input[@value='neft']"));
		payementmode.click();
		
	}
	
	public static void Enter_UtrNo() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement utr=driver.findElement(By.xpath("//input[@id='utr_no_input']"));
		utr.sendKeys("1234ewfwegweg");
		
		//a[@id='basket_order_utr']
		
	}
	
	public static void clickonVerifyOTP() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		otpcheckbox.click();
		verifyotp.click();
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static void orderplaced_popup() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement order_placetext=driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/button[1]/i[1]"));
		if(!order_placetext.equals("Your lumpsum order for Investment of ₹2500-/ in Best funds for Tax Savings – Conservative is placed"))
		{
			System.out.println("NEFT Lumpsum Placed order is placed sucessfully:\n"+order_placetext.getText());
		}
		else
		{
			System.out.println("NEFT Lumpsum Placed order is failed");
		
	     }
	
		WebElement close=driver.findElement(By.xpath("//*[@id='modal-payment-close']/i"));
		close.click();
		
		
	
	}



}
