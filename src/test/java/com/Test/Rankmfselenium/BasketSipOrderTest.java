package com.Test.Rankmfselenium;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Test.RANKMFSELENIUM.BasketAction;
import com.Test.RANKMFSELENIUM.BasketLumpsum_NEFTRTGS;
import com.Test.RANKMFSELENIUM.BasketSipOrder;
import com.Test.RANKMFSELENIUM.BasketlumpsumNetBanking;
import com.Test.RANKMFSELENIUM.LoginPage;
import com.Test.RANKMFSELENIUM.LogoutPageTest;

import RankmfBase.TestBase;

public class BasketSipOrderTest extends TestBase{
	 static LoginPage lp;
	 static BasketLumpsum_NEFTRTGS NEFT;
	 static BasketAction ba;
	 static BasketlumpsumNetBanking bln;
	 static BasketSipOrder bso;
	@BeforeClass
	public static void SetInitialization() throws Exception
	{
	driver=initialization();
	lp=new LoginPage(driver);
	bln=new BasketlumpsumNetBanking(driver);
    bso=new BasketSipOrder(driver);
    
   // bso=new Basketsiporder(driver);
     ba=new BasketAction();
	}
	
	@Test(groups="Regression")
	public static void clickonSigninPage() throws Exception
	{
	PropertyConfigurator.configure("log4j.properties");
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
		
		
		BasketSipOrder.click_SIP();
	
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"clickoninvest"})
	public static void select_startdate() throws InterruptedException
	{
		
		
		BasketSipOrder.clickon_StartDate();
	
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"select_startdate"})
	public static void Clickon_Confrim() throws InterruptedException
	{
		
		
		BasketSipOrder.Clickon_confrim();
	
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_Confrim"})
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
			BasketSipOrder.Order_Place_popup();
			//DBconnection.Connectsql(null);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"RedirectNetbankingurl"})	
	public static void Clickon_cancelsmartsiporder() throws Exception
	{
		
		BasketAction.cancelsmartsiporder();
	}
	

	@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_cancelsmartsiporder"})	
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
