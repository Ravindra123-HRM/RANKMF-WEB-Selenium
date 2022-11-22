package com.Test.Rankmfselenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Test.RANKMFSELENIUM.BasketAction;
import com.Test.RANKMFSELENIUM.BasketLumpsum_NEFTRTGS;
import com.Test.RANKMFSELENIUM.BasketlumpsumNetBanking;
import com.Test.RANKMFSELENIUM.LoginPage;
import com.Test.RANKMFSELENIUM.LogoutPageTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import RankmfBase.Email_sent;
import RankmfBase.ExtentReportNG;
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
	public static void clickonSigninPage() throws IOException
	{
	PropertyConfigurator.configure("log4j.properties");
		
		LoginPage.clicklogintest();

		LoginPage.loginpage(pro.getProperty("Username"), pro.getProperty("password"));

		//ExtentReportNG.passFailScreenshot("Testing Login Page");
		
		//logger.pass("User name and password is entered");
		
		//HomepageTest.TotalInvestmentvalue();
  } 

	@Test(groups= {"Regression"},dependsOnMethods= {"clickonSigninPage"})
	public static void clickonbasketpage() throws InterruptedException
	{
		
		BasketlumpsumNetBanking.clickonBasket();
		
	
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"clickonbasketpage"})
	public static void Clickonconservative() throws InterruptedException
	{
		
		BasketlumpsumNetBanking.clickonconservative();
		
	
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Clickonconservative"})
	public static void clickoninvest() throws InterruptedException
	{
		
		
		BasketlumpsumNetBanking.clickoninvest();
	
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"clickoninvest"})
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
