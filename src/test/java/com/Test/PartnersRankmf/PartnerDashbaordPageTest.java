package com.Test.PartnersRankmf;

<<<<<<< HEAD
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
=======
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Test.Partners.Rankmf.Selenium.PartnerCRMPanel;
import com.Test.Partners.Rankmf.Selenium.PartnerDashbaordPanel;
import com.Test.RANKMFSELENIUM.BasketlumpsumNetBanking;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import RankmfBase.PartnerTestBase;
import utility.Constant;


public class PartnerDashbaordPageTest extends PartnerTestBase {
	
	
	static PartnerDashbaordPanel PDP;
	static PartnerCRMPanel PCP;
	
	 
	
	@BeforeClass
	public static void setInitialization() throws Exception
	{
		driver=initialization();
		PDP=new PartnerDashbaordPanel(driver);
		PCP=new PartnerCRMPanel(driver);
		
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
	public static void CRM_Tab() throws InterruptedException
	{
		
		PartnerCRMPanel.CRM();
		
	
	}
	
	
	

}
