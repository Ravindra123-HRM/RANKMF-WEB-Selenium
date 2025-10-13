package com.Test.Partners.Rankmf.Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Test.RANKMFSELENIUM.BasketAction;

import RankmfBase.PartnerTestBase;

public class PartnerCRMPanel extends PartnerTestBase {
	
	static JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public PartnerCRMPanel(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	

	public static void CRM() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("This is home URL: " +driver.getCurrentUrl());
		/*WebElement popup=driver.findElement(By.xpath("//body/div[@id='homemodel']/div[1]/div[1]/div[1]/button[1]"));
		WebDriverWait wt1 = new WebDriverWait(driver,6);
	      // elementToBeClickable expected criteria
	    wt1.until(ExpectedConditions.elementToBeClickable (popup));
		Actions a1 =new Actions(driver);
		a1.moveToElement(popup).build().perform();
		popup.click();*/
		WebElement crmtab=driver.findElement(By.xpath("//a[contains(@class,'m-menu__link m-menu__toggle')]//span[contains(@class,'m-menu__link-text')][normalize-space()='CRM']"));
		crmtab.click();
		Thread.sleep(2000);
		WebElement crm=driver.findElement(By.xpath("//a[@href='https://partners.rankmf.com/crm']//span[@class='m-menu__link-text'][normalize-space()='CRM']"));
		crm.click();
		System.out.println("This is CRM URL: " +driver.getCurrentUrl());
		Thread.sleep(2000);
		String Activelead=driver.findElement(By.xpath("//a[@id='activeLeadsClk']")).getText();
		System.out.println("Active lead panel :"+Activelead);
		/*Thread.sleep(2000);
		WebElement act=driver.findElement(By.xpath("//a[@id='activeLeadsClk']"));
		Actions z =new Actions(driver);
		z.moveToElement(act).build().perform();*/
		//act.click();
		Thread.sleep(2000);
		WebElement Addlead=driver.findElement(By.xpath("//button[@id='open']"));
		Actions active =new Actions(driver);
		active.moveToElement(Addlead).build().perform();
		Addlead.click();
	//	Addlead.click();
		WebElement fullname=driver.findElement(By.xpath("//input[@id='full_name']"));
		fullname.sendKeys("nsdgndgsdg");
		for(int i=0;i<=100;i++)
		{
		WebElement mobileno=driver.findElement(By.xpath("//input[@id='mobile_no']"));
		mobileno.sendKeys("2366"+i+"26262");
		}
		for(int i=0;i<=100;i++)
		{
		WebElement emailid=driver.findElement(By.xpath("//input[@id='email-id']"));
		emailid.sendKeys("nsdgndgsdg"+i+"@gmail.com");
	if(i==0)
	{
		break;
	}
		}
	    WebElement source=driver.findElement(By.xpath("//div[@id='leadSource']"));
		source.click();
		WebElement selectsource=driver.findElement(By.xpath("//div[@id='leadSource']//following::ul//li[contains(text(),'Friend')]"));
		selectsource.click();
		Thread.sleep(2000);
		WebElement submit=driver.findElement(By.xpath("//button[@id='submit_referral_form']"));
		Actions z =new Actions(driver);
		z.moveToElement(submit).build().perform();
		submit.click();//click to Add lead referral button
		Thread.sleep(2000);
		WebElement alertok=driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
		if(alertok.isSelected())
{
			submit.click();
			
}
			else
			{	
				alertok.click();

}
		
		Thread.sleep(2000);
	WebElement closepopup=driver.findElement(By.xpath("//div[@class='modal-headd']//div[2]"));
	
	closepopup.click();
	Thread.sleep(2000);
		
		List<WebElement> b=driver.findElements(By.xpath("//div[@id='active-leads']//div[@class='col-xl-3']//a[1]//span[1]"));
		 int schemenames=b.size();
		List <WebElement>c=driver.findElements(By.xpath("//div[@id='active-leads']//div[@class='dsp-txt']//h2"));
		int activelead=c.size();
		//WebElement a=driver.findElement(By.xpath("//div[@id='active-leads']//div[@class='dsp-box']"));
		//Thread.sleep(2000);
		//div[@id='active-leads']//div[@class='dsp-box']//a[@getid='1']//span[1]
		//int activeleads=a.findElements(By.xpath("div[2]")).size();
		int i=0;
		while(i<schemenames-1)
		
		{
			Thread.sleep(2000);
			String Activeleads=c.get(i).getText();
			
			 System.out.println(Activeleads);
			 i++;
		
		}
		
		
			Thread.sleep(2000);
        WebElement form=driver.findElement(By.xpath("//button[@id='filterNow']"));
    	
		      // elementToBeClickable expected criteria
			// WebDriverWait wt = new WebDriverWait(driver,6);
			// js.executeScript("arguments[0].scrollIntoView();", form);
			  Actions a=new Actions(driver);
			 a.moveToElement(form).build().perform();
			   form.click();
			   Thread.sleep(2000);
				WebElement formstatus=driver.findElement(By.xpath("//div[@id='main_form_status']"));
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			      wait.until(ExpectedConditions.elementToBeClickable (formstatus));
			      Actions b1=new Actions(driver);
				   b1.moveToElement(formstatus).build().perform();
				   formstatus.click();
				   WebElement select=driver.findElement(By.xpath("//li[contains(text(),'pan')]"));
				   select.click();
				  
			Thread.sleep(2000);
			WebElement downloadcsv=driver.findElement(By.xpath("//button[@id='downloadCSV']"));
			downloadcsv.click();
			
			System.out.println("-Download Active lead CSV with and without Filters");
			String Parent_Window = driver.getWindowHandle();    

			 for (String Child_Window : driver.getWindowHandles())  
			 {  
			 driver.switchTo().window(Child_Window);  
			 //Perform operation on child window 
			 //driver.close();
			 } 

			 //Switching back to Parent Window  
			 driver.switchTo().window(Parent_Window);  

			
				//Thread.sleep(2000);

				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement poten=driver.findElement(By.xpath("//a[@id='potentialLeadsClk']"));
		
			 Actions pot=new Actions(driver);
			 pot.moveToElement(poten).build().perform();
			 poten.click();
			 String Potentiallead=driver.findElement(By.xpath("//a[@id='potentialLeadsClk']")).getText();
			System.out.println("Potential lead panel :"+Potentiallead);
		
			
		Thread.sleep(25000);
			List<WebElement> d=driver.findElements(By.xpath("//div[@id='potential-leads']//div[@class='col-xl-3']//a[1]//span[1]"));
			 int schemename=d.size();
			List <WebElement>e=driver.findElements(By.xpath("//div[@id='potential-leads']//div[@class='dsp-txt']//h2"));
			int potentialleads=e.size();
			
			int k=0;
			while(k<schemename-1)
			
			{
				Thread.sleep(2000);
				String potential=e.get(k).getText();
				
				 System.out.println(potential);
				 k++;
			
			}
		      
			/*int l=0;
				while(l<potentialleads-1)
				{
				Thread.sleep(2000);
				
				String scheme=d.get(l).getText();
				//String freshlead=a.findElement(By.xpath("a[@getid="+i+"]/span[1]")).getText();
				System.out.println(scheme);
				l++;
				}*/
			
			
				
		}
	
	public static void Filter() throws InterruptedException
	{
		
		
		
		
		
	}
			
		

}
