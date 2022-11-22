package com.Test.Rankmfselenium;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Test.RANKMFSELENIUM.BasketAction;
import com.Test.RANKMFSELENIUM.BasketLumpsum_NEFTRTGS;
import com.Test.RANKMFSELENIUM.BasketSipOrder;
import com.Test.RANKMFSELENIUM.BasketlumpsumNetBanking;
import com.Test.RANKMFSELENIUM.LoginPage;
import com.Test.RANKMFSELENIUM.LogoutPageTest;

import RankmfBase.TestBase;



public class BasketlumpsumOrderNetBankingTest extends TestBase  {
	
 static LoginPage lp;
 static BasketlumpsumNetBanking dsl;
 static BasketAction ba;
 static BasketSipOrder bso;
static BasketLumpsum_NEFTRTGS NEFT;
static BasketlumpsumNetBanking bln;
	//static Basketsiporder bso;
	
	@BeforeClass
	public static void SetInitialization() throws Exception
	{
	driver=initialization();
	lp=new LoginPage(driver);
    dsl=new BasketlumpsumNetBanking(driver);
    bso=new BasketSipOrder(driver);
    
   // bso=new Basketsiporder(driver);
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
	
	
	
	
	/*@AfterClass
	public static void Teardown()
	{
		driver.close();
		
	}*/
	

}
