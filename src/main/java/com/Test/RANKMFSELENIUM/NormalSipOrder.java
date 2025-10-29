package com.Test.RANKMFSELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import RankmfBase.TestBase;
import otpPageTest.OTPPageTest;

public class NormalSipOrder extends TestBase {
	
	public NormalSipOrder(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	public static void click_HomePage() throws Exception
	{
		
		HomepageTest.click_ExploreRankmf();	
	}
	
	public static void Click_SearchMutualfunds() throws Exception
	{
		
		HomepageTest.SearchMutualfunds();	
	}
	
	
	
	public static void click_Normalsip() throws Exception
	{
		Thread.sleep(2000);
        WebElement sip=driver.findElement(By.xpath("//div[@class='disp_table_both']//button[@id='SIP']"));
       sip.click();
       
       Thread.sleep(2000);
       WebElement sippop=driver.findElement(By.xpath("//article[@id='trigger_sip_additional']"));
       sippop.click();
       
       Thread.sleep(2000);
       WebElement sippopup=driver.findElement(By.xpath("//article[@class='rounded_box normal_sip']//div[contains(@class,'font_24')]"));
       sippopup.click();
       
     
	}
		
	
		
	public static void Click_continue() throws Exception
	{
		
		HomepageTest.click_continue();	
	}	
	
	public static void Installementdate() throws Exception
	{
		
		DatepickerCalender.clickon_installementdate();	
	}	
	
	public static void startdatepicker() throws InterruptedException
	{
		
		DatepickerCalender.start_smartsipdatepicker();
		
	}
	
	public static void click_continuebtn() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement clickcontinue=driver.findElement(By.xpath("//a[@id='order_button']"));
		clickcontinue.click();
		
	}
	
	public static void clickalert() throws InterruptedException
	{
		
		DatepickerCalender.click_alertpopup();
		
	}
	
	public static void click_smartsipotp() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement checkbox=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/label[1]/span[1]"));
		checkbox.click();
	
		WebElement verifyotp=driver.findElement(By.xpath("//a[@id='otp_click']"));
		verifyotp.click();
		
		
		
	}
	public static void confirmcontinue() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//a[@id='otp_submit']"));
		ele.click();
		
		
	}
	
	public static void placeorderfirst() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement placeorder=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[7]/ul[1]/li[2]/button[1]"));
		placeorder.click();
		
		
	}
	
	public static void click_smartsipnormalotp() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement checkbox=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/label[1]/span[1]"));
		checkbox.click();
	
		WebElement verifyotp=driver.findElement(By.xpath("//a[@id='otp_click_normal']"));
		verifyotp.click();
		
		
		
	}
	
	public static void click_Normalsipotp() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement checkbox=driver.findElement(By.xpath("//body/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/span[1]"));
		checkbox.click();
		WebElement verifyotp=driver.findElement(By.xpath("//body/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[6]/div[1]/a[1]"));
		verifyotp.click();
		
		
		
	}
	
	public static void Confirmcontinuenormal() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//div[4]//div[1]//div[1]//div[1]//div[6]//div[2]//div[2]//a[2]"));
		ele.click();
		
		
	}
	
	public static void enterotpnumber() throws Exception 
	{
		
		OTPPageTest.otp_textbox().sendKeys(Orderpopup.otp());
		
		 
	}
	
	public static void confirmandplaceorder() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//body/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[6]/div[2]/div[2]/a[2]"));
		ele.click();
		
		
	}
	
	public static void skipstep() throws InterruptedException
	{
		
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//div[@class='modal-content']//div[@id='skip_step']//button[@class='close-refresh waves-effect yellow black-text mt_20 waves-light btn-small right-align']"));
		ele.click();
		
		
	}
	

	
	
	public static void closepopup() throws InterruptedException
	{
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(1000,0)");
		WebElement ele=driver.findElement(By.xpath("//body/div[1]/div[1]/div[4]/div[1]/button[1]/i[1]"));
		ele.click();
	}
	
	
	
	
	
		
	
	
	

}
