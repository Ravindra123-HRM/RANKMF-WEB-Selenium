package com.Test.Rankmfselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Test.RANKMFSELENIUM.EmailOTPReader;

public class OTPAutomationTest {
public static void main(String[] args) throws Exception {
	
    // STEP 1: Launch Selenium
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://example.com/login"); // Replace with your site

    // STEP 2: Fetch OTP from Gmail
    String host = "imap.gmail.com";  // For Outlook: "outlook.office365.com"
    String user = "ravindrac2871990@gmail.com"; // your email ID
    String password = "jjgciyvvdciqeubs"; // Gmail app password
    String subjectKeyword = "One Time Password(OTP) for your mutual fund investment."; // subject to filter emails

    String otp = EmailOTPReader.fetchOTP(host, user, password, subjectKeyword);

    // STEP 3: Enter OTP in the input field (if page requires it)
    if (otp != null) {
        driver.findElement(By.id("otpField")).sendKeys(otp);
        System.out.println("✅ OTP Entered Successfully: " + otp);
    } else {
        System.out.println("❌ OTP not found in emails!");
    }

    driver.quit();
}
}
