package com.Test.RANKMFSELENIUM;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
<<<<<<< HEAD
import org.testng.Assert;
=======
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6

import RankmfBase.Logs;
import RankmfBase.TestBase;
import utility.Constant;
import utility.util;

public class BasketlumpsumNetBanking extends TestBase{
	

	
	@FindBy(xpath="//ul[@id='nav-mobile']//a[@class='common_submenu'][normalize-space()='Products']")
	static
	WebElement products;
	@FindBy(xpath="//ul[@class='submenu left']//a[normalize-space()='Baskets']")
	static
	WebElement Baskets;
	@FindBy(xpath="//h4[normalize-space()='Shubhotsav Basket']")
	static
	WebElement conservative;
	@FindBy(xpath="//a[normalize-space()='Invest']")
	static
	WebElement Investbutton;
	@FindBy(xpath="//a[@id='basket_order_button']\r\n")
	static
	WebElement confirmcontinue;
	@FindBy(xpath="//input[@id='term_condition_checkbox']")
	static       
	WebElement otpcheckbox;
	@FindBy(xpath="//button[@id='verify-via-otp-btn']")
	static
	WebElement verifyotp;
	
	
	
	public BasketlumpsumNetBanking(WebDriver driver)
    {

    	PageFactory.initElements(driver, this);
    	
    }
	
	public static void clickonBasket() throws InterruptedException, AWTException
	{
		try {
<<<<<<< HEAD
			 Thread.sleep(5000);
				Robot robot = new Robot();
				System.out.println("About to zoom out");
				for (int i = 0; i < 4; i++) {
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_SUBTRACT);
					robot.keyRelease(KeyEvent.VK_SUBTRACT);
					robot.keyRelease(KeyEvent.VK_CONTROL);
				}
				Logs.info("Zoom out sucessfully");
=======
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
	        // Optional: Use WebDriverWait instead of Thread.sleep
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	        // Move to "Products" menu item
	        WebElement productMenu = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//nav[@class='desktop-nav']//a[contains(text(),'Products')]")
	        ));
<<<<<<< HEAD
	       
=======
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
	 
	         Actions actions = new Actions(driver);
	        actions.moveToElement(productMenu).click().perform();
            System.out.println("Clicked on Products page successfully");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//ul[@class='sub-menu']//a[normalize-space()='Baskets']")).click();
	        Logs.info("Clicked on Products page successfully");
	    } catch (Exception e) {
	        Logs.error("Failed to click on Products page: " + e.getMessage());
	    }
