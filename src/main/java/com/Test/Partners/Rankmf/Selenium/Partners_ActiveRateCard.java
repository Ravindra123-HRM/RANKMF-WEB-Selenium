package com.Test.Partners.Rankmf.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import RankmfBase.Logs;
import RankmfBase.PartnerTestBase;
import utility.Constant;


public class Partners_ActiveRateCard extends PartnerTestBase {
	 
	static JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@FindBy(xpath="//input[@id='login_username']")
	static
	WebElement Email;
	@FindBy(xpath="//input[@id='login_password']")
	static
	WebElement password;
	
	@FindBy(xpath="//button[@id='common_login_btn']")
	static
	WebElement loginbutton;
	
	 static String Emails="deepti.samco@gmail.com";
	 static String Password="123456";
	
	
	public Partners_ActiveRateCard(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public static void Loginpage(String Emails,String Password) throws InterruptedException
	{
	 	Thread.sleep(2000);
		Email.sendKeys(Emails);
		   Logs.info("Enter Username");
		   password.sendKeys(Password);
		   Logs.info("Enter Password");
		   loginbutton.click();
		   Logs.info("click on sign button");
		   
		
	}
	
	public static void LoginButton() throws InterruptedException
	{
		
		Thread.sleep(2000);
		System.out.println("Current page title:" + driver.getTitle());
		WebElement Login=driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	      // elementToBeClickable expected criteria
	     wait.until(ExpectedConditions.elementToBeClickable (Login));
		Actions a =new Actions(driver);
		a.moveToElement(Login).build().perform();
		Login.click();
		
           	 
		
	}
	public static void Brokerage() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("This is home URL: " +driver.getCurrentUrl());
		//*[@id="reports"]/a/span[contains(text(),'Brokerage')]
		WebElement crm=driver.findElement(By.xpath("//*[@id='reports']/a/span[contains(text(),'Brokerage')]"));
		crm.click();
		
		Thread.sleep(2000);
		WebElement activeratecard=driver.findElement(By.xpath("//span[contains(text(),'Active Rate Card')]"));
		activeratecard.click();	
	}
	
	
	public static void Reports() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		//input[@id='fromdate']
		WebElement calender=driver.findElement(By.xpath("//input[@id='fromdate']"));
		calender.sendKeys(Constant.DATE);
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//button[@id='date-search']"));
		search.click();
		Thread.sleep(2000);
		WebElement AMCsearch=driver.findElement(By.xpath("//input[@id='amc-search']"));
		AMCsearch.sendKeys(Constant.AMC);
	}
	public static void SearchAMC() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		// WebDriverWait wt = new WebDriverWait(driver,6);
	      // elementToBeClickable expected criteria
	    
		//Thread.sleep(3000);
		//WebElement mututalname=driver.findElement(By.xpath("//label[normalize-space()='Axis Mutual Fund']"));
		//wt.until(ExpectedConditions.elementToBeClickable (mututalname));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement  element = wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//label[normalize-space()='Axis Mutual Fund']"))));
       element.click();
       Thread.sleep(2000);
       WebElement search=driver.findElement(By.xpath("//input[@id='scheme-search']"));
        search.sendKeys("Axis Value Fund Regular Growth");
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement  element1 = wait.until(ExpectedConditions.visibilityOf((search)));
	    search.sendKeys(Keys.ENTER);
		String schemename=driver.findElement(By.xpath("//div[@class='name-group']//h4[contains(text(),'Axis Value Fund Regular Growth')]")).getText();
		System.out.println(schemename);
		Thread.sleep(2000);
		WebElement invest=driver.findElement(By.xpath("//div[@class='name-group']//h4[contains(text(),'Axis Value Fund Regular Growth')]//following::button[1]"));
		//WebDriverWait wait = new WebDriverWait (driver, 10);
	    Actions a1=new Actions(driver);
		a1.moveToElement(invest).build();
		invest.click();
	}

	public static void investAmount() throws InterruptedException, AWTException
	{
		 Robot robots = new Robot();
		String investpage=driver.getCurrentUrl();
		System.out.println("invest page "+investpage);
	
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    
	    driver.switchTo().window(tabs.get(1));
		 // Robot robot = new Robot();
		  robots.keyPress(KeyEvent.VK_PAGE_DOWN);
		  
		  for(int i=5;i<=7;i++)
		  {

		Thread.sleep(2000);
		//j.executeScript("arguments[0].click();", l);
		WebElement check=driver.findElement(By.xpath("//*[@id='investmentClientTable']/tbody/tr["+i+"]/td[1]/label/span"));
		check.click();
	
		
		WebElement Amount=driver.findElement(By.xpath("//tbody//tr["+i+"]//td[6]//input[@class='investment-amount']"));
		Amount.click();
	     Amount.sendKeys(Constant.AMOUNT);
		 }
	     
		 // Robot robots = new Robot();
		  robots.keyPress(KeyEvent.VK_PAGE_UP);
	     Thread.sleep(2000);
	     WebElement initiatetransaction=driver.findElement(By.xpath("//button[@id='investmentClientEmailBtn']"));
		Actions a=new Actions(driver);
		a.moveToElement(initiatetransaction).build();
		initiatetransaction.click();
		
		Thread.sleep(2000);
		WebElement initatetransaction=driver.findElement(By.xpath("//button[@id='confirm-btn']"));
		initatetransaction.click();
		// Robot robo = new Robot();
		
		  System.out.println("About to zoom in");
			//Robot rob = new Robot();
			for (int i = 0; i < 3; i++) {			
				robots.keyPress(KeyEvent.VK_CONTROL);
				robots.keyPress(KeyEvent.VK_SUBTRACT);
				robots.keyRelease(KeyEvent.VK_SUBTRACT);
				robots.keyRelease(KeyEvent.VK_CONTROL);
				}
			Thread.sleep(2000);
			 robots.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
	
	public static void SchemeTypeAndSubSchemeType() throws AWTException, InterruptedException
	{
		Robot robots = new Robot();
		robots.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		for(int i=1;i<=2;i++)
		{
			//Thread.sleep(2000);
			WebElement schemetype=driver.findElement(By.xpath("//input[@id='asset"+i+"']"));
			schemetype.click();	
			
			
			//Thread.sleep(2000);
			WebElement schemesubtype=driver.findElement(By.xpath("//input[@id='classcode"+i+"']"));
			schemesubtype.click();	 
			
		}
		
		String schemename=driver.findElement(By.xpath("//div[@class='name-group']//h4[contains(text(),'Sundaram Medium Term Bond Fund Regular Growth')]")).getText();
		System.out.println(schemename);
		Thread.sleep(3000);
		WebElement invest=driver.findElement(By.xpath("//div[@class='name-group']//h4[contains(text(),'Sundaram Medium Term Bond Fund Regular Growth')]//following::button[1]"));
		//WebDriverWait wait = new WebDriverWait (driver, 10);
	    Actions a=new Actions(driver);
		a.moveToElement(invest).build();
		invest.click();
		Partners_ActiveRateCard.investAmount();
		
	}
	
	
}

