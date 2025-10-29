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
import com.Test.RANKMFSELENIUM.NormalSipOrder;
import com.Test.RANKMFSELENIUM.DatepickerCalender;
import com.Test.RANKMFSELENIUM.HomepageTest;
import com.Test.RANKMFSELENIUM.LoginPage;
import com.Test.RANKMFSELENIUM.LogoutPageTest;
import com.Test.RANKMFSELENIUM.NormalLumpsumOrder_Netbanking;

import RankmfBase.TestBase;

public class NormalSiporderTest extends TestBase {
	
	
		
		static LoginPage lp;
	    static BasketlumpsumNetBanking dsl;
		static BasketSipOrder bso;
	    static BasketAction ba;
		static NormalSmartSipOrder dbs;
		static NormalSipOrder dns;

		
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
		

		@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_TotalInvestmentvalue"})
		public static void Click_HomePage() throws Exception
		{
			NormalSipOrder.click_HomePage();
			
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"Click_HomePage"})
		public static void search_mutualfunds() throws Exception
		{
			NormalSipOrder.Click_SearchMutualfunds();
			
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"search_mutualfunds"})
		public static void Click_Normalsip() throws Exception
		{
			NormalSipOrder.click_Normalsip();
			
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"Click_Normalsip"})
		public static void Click_sipcontinuebtn() throws Exception
		{
			HomepageTest.click_sipcontinuebtn();
			
		}
		
	
		@Test(groups= {"Regression"},dependsOnMethods= {"Click_sipcontinuebtn"})
		public static void InstallementStartdate() throws Exception
		{
			DatepickerCalender.clickon_startdatesip();
			
			
			
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"InstallementStartdate"})
		public static void Startdatepicker() throws Exception
		{
			DatepickerCalender.start_datepicker();
			
		}
		@Test(groups= {"Regression"},dependsOnMethods= {"Startdatepicker"})
		public static void Click_continuebtn() throws Exception
		{
			
			NormalSipOrder.click_continuebtn();
			
			
		}
		@Test(groups= {"Regression"},dependsOnMethods= {"Click_continuebtn"})	
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
			
			BasketAction.fetchnormalpalcedorder();
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"FetchOrderPlaceText_NormalSIP"})	
		public static void Clickon_skipstep() throws Exception
		{
			
			NormalSipOrder.skipstep();
		}	
		
		@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_skipstep"})	
		public static void Clickon_cancelsmartSiporder() throws Exception
		{
			
			BasketAction.cancelsmartsiporder();
		}
		

		@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_cancelsmartSiporder"})	
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
