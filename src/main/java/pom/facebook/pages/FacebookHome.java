package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FacebookHome extends GenericWrappers{

	public FacebookHome (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	public FacebookHome clickonEnglish() {
		clickByXpath(prop.getProperty("FacebookHomePage.English.XPath"));
		return this;
	}
	public FacebookSignUp clickonCreateNewAccount() {
		clickByXpath(prop.getProperty("FacebookHomePage.CreateNewAccount.XPath"));
		return new FacebookSignUp(driver,test);
	}
	
}
