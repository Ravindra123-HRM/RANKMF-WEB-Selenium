package com.Test.RANKMFSELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import RankmfBase.TestBase;

public class LogoutPageTest  extends TestBase{
	
	public static void profile_logout() throws InterruptedException
	{
		
		Thread.sleep(3000);
	   Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//img[@class='profile_picture']"))).build().perform();
		
		
	}
	
	

	public static void click_logoutbtn() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
		ele.click();
		driver.close();
		
		
		
		
		//WebElement ele=driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
		
		
	}
	

	
	

}
