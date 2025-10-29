package com.Test.Rankmfselenium;

<<<<<<< HEAD
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.awt.AWTException;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
=======
import java.awt.AWTException;

import org.apache.log4j.PropertyConfigurator;
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Test.RANKMFSELENIUM.BasketAction;
import com.Test.RANKMFSELENIUM.BasketLumpsum_NEFTRTGS;
import com.Test.RANKMFSELENIUM.BasketSipOrder;
import com.Test.RANKMFSELENIUM.BasketlumpsumNetBanking;
import com.Test.RANKMFSELENIUM.EmailOTPReader;
import com.Test.RANKMFSELENIUM.LoginPage;
import com.Test.RANKMFSELENIUM.LogoutPageTest;

import RankmfBase.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BasketlumpsumOrderNetBankingTest extends TestBase  {
	
 static LoginPage lp;
 static BasketlumpsumNetBanking bln;
 static BasketAction ba;
<<<<<<< HEAD
static BasketLumpsum_NEFTRTGS NEFT;
=======
 static BasketSipOrder bso;
 static BasketLumpsum_NEFTRTGS NEFT;
 static BasketlumpsumNetBanking bln;
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
	//static Basketsiporder bso;
	
	@BeforeClass
	public static void SetInitialization() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
<<<<<<< HEAD
		
=======
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
	driver=initialization();
	lp=new LoginPage(driver);
    bln=new BasketlumpsumNetBanking(driver);
    NEFT=new BasketLumpsum_NEFTRTGS(driver);
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
		
		BasketlumpsumNetBanking.clickonBasket();
		
	
	}
<<<<<<< HEAD
	@Test(groups= {"Regression"},dependsOnMethods= {"clickonbasketpage"})
	public static void checkbasketcount() throws InterruptedException, AWTException
=======
	@Test(groups= {"Regression"},dependsOnMethods= {"clickonSigninPage"})
	public static void checkbasketcount() throws InterruptedException
	{
		
		BasketlumpsumNetBanking.Basketcount();
		
	
	}
	
	
	@Test(groups= {"Regression"},dependsOnMethods= {"checkbasketcount"})
	public static void Clickonconservative() throws InterruptedException, AWTException
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
	{
		
		BasketlumpsumNetBanking.Basketcount();
		
	
	}
	
<<<<<<< HEAD
	@Test(groups= {"Regression"},dependsOnMethods= {"checkbasketcount"})
=======
	@Test(groups= {"Regression"},dependsOnMethods= {"Clickonconservative"})
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
	public static void clickoninvest() throws InterruptedException, AWTException
	{
		
		
		BasketlumpsumNetBanking.clickoninvest();
	
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"clickoninvest"})
	public static void clickonpaymentmode() throws InterruptedException	
	{
		
		BasketlumpsumNetBanking.selectpaymentmode();
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"clickonpaymentmode"})
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
	public static void RedirectNetbankingurl() throws Exception
	{
		try {
			BasketlumpsumNetBanking.Alertpopup();
			//DBconnection.Connectsql(null);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"RedirectNetbankingurl"})	
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
