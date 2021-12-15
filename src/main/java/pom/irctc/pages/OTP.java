package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class OTP extends GenericWrappers{
	public OTP (RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	public OTP clickonVerify() {
		clickByXpath("//button[text()='Verify']");
		return this;
	}
	
	public OTP verifyOTPField() {
		
		String verifyOTP = getTextByXpath("//span[@class='ERR2'][1]");
		if(verifyOTP.equals("otp is required.")) {
			System.out.println("Text is displayed");
		}else {
			System.out.println("Text is not displayed");
		}
		return this;
	}

}
