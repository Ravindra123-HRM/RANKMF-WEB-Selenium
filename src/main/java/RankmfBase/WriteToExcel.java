package RankmfBase;


import java.io.IOException;

import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;



import utility.XLUtility;


public class WriteToExcel extends TestBase{
	
public  void ReadExcel  () throws IOException
{

	 //File file =    new File("C:\\Users\\samco\\eclipse-workspace\\RankmfwebApplication\\src\\main\\java\\RankmfBase\\TestData.xlsx");
	
	
	 String path="C:\\Users\\samco\\eclipse-workspace\\RankmfwebApplication\\src\\main\\java\\RankmfBase\\DataFiles.xlsx";
	
     //Create an object of FileInputStream class to read excel file
     //FileInputStream inputStream = new FileInputStream(file);
	 XLUtility xlutil=new XLUtility(path);
	 xlutil.setCellData("Sheet1", 0, 0, "FundsName");
	 xlutil.setCellData("Sheet1", 0, 1, "Rank");
	 xlutil.setCellData("Sheet1", 0, 2, "NAVs");
	 xlutil.setCellData("Sheet1", 0, 3, "ONE_YEAR");
	 xlutil.setCellData("Sheet1", 0, 4, "Three_Year");
	 xlutil.setCellData("Sheet1", 0, 5, "Five_Year");
	 xlutil.setCellData("Sheet1", 0, 6, "SinceInception");
     
     
     
			
	
	
	WebElement t = driver.findElement(By.xpath("//div[@id='fund_list_id']//tbody"));
	int rows=t.findElements(By.xpath("tr")).size();
	//List<WebElement> schemename = driver.findElements(By.xpath("//div[@class='fund_name col l7']"));
    //int schemename_count = schemename.size();
   
   
    for (int k = 1;k <= rows; k++) {
    			
        // get cell text with getText()
   	  String schemenam = t.findElement(By.xpath("tr["+k+"]/td[1]")).getText();
   	  String rank = t.findElement(By.xpath("tr["+k+"]/td[2]")).getText();
      String NAV = t.findElement(By.xpath("tr["+k+"]/td[7]")).getText();
      String ONEYRS = t.findElement(By.xpath("tr["+k+"]/td[8]")).getText();
      String THREEYRS = t.findElement(By.xpath("tr["+k+"]/td[9]")).getText();
      String FIVEYRS = t.findElement(By.xpath("tr["+k+"]/td[10]")).getText();
      String Inception = t.findElement(By.xpath("tr["+k+"]/td[11]")).getText();
      

    
    System.out.println("The scheme name is: " +schemenam+rank+NAV+ONEYRS+THREEYRS+FIVEYRS+Inception);
    xlutil.setCellData("Sheet1", k, 0, schemenam);
    xlutil.setCellData("Sheet1", k, 1, rank);
    xlutil.setCellData("Sheet1", k, 2, NAV);
    xlutil.setCellData("Sheet1", k, 3, ONEYRS);
    xlutil.setCellData("Sheet1", k, 4, THREEYRS);
    xlutil.setCellData("Sheet1", k, 5, FIVEYRS);
    xlutil.setCellData("Sheet1", k, 6, Inception);
    
    
    
    }
       
    
    /*List<WebElement> rank = driver.findElements(By.xpath("//tbody//td[2]"));
    int rank_count = rank.size();
   
   
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
 for (int k = 0;k < sinceinception; k++) {
     // get cell text with getText()
	 String sinceincept = Inception.get(k).getText();
	    	 System.out.println("Since Inception: "+sinceincept);
	    	 System.out.println("Since Inception: "+sinceinception);
	    	 

		 }  */

	
        //set the ChromeDriver path
    
        //Create an object of File class to open xlsx file
       	
      //Creating an object of ChromeDriver
     


			//Identify the WebElements for the student registration form
			



			//iterate over all the rows in Excel and put data in the form.
			
		}
}

        
        //Close the workbook
       
        

