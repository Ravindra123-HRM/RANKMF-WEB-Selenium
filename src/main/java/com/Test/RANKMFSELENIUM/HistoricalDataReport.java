package com.Test.RANKMFSELENIUM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import RankmfBase.TestBase;

public class HistoricalDataReport extends TestBase {
	
	@FindBy(xpath="//span[@id='HistoricalMenu']")
	static
	WebElement Archives_dailyreport;
	@FindBy(xpath="//select[@id='ArchiveDailyReport']")
	static
	WebElement INDICES_marketcapital;
	
	
	
	
	public HistoricalDataReport(WebDriver driver)
    {

    	PageFactory.initElements(driver, this);
    	
    }
	
	public static void Click_Index_Type() throws InterruptedException
	{
		//driver.navigate().refresh();
	    //Thread.sleep(2000);
	  //select[@id='ArchiveDailyReport']
		
	    String index=driver.findElement(By.xpath("//select[@id='ddlHistoricaltypee']")).getText();
	    System.out.println(index);
	    String type=driver.findElement(By.xpath("//select[@id='ddlHistoricaltypeeindex']")).getText();
	    for(int i=2;i<=100;i++)
	    {
	    	//for(int j=2;j<=100;j++)
	    	//{
	    		
	    driver.findElement(By.xpath("//select[@id='ddlHistoricaltypee']")).click();
	   // Thread.sleep(2000);
		Select a =new Select(driver.findElement(By.xpath("//select[@id='ddlHistoricaltypee']")));
		a.selectByIndex(i);

		 Thread.sleep(2000);
		WebElement typeeindex=driver.findElement(By.xpath("//select[@id='ddlHistoricaltypeeindex']"));
		typeeindex.click();
		//WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ddlHistoricaltypeeindex']")));
		// element.click();
		    Thread.sleep(5000);
		    
			Select b =new Select(driver.findElement(By.xpath("//select[@id='ddlHistoricaltypeeindex']")));
			//((JavascriptExecutor)b).executeScript("arguments[0].value='X'", b);
			b.selectByIndex(i);
			WebElement timeperiod=driver.findElement(By.xpath("//input[@id='datepickerFrom']"));
			Thread.sleep(2000);
			timeperiod.click();
			WebElement prev=driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/a[1]"));
			
			List<WebElement> month=driver.findElements(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]"));
			List<WebElement> year=driver.findElements(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]"));
			
			//for(int k=0;k<=20;k++)
			//{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")).click();
			//for(WebElement cal:month)
				//if(cal.equals("Jan"))
			
					
			Select c =new Select(driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")));
			c.selectByIndex(0);
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]")).click();
			//Thread.sleep(2000);
			WebElement submit=driver.findElement(By.xpath("//a[@id='submit_button']"));
			submit.click();
			System.out.println(submit.isSelected());
			Thread.sleep(2000);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,-350)", "");
			
	    	}
	    }
	}
	    
	    
	    
	




