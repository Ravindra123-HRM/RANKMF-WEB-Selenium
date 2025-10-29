package com.Test.PartnersRankmf;

<<<<<<< HEAD
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
=======
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
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
<<<<<<< HEAD
	public static void Brokeraged() throws InterruptedException
=======
	public static void Brokerage() throws InterruptedException
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
	{
		
		Partners_ActiveRateCard.Brokerage();
		
	
	}
	/*@Test(groups= {"Regression"},dependsOnMethods= {"Brokerage"})
	public static void Reports() throws InterruptedException, AWTException
	{
		
		Partners_ActiveRateCard.Reports();
		
	
	}*/
<<<<<<< HEAD
	@Test(groups= {"Regression"},dependsOnMethods= {"Brokeraged"})
=======
	@Test(groups= {"Regression"},dependsOnMethods= {"Brokerage"})
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
	public static void Search_AMC() throws InterruptedException, AWTException
	{
		
		Partners_ActiveRateCard.SearchAMC();
		
	
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Search_AMC"})
	public static void AmountInvest() throws InterruptedException, AWTException
	{
		
		Partners_ActiveRateCard.investAmount();
	
	}
<<<<<<< HEAD
	/*@Test(groups= {"Regression"},dependsOnMethods= {"AmountInvest"})
	public static void Brokerages() throws InterruptedException, AWTException
	{
		Partners_ActiveRateCardTest.Brokeraged();
		//Partners_ActiveRateCardTest.Reports();
	
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Brokerages"})
	public static void SchemeType_SubSchemeType() throws InterruptedException, AWTException
	{

		Partners_ActiveRateCard.SchemeTypeAndSubSchemeType();
	
	}*/
=======
	@Test(groups= {"Regression"},dependsOnMethods= {"AmountInvest"})
	public static void SchemeType_SubSchemeType() throws InterruptedException, AWTException
	{
		Partners_ActiveRateCardTest.Brokerage();
		//Partners_ActiveRateCardTest.Reports();
		Partners_ActiveRateCard.SchemeTypeAndSubSchemeType();
	
	}
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6

	



}