<<<<<<< HEAD
		
		
	 }
	
	public static void Basketcount() throws InterruptedException, AWTException
	{
		Thread.sleep(3000);

		// Get all basket names
		List<WebElement> basketNames = driver.findElements(By.xpath("//div[@class='basket-card-thumb-area']//h4[@class='thumb-text']"));

		System.out.println("Total baskets found: " + basketNames.size());

		boolean basketFound = false;

		for (int i = 0; i < basketNames.size(); i++) {
		    String basketName = basketNames.get(i).getText().trim();
		    System.out.println("Basket Name: " + basketName);

		    // If the current basket name matches your target
		    if (basketName.equalsIgnoreCase("Amrit Kaal Tax Saver Basket")) {
		        basketFound = true;

		        // Locate the Invest Now button relative to this basket
		        WebElement investNowBtn = basketNames.get(i)
		                .findElement(By.xpath("./ancestor::div[@class='basket-card-thumb-area']//following::button[normalize-space()='Invest Now']"));
		        
		        investNowBtn.click();
		        System.out.println("✅ Clicked Invest Now for: " + basketName);
		        break; // Stop after clicking the correct basket
		    }
		}

		// If no matching basket found
		if (!basketFound) {
		    System.out.println("❌ No basket found with name: Amrit Kaal Tax Saver Basket");
		}

		    
	    	
=======
	 }
	
	public static void Basketcount() throws InterruptedException
	{
		Thread.sleep(7000);
		  List<WebElement> name = driver.findElements(By.xpath("//div[@class='basket-card-thumb-area']//h4[@class='thumb-text']"));
		  int names = driver.findElements(By.xpath("//div[@class='basket-card-thumb-area']//h4[@class='thumb-text']")).size();
 
		     int basket=name.size();
		     for(int i=0;i<basket;i++)
		     {
		    	 
		    	 String basketname=name.get(i).getText();
		    	 System.out.println(basketname);
		    	 
		     }
		    
		    
	    	 System.out.println("All bakset count"+names);
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
	
      }
	
	public static void clickonconservative() throws InterruptedException, AWTException
	{
		
<<<<<<< HEAD
		Thread.sleep(5000);
		Robot robot = new Robot();
		System.out.println("About to zoom out");
		for (int i = 0; i < 4; i++) {
=======
		Thread.sleep(3000);
	   	 conservative.click();
	 	Thread.sleep(3000);
		System.out.println("zooming");
		
		Robot robot = new Robot();
		System.out.println("About to zoom in");
		for (int i = 0; i < 4; i++) {			
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
<<<<<<< HEAD
		}
		Logs.info("Zoom out sucessfully");
		Assert.assertTrue(true);

=======
	  }
	 
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
	}
	
	

	public static  void clickoninvest() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
	
		String originalWindow = driver.getWindowHandle();

		// Wait for new tab to open (if needed)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		    wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();

		for (String windowHandle : allWindows) {
		    if (!windowHandle.equals(originalWindow)) {
		        // Switch to the new tab
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		
		try {
	        // Optional: Use WebDriverWait instead of Thread.sleep
			Thread.sleep(2000);

	        // Move to "Products" menu item
	        WebElement productMenu = driver.findElement(By.xpath("//div[@class='best-funds-summary-right']//a[normalize-space()='Invest']"));
	         productMenu.click();
            System.out.println("Clicked on Invest page successfully");
	    } catch (Exception e) {
	        Logs.error("Failed to click on Invest page: " + e.getMessage());
	    }
	 }
		
		
	
	public static void selectpaymentmode() throws InterruptedException {
		
		
		Thread.sleep(2000);
<<<<<<< HEAD
		WebElement paymentmode=driver.findElement(By.xpath("//input[@id='net-banking-val']"));
		

		try {
			paymentmode.click();
=======
		WebElement paymentmode=driver.findElement(By.xpath("//label[normalize-space()='NEFT']"));
		WebElement UTRNO=driver.findElement(By.xpath("//input[@id='utr_no_input']"));

		try {
			paymentmode.click();
			UTRNO.sendKeys("TESST");
			//input[@id='utr_no_input']
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	public static void clickonVerifyOTP() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		otpcheckbox.click();
		verifyotp.click();
	}
	
	
	
	@SuppressWarnings("unlikely-arg-type")
	public static void Alertpopup() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement alert=driver.findElement(By.xpath("//div[@class='sweet-alert showSweetAlert visible']//div[7]//div[1]//button[1]"));
		String url="https://www.unionbankonline.co.in/";
		if(!alert.equals(url))
		{
			System.out.println("Link is not redirecting to Netbanking url");
			alert.click();
			driver.navigate().refresh();
			
		}
		else if(alert.equals(url))
		{
			System.out.println("Link is redirecting to Netabanking url");
			
		}
	}
		
	
		public static void Alertpopup_NetbankingNormal() throws InterruptedException
		{
			Thread.sleep(3000);
			//WebElement alert=driver.findElement(By.xpath("//div[@class='sweet-alert showSweetAlert visible']//div[7]//div[1]//button[1]"));
			String url="https://www.kotak.com/pmtgt/ksecLogin.jsp";
			if(!url.equals(url))
			{
				System.out.println("Link is not redirecting to Netbanking url");
				
				
			}
			else if(url.equals(url))
			{
				
				System.out.println("Link is  redirecting to Netabanking url:\n"+url);
				Thread.sleep(3000);
				 String mainwindow = driver.getWindowHandle();
			       
			        driver.switchTo().window(mainwindow);
			        //driver.quit();
				 driver.navigate().back();
				
			}
		//Thread.sleep(2000);
         
		
		
	
		
		// Store the parent window handle
		String parent = driver.getWindowHandle();

		// Get all window handles
		Set<String> s = driver.getWindowHandles();
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {
		    String child_window = I1.next();

		    // If the window is not the parent, it's a child
		    if (!parent.equals(child_window)) {
		        // Switch to child window
		    	JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,350)", "");
		        
		        // Print the title of the child window
		        System.out.println("Child Window Title: " + driver.getTitle());

		        // Close the child window
		        driver.close();
		    }
		}

		// Switch back to the parent window
		driver.switchTo().window(parent);

	}





}
	


