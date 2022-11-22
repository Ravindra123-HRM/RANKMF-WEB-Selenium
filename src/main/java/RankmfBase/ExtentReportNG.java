package RankmfBase;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportNG {
	static ExtentReports extent;
	static ExtentSparkReporter htmlReporter;
static WebElement driver;
	 public static ExtentTest logger;
	
	public static   ExtentReports extentReportGenerator() {
	
	String path=System.getProperty("user.dir")+"./Reports/RANKMF.html";
	
	ExtentSparkReporter htmlReporter=new ExtentSparkReporter(path);
	
	htmlReporter.config().setDocumentTitle("Automation in RankMF");
	htmlReporter.config().setReportName("RANKMF_WEB");
	htmlReporter.config().setTheme(Theme.STANDARD);
	extent=new ExtentReports();
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Hostname", "LocalHost");
	extent.setSystemInfo("OS", "Windows10");
	extent.setSystemInfo("TesterName", "Ravindra Chavan");
	extent.setSystemInfo("Browser","chrome_Browser");
	
	
	
	return extent;
	}
	
	 public static  String getScreenShot( String screenshotName) throws IOException {
		 String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 // after execution, you could see a folder "FailedTestsScreenshots" under src folder
		 String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
		 File finalDestination = new File(destination);
		 FileUtils.copyFile(source, finalDestination);
		 return destination;
		 }
	 
	
	public void getResult(ITestResult result) throws Exception{
		if(result.getStatus() == ITestResult.FAILURE){
		//MarkupHelper is used to display the output in different colors
		logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
		logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
		//To capture screenshot path and store the path of the screenshot in the string "screenshotPath"
		//We do pass the path captured by this method in to the extent reports using "logger.addScreenCapture" method.
		//String Scrnshot=TakeScreenshot.captuerScreenshot(driver,"TestCaseFailed");
		String screenshotPath = getScreenShot(result.getName());
		//To add it in the extent report
		logger.fail("Test Case Failed Snapshot is below " + logger.addScreenCaptureFromPath(screenshotPath));
		}
		else if(result.getStatus() == ITestResult.SKIP){
		logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
		}
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
		logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
		}
		
		}
	
	/*public static  void passFailScreenshot(String name) throws IOException
	{
		String screenshotNames= ExtentReportNG.getScreenShot(name);
		screenCapture("testing",screenshotNames);
		
		
	}*/
	public static void passFailScreenshot(String name) throws IOException {
		// TODO Auto-generated method stub
		String screenshotNames= ExtentReportNG.getScreenShot(name);
		screenCapture("testing",screenshotNames);
		
	}

	public static  ExtentReports screenCapture(String logdetails, String imagepath) throws IOException {
		// TODO Auto-generated method stub
		logger.log(Status.INFO,logdetails,MediaEntityBuilder.createScreenCaptureFromPath(imagepath).build());
		return extent;
		
	}
}
