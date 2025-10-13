package com.Test.PartnersRankmf;

import java.awt.AWTException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Test.Partners.Rankmf.Selenium.PartnerCRMPanel;
import com.Test.Partners.Rankmf.Selenium.PartnerDashbaordPanel;
import com.Test.Partners.Rankmf.Selenium.Partners_ActiveRateCard;

import RankmfBase.PartnerTestBase;
import utility.Constant;





public class Partners_ActiveRateCardTest extends PartnerTestBase {
	
	
	
	
	static PartnerDashbaordPanel PDP;
	static PartnerCRMPanel PCP;
	static Partners_ActiveRateCard PARC;
	
	 
	
	@BeforeClass
	public static void setInitialization() throws Exception
	{
		driver=initialization();
		PDP=new PartnerDashbaordPanel(driver);
		PCP=new PartnerCRMPanel(driver);
		PARC=new Partners_ActiveRateCard(driver);
		
	} 
	
	@Test(groups="Regression")

	public static void ClickonSigninPage() throws Exception
	{
		PartnerDashbaordPanel.LoginButton();
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"ClickonSigninPage"})
	public static void clickonLoginpage() throws InterruptedException
	{
		
		PartnerDashbaordPanel.Loginpage(Constant.clientuser, Constant.starpassword);
		
	
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"clickonLoginpage"})
	public static void DashbaordPage() throws InterruptedException
	{
		
		PartnerDashbaordPanel.Dashboardpage();
		
	
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"DashbaordPage"})
	public static void Brokerage() throws InterruptedException
	{
		
		Partners_ActiveRateCard.Brokerage();
		
	
	}
	/*@Test(groups= {"Regression"},dependsOnMethods= {"Brokerage"})
	public static void Reports() throws InterruptedException, AWTException
	{
		
		Partners_ActiveRateCard.Reports();
		
	
	}*/
	@Test(groups= {"Regression"},dependsOnMethods= {"Brokerage"})
	public static void Search_AMC() throws InterruptedException, AWTException
	{
		
		Partners_ActiveRateCard.SearchAMC();
		
	
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Search_AMC"})
	public static void AmountInvest() throws InterruptedException, AWTException
	{
		
		Partners_ActiveRateCard.investAmount();
	
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"AmountInvest"})
	public static void SchemeType_SubSchemeType() throws InterruptedException, AWTException
	{
		Partners_ActiveRateCardTest.Brokerage();
		//Partners_ActiveRateCardTest.Reports();
		Partners_ActiveRateCard.SchemeTypeAndSubSchemeType();
	
	}

	



}
