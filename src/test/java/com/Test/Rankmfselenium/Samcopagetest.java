package com.Test.Rankmfselenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.Test.RANKMFSELENIUM.Samco_MF_Website;

import RankmfBase.TestBase;

public class Samcopagetest extends TestBase  {
	
	
	
	@BeforeClass
	public void  SetInitialization() throws Exception
	{
	//driver=initialization();
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
		//Thread.sleep(5000);
		
		 //driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);
	   //  driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.get("https://www.samcomf.com/");
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");*/
		
	
	
    
  
	}
	
	@Test
	public static void page() throws InterruptedException
	{
		Samco_MF_Website.samcopage();
		//driver.close();
		
		
	}

}
