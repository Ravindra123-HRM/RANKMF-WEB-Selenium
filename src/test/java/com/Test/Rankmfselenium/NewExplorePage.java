package com.Test.Rankmfselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Test.RANKMFSELENIUM.Orderpopup;

import RankmfBase.Logs;
import RankmfBase.TestBase;
import otpPageTest.OTPPageTest;

public class NewExplorePage extends TestBase {

	public NewExplorePage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	public static void click_ExploreAll_MF_Ranks() throws InterruptedException, AWTException {
		Thread.sleep(5000);
	    WebElement explore = driver.findElement(By.xpath("//header//a[contains(text(),'Explore All MF Ranks')]"));
		Actions a=new Actions(driver);
		a.moveToElement(explore);
		explore.click();
		Logs.info("click to explore page sucessfully");

	}

	public static void Filters() throws InterruptedException, AWTException {
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
		Assert.assertTrue(true);

		WebElement filter = driver.findElement(By.xpath("//input[@id='filter_scheme_id']"));
		filter.click();
		Logs.info("click to filter sucessfully");
        filter.sendKeys("navi");
		Thread.sleep(2000);
		filter.sendKeys(Keys.ENTER);
		Logs.info("Enter filter name sucessfully");
		Thread.sleep(2000);
		List<WebElement> cart = driver.findElements(By.xpath("//body/main[1]/div[1]/div[1]/div[2]/div[2]/ul[1]//button[@class='btn-add-to-cart add_to_cart']"));
		List<WebElement> schemename = driver.findElements(By.xpath("//h3[@class='mf-name']"));
		 
		for (int i = 0; i < schemename.size(); i++) {
			WebElement label = schemename.get(i);
			String scheme = label.getText();

			if (scheme.contains("Navi Large And Midcap Fund - Regular Plan Growth")) {

				WebElement carts = cart.get(i);

				if (!carts.isSelected()) {
					carts.click();
					Logs.info("click on cart sucessfully");
				}

		
			
			 // For example, by checking its adjacent text or other properties
					
					System.out.println("Found scheme: " + scheme);	
					break;
					
				}
			  }
<<<<<<< HEAD
		
		 Thread.sleep(20000);
	        WebElement Addtocart = driver.findElement(By.xpath("//button[@id='add-btn-lumpsum']"));
			Addtocart.click();
			Logs.info("Add to cart sucessfully");
			try {
			    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			    By proceedLocator = By.xpath("//*[contains(text(),'Proceed')]");
			    
			    WebElement proceedBtn = wait.until(ExpectedConditions.elementToBeClickable(proceedLocator));
			    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", proceedBtn);
			    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", proceedBtn);
			    Logs.info("Clicked on Proceed button successfully");
			} catch (Exception e) {
			    Logs.error("Unable to find or click Proceed button: " + e.getMessage());
			}
	
=======
				
		Thread.sleep(20000);
		WebElement Addtocart = driver.findElement(By.xpath("//button[@id='add-btn-lumpsum']"));
		Addtocart.click();
		Logs.info("Add to cart sucessfully");
		
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
	}
		
	
	public static void Filter() throws InterruptedException, AWTException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		WebElement filter = driver.findElement(By.xpath("//input[@id='filter_scheme_id']"));
		filter.click();
		Logs.info("click to filter sucessfully");
		filter.sendKeys("icici");
		Thread.sleep(2000);
		filter.sendKeys(Keys.ENTER);
		Logs.info("Enter filter name sucessfully");
		Thread.sleep(2000);
		List<WebElement> cart = driver.findElements(By.xpath("//body/main[1]/div[1]/div[1]/div[2]/div[2]/ul[1]//button[@class='btn-add-to-cart add_to_cart']"));
		List<WebElement> schemename = driver.findElements(By.xpath("//h3[@class='mf-name']"));
		 
		for (int i = 0; i < schemename.size(); i++) {
			WebElement label = schemename.get(i);
			String scheme = label.getText();

			if (scheme.contains("Icici Prudential Active Momentum Fund - Growth")) {

				WebElement carts = cart.get(i);

				if (!carts.isSelected()) {
					carts.click();
					Logs.info("click on cart sucessfully");
				}
					
					System.out.println("Found scheme: " + scheme);	
					break;
					
				}
			  }
<<<<<<< HEAD
	   
         Thread.sleep(20000);
        WebElement Addtocart = driver.findElement(By.xpath("//button[@id='add-btn-lumpsum']"));
		Addtocart.click();
		Logs.info("Add to cart sucessfully");
		try {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    By proceedLocator = By.xpath("//*[contains(text(),'Proceed')]");
		    
		    WebElement proceedBtn = wait.until(ExpectedConditions.elementToBeClickable(proceedLocator));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", proceedBtn);
		    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", proceedBtn);
		    Logs.info("Clicked on Proceed button successfully");
		} catch (Exception e) {
		    Logs.error("Unable to find or click Proceed button: " + e.getMessage());
		}
=======
	    
	
        
