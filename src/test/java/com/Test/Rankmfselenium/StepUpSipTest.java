package com.Test.Rankmfselenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Test.RANKMFSELENIUM.BasketAction;
import com.Test.RANKMFSELENIUM.BasketSipOrder;
import com.Test.RANKMFSELENIUM.BasketlumpsumNetBanking;
import com.Test.RANKMFSELENIUM.DatepickerCalender;
import com.Test.RANKMFSELENIUM.HomepageTest;
import com.Test.RANKMFSELENIUM.LoginPage;
import com.Test.RANKMFSELENIUM.LogoutPageTest;
import com.Test.RANKMFSELENIUM.NormalLumpsumOrder_Netbanking;
import com.Test.RANKMFSELENIUM.NormalSipOrder;
import com.Test.RANKMFSELENIUM.NormalSmartSipOrder;
import com.Test.RANKMFSELENIUM.StepUpSipOrderAmount;
import com.Test.RANKMFSELENIUM.StepUpSipOrderPercentage;

import RankmfBase.TestBase;

public class StepUpSipTest extends TestBase {
	
	
	static LoginPage lp;
    static BasketlumpsumNetBanking dsl;
	static BasketSipOrder bso;
    static BasketAction ba;
	static NormalSmartSipOrder dbs;
	static NormalSipOrder dns;
	static StepUpSipOrderAmount stp;

	
	@BeforeClass
	public static void SetInitialization() throws Exception
	{
		driver=initialization();
		
		lp=new LoginPage(driver);
	    dsl=new BasketlumpsumNetBanking(driver);
        bso=new BasketSipOrder(driver);
        dbs=new NormalSmartSipOrder(driver);
        dns=new NormalSipOrder(driver);
        ba=new BasketAction();
        stp=new StepUpSipOrderAmount(driver);
		
	} 
	
	@Test(groups="Regression")
	public static void clickonSigninPage() throws Exception
	{
	PropertyConfigurator.configure("log4j.properties");
		LoginPage.clicklogintest();

		LoginPage.loginpage(pro.getProperty("Username"), pro.getProperty("password"));
		
		//HomepageTest.TotalInvestmentvalue();
	

	
    } 
	@Test(groups={"Regression"},dependsOnMethods= {"clickonSigninPage"})

	public static void Click_HomePage() throws Exception
	{
		NormalLumpsumOrder_Netbanking.click_HomePage();
		
		
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Click_HomePage"})

	public static void Search_Mutualfund() throws Exception
	{
		StepUpSipOrderAmount.Click_SearchMutualfunds();
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Search_Mutualfund"})

	public static void click_INVEST() throws Exception
	{
		StepUpSipOrderAmount.StepUp_Sip();
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"click_INVEST"})

	public static void click_InvestNowpopup() throws Exception
	{
	
		StepUpSipOrderAmount.InvestNowpopup();
		
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"click_InvestNowpopup"})
	public static void Installementdate() throws Exception
	{
		DatepickerCalender.Clickon_Calender();
		
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Installementdate"})
	public static void InstallementStartdate() throws Exception
	{
		NormalSmartSipOrder.startdatepicker();
	
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"InstallementStartdate"})
	public static void Click_Continue() throws Exception
	{
		StepUpSipOrderAmount.click_Continue();
	
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Click_Continue"})	
	public static void check_VerifyOTP() throws Exception
	{
		NormalSipOrder.click_Normalsipotp();
		
	}	
	@Test(groups= {"Regression"},dependsOnMethods= {"check_VerifyOTP"})	
	public static void check_enterotpnum() throws Exception
	{
		
		NormalSipOrder.enterotpnumber();
	}  
	@Test(groups= {"Regression"},dependsOnMethods= {"check_enterotpnum"})	
	public static void Clickon_confirmcontinue() throws Exception
	{
		
		NormalSipOrder.confirmandplaceorder();
	}	
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_confirmcontinue"})	
	public static void 	FetchOrderPlaceText_NormalSIP() throws Exception
	{
		
		BasketAction.FetchSchemeSucessOrder();
	}
	
	
	
	
	
	@Test(groups= {"Regression"},dependsOnMethods= {"FetchOrderPlaceText_NormalSIP"})	
	public static void Clickon_logout() throws Exception
	{
		
		LogoutPageTest.profile_logout();
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_logout"})	
	public static void Click_logoutbtn() throws Exception
	{
		
		LogoutPageTest.click_logoutbtn();
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Click_logoutbtn"})
	public static void clickonSigninPage1() throws Exception
	{
	PropertyConfigurator.configure("log4j.properties");
		LoginPage.clicklogintest();

		LoginPage.loginpage(pro.getProperty("Username"), pro.getProperty("password"));
		
		//HomepageTest.TotalInvestmentvalue();
	

	
    } 
	
	@Test(groups= {"Regression"},dependsOnMethods= {"clickonSigninPage1"})
	public static void 	FetchOrderPlaceText_InvestNowPopupPercentage() throws Exception
	{
		NormalLumpsumOrder_Netbanking.click_HomePage();
		StepUpSipOrderAmount.Click_SearchMutualfunds();
		StepUpSipOrderAmount.StepUp_Sip();
		StepUpSipOrderPercentage.InvestNowPopupPercentage();
		DatepickerCalender.Clickon_Calender();
		NormalSmartSipOrder.startdatepicker();
		StepUpSipOrderAmount.click_Continue();
		NormalSipOrder.click_Normalsipotp();
		NormalSipOrder.enterotpnumber();
		NormalSipOrder.confirmandplaceorder();
		BasketAction.FetchSchemeSucessOrder();
		LogoutPageTest.profile_logout();
		LogoutPageTest.click_logoutbtn();
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"FetchOrderPlaceText_InvestNowPopupPercentage"})

	public static void driver_close()
	{
		
		driver.close();
	}
	
	
	
	

	




}
