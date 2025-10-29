package com.Test.Rankmfselenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Test.RANKMFSELENIUM.BasketAction;
import com.Test.RANKMFSELENIUM.BasketLumpsumUPI;
import com.Test.RANKMFSELENIUM.BasketLumpsum_NEFTRTGS;
import com.Test.RANKMFSELENIUM.BasketlumpsumNetBanking;
import com.Test.RANKMFSELENIUM.EmailOTPReader;
import com.Test.RANKMFSELENIUM.LoginPage;
import com.Test.RANKMFSELENIUM.LogoutPageTest;

import RankmfBase.TestBase;

public class BasketLumpsumUPITest extends TestBase {
	static BasketLumpsumUPI bupi;
	static LoginPage lp;
	static BasketlumpsumNetBanking bln;
	static BasketAction ba;
	static BasketLumpsum_NEFTRTGS NEFT;
		//static Basketsiporder bso;
		
		@BeforeClass
		public static void SetInitialization() throws Exception
		{
			//WebDriverManager.chromedriver().setup();
		driver=initialization();
		lp=new LoginPage(driver);
	    bln=new BasketlumpsumNetBanking(driver);
	    NEFT=new BasketLumpsum_NEFTRTGS(driver);
	    bupi=new BasketLumpsumUPI(driver);
	    ba=new BasketAction();
		}
		
		@Test(groups="Regression")
		public static void clickonSigninPage() throws Exception
		{
		//PropertyConfigurator.configure("log4j.properties");
			LoginPage.clicklogintest();

			LoginPage.loginpage(pro.getProperty("Username"), pro.getProperty("password"));
			
			//HomepageTest.TotalInvestmentvalue();
		

		
	    } 
		@Test(groups= {"Regression"},dependsOnMethods= {"clickonSigninPage"})
		public static void clickonbasketpage() throws InterruptedException, AWTException
		{
			
			BasketLumpsumUPI.clickonBasket();
			
		
		}
		@Test(groups= {"Regression"},dependsOnMethods= {"clickonbasketpage"})
		public static void checkbasketcount() throws InterruptedException, AWTException
		{
			
			BasketLumpsumUPI.Basketcount();
			
		
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"checkbasketcount"})
		public static void clickoninvest() throws InterruptedException, AWTException
		{
			
			
			BasketLumpsumUPI.clickoninvest();
		
		}
		@Test(groups= {"Regression"},dependsOnMethods= {"clickoninvest"})
		public static void clickonpaymentmode() throws InterruptedException	
		{
			
			BasketLumpsumUPI.selectpaymentmode();
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"clickonpaymentmode"})
		public static void ClickonVerifyOTP() throws InterruptedException
		{
			
			
			BasketLumpsumUPI.clickonVerifyOTP();

		
		
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
			
			 String host = "imap.gmail.com";  // For Outlook: "outlook.office365.com"
			    String user = "ravindrac2871990@gmail.com"; // your email ID
			    String password = "jjgciyvvdciqeubs"; // Gmail app password
			    String subjectKeyword = "One Time Password(OTP) for your mutual fund investment."; // subject to filter emails

			    String otp = EmailOTPReader.fetchOTP(host, user, password, subjectKeyword);

			    // STEP 3: Enter OTP in the input field (if page requires it)
			    if (otp != null) {
			    	BasketAction.Enter_Otp_Number();
			       driver.findElement(By.id("otpField")).sendKeys(otp);
			        System.out.println("✅ OTP Entered Successfully: " + otp);
			    } else {
			        System.out.println("❌ OTP not found in emails!");
			    }

			
		}
		
		
			
		
		
		@Test(groups= {"Regression"},dependsOnMethods= {"enterotpnum"})	
		public static void Clickon_logout() throws Exception
		{
			
			LogoutPageTest.profile_logout();
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_logout"})	
		public static void Click_logoutbtn() throws Exception
		{
			
			LogoutPageTest.click_logoutbtn();
		}	
		
		
		
		
		@AfterClass
		public static void Teardown()
		{
			driver.close();
			
		}
		

}
