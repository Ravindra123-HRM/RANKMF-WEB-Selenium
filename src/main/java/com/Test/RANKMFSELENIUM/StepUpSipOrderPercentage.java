package com.Test.RANKMFSELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import RankmfBase.TestBase;

public class StepUpSipOrderPercentage extends TestBase{
	
	public StepUpSipOrderPercentage(WebDriver driver)
    {

    	PageFactory.initElements(driver, this);
    	
    }
	
	
	
	
	
	public static void InvestNowPopupPercentage() throws InterruptedException
	{
		
		
		String txt=driver.findElement(By.xpath("//*[@id='buy_sell_modal']/div/div/div[1]/div[1]/div[1]/div[2]/div[1]")).getText();
		Thread.sleep(2000);
		System.out.println("popup window open" +txt);
		String amount="600";
		WebElement installement=driver.findElement(By.xpath("//input[@id='installment_amount']"));
		
		
			Thread.sleep(2000);
			installement.clear();
			installement.sendKeys(amount);
			
		WebElement installements=driver.findElement(By.xpath("//span[contains(text(),'Percentage')]"));
		
	     Thread.sleep(2000);
		installements.click();
		
		String amount1="8";
		WebElement installement1=driver.findElement(By.xpath("//input[@id='stepup_year']"));
		
		
			Thread.sleep(2000);
			installement1.clear();
			installement1.sendKeys(amount1);
		//input[@id='stepup_year']
			
		
		}
	
	
	
		
		
	


}
