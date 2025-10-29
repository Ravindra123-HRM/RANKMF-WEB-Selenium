package com.Test.RANKMFSELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RankmfBase.Logs;
import RankmfBase.TestBase;


public class LoginPage extends TestBase  {
	
	@FindBy(xpath="/html/body/header/div/div[1]/div/div/ul/li[3]")
	static
	WebElement login;
	@FindBy(id="login_username")
	static
	WebElement clientid;
	@FindBy(id="login_password")
	static
	WebElement password;
	@FindBy(id="common_login_btn")
	static
	WebElement loginbutton;
	

	
	
	public LoginPage(WebDriver driver)
    {

    	PageFactory.initElements(driver, this);
    	
    }
	
	public static void clicklogintest() throws InterruptedException
	{
		Thread.sleep(2000);	
		login.click();
		System.out.println( driver.getTitle());
		 Logs.info("Click on sign button");
		
	}
	
	 public static void loginpage(String username,String Password)
	   {
		   clientid.sendKeys(username);
		   Logs.info("Enter Username");
		   password.sendKeys(Password);
		   Logs.info("Enter Password");
		   loginbutton.click();
		   Logs.info("click on sign button");
		   //Logs.info(image.isDisplayed());
		  
		  // Logs.info(signout.isSelected());
		   
		 }
	 
	 public static void smartswitchlogin(String username,String Password) throws InterruptedException 
	   {
		
		
		   clientid.sendKeys(username);
		   Logs.info("Enter Username");
		   password.sendKeys(Password);
		   Logs.info("Enter Password");
		   loginbutton.click();
		   Logs.info("click on sign button");
		   //Logs.info(image.isDisplayed());
		  
		  // Logs.info(signout.isSelected());
		   
		 }
	 
	 
	 
	 
	

}
