package com.Test.Rankmfselenium;


import org.apache.log4j.PropertyConfigurator;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Test.RANKMFSELENIUM.BasketAction;

import com.Test.RANKMFSELENIUM.LoginPage;

import com.Test.RANKMFSELENIUM.SearchRankMFScheme;
import com.Test.RANKMFSELENIUM.TimerSTP;


import RankmfBase.TestBase;
import RankmfBase.WriteToExcel;

public class SearchRankmfSchemelistTest extends TestBase {
	static LoginPage lp;
   
    static BasketAction ba;
    static TimerSTP tstp;
    static SearchRankMFScheme SRMF;
	
	
	@BeforeClass
	public static void SetInitialization() throws Exception
	{
		driver=initialization();
		
		lp=new LoginPage(driver);
	  
        ba=new BasketAction();
        tstp=new TimerSTP(driver);
        SRMF=new SearchRankMFScheme(driver);
      		
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

	public static void Click_Explorerankmf() throws Exception
	{
		TimerSTP.click_HomePage();
		
		
	}
	@Test(groups={"Regression"},dependsOnMethods= {"Click_Explorerankmf"})

	public  void Click_HomePage() throws Exception
	{
		
		WriteToExcel writeToExcel = new WriteToExcel();
		writeToExcel.ReadExcel();
		
		
	}
	
		
		
		
		
		
	
	

}
