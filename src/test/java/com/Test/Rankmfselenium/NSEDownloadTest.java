package com.Test.Rankmfselenium;

import java.io.FileInputStream;
import java.time.LocalDate;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Test.RANKMFSELENIUM.DatepickerCalender;
import com.Test.RANKMFSELENIUM.HomepageTest;
import com.Test.RANKMFSELENIUM.NSEformDownload;

import RankmfBase.TestBase;

public class NSEDownloadTest extends TestBase {
	
	@BeforeClass
	public  void SetInitialization() throws Exception
	{
		pro=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\samco\\eclipse-workspace\\RANKMFSELENIUM\\src\\main\\java\\RankmfBase\\configproperties");
		
		pro.load(fis);
		
		String Browsername=pro.getProperty("chrome");
		
		if(Browsername.equals("chromedriver"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\samco\\eclipse-workspace\\RankmfwebApplication\\chromedriver.exe");
	       driver = new ChromeDriver();  
	      
			
		}
		
		else if(Browsername.equals("firefoxdriver"))
			{
			   System.setProperty("webdriver.firefox.driver","./Chrome/chromedriver.exe");
		       driver = new ChromeDriver();  
		       driver.manage().window().maximize(); 
				
			}
		driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);
	   //  driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.get("https://niftyindices.com/reports/historical-data");
		
	
	
	}
	
	@Test(groups="Regression")

	public static void Clickonurl() throws Exception
	{
		NSEformDownload.clickonReports();
		
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Clickonurl"})

	public static void Clickon_Marketdownloadcapital() throws Exception
	{
		NSEformDownload.clickonMarketdropdowncapital();
		
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_Marketdownloadcapital"})

	public static void Clickon_datepicker() throws Exception
	{
		DatepickerCalender.NSEdatepicker();
		
	}
	
	/*@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_datepicker"})

	public static void Clickon_submit() throws Exception
	{
		NSEformDownload.submitclick();
		
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Clickon_submit"})

	public static void Clickon_downloadlink() throws Exception
	{
		NSEformDownload.clickondownload();
		
	}*/
	
	

}
