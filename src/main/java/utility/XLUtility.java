package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Test.RANKMFSELENIUM.NormalLumpsumOrder_Netbanking;

import RankmfBase.TestBase;



public  class XLUtility extends TestBase {
	
	
	public FileInputStream fi;
	public FileOutputStream fo;
	public static XSSFWorkbook workbook;
	 public XSSFRow row;
 public XSSFSheet sheet;
	 public XSSFCell cell;
	 public CellStyle style;
	static String path;
	static JavascriptExecutor js = (JavascriptExecutor) driver;
	static Actions a =new Actions(driver);
	static NormalLumpsumOrder_Netbanking bln;
	 public XLUtility(String path)
	{
		
		this.path=path;
	}
	
	public int getRowCount(String sheetName) throws IOException
	{
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		int rowcount=sheet.getLastRowNum();
		workbook.close();
		fi.close();
		return rowcount;
		
		
	}
	
	public int getCellCount(String sheetName,int rownum) throws IOException
	{
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		int cellcount=row.getLastCellNum();
		workbook.close();
		fi.close();
		return cellcount;
		
	
	}
	
	public String getCellData(String sheetName,int rownum,int colnm) throws IOException
	{
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnm);
		
		DataFormatter formatter=new DataFormatter();
		String data;
		try {
		data=formatter.formatCellValue(cell);
		}
		catch(Exception e) {data="";}
		workbook.close();
		fi.close();
		return data;
		
	
	}
	
	public void setCellData(String sheetName,int rownum,int colnm,String data ) throws IOException
	{
		
		
		File xlfile=new File(path);
		if(!xlfile.exists())
		{
			workbook=new XSSFWorkbook();
			fo=new FileOutputStream(path);
			workbook.write(fo);
			
		}
		
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		
		if(workbook.getSheetIndex(sheetName)==-1)
			workbook.createSheet(sheetName);
		sheet=workbook.getSheet(sheetName);
		
		if(sheet.getRow(rownum)==null)
          sheet.createRow(rownum);
		row=sheet.getRow(rownum);
		cell=row.createCell(colnm);
		cell.setCellValue(data);
		fo=new FileOutputStream(path);
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();
		
		
		
	}

	public static  void ReadDataFromFormulaCell() throws Exception
	{
		FileInputStream fi = new FileInputStream("C:\\Users\\samco\\eclipse-workspace\\RankmfwebApplication\\src\\main\\java\\RankmfBase\\DataFiles.xlsx");
		
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		XSSFRow row= sheet.getRow(0);
		XSSFCell cell=row.getCell(0);
		
		System.out.println(cell);
		System.out.println(sheet.getRow(2).getCell(0));
		XSSFCell Fundslist=sheet.getRow(2).getCell(0);
		String arrays=Fundslist.getStringCellValue();
		
			//a
			WebElement rows=driver.findElement(By.xpath("//div[@id='fund_list_id']//tbody//tr"));
			WebElement h = driver.findElement(By.xpath("//div[@class='customize_datatable hide_below_992']"));
			
		     js.executeScript("arguments[0].scrollIntoView();", rows);
			a.moveToElement(rows);
			      
			      
			 List<WebElement> schemename = driver.findElements(By.xpath("//div[@class='fund_name col l7']//a"));
			
						 for(WebElement cal:schemename)
				{
					String name=cal.getText();
					
					 if(name.equalsIgnoreCase("Samco Flexi Cap Fund - Regular Plan - Growth"))
					{
						cal.click();
						//Log.info("Date is selected");
						break;
						
					}
					//System.out.println(name);
					 System.out.println("The scheme name is: " +name);	
						System.out.println(" Read data from excel:");	
				}
   	
	    	 // xlutil.setCellData("Sheet1", k, 0, schemenam);
		   
		    	 
					
					fi.close();
		     }	 
			
			/*switch(cell.getCellTypeEnum())
			{
			case STRING:
			System.out.println(cell.getStringCellValue());
			break;
			case NUMERIC:
				System.out.println(cell.getNumericCellValue());
			break;
			case BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
			break;
		
			}*/
			
		
			

		
		
		
		
		
	}

	
	
	


