package com.Test.RANKMFSELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import RankmfBase.TestBase;

public class NSEformDownload extends TestBase{
	

	@FindBy(xpath="//span[@id='HistoricalMenu']")
	static
	WebElement Archives_dailyreport;
	@FindBy(xpath="//select[@id='ArchiveDailyReport']")
	static
	WebElement INDICES_marketcapital;
	
	
	
	
	public NSEformDownload(WebDriver driver)
    {

    	PageFactory.initElements(driver, this);
    	
    }
	
	public static void clickonReports() throws InterruptedException
	{
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@id='HistoricalMenu']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'Archives of Daily/ Monthly Reports')]")).click();
	 }
	
	public static void clickonMarketdropdowncapital() throws InterruptedException
	{
		
	    //Thread.sleep(2000);
	  //select[@id='ArchiveDailyReport']
	    driver.findElement(By.xpath("//select[@id='ArchiveDailyReport']")).click();
	    Thread.sleep(2000);
		Select a =new Select(driver.findElement(By.xpath("//select[@id='ArchiveDailyReport']")));
		a.selectByVisibleText("Indices - Market Capitalisation & Weightage");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Select Date')]")).click();
	 }
	
	public static void submitclick() throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath( "//input[@id='mainInner_C017_btndailyreport']")).click();
		
	}
	
	public static void clickondownload() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(1000,0)");
		//Thread.sleep(2000);
		 
		WebElement a=driver.findElement(By.xpath("//a[@id='mainInner_C017_datalist_exportArchives_0']"));
		a.click();
	
	}
	
	
}