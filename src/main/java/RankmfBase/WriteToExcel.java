package RankmfBase;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.Test.RANKMFSELENIUM.NormalLumpsumOrder_Netbanking;

import utility.XLUtility;


public class WriteToExcel extends TestBase{
	
	
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	 public XSSFRow row;
 public XSSFSheet sheet;
	 public XSSFCell cell;
	 public CellStyle style;
	
public  void ReadExcel  () throws Exception
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
	WebElement h = driver.findElement(By.xpath("//div[@id='fund_list_id']"));
	
	int row=h.findElements(By.xpath("//div[@class='fund_name col l7']")).size();
	int rows=t.findElements(By.xpath("tr")).size();
	
	
	
	 List<WebElement> schemename = driver.findElements(By.xpath("//div[@class='fund_name col l7']"));
     int schemename_count = schemename.size();
    
    
     for (int k = 1;k < schemename_count; k++) {
         // get cell text with getText()
    	// String schemenam = t.findElement(By.xpath("a["+k+"]")).getText();
    	  String schemenam = schemename.get(k).getText();
    	  xlutil.setCellData("Sheet1", k, 0, schemenam);
     System.out.println("The scheme name is: " +schemenam);
     
     }
   
   
    for (int k = 1;k <= rows; k++) {
    	
    			
        // get cell text with getText()
   	  String schemenam = t.findElement(By.xpath("tr["+k+"]/td[1]")).getText();
   	  String rank = t.findElement(By.xpath("tr["+k+"]/td[2]")).getText();
      String NAV = t.findElement(By.xpath("tr["+k+"]/td[7]")).getText();
      String ONEYRS = t.findElement(By.xpath("tr["+k+"]/td[8]")).getText();
      String THREEYRS = t.findElement(By.xpath("tr["+k+"]/td[9]")).getText();
      String FIVEYRS = t.findElement(By.xpath("tr["+k+"]/td[10]")).getText();
      String Inception = t.findElement(By.xpath("tr["+k+"]/td[11]")).getText();
      

    
    System.out.println("The scheme name is: " +rank+NAV+ONEYRS+THREEYRS+FIVEYRS+Inception);
    xlutil.setCellData("Sheet1", k, 0, schemenam);
    xlutil.setCellData("Sheet1", k, 1, rank);
    xlutil.setCellData("Sheet1", k, 2, NAV);
    xlutil.setCellData("Sheet1", k, 3, ONEYRS);
    xlutil.setCellData("Sheet1", k, 4, THREEYRS);
    xlutil.setCellData("Sheet1", k, 5, FIVEYRS);
    xlutil.setCellData("Sheet1", k, 6, Inception);
    
   
    
   
    
    
    }
    XLUtility.ReadDataFromFormulaCell(); 
    
    
  
    
  }
 



}

        
        //Close the workbook
       
        

