package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import RankmfBase.TestBase;

public class ExcelUtils  {
	
	private Sheet sheet;
	public  ExcelUtils(String excelpath,String SheetName) throws IOException
	{
		FileInputStream fis=new FileInputStream(excelpath);
		 Workbook workbook = new XSSFWorkbook(fis);
	     sheet = workbook.getSheet(SheetName);
		
		
	}
	

		// TODO Auto-generated constructor stub
	

	public int getRowCount()
	{
		return sheet.getPhysicalNumberOfRows();
		
		
	}
	public String getcellData(int row, int col)
	{
		Row r=sheet.getRow(row);
		Cell c = r.getCell(col);
		return c.getStringCellValue();
		
		
		
	}

}
