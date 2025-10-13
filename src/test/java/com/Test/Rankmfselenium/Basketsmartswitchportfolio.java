package com.Test.Rankmfselenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Test.RANKMFSELENIUM.BasketAction;
import com.Test.RANKMFSELENIUM.BasketlumpsumNetBanking;
import com.Test.RANKMFSELENIUM.BasketSipOrder;
import com.Test.RANKMFSELENIUM.NormalSmartSipOrder;
import com.Test.RANKMFSELENIUM.HomepageTest;
import com.Test.RANKMFSELENIUM.LoginPage;

import RankmfBase.TestBase;
import utility.Constant;

import com.Test.RANKMFSELENIUM.SmartSwitchportfolio;

public class Basketsmartswitchportfolio  extends TestBase {
		
		static LoginPage lp;
	    static BasketlumpsumNetBanking dsl;
		static BasketSipOrder bso;
	    static BasketAction ba;
		static NormalSmartSipOrder dbs;
		static SmartSwitchportfolio ssp;

		
		@BeforeClass
		public static void setInitialization() throws Exception
		{
			driver=initialization();
			lp=new LoginPage(driver);
		    dsl=new BasketlumpsumNetBanking(driver);
	        bso=new BasketSipOrder(driver);
	        dbs=new NormalSmartSipOrder(driver);
	        ssp=new SmartSwitchportfolio(driver);
	        ba=new BasketAction();
			
		} 
		
		@Test(groups="Regression")

		public static void ClickonSigninPage() throws Exception
		{
			
			LoginPage.clicklogintest();
			LoginPage.smartswitchlogin(Constant.Username, Constant.password);
			
		}
		@Test(groups= {"Regression"},dependsOnMethods= {"ClickonSigninPage"})

		public static void ClickonEvaluateportfolio() throws Exception
		{
			SmartSwitchportfolio.Evaluateportfolio();
			
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"ClickonEvaluateportfolio"})

		public static void Clickon_uploadbtn() throws Exception
		{
			SmartSwitchportfolio.clickon_uploadbtn();
			
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_uploadbtn"})

		public static void Clickon_portfolio() throws Exception
		{
			SmartSwitchportfolio.clickon_portfolio();
			
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_portfolio"})

		public static void uploadcasfile() throws Exception
		{
			SmartSwitchportfolio.upload_casfile();
			
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"uploadcasfile"})

		public static void Clickon_browse() throws Exception
		{
			SmartSwitchportfolio.clickon_browse();
			
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_browse"})

		public static void Checkdetails_portfolioanalysis() throws Exception
		{
			SmartSwitchportfolio.checkdetails_portfolioanalysis();
			
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"Checkdetails_portfolioanalysis"})

		public static void Click_proceedbutton() throws Exception
		{
			
			SmartSwitchportfolio.click_proceedbutton();
			
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"Click_proceedbutton"})

		public static void Click_initiateswitch() throws Exception
		{
			
			SmartSwitchportfolio.click_initiateswitch();
			
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"Click_initiateswitch"})	
		public static void check_enterotpnum() throws Exception
		{
			
			 BasketAction.EnterOTPsmartswitch();
		} 

		@Test(groups= {"Regression"},dependsOnMethods= {"check_enterotpnum"})	
		public static void Click_submitOtpBtn() throws Exception
		{
			
			SmartSwitchportfolio.click_submitOtpBtn();
		} 
		
		@Test(groups= {"Regression"},dependsOnMethods= {"Click_submitOtpBtn"})	
		public static void Click_logoutbtn() throws Exception
		{
			
			SmartSwitchportfolio.click_logoutbtn();
		} 
		
		


}
