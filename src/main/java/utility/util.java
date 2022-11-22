package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import RankmfBase.TestBase;


public class util {

private static WebDriver driver = null;

	
	@SuppressWarnings("deprecation")
	public static WebDriver openBrowser() {

			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Fahim Office\\Chrome driver\\chromedriver.exe");
		//	WebDriver driver = new ChromeDriver();
			
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability("marionette",true);
			driver= new ChromeDriver(capabilities);
			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    return driver;
	}
 public static void waitForElement(WebDriver driver,WebElement element){ 
		 WebDriverWait wait = new WebDriverWait(driver, 30);
	     wait.until(ExpectedConditions.visibilityOf(element));
	 	}
 
 public static void movescrollertoview(WebDriver driver,WebElement element) {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 
	 js.executeScript("arguments[0].scrollIntoView(true);",element);
 }

 public static int stringtointerger(String s) {
	 String num = s.replaceAll("[^0-9]","");
	 int n = Integer.parseInt(num);
	 return n;
	 
 }
 
 public static boolean waitforinvisiblityElement(WebDriver driver,WebElement element){ 
	 WebDriverWait wait = new WebDriverWait(driver, 30);
	 return wait.until(ExpectedConditions.invisibilityOf(element));
      
 	}
 
 public static void movescroller(int x,int y,WebDriver driver) {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy("+x+","+y+")");
 }
 
 public static void movescrollerpoint(WebDriver driver, WebElement element) {
	 int[] points = movescroller(element);
	 JavascriptExecutor js = (JavascriptExecutor) driver; 
	 js.executeScript("window.scrollBy("+points[0]+","+points[1]+")");
 }
 
 public static int[] movescroller(WebElement element) {
 int[] cordinate =new int[2];
 Point classname = element.getLocation();
 int xcordi = classname.getX();
 cordinate[0] = xcordi;
 System.out.println("Element's Position from left side "+xcordi +" pixels.");
 int ycordi = classname.getY();
 cordinate[0] = ycordi;
 System.out.println("Element's Position from top "+ycordi +" pixels.");
 return cordinate;
 }
 public static  String getdbdata(String db, String query) throws Exception {
		Thread.sleep(2000);
		DBconnection.Connectsql(db);
		
	    String data = DBconnection.GetData(query);
	
	 return data;
 }
 
 public static  String getdbdata1(String db, String query) throws Exception {
		Thread.sleep(2000);
		DBconnection.Connectsql(db);
		
	    String data = DBconnection.GetData1(query);

	
	 return data;
}
 
 
 
 public static boolean existsElement(WebElement element) {
	    try {
	       element.isDisplayed();
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	    return true;
	}
 
 public static String previousDateString(String format) 
         throws  Exception {
     // Create a date formatter using your format string
     DateFormat dateFormat = new SimpleDateFormat(format);

     // Parse the given date string into a Date object.
     // Note: This can throw ag ParseException.
   // Date myDate = dateFormat.parse(dateString);
   Date myDate =new Date();

     // Use the Calendar class to subtract one day
     Calendar calendar = Calendar.getInstance();
     String day = calendar.toString(); 
     if ((calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)  || (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) || holiday(day)) { 
    	 System.out.println("This day is holiday");
    	 return " ";
     } else {
         System.out.println("WEEKDAY");
         calendar.setTime(myDate);
   	     calendar.add(Calendar.DAY_OF_YEAR, -1);
   	  // Use the date formatter to produce a formatted date string
   	     Date previousDate = calendar.getTime();
   	     String result = dateFormat.format(previousDate);

   	     return result;
         
     }

 }
 

public static boolean element_present(int value) {
	 boolean ele = false;
	
	 if( value != 0){
		 System.out.println("Element is Present");
		 return ele = true;
		 }else{
		 System.out.println("Element is Absent");
		 }
	 return ele;
 }


 public static boolean holiday(String date) {
	 String[] days = {"25/12/2021",
			 "19/11/2021",
			 "05/11/2021",
			 "04/11/2021",
			 "15/10/2021",
			 "02/10/2021",
			 "10/09/2021",
			 "19/08/2021",
			 "15/08/2021",
			 "21/07/2021",
			 "13/05/2021",
			 "01/05/2021",
			 "25/04/2021",
			 "21/04/2021",
			 "14/04/2021",
			 "02/04/2021",
			 "29/03/2021",
			 "11/03/2021",
			 "26/01/2021"};
	 boolean y = false;
	 for(String d: days ) {
		 if(d.equals(date)) {
	      return y= true;
		 }
	 } 
	return y;
 }
 
 
 
 public static void failed(String TesMethodName) {
	   File	scrFile = ((TakesScreenshot)TestBase.driver).getScreenshotAs(OutputType.FILE);
		try {
			// Open the current date and time
			String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
			FileUtils.copyFile(scrFile,new File("C:\\Users\\Admin\\eclipse-workspace\\MutualFund\\MutualFundScreenShot\\"+TesMethodName+"_"+timestamp+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 }
		
		public static boolean isAlertPresent() 
		{ 
		    try 
		    { 
		    	TestBase.driver.switchTo().alert(); 
		        return true; 
		    }   // try 
		    catch (NoAlertPresentException Ex) 
		    { 
		        return false; 
		    }   // catch 
		}   // isAlertPresent()
 
		public static <alerts> Alert getalert() {
			Alert alerts = TestBase.driver.switchTo().alert();
			return alerts;
		}
		
	
}
