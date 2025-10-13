package RankmfBase;




import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartnerTestBase {
	
	
	


	//import com.shopping.utilities.java.TestUtil;



	
		
			
			public static Properties pro;
			public static WebDriver driver;
			
			
			
			

			public static   WebDriver initialization() throws Exception
			{
				pro=new Properties();
				FileInputStream fis=new FileInputStream("C:\\Users\\ravindra.chavan\\eclipse\\RankmfwebApplication\\src\\main\\java\\RankmfBase\\configproperties");
				
				pro.load(fis);
				
				String Browsername=pro.getProperty("chrome");
				
				if(Browsername.equals("chromedriver"))
				{
					System.setProperty("webdriver.chrome.driver","C:\\Users\\ravindra.chavan\\eclipse\\RankmfwebApplication\\chromedriver-win64\\chromedriver.exe");
			       driver = new ChromeDriver();  
			      
					
				}
				
				else if(Browsername.equals("firefoxdriver"))
					{
					   System.setProperty("webdriver.firefox.driver","./Chrome/chromedriver.exe");
				       driver = new ChromeDriver();  
				       driver.manage().window().maximize(); 
						
					}
				driver.manage().window().maximize();
				//Thread.sleep(5000);
				
				 //driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);
			   //  driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
				driver.get("https://partners.rankmf.com/");
				/*JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,250)", "");*/
				return driver;
			}
			
			public static String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
			{
				TakesScreenshot ts=(TakesScreenshot)driver;
				File source=ts.getScreenshotAs(OutputType.FILE);
				String destinationFile=System.getProperty("user.dir")+"\\Reports\\"+testCaseName+".png";
				FileUtils.copyFile(source, new File(destinationFile));
				
				return destinationFile;
				
				
			}
			public static void pagescroll()
			{
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window.scrollBy(0,500)");
				
			}
			

	}



