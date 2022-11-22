package com.Test.RANKMFSELENIUM;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import RankmfBase.TestBase;
import utility.Constant;
import utility.util;

public class BasketlumpsumNetBanking extends TestBase{
	

	
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
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/span[1]")
	static       
	WebElement otpcheckbox;
	@FindBy(xpath="//a[@id='basket_otp_click_normal']")
	static
	WebElement verifyotp;
	
	
	
	public BasketlumpsumNetBanking(WebDriver driver)
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
	
	

	public static  void clickoninvest() throws InterruptedException {
		// TODO Auto-generated method stub
        Thread.sleep(3000);
		
		//String parent=driver.getWindowHandle();
		Investbutton.click();
	}
	
	public static void selectpaymentmode() throws InterruptedException {
		Thread.sleep(2000);
		Select paymentmode=new Select(driver.findElement(By.xpath("//select[@id='basketpayment_mode']")));
		paymentmode.selectByVisibleText("Net Banking");
		try {
			confirmcontinue.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	public static void clickonVerifyOTP() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		otpcheckbox.click();
		verifyotp.click();
	}
	
	
	
	@SuppressWarnings("unlikely-arg-type")
	public static void Alertpopup() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement alert=driver.findElement(By.xpath("//div[@class='sweet-alert showSweetAlert visible']//div[7]//div[1]//button[1]"));
		String url="https://www.unionbankonline.co.in/";
		if(!alert.equals(url))
		{
			System.out.println("Link is not redirecting to Netbanking url");
			alert.click();
			driver.navigate().refresh();
			
		}
		else if(alert.equals(url))
		{
			System.out.println("Link is redirecting to Netabanking url");
			
		}
	}
		
	
		public static void Alertpopup_NetbankingNormal() throws InterruptedException
		{
			Thread.sleep(3000);
			//WebElement alert=driver.findElement(By.xpath("//div[@class='sweet-alert showSweetAlert visible']//div[7]//div[1]//button[1]"));
			String url="https://www.kotak.com/pmtgt/ksecLogin.jsp";
			if(!url.equals(url))
			{
				System.out.println("Link is not redirecting to Netbanking url");
				
				
			}
			else if(url.equals(url))
			{
				
				System.out.println("Link is  redirecting to Netabanking url:\n"+url);
				Thread.sleep(3000);
				 String mainwindow = driver.getWindowHandle();
			       
			        driver.switchTo().window(mainwindow);
			        //driver.quit();
				 driver.navigate().back();
				
			}
		//Thread.sleep(2000);
         
		
		
	}

		/*Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();
		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.close();
		}

		}
		//switch to the parent window
		driver.switchTo().window(parent);

	}*/





}
	


