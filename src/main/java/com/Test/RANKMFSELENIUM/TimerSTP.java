package com.Test.RANKMFSELENIUM;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import RankmfBase.TestBase;
import otpPageTest.OTPPageTest;
import utility.Constant;


public class TimerSTP extends TestBase {
	static JavascriptExecutor js = (JavascriptExecutor) driver;
	static Actions a =new Actions(driver);
	
	
	public TimerSTP(WebDriver driver) {
		  {

		    	PageFactory.initElements(driver, this);
		    	
		    }
		// TODO Auto-generated constructor stub
		  
	}

	public static void click_HomePage() throws Exception
	{
		
		HomepageTest.click_ExploreRankmf();	
	}
	
	public static void Click_SearchMutualfunds() throws Exception
	{
		String name="samco overnight fund";
		
		WebElement smartsip=driver.findElement(By.xpath("//input[@id='search_funds']"));
		smartsip.sendKeys(name);
		Thread.sleep(3000);
		smartsip.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		smartsip.sendKeys(Keys.ENTER);
		
	}
	
	public static void TSTP() throws InterruptedException
	{
		//Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement tstp=driver.findElement(By.xpath("//div[@class='col s12 xl2 l2 width_20 detail_page_btn']//following::div[1]//a[contains(text(),'Timer STP')]"));
		tstp.click();
		
		
	}
	
