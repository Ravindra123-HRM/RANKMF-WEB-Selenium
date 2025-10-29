package com.Test.Rankmfselenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.Test.RANKMFSELENIUM.BasketAction;
import com.Test.RANKMFSELENIUM.BasketLumpsum_NEFTRTGS;
import com.Test.RANKMFSELENIUM.BasketlumpsumNetBanking;
import com.Test.RANKMFSELENIUM.LoginPage;
import com.Test.RANKMFSELENIUM.LogoutPageTest;
//import com.Test.RANKMFSELENIUM.TestMailExample;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;



import RankmfBase.TestBase;


public class BasketLumpsum_NEFTTest extends TestBase {

	static LoginPage lp;
	 static BasketLumpsum_NEFTRTGS NEFT;
	 static BasketAction ba;
	 static BasketlumpsumNetBanking bln;
	
	 public static ExtentTest logger;
	 static ExtentReports extent;
	 
	
	
	@BeforeClass
	public static void SetInitialization() throws Exception
	{
		 
	driver=initialization();
	lp=new LoginPage(driver);
	NEFT=new BasketLumpsum_NEFTRTGS(driver);
	bln=new BasketlumpsumNetBanking(driver);
   // bso=new Basketsiporder(driver);
     ba=new BasketAction();
   
    

    
	}
	
	@Test(groups="Regression")
	public static void clickonSigninPage() throws IOException, InterruptedException
	{
	PropertyConfigurator.configure("log4j.properties");
		
		LoginPage.clicklogintest();

		LoginPage.loginpage(pro.getProperty("Username"), pro.getProperty("password"));

		//ExtentReportNG.passFailScreenshot("Testing Login Page");
		
		//logger.pass("User name and password is entered");
		
		//HomepageTest.TotalInvestmentvalue();
  } 

	@Test(groups= {"Regression"},dependsOnMethods= {"clickonSigninPage"})
	public static void clickonbasketpage() throws InterruptedException, AWTException
	{
		
		BasketlumpsumNetBanking.clickonBasket();
		
	
	}

	@Test(groups= {"Regression"},dependsOnMethods= {"clickonbasketpage"})
	public static void verifybasketcount() throws InterruptedException, AWTException
	{
		
		BasketlumpsumNetBanking.Basketcount();
		
	
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"verifybasketcount"})
	public static void Clickoninvest() throws InterruptedException, AWTException
	{
		
		
		BasketlumpsumNetBanking.clickoninvest();
	
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Clickoninvest"})
	public static void clickonpaymentmode() throws InterruptedException
	{
		
		BasketLumpsum_NEFTRTGS.selectpaymentmode();
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"clickonpaymentmode"})
	public static void clickon_Enter_UtrNo() throws InterruptedException
	{
		
		BasketLumpsum_NEFTRTGS.Enter_UtrNo();
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"clickon_Enter_UtrNo"})
	public static void ClickonVerifyOTP() throws InterruptedException
	{
		
		
	BasketlumpsumNetBanking.clickonVerifyOTP();

	
	
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"ClickonVerifyOTP"})
	public static void enterotpnum() throws Exception
	{
		try {
			BasketAction.Enter_Otp_Number();
			
			
		//	String otp = TestMailExample.getGmailOtp("yourgmail@gmail.com", "your-app-password", "Your OTP");
			WebElement otpField = driver.findElement(By.xpath("//input[@id='confirm_otp']"));
			//otpField.sendKeys(otp);
			driver.findElement(By.xpath("//a[@id='basket_otp_submit_normal']"));
			//DBconnection.Connectsql(null);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
	}
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"enterotpnum"})
	public static void show_orderplaced_popup() throws Exception
	{
		try {
			BasketLumpsum_NEFTRTGS.orderplaced_popup();
			
			//DBconnection.Connectsql(null);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"show_orderplaced_popup"})	
	public static void Clickon_logout() throws Exception
	{
		
		LogoutPageTest.profile_logout();
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_logout"})	
	public static void Click_logoutbtn() throws Exception
	{
		
		LogoutPageTest.click_logoutbtn();
	}	
	
 
	
	
	



}
