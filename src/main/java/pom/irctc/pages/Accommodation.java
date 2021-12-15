package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class Accommodation extends GenericWrappers{

	
	public Accommodation(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test=test;
	}
		
	public Accommodation clickonMenuIcon() {
		clickByXpath(prop.getProperty("IRCTCAccommodationPage.MenuIcon.XPath"));
		return this;
	}	
	public Accommodation clickOnBookYourCoach() {
		clickByXpath(prop.getProperty("IRCTCAccommodationPage.BookYourCoach.XPath"));
		return this;
	}
	public Accommodation waitTime() {
		waitProperty(3000);
		return this;
	}
	public Ftr switchtoFtrNewUser() {
		switchToLastWindow();
		return new Ftr(driver,test);
	}
	public Charter clickonCharter() {
		clickByXpath(prop.getProperty("IRCTCCharterPage.Charter.XPath"));
		return new Charter(driver,test);
	}
	public Hotel clickonHotel() {
		clickByXpath(prop.getProperty("IRCTCOTPValidation.Hotels.Xpath"));
		return new Hotel(driver,test);
	}
		
}
