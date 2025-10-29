package RankmfBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;




public class Listeners extends TestBase implements ITestListener {

    private static ExtentReports extent = ExtentReportNG.extentReportGenerator();
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    @Override
    public void onStart(ITestContext context) {
        Logs.info("=== Test Suite Started: " + context.getName() + " ===");
    }

    @Override
    public void onFinish(ITestContext context) {
        Logs.info("=== Test Suite Finished: " + context.getName() + " ===");
        extent.flush();
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest test = extent.createTest(result.getMethod().getMethodName());
        extentTest.set(test);
        Logs.info("Starting test: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTest test = extentTest.get();
        if (test != null) {
            test.log(Status.PASS, "✅ Test Passed");
        }
        Logs.info("PASS: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentTest test = extentTest.get();
        if (test != null) {
            test.log(Status.FAIL, "❌ Test Failed: " + result.getThrowable());
            try {
                String screenshotPath = getScreenShotPath(result.getMethod().getMethodName(), driver);
                test.addScreenCaptureFromPath(screenshotPath);
            } catch (IOException e) {
                Logs.error("Error attaching screenshot: " + e.getMessage());
            }
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentTest test = extentTest.get();
        if (test != null) {
            test.log(Status.SKIP, "⚠️ Test Skipped: " + result.getThrowable());
        }
        Logs.error("SKIPPED: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // not used
    }
}
