package com.Test.RANKMFSELENIUM;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import RankmfBase.TestBase;

public class SearchRankMFScheme extends TestBase {
	
	public SearchRankMFScheme(WebDriver driver)
    {

    	PageFactory.initElements(driver, this);
    	
    }
	
	public static void Explore_All_MF_Ranks()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // identify table
       /* WebElement t = driver.findElement(By.xpath("//div[@id='fund_list_id']//tbody//tr//td[1]"));
        // count rows with size() method
        List<WebElement> rws = t.findElements(By.tagName("tr"));
        int rws_cnt = rws.size();
        //iterate rows of table
        for (int i = 0;i < rws_cnt; i++) {
        	
        // count columns with size() method
        List<WebElement> cols = rws.get(i).findElements(By.tagName("td"));
        int cols_cnt = cols.size();
       
        //iterate cols of table
        for (int j = 0;j < cols_cnt; j++) {
        // get cell text with getText()
        String c = cols.get(j).getText();
        System.out.println("The cell value is: " + c);
        }*/
        
        
    
        
        
        List<WebElement> schemename = driver.findElements(By.xpath("//div[@class='fund_name col l7']"));
     int schemename_count = schemename.size();
    
    
     for (int k = 0;k < schemename_count; k++) {
         // get cell text with getText()
    	  String schemenam = schemename.get(k).getText();
     
     System.out.println("The scheme name is: " +schemenam);
     
     }
        
     
     List<WebElement> rank = driver.findElements(By.xpath("//span[@class='rank-datatable']"));
     int rank_count = schemename.size();
    
    
     for (int k1 = 0;k1 < rank_count; k1++) {
         // get cell text with getText()
    	  String schemenam1 = rank.get(k1).getText();
    	  System.out.println("The Rank is: " +schemenam1);
   
        
     }
     List<WebElement> MF_RATING = driver.findElements(By.xpath("//tbody//td[3]"));
     int mf_rating = MF_RATING.size();
    
    
     for (int k = 0;k < mf_rating; k++) {
         // get cell text with getText()
    	 String mf_ratings = MF_RATING.get(k).getText();
    	  System.out.println("The Rating is: " +mf_ratings);
   
        
     }
     
     List<WebElement> NAV = driver.findElements(By.xpath("//tbody//td[4]"));
   
    
   
     int NAVS=NAV.size();
     for (int k = 0;k < NAVS; k++) {
         // get cell text with getText()
    	
    	
    	
    	    	
    	    	 System.out.println("fund sahi hai: ");
    	    	 
 
    		 }
    
     List<WebElement> fund_galat = driver.findElements(By.xpath("//td[5]"));
     
     
     
     int fund_galat_hai=fund_galat.size();
     for (int k = 0;k < fund_galat_hai; k++) {
         // get cell text with getText()
    	
    	
    	
    	    	 String fund_galat_haii = NAV.get(k).getText();
    	    	 System.out.println("fund galat hai: "+fund_galat_haii);
    	    	
 
    		 }  
     
List<WebElement> NAV1 = driver.findElements(By.xpath("//td[7]"));
     
     
     
     int NAVS1=NAV1.size();
     for (int k = 0;k < NAVS1; k++) {
         // get cell text with getText()
    	
    	
    	
    	    	 String NAVI = NAV1.get(k).getText();
    	    	 System.out.println("The NAV is: "+NAVI);
    	    	 System.out.println("The NAV is: "+NAVS1);
    	    	 
 
    		 }  
List<WebElement> ONEYRS = driver.findElements(By.xpath("//td[8]"));
      int ONEYR=ONEYRS.size();
     for (int k = 0;k < ONEYR; k++) {
         // get cell text with getText()
    	 String ONEYEARS = ONEYRS.get(k).getText();
    	    	 System.out.println("ONE YEARS: "+ONEYEARS);
    	    	 System.out.println("ONE YEARS: "+ONEYR);
    	    	 
 
    		 }  
     
     List<WebElement> THREEYRS = driver.findElements(By.xpath("//td[9]"));
     int THREEYR=ONEYRS.size();
    for (int k = 0;k < THREEYR; k++) {
        // get cell text with getText()
   	 String THREEYEARS = THREEYRS.get(k).getText();
   	    	 System.out.println("THREE YEARS: "+THREEYEARS);
   	    	 System.out.println("THREE YEARS: "+THREEYR);
   	    	 

   		 }  
    
    
    List<WebElement> FIVEYRS = driver.findElements(By.xpath("//td[10]"));
    int FIVEYR=ONEYRS.size();
   for (int k = 0;k < FIVEYR; k++) {
       // get cell text with getText()
  	 String FIVEYEARS = FIVEYRS.get(k).getText();
  	    	 System.out.println("FIVE YEARS: "+FIVEYEARS);
  	    	 System.out.println("FIVE YEARS: "+FIVEYR);
  	    	 

  		 }  
   
   List<WebElement> Inception = driver.findElements(By.xpath("//td[11]"));
   int sinceinception=Inception.size();
  for (int k = 0;k < FIVEYR; k++) {
      // get cell text with getText()
 	 String sinceincept = Inception.get(k).getText();
 	    	 System.out.println("Since Inception: "+sinceincept);
 	    	 System.out.println("Since Inception: "+sinceinception);
 	    	 

 		 }  
     }

     
	}
   


        
       
        
        
        
        
       
        
	
        
	

