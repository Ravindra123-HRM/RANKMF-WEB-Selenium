package RankmfBase;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Listeners extends TestBase implements ITestListener {
	public Listeners() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	ExtentReports extent = ExtentReportNG.extentReportGenerator();
	 ExtentTest test;
		
	 public  Logger logger;
	private static ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();

	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		Logs.info("................On Finish  Testcases..... ...."+result.getName());
		extent.flush();
	}

	public void onStart(ITestResult result) {
		// TODO Auto-generated method stub
		Logs.info("................On start  Testcases..... ...."+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailure(ITestResult result) {
		
		// TODO Auto-generated method stub
		Logs.info("Failure  because of ...."+result.getThrowable());
		
		extentTest.get().fail(result.getThrowable());
	  Object testobject= result.getInstance();
	Class clazz=result.getTestClass().getRealClass();
	
		try {
			driver=(WebDriver)clazz.getDeclaredField("driver").get(testobject);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	
	
	
		try {
			extentTest.get().addScreenCaptureFromPath(getScreenShotPath(result.getMethod().getMethodName(),driver), result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
	

	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Logs.info("Skipped because of ...."+result.getThrowable());
	}

	
	public void onTestStart(ITestResult result) {
	
		 test=extent.createTest(result.getMethod().getMethodName());
		 Logs.info(result.getMethod().getDescription());
	     extentTest.set(test);
		
	}
	
	 


	public  void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
Logs.info("Passed Testcase ...."+result.getThrowable());

		

	//MarkupHelper is used to display the output in different colors
	
		test.log(Status.PASS, "Test Passed");
	
		Logs.info(result.getMethod().getMethodName()+ "passed");

	}
}
	
		
	
		
	
	
	
		
	
	
	