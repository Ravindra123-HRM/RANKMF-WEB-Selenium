package com.Test.RANKMFSELENIUM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import RankmfBase.TestBase;

public class StepUpSipOrderAmount extends TestBase {
	
	
	public StepUpSipOrderAmount(WebDriver driver)
    {

    	PageFactory.initElements(driver, this);
    	
    }
	
	public static void click_HomePage() throws Exception
	{
		
		HomepageTest.click_ExploreRankmf();	
	}
	
	public static void Click_SearchMutualfunds() throws Exception
	{
		String name="Edelweiss Nifty 100 Quality 30 Index Fund-";
		
		WebElement smartsip=driver.findElement(By.xpath("//input[@id='search_funds']"));
		smartsip.sendKeys(name);
		Thread.sleep(3000);
		smartsip.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		smartsip.sendKeys(Keys.ENTER);
		
	}
	
	public static void StepUp_Sip()
	{
		WebElement stepup=driver.findElement(By.xpath("//div[@class='mt-5 text-center mt_10']//button[@id='step_up_sip']"));
		stepup.click();
		
		
		
	}
	
	public static void InvestNowpopup() throws InterruptedException
	{
		
		
		String txt=driver.findElement(By.xpath("//*[@id='buy_sell_modal']/div/div/div[1]/div[1]/div[1]/div[2]/div[1]")).getText();
		Thread.sleep(2000);
		System.out.println("popup window open" +txt);
		String amount="600";
		WebElement installement=driver.findElement(By.xpath("//input[@id='installment_amount']"));
		
		
			Thread.sleep(2000);
			installement.clear();
			installement.sendKeys(amount);
			
		
	
	
		
			
			
				
		}
	
	
	public static void click_Continue() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement confirmcontinue=driver.findElement(By.xpath("//a[@id='order_button']"));
		confirmcontinue.click();
		System.out.println("Not selected");
		
		
	}
		
		
	
	
	

}
