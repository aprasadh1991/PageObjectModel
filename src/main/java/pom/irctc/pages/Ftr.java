package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class Ftr extends GenericWrappers{

	public Ftr(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	public Ftr clickOnNewUser() {
		clickByXpath(prop.getProperty("IRCTCFtrPage.NewUser.XPath"));
		return this;
	}
	public FtrNewUser swithchToFtrNewUser() {
		switchToLastWindow();
		return new FtrNewUser(driver,test);
	}
	
	
}
