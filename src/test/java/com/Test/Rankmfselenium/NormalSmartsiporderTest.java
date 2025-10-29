package com.Test.Rankmfselenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Test.RANKMFSELENIUM.BasketAction;
import com.Test.RANKMFSELENIUM.BasketlumpsumNetBanking;
import com.Test.RANKMFSELENIUM.BasketSipOrder;
import com.Test.RANKMFSELENIUM.NormalSmartSipOrder;
import com.Test.RANKMFSELENIUM.HomepageTest;
import com.Test.RANKMFSELENIUM.LoginPage;
import com.Test.RANKMFSELENIUM.LogoutPageTest;

import RankmfBase.TestBase;

public class NormalSmartsiporderTest extends TestBase {
	
	static LoginPage lp;
    static BasketlumpsumNetBanking dsl;
	static BasketSipOrder bso;
    static BasketAction ba;
	static NormalSmartSipOrder dbs;

	
	@BeforeClass
	public static void SetInitialization() throws Exception
	{
		driver=initialization();
		
		lp=new LoginPage(driver);
	    dsl=new BasketlumpsumNetBanking(driver);
        bso=new BasketSipOrder(driver);
        dbs=new NormalSmartSipOrder(driver);
        ba=new BasketAction();
		
	} 
	
	@Test(groups="Regression")

	public static void ClickonSigninPage() throws Exception
	{
		BasketlumpsumOrderNetBankingTest.clickonSigninPage();
		
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"ClickonSigninPage"})

	public static void Clickon_TotalInvestmentvalue() throws Exception
	{
		HomepageTest.TotalInvestmentvalue();
		
	}
	
	/*@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_TotalInvestmentvalue"})
	public  void Click_HomePage() throws Exception
	{
		NormalSmartSipOrder.click_HomePage();
		
	}*/
	
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_TotalInvestmentvalue"})
	public static void Click_Investsmartsip() throws Exception
	{
		NormalSmartSipOrder.click_Investsmartsip();
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Click_Investsmartsip"})
	public static void Click_SmartSip() throws Exception
	{
		NormalSmartSipOrder.CLICK_smartsip();
		
		
	}

	@Test(groups= {"Regression"},dependsOnMethods= {"Click_SmartSip"})
	public static void click_continue() throws Exception
	{
		NormalSmartSipOrder.click_continue();
		
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"click_continue"})
	public static void Installementdate() throws Exception
	{
		NormalSmartSipOrder.Installementdate();
		
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Installementdate"})
	public static void InstallementStartdate() throws Exception
	{
		NormalSmartSipOrder.startdatepicker();
	
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"InstallementStartdate"})
	public static void Clickalert() throws Exception
	{
		NormalSmartSipOrder.clickalert();
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Clickalert"})	
	public static void check_VerifyOTP() throws Exception
	{
		
		NormalSmartSipOrder.click_smartsipotp();
	}	
	@Test(groups= {"Regression"},dependsOnMethods= {"check_VerifyOTP"})	
	public static void check_enterotpnum() throws Exception
	{
		
		 BasketAction.EnterOtpnumber();
	}  
	@Test(groups= {"Regression"},dependsOnMethods= {"check_enterotpnum"})	
	public static void Clickon_confirmcontinue() throws Exception
	{
		
		NormalSmartSipOrder.confirmcontinue();
	}	
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_confirmcontinue"})	
	public static void FetchOrderPlaceText_SmartSIP() throws Exception
	{
		
		BasketAction.fetchsmartsippalcedorder();
	}	
	
	
	
	@Test(groups= {"Regression"},dependsOnMethods= {"FetchOrderPlaceText_SmartSIP"})	
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
