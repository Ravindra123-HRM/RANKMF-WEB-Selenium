package com.Test.RANKMFSELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import RankmfBase.TestBase;

public class Samco_MF_Website extends TestBase
{
	
	public static void samcopage() throws InterruptedException
	{
		
		Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions a =new Actions(driver);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		WebElement samcoelss= driver.findElement(By.xpath("//span[contains(text(),'Samco ELSS Tax Saver Fund')]"));
		js.executeScript("arguments[0].scrollIntoView();", samcoelss);
		a.moveToElement(samcoelss);
		a.click();
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Samco ELSS Tax Saver Fund')]")).isDisplayed());
		Thread.sleep(2000);
		WebElement samcoflexi=	driver.findElement(By.xpath("//body//ul[@class='faq-items tab-items']//div[@class='team-porfile align-center']//span[contains(text(),'Samco Flexi Cap Fund')]"));

		WebElement para=driver.findElement(By.xpath(" //p[contains(text(),'Equity Linked Saving Scheme (ELSS), also known as ')]"));
		samcoflexi.click();
		System.out.println(para.getText());
		Thread.sleep(2000);
		WebElement hexashield=driver.findElement(By.xpath("//span[contains(text(),'HexaShield Frame Work')]"));
		hexashield.click();
		Thread.sleep(2000);
		WebElement Activeshare=driver.findElement(By.xpath("//span[contains(text(),'Active Share')]"));
		Activeshare.click();
		Thread.sleep(2000);
		WebElement timerstp=driver.findElement(By.xpath("//span[contains(text(),'Timer STP')]"));
		timerstp.click();
		
		
		
	}

}
