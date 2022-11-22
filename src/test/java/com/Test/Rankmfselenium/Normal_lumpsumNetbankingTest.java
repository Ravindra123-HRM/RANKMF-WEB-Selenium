package com.Test.Rankmfselenium;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Test.RANKMFSELENIUM.BasketAction;
import com.Test.RANKMFSELENIUM.BasketSipOrder;
import com.Test.RANKMFSELENIUM.BasketlumpsumNetBanking;
import com.Test.RANKMFSELENIUM.HomepageTest;
import com.Test.RANKMFSELENIUM.LoginPage;
import com.Test.RANKMFSELENIUM.LogoutPageTest;
import com.Test.RANKMFSELENIUM.NormalLumpsumOrder_Netbanking;
import com.Test.RANKMFSELENIUM.NormalSipOrder;
import com.Test.RANKMFSELENIUM.NormalSmartSipOrder;

import RankmfBase.TestBase;

public class Normal_lumpsumNetbankingTest extends TestBase {
	static LoginPage lp;
    static BasketlumpsumNetBanking dsl;
	static BasketSipOrder bso;
    static BasketAction ba;
	static NormalSmartSipOrder dbs;
	static NormalSipOrder dns;
	static NormalLumpsumOrder_Netbanking bln;

	
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
        bln=new NormalLumpsumOrder_Netbanking(driver);
		
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
		NormalLumpsumOrder_Netbanking.Click_SearchMutualfunds();
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Search_Mutualfund"})

	public static void click_INVEST() throws Exception
	{
		NormalLumpsumOrder_Netbanking.click_Invest();
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"click_INVEST"})

	public static void Select_PaymentMode() throws Exception
	{
		NormalLumpsumOrder_Netbanking.select_paymentmode();
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Select_PaymentMode"})

	public static void Click_VerifyOTP() throws Exception
	{
		NormalLumpsumOrder_Netbanking.clickonVerifyOTP();
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Click_VerifyOTP"})
	public static void enterotpnum() throws Exception
	{
		try {
			BasketAction.Enter_OTP();
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
			BasketlumpsumNetBanking.Alertpopup_NetbankingNormal();
			//DBconnection.Connectsql(null);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	


}
