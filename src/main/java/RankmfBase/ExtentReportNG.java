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
    public static String reportPath;
	 public static ExtentTest logger;
	public static   ExtentReports extentReportGenerator() {
		  if (extent == null) {
	String reportPath=System.getProperty("user.dir")+"./Reports/RANKMF.html";
	
	ExtentSparkReporter htmlReporter=new ExtentSparkReporter(reportPath);
	
	htmlReporter.config().setDocumentTitle("Automation in RankMF");
	htmlReporter.config().setReportName("RANKMF_WEB");
	htmlReporter.config().setTheme(Theme.STANDARD);
	extent=new ExtentReports();
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Hostname", "LocalHost");
	extent.setSystemInfo("OS", "Windows10");
	extent.setSystemInfo("TesterName", "Ravindra Chavan");
	extent.setSystemInfo("Browser","chrome_Browser");
	
	
	
	
	}
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
	 
	
	
}