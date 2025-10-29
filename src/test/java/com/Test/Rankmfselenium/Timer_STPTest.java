package com.Test.Rankmfselenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Test.RANKMFSELENIUM.BasketAction;
import com.Test.RANKMFSELENIUM.BasketSipOrder;
import com.Test.RANKMFSELENIUM.BasketlumpsumNetBanking;
import com.Test.RANKMFSELENIUM.LoginPage;
import com.Test.RANKMFSELENIUM.NormalLumpsumOrder_Netbanking;
import com.Test.RANKMFSELENIUM.NormalSipOrder;
import com.Test.RANKMFSELENIUM.NormalSmartSipOrder;
import com.Test.RANKMFSELENIUM.StepUpSipOrderAmount;
import com.Test.RANKMFSELENIUM.TimerSTP;

import RankmfBase.TestBase;

public class Timer_STPTest extends TestBase {
	
	static LoginPage lp;
    static BasketlumpsumNetBanking dsl;
	static BasketSipOrder bso;
    static BasketAction ba;
	static NormalSmartSipOrder dbs;
	static NormalSipOrder dns;
	static StepUpSipOrderAmount stp;
	static TimerSTP tstp;

	
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
        tstp=new TimerSTP(driver);
		
	} 
	
	@Test(groups="Regression")
	public static void clickonSigninPage() throws Exception
	{
	PropertyConfigurator.configure("log4j.properties");
		LoginPage.clicklogintest();

		LoginPage.loginpage(pro.getProperty("Username"), pro.getProperty("password"));
		
		//HomepageTest.TotalInvestmentvalue();
	

	
    } 
	/*@Test(groups={"Regression"},dependsOnMethods= {"clickonSigninPage"})

	public static void Click_HomePage() throws Exception
	{
		TimerSTP.click_HomePage();
		
		
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Click_HomePage"})

	public static void Search_Mutualfund() throws Exception
	{
		TimerSTP.Click_SearchMutualfunds();
		
		
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Search_Mutualfund"})

	public static void Timer_STPButton() throws Exception
	{
		TimerSTP.TSTP();
		
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Timer_STPButton"})

	public static void Select_folio() throws Exception
	{
	
		TimerSTP.Select_Folio();
		
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Select_folio"})

	public static void Investor_details() throws Exception
	{
	
		TimerSTP.placeofbirth();
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Investor_details"})

	public static void Nominee() throws Exception
	{
	
		TimerSTP.Nominee();
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Nominee"})

	public static void Scheme_page() throws Exception
	{
	
		TimerSTP.SchemePage();
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Scheme_page"})

	public static void Payment_page() throws Exception
	{
	
		TimerSTP.Paymentpage();
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Payment_page"})

	public static void Registered_STP() throws Exception
	{
	
		TimerSTP.Already_Registered_STP();
		
	}*/
	
	@Test(groups= {"Regression"},dependsOnMethods= {"clickonSigninPage"})

	public static void folio_orderNotcomplete() throws Exception
	{
	
		TimerSTP.Registered_folio_orderNotcomplete();
		
	}
	
	
	
	
	
	

}