        waitForNextPage(driver, By.xpath("//button[@id='add-btn-lumpsum']"));
         Thread.sleep(2000);
        WebElement Addtocart = driver.findElement(By.xpath("//button[@id='add-btn-lumpsum']"));
		Addtocart.click();
		Logs.info("Add to cart sucessfully");
		Thread.sleep(2000);
	    WebElement proceed = driver.findElement(By.xpath("//a[contains(text(),'Proceed')]"));
	    js.executeScript("arguments[0].click();", proceed);
	   // proceed.click();
	    Logs.info("click to proceed button sucessfully");
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
	   // JavascriptExecutor js = (JavascriptExecutor) driver;
	 
	}

	public  static void waitForNextPage(WebDriver driver, By xpath) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20000));
	       wait.until(webDriver -> ((JavascriptExecutor) webDriver)
	    	        .executeScript("return document.readyState").equals("complete"));
	       wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
		// TODO Auto-generated method stub
		
	}
	public static void click_Review_PaymentPage() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println(driver.getCurrentUrl());
		String url=driver.getCurrentUrl();
		  Thread.sleep(2000);
	    	//driver.navigate().refresh();
			 WebElement option = driver.findElement(By.xpath("//label[@class='form-check-label']//input[@value='upi']"));
		
			 option.click();
		
			  Logs.info("click to option button sucessfully"); 
			Thread.sleep(2000);
			WebElement enterupid=driver.findElement(By.xpath("//input[@id='upi-input']"));
			enterupid.sendKeys("ravindrac202@okicici");
			 Logs.info("enter upi id  sucessfully");
			Thread.sleep(2000);
			WebElement verifyupi=driver.findElement(By.xpath("//span[contains(text(),'Verify UPI')]"));
			verifyupi.click();
			 Logs.info("click on verify upi sucessfully");
		    WebElement checkbox = driver.findElement(By.xpath("//input[@id='confirm']"));
		   // js.executeScript("arguments[0].click();", checkbox);
		    checkbox.click();
		    Logs.info("click on check box  sucessfully");
			Thread.sleep(2000);
			WebElement verifyotp = driver.findElement(By.xpath("//a[@id='verify-via-otp-btn']"));
			verifyotp.click();
	
   /*  WebElement Addedscheme=driver.findElement(By.xpath("//button[@class='btn-added-schemes']"));
        js.executeScript("arguments[0].click();", Addedscheme);
	    Addedscheme.click();
		 	Thread.sleep(2000);
			WebElement close = driver.findElement(By.xpath("//body[1]/div[8]/div[1]/div[1]/button[1]/img[1]"));
		    close.click();	*/		
		  /* List<WebElement> options = driver.findElements(By.xpath("//input[@name='payment-mode']"));
		List<WebElement> labels = driver.findElements(By.xpath("//label[@class='form-check-label']"));

		for (int i = 0; i < labels.size(); i++) {
			WebElement label = labels.get(i);
			String labelText = label.getText();

			if (labelText.contains("NEFT")) {

				WebElement option = options.get(i);
				System.out.println(option);	

				if (!option.isSelected()) {
					// Actions a =new Actions(driver);
					// a.moveToElement(option);
					 
					 option.click();
				}

				System.out.println("Selected checkbox for: " + labelText);
				break; // Exit loop after performing action
			}
		}*/
		   	}

	public static void EnterOtpnumber() throws Exception {

		OTPPageTest.otp_lumpsum().sendKeys(Orderpopup.otp());

	}
	public static void select_transact_mode() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement client_id = driver.findElement(By.xpath("//span[contains(text(),'RR34434')]"));
		Actions a=new Actions(driver);
		a.moveToElement(client_id).build();
		client_id.click();
		Thread.sleep(2000);
		WebElement My_account=driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
		My_account.click();
		Thread.sleep(2000);
		WebElement transact_mode=driver.findElement(By.xpath("//body/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/label[2]/span[1]"));
		transact_mode.click();
		Thread.sleep(2000);
		WebElement submit=driver.findElement(By.xpath("//button[@class='waves-effect waves-light btn changeMode mt-10']"));
		submit.click();
		Thread.sleep(2000);
		WebElement alert=driver.findElement(By.xpath("//button[@id='physical_modey']"));
		alert.click();
		Thread.sleep(2000);
		WebElement alertok=driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
		alertok.click();
		
		
	}

}