	public static void Select_Folio() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement selectdrop=driver.findElement(By.xpath("//div[@id='modal_content']//div[@class='select-wrapper']//input[1]"));
		selectdrop.click();
	Thread.sleep(2000);
	  WebElement createfolio=driver.findElement(By.xpath("//span[contains(text(),'Create New Folio')]"));
	  createfolio.click();
     }
	public static void placeofbirth() throws InterruptedException
	{
	     //JavascriptExecutor js = (JavascriptExecutor) driver;
		// Actions a =new Actions(driver);
		System.out.println(driver.getCurrentUrl());
		//Thread.sleep(2000);
		
		Thread.sleep(2000);
		WebElement placebirth=driver.findElement(By.xpath("//input[@id='birth_place']"));
	     js.executeScript("arguments[0].scrollIntoView();", placebirth);
		a.moveToElement(placebirth);
		System.out.println(placebirth.getText());
		placebirth.clear();
		placebirth.sendKeys("SHIMLA");
		
		//Thread.sleep(2000);
		WebElement tax1=driver.findElement(By.xpath("//span[contains(text(),'Income')]"));
	     js.executeScript("arguments[0].scrollIntoView();", tax1);
		a.moveToElement(tax1);
		Thread.sleep(2000);
		WebElement tax=driver.findElement(By.xpath("//*[@id='investor_detail_form']/div[5]/div[1]/div/div[1]/input"));
		tax.click();
		
		Thread.sleep(2000);
	    WebElement tax2=driver.findElement(By.xpath("//span[contains(text(),'NRI-Repatriable')]"));
		tax2.click();
		
		Thread.sleep(2000);
		 WebElement Address1=driver.findElement(By.xpath("//input[@id='permanent_address_line_1']"));
		 Address1.clear();
		 Address1.sendKeys("SATARA");
		 WebElement Address2=driver.findElement(By.xpath("//input[@id='permanent_address_line_2']"));
		 Address2.clear();
		 Address2.sendKeys("SATARA");
		 WebElement Address3=driver.findElement(By.xpath("//input[@id='permanent_address_line_3']"));
		 Address3.clear();
		 Address3.sendKeys("SATARA");
		 WebElement city=driver.findElement(By.xpath("//input[@id='permanent_address_city']"));
		 city.clear();
		 city.sendKeys("PUNE");
		 WebElement pincode=driver.findElement(By.xpath("//input[@id='permanent_address_pincode']"));
		 pincode.clear();
		 pincode.sendKeys("401303");
		 WebElement district=driver.findElement(By.xpath("//input[@id='permanent_address_district']"));
		 district.clear();
		 district.sendKeys("satara");
		 WebElement state=driver.findElement(By.xpath("//input[@id='permanent_address_state']"));
		 state.clear();
		 state.sendKeys("Maharastra");
		 Thread.sleep(2000);
		 WebElement taxresident=driver.findElement(By.xpath("//div[contains(text(),'FATCA / CRS Details')]"));
	     js.executeScript("arguments[0].scrollIntoView();", taxresident);
		a.moveToElement(taxresident);
		Thread.sleep(2000);
		WebElement Taxresident=driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
		Taxresident.click();
		 Thread.sleep(2000);
		 WebElement Taxref1=driver.findElement(By.xpath("//input[@id='tax_reference_number1']"));
		 Taxref1.clear();
		 Taxref1.sendKeys("Maharastra1312421455");
		 WebElement Taxref2=driver.findElement(By.xpath("//input[@id='tax_identification_type1']"));
		 Taxref2.clear();
		 Taxref2.sendKeys("Maharastra1312421455");
		Thread.sleep(2000);
		 WebElement continues=driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
	     js.executeScript("arguments[0].scrollIntoView();", continues);
		a.moveToElement(continues);
		 WebElement continuesbtn=driver.findElement(By.xpath("//button[@id='investorDetailsBtn']"));
		 continuesbtn.click();
		 
		 Thread.sleep(2000);
		 WebElement IFSC_CODE=driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
	     js.executeScript("arguments[0].scrollIntoView();", IFSC_CODE);
		 a.moveToElement(IFSC_CODE);
		 
		 WebElement Bankname=driver.findElement(By.xpath("//input[@id='bank_name1']"));
		 Bankname.clear();
		 Bankname.sendKeys("Bank of Maharastra");
		 Thread.sleep(2000);
		 WebElement AccountNumber=driver.findElement(By.xpath("//input[@id='account_number1']"));
		 AccountNumber.clear();
		 AccountNumber.sendKeys("111111111111");
		 Thread.sleep(2000);
		 WebElement AccountNumber2=driver.findElement(By.xpath("//input[@id='confirm_account_number1']"));
		 AccountNumber2.clear();
		 AccountNumber2.sendKeys("111111111111");
		 Thread.sleep(2000);
		 WebElement yes=driver.findElement(By.xpath("//span[contains(text(),'Saving')]"));
	     js.executeScript("arguments[0].scrollIntoView();", yes);
		 a.moveToElement(yes);
		 WebElement continuesbutton=driver.findElement(By.xpath("//button[@id='investorbankDetailsBtn']"));
		 continuesbutton.click();
		 
		 Thread.sleep(2000);
		 WebElement Iwishnominee=driver.findElement(By.xpath("//*[@id=\"investorbankDetailsDiv\"]/div[1]"));
	     js.executeScript("arguments[0].scrollIntoView();", Iwishnominee);
		 a.moveToElement(Iwishnominee);
	
	}
	
	public static void Nominee() throws Exception
	{
		
		// WebElement wishnominee=driver.findElement(By.xpath("//span[contains(text(),'I wish to add a Nominee now')]"));
		// wishnominee.click();
		// Thread.sleep(2000);
		 
		 WebElement otp= driver.findElement(By.xpath("//a[contains(text(),'Verify via OTP')]"));
			otp.click();
		Orderpopup.otp();
		Thread.sleep(2000);
		 WebElement proceed= driver.findElement(By.xpath("//a[@id='confirmBtn']"));
		 proceed.click();
		
		
	}
	public static void SchemePage() throws Exception
	{
		
		Thread.sleep(2000);
		String URL="https://dev-newof.rankmf.com/timer-stp-scheme/onrg";
		String name=driver.getCurrentUrl();
		if(name.contains(URL))
		{
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 WebElement purchaseamount=driver.findElement(By.xpath("//input[@id='paymentInput']"));
		 purchaseamount.click();
		 purchaseamount.clear();
		 WebElement scrolldown=driver.findElement(By.xpath("//label[contains(text(),'Start Date')]"));
		  js.executeScript("arguments[0].scrollIntoView();", scrolldown);
		  a.moveToElement(scrolldown);
		
		  WebElement verifyotp=driver.findElement(By.xpath("//a[contains(text(),'Verify via OTP')]"));
		  verifyotp.click();
		  Thread.sleep(2000);
		  purchaseamount.sendKeys("250000");
		  WebElement scrolldown1=driver.findElement(By.xpath("//input[@id='pick_scheme']"));
		  js.executeScript("arguments[0].scrollIntoView();", scrolldown1);
		  a.moveToElement(scrolldown1);
		  Thread.sleep(2000);
		  WebElement weekly=driver.findElement(By.xpath("//span[contains(text(),'Weekly')]"));
		  weekly.click();
		  WebElement weekdays=driver.findElement(By.xpath("//*[@id=\"order_detail_form\"]/div[5]/div/div[1]/input"));
		  weekdays.click();
		  WebElement weekday=driver.findElement(By.xpath("//span[contains(text(),'Wednesday')]"));
		  weekday.click();
		  WebElement tenure=driver.findElement(By.xpath("//h3[contains(text(),'Tenure')]"));
		  js.executeScript("arguments[0].scrollIntoView();", tenure);
		  a.moveToElement(tenure);
		  WebElement startdate=driver.findElement(By.xpath("//input[@id='start_date']"));
		  startdate.click();
		  DatepickerCalender.start_smartsipdatepicker();
		  DatepickerCalender.click_alertpopup();
		  WebElement enddate=driver.findElement(By.xpath("//input[@id='end_date']"));
		  enddate.click();
		  DatepickerCalender.start_smartsipdatepicker();
		  DatepickerCalender.click_alertpopupok();
		  WebElement verifyviaotp=driver.findElement(By.xpath("//a[contains(text(),'Verify via OTP')]"));
		  verifyviaotp.click();
		  Orderpopup.otp();
			Thread.sleep(2000);
			WebElement proceed= driver.findElement(By.xpath("//*[@id=\"order_detail_form\"]/div[15]/a"));
			proceed.click();
		}
			
	}
	
	public static void Paymentpage() throws InterruptedException
	{
		
		    Thread.sleep(3000);
		      //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    WebElement upi=driver.findElement(By.xpath("//h3[contains(text(),'Select Bank')]"));
			  js.executeScript("arguments[0].scrollIntoView();", upi);
			  a.moveToElement(upi);
		    WebElement netbanking=driver.findElement(By.xpath("//strong[contains(text(),'Net Banking')]"));
			  netbanking.click();
			  Thread.sleep(2000);
			  WebElement proceed=driver.findElement(By.xpath("//button[@id='proceed_online_payment_request']"));
			  proceed.click();
			  Thread.sleep(2000);
			  WebElement yes=driver.findElement(By.xpath("//button[@id='btn_modal_yes']"));
			  yes.click();
			  Thread.sleep(2000);
			  Select amount=new Select(driver.findElement(By.xpath("//select[@id='BankStatus']")));
			  amount.selectByVisibleText("Success");
			  Thread.sleep(2000);
			  WebElement submit=driver.findElement(By.xpath("//button[@id='SubmitForm']"));
			  submit.click();
			  Thread.sleep(2000);
			  String sucess=driver.findElement(By.xpath("//h2[contains(text(),'Your lumpsum order has been placed successfully')]")).getText();
			  System.out.println(sucess);
			 
			  
			  
	}
	
	public static void Already_Registered_STP() throws Exception
	{
		
		
			String URL="https://dev-newof.rankmf.com/tstp-callback-url";
			String currenturl=driver.getCurrentUrl();
			if(currenturl.equalsIgnoreCase(URL))
			{
				Thread.sleep(2000);
			WebElement homepage=driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[1]/a[2]/img[1]"));
			homepage.click();
			}
		 TimerSTP.click_HomePage();
		 TimerSTP.Click_SearchMutualfunds();
		 TimerSTP.TSTP();
		Thread.sleep(2000);
		WebElement selectdrop=driver.findElement(By.xpath("//div[@id='modal_content']//div[@class='select-wrapper']//input[1]"));
		selectdrop.click();
		System.out.println(Orderpopup.folionumber());
		WebElement folio=driver.findElement(By.xpath("//span[contains(text(),'"+Orderpopup.folionumber()+"')]"));
		folio.click();
		TimerSTP.SchemePage();
		
		 
	  }
	
	public static void Registered_folio_orderNotcomplete() throws Exception
	{
		
		 TimerSTP.click_HomePage();
		 TimerSTP.Click_SearchMutualfunds();
		 TimerSTP.TSTP();
		 TimerSTP.Select_Folio();
		 TimerSTP.placeofbirth();
		 TimerSTP.Nominee();
		 TimerSTP.SchemePage();
		 driver.navigate().back();
		 TimerSTP.click_HomePage();
		 TimerSTP.Click_SearchMutualfunds();
		 TimerSTP.TSTP();
		 Thread.sleep(2000);
			WebElement selectdrop=driver.findElement(By.xpath("//div[@id='modal_content']//div[@class='select-wrapper']//input[1]"));
			selectdrop.click();
			System.out.println(Orderpopup.folionumber());
			WebElement folio=driver.findElement(By.xpath("//span[contains(text(),'"+Orderpopup.folionumber()+"')]"));
			folio.click();
			TimerSTP.SchemePage();
			//TimerSTP.Paymentpage();
			
		
		
	}
		  
		
		
		
	}
	

