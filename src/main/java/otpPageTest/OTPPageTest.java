package otpPageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import RankmfBase.TestBase;
import utility.Constant;
import utility.util;

public class OTPPageTest extends TestBase {
	
	@FindBy(xpath="//input[@id='otp_text_normal']")
	WebElement enterotp;
	@FindBy(xpath="//a[@id='basket_otp_submit_normal']")
	WebElement placeorder;
	private static WebElement element = null ;
	
	
	public static WebElement otp_textbox() throws Exception {
		try {
			//Thread.sleep(2000);
			element = driver.findElement(By.xpath("//input[@id='confirm_otp']"));
		    
			
		}catch(org.openqa.selenium.TimeoutException TE) {
			util.waitForElement(driver, element);
			
		}catch(Exception Ex) {
			throw(Ex);
			
		}
		
		
			return element;
		
		}
	
	public static WebElement verify_otp()
	{
		
		try {
			//Thread.sleep(2000);
			//for(int i=0;i<=4;i++) 
			element = driver.findElement(By.xpath("//input[@id='otp1']"));
			//element.click();
			
			
		}catch(org.openqa.selenium.TimeoutException TE) {
			util.waitForElement(driver, element);
			
		}catch(Exception Ex) {
			throw(Ex);
			
		}
		return element;
		
		
		
			
			
		}
	
		
		
	
	
	public static WebElement otp_textboxnormallumpsumsip() throws Exception {
		try {
			//Thread.sleep(2000);
			element = driver.findElement(By.xpath("//body/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/input[1]"));

			
		}catch(org.openqa.selenium.TimeoutException TE) {
			util.waitForElement(driver, element);
			
		}catch(Exception Ex) {
			throw(Ex);
			
		}
		
		
			return element;
		
		}
	
	
	public static WebElement otp_textboxsmartsip() throws Exception {
		try {
			//Thread.sleep(2000);
			element = driver.findElement(By.xpath("//input[@id='otp_text']"));
		    
			
		}catch(org.openqa.selenium.TimeoutException TE) {
			util.waitForElement(driver, element);
			
		}catch(Exception Ex) {
			throw(Ex);
			
		}
		
		
			return element;
		
		}
	
	
	public static WebElement otp_partnerverificationrankmf() throws Exception {
		try {
			//Thread.sleep(2000);
			element = driver.findElement(By.xpath("//input[@id='otp_text']"));
		    
			
		}catch(org.openqa.selenium.TimeoutException TE) {
			util.waitForElement(driver, element);
			
		}catch(Exception Ex) {
			throw(Ex);
			
		}
		
		
			return element;
		
		}
	
	public static WebElement otp_textboxsmartswitch() throws Exception {
		try {
			//Thread.sleep(2000);
			element = driver.findElement(By.xpath("//input[@id='submitOtp']"));
		    
			
		}catch(org.openqa.selenium.TimeoutException TE) {
			util.waitForElement(driver, element);
			
		}catch(Exception Ex) {
			throw(Ex);
			
		}
		
		
			return element;
		
		}
	
	public static WebElement otp_lumpsum() throws Exception {
		try {
			Thread.sleep(2000);
			element = driver.findElement(By.xpath("//input[@id='otp-input']"));
		    
			
		}catch(org.openqa.selenium.TimeoutException TE) {
			util.waitForElement(driver, element);
			
		}catch(Exception Ex) {
			throw(Ex);
			
		}
		
		
			return element;
		
		}
	
	
	
	public static void clickonsubmit() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement clickotp=driver.findElement(By.xpath("//a[@id='basket_otp_submit_normal']"));
		
		clickotp.click();
		
		
	}
	
	
	
	
	
	public static void Click_ConfirmPlacedNormalLumpsum() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement clickotp=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[6]/div[2]/div[2]/a[2]"));
		
		clickotp.click();
		
		
		
		
	}
	public static WebElement otp_resendlink() throws Exception {
		try {
			
			element = driver.findElement(By.xpath("//div[@id='payment-modal']//div[@class='modal-content']//a[@id='otp_resend_normal']"));
			
			
		}catch(org.openqa.selenium.TimeoutException TE) {
			util.waitForElement(driver, element);
			
		}catch(Exception Ex) {
			throw(Ex);
		}
		
			return element;
		}
	
	
		//	return element;
		}

