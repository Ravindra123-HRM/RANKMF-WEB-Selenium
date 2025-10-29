package com.Test.Rankmfselenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Test.RANKMFSELENIUM.BasketAction;
import com.Test.RANKMFSELENIUM.LoginPage;
import com.Test.RANKMFSELENIUM.SearchRankMFScheme;
import com.Test.RANKMFSELENIUM.TimerSTP;

import RankmfBase.TestBase;
import utility.Constant;

public class ExploreNewPageTest extends TestBase{
	static LoginPage lp;
	   
    static BasketAction ba;
    static NewExplorePage ne;
   
	
	
	@BeforeClass
	public static void SetInitialization() throws Exception
	{
		driver=initialization();
		
		lp=new LoginPage(driver);
	  
        ba=new BasketAction();
        ne=new NewExplorePage(driver);
      
      		
	} 
	@Test(groups="Regression")
	public static void clickonSigninPage() throws Exception
	{
	PropertyConfigurator.configure("log4j.properties");
	LoginPage.clicklogintest();

	LoginPage.loginpage(Constant.Username, Constant.password);
		
		//HomepageTest.TotalInvestmentvalue();
	

	
    } 
	@Test(groups={"Regression"},dependsOnMethods= {"clickonSigninPage"})

	public static void Click_Explorerankmf() throws Exception
	{
		NewExplorePage.click_ExploreAll_MF_Ranks();
		
	}
	@Test(groups={"Regression"},dependsOnMethods= {"Click_Explorerankmf"})

	public static void Click_Filter() throws Exception
	{
		NewExplorePage.Filters();
		
		
	}
	@Test(groups={"Regression"},dependsOnMethods= {"Click_Filter"})

	public static void Click_Myinvestment() throws Exception
	{
		NewExplorePage.select_transact_mode();
		NewExplorePage.click_ExploreAll_MF_Ranks();
		NewExplorePage.Filter();
	}
	@Test(groups={"Regression"},dependsOnMethods= {"Click_Myinvestment"})

	public static void Review_PaymentPage() throws Exception
	{
		
		NewExplorePage.click_Review_PaymentPage();
		
		
	}
	
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Review_PaymentPage"})
	public static void enterotpnum() throws Exception
	{
		try {
			NewExplorePage.EnterOtpnumber();
			//DBconnection.Connectsql(null);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
	}
	

}
