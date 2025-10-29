package com.Test.Rankmfselenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Test.RANKMFSELENIUM.DatepickerCalender;
import com.Test.RANKMFSELENIUM.HistoricalDataReport;
import com.Test.RANKMFSELENIUM.NSEformDownload;

import RankmfBase.TestBase;

public class HistoricalDataPagetest extends TestBase {
	@BeforeClass
	public  void SetInitialization() throws Exception
	{
		pro=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\ravindra.chavan\\Downloads\\RankmfwebApplication\\src\\main\\java\\RankmfBase\\configproperties");
		
		pro.load(fis);
		
		String Browsername=pro.getProperty("chrome");
		
		if(Browsername.equals("chromedriver"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ravindra.chavan\\Downloads\\RankmfwebApplication\\chromedriver-win64\\chromedriver.exe");
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
		driver.get("https://www.niftyindices.com/reports/historical-data");
	
		
	
	
	}
	
	@Test(groups="Regression")

	public static void Clickonurl() throws Exception
	{
		HistoricalDataReport.Click_Index_Type();
		
	}
	
	


}
