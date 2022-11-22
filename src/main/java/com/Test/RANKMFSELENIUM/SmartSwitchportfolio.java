package com.Test.RANKMFSELENIUM;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import RankmfBase.TestBase;

public class SmartSwitchportfolio extends TestBase {
	
	@FindBy(xpath="//ul[@id='nav-mobile']//a[normalize-space()='Evaluate Portfolio']")
	static
	WebElement Evaluateportfolio;
	
	@FindBy(xpath="//button[@id='btn-new-cas']")
	static
	WebElement uploadportfolio;
	
	
	
	public SmartSwitchportfolio(WebDriver driver)
    {

    	PageFactory.initElements(driver, this);
    	
    }
	
	
	//private static WebElement element = null ;
	
	
	
	
	public static void  Evaluateportfolio() throws InterruptedException
	{
		Thread.sleep(2000);
		
		Evaluateportfolio.click();
		
		
	}
	
	public static void clickon_uploadbtn() throws InterruptedException 
	{
      Thread.sleep(2000);
		
      uploadportfolio.click();
		
		
	}
	
	public static void clickon_portfolio() throws InterruptedException 
	{
      Thread.sleep(2000);
	 WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Evaluate Your Portfolio')]"));
      ele.click();
		
		
	}
	
	
	public static void upload_casfile() throws InterruptedException
	{
      Thread.sleep(2000);
	 WebElement title=driver.findElement(By.xpath("//input[@id='upload_cas_file']")); 
     Actions a=new Actions(driver);
	  a.moveToElement(title).click().build().perform();
			
		
		
	
		//div[@id='prg-circle']//i[@class='per-circle']
		
	}
	
	public static void clickon_browse() throws InterruptedException, IOException
	{
		
		 Thread.sleep(2000); 
		Runtime.getRuntime().exec("C:\\Users\\samco\\Desktop\\FileUpload.exe");
		 //System.out.println("2");
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert(); // switch to alert
		//String alertMessage= driver.switchTo().alert().getText();
		alert.sendKeys("EPNPS8313L");
		driver.switchTo().alert().accept();
		
	}
	
	public static void checkdetails_portfolioanalysis() throws InterruptedException
	{
        Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Check Detailed Portfolio Analysis')]"));
		 Actions a=new Actions(driver);
		  a.moveToElement(ele).click().build().perform();
				
		
		
		
	}
	
	public static void click_proceedbutton() throws InterruptedException
	{
        Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//body/section[2]/div[1]/div[6]/a[2]"));
		ele.click();
		
		
	}
	
	public static void click_initiateswitch() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//a[@id='initiateSwitch']"));
		ele.click();
		
	
     }
	public static void click_submitOtpBtn() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//a[@id='submitOtpBtn']"));
		ele.click();
		
	
     }
	
	public static void click_logoutbtn() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		ele.click();
		
	
     }
	
	
	
	
	

}
