package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IndianFrro extends GenericWrappers{
	
	public IndianFrro(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
		}	
	
	public FrroRegistration clickonSignUp() {
		clickByXpath(prop.getProperty("IRCTCIndianFrro.SignUp.XPath"));
		return new FrroRegistration(driver,test);
	}

}
