package com.Test.RANKMFSELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import RankmfBase.Logs;
import RankmfBase.TestBase;

public class NormalLumpsumOrder_Netbanking extends TestBase{
	@FindBy(xpath="//*[@id='nav-mobile']/li[2]/a")
	static
	WebElement Baskets;
	@FindBy(xpath="//div[contains(text(),'Best funds for Tax Savings  – Conservative')]")
	static
	
	WebElement Investbutton;
	@FindBy(xpath="//a[@id='order_button']")
	static
	WebElement confirmcontinue;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/span[1]")
	static       
	WebElement otpcheckbox;
	@FindBy(xpath="//body/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[6]/div[1]/a[1]")
    static
	WebElement verifyotp;
	
	
	public NormalLumpsumOrder_Netbanking(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	public static void click_HomePage() throws Exception
	{
		
		HomepageTest.click_ExploreRankmf();	
	}
	
	public static void Click_SearchMutualfunds() throws Exception
	{
		
		HomepageTest.SearchMutualfunds();	
	}
	
	
	
	public static void click_Invest() throws Exception
	{
		Thread.sleep(2000);
        WebElement invest=driver.findElement(By.xpath("//div[@class='col s12 xl2 l2 width_20 detail_page_btn']//div[@class='disp_table_cell_both']//button[contains(text(),'INVEST')]"));
       invest.click();
      
       Logs.info("click on invest button");
	}
	
	public static void select_paymentmode() throws InterruptedException
	{
       
       Thread.sleep(2000);
		Select paymentmode=new Select(driver.findElement(By.xpath("//select[@id='payment_mode']")));
		paymentmode.selectByVisibleText("Net Banking");
		Logs.info("select payment mode as Netbanking");
		try {
			confirmcontinue.click();
			Logs.info("click on conform and continue button");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	public static void clickonVerifyOTP() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		otpcheckbox.click();
		verifyotp.click();
		Logs.info("verify otp number");
	}
	
	public static void Click_confirmPlaceOrder() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement submit=driver.findElement(By.xpath("//body/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[6]/div[2]/div[2]/a[2]"));
		submit.click();
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static void Alertpopup() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement alert=driver.findElement(By.xpath("//div[@class='sweet-alert showSweetAlert visible']//div[7]//div[1]//button[1]"));
		String url="https://www.unionbankonline.co.in/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=026&CATEGORY_ID=SHP&AuthenticationFG.TAX_MNU_ID=AMGSHP&AuthenticationFG.CALL_MODE=2&RU=https://www.billdesk.com/pgidsk/PGIProcessResponse/UBI&QS=XXJt1sfFgH42aDbauaUS8BXcjLS%2FCVixrKVvJORhuLldcm3Wx8WAfjZoNtq5pRLw4hk4CpMhRqkz3G%2F5bkvDv5Mn9nY6NYPcQCpu7v6ZU8pIf%2FUsZQDf437U%2BxVtfppX%0D%0ABzy9UCttwVMJ3OajyHZ9whgSTm9lO2ks3jSewit4u57ftpK0YXR5Q00cY0GdekSmSUeg%2Fqg1cY9XSeHOj71vzwUbXrrHVNx9o2MImOAt0jsKwi296BF3Qh6Bv6uVpjGKF0pf%0D%0A4xVb7BDCuS2RP95yfeIt3AUFYTN8B02w%2B8yKKiUHPL1QK23BUwnc5qPIdn3CglzDHKCJvOLFPFUQojG35Pet6xQ0tePXwKpsSg9xZbJeOvQ4UkiIY9aHbAhGGqeHF0pf4xVb%0D%0A7BDCuS2RP95yfTyVXGUNmFTe628aCYawFmGxuEBudSUoPl9bNVylKT9loCe9RWw4p0gdJhdbdbOFbd5Wet5dutHJCTlwq0YSeN1R0piutUoILCwb7e3wKj1Sw4KwOpGlN5sK%0D%0Av7LLXdYc9y6c1WCTBkujc%2FdEhRkV2Qt%2FSiR06Xj0Jfj4%2B7Kfadu0foxGpPyRyVwN66ZiM3Gr90syjAWyMIzPHrc7Nm%2FYPVBrAW60Po8Gxmp5qBoHP%2FmruZNgsqXjuptT4C2m%0D%0AqQPYc2lP7aNXfLj2Wesvne5kIDOQ3icp7HKkuoa1LRE54%2B%2FIXXJt1sfFgH42aDbauaUS8NK3dd4gBmzDUuaQ%2FkgVlUa2pFLKyLdV2p8TgNhNYdEuhLck02UY0vsyuBWCA%2FOd%0D%0APABzkFWxcUF0XcQmt9tP7KvHtDqhthOXCIhD7LUm7LBorpvhDKLKiZypycBc5J%2FWm6MGGjpI8NjfK7f613424E5W8QRDz%2FNn5aF9%2BzyGUmmume%2FubQrMOyZC9%2F%2BIjTSdh%2FL1%0D%0Ar1v8tHUF0AqlG3E5lhL5a1uFmKmo53mo2gtfnHlThQhzxz2ze1G1Oh1HwbI6SSbgKbslVkfWWUNY8abwvR7lmYJhkYSbrjEUI%2FwQ5%2BuZRee88IizjgJQJLkk9GynakMDm5Wv%0D%0AUrnnzkrsYkiITe9L9PQxj4Yi%2FelLZgTw0BQRGme3980Oobg%2BhCmWerKeLcto1NQpTLWkmpvkNBk9bb1PHTLwOyIL6pGZn3mjUTBEjMRGUNvvoYH1NKs2nfrKfkbgTxLZf1yz%0D%0APqNNH7OpibX59X6e4PiKVM7JfE4lCXfW29R4bsirwh8jRcyUmZhZOgQezdm%2Bj0uAyXDjCsAv3BSiJFUh4MbZaUheTMevtMEBwFyUISFrsMFhBR8%2FT8PhNKdLDVTiKLH%2B7aCq%0D%0ADhqFlF2v%2BbZcJC8PL09hlezS9yN2wUwX88eK1Nlsi3st0IIi9Who4F5etuBzwl2acDSs%2Brg0yqsqR4C%2F6PgkUQ3a84YmXXJt1sfFgH42aDbauaUS8JmjiGSmzbgRdOupAbJz%0D%0AXYoSPd7NrjqEZ039IHDqJyw79wFdMYZDgkLdwci%2FBAXrrV5fDmK76bfwOow8gJ6bdomGZ%2BHp3o0v%2F5CxENiu3CBqvtO7nka2YCKIT0WWqEOZkP%2FAqBTUuDO%2FuRn4vqupbIVG%0D%0AGvDmtzi7R822V9843pt2nm6rgGA73TD4u4IEeuBa6LIcR7HekUsjPq%2BVnCOxe9YrvnIc3UVk36KnthIG5L7YmXFz6aaUEYiNXaAJWZG0FSu5%2BxwEzY72qq%2FIJrUWIfYC4UwW%0D%0Afml%2Fyawl59jPLvDJqD%2BmnORFN58%2FcRp%2BMcumx95Wet5dutHJCTlwq0YSeN1R0piutUoILCwb7e3wKj1Sw4KwOpGlN5sKv7LLXdYc9y6c1WCTBkujc%2FdEhRkV2Qt%2FSiR06Xj0%0D%0AJfj4%2B7Kfadu0foxGpPyRyVwN66ZiM3Gr90syjAWyMIzPHrc7Nm%2FYPVBVX1%2B4Ws1SinLT9HmAPcqh";
		if(!alert.equals(url))
		{
			System.out.println("Link is not redirecting to Netbanking url");
			alert.click();
			driver.navigate().refresh();
			
		}
		else if(alert.equals(url))
		{
			System.out.println("Link is redirecting to Netabanking url");
			
		}
		
		
		
		
	}

	
		
	

}
