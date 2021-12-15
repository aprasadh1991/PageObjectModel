package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{

	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test=test;
	}	
	public RegistrationPage clickonRegister() {
		clickByXpath(prop.getProperty("IRCTCHomePage.Register.XPath"));
		return new RegistrationPage(driver,test);
	}
	public HomePage mouseHoveronHolidays() {
		mouseHoverbyXpath(prop.getProperty("IRCTCHomePage.Holidays.XPath"));
		return this;
	}
	public HomePage mouseHoveronStays() {
		mouseHoverbyXpath(prop.getProperty("IRCTCHomePage.Stays.XPath"));
		return this;
	}
	public HomePage clickOnLongue() {
		clickByXpath(prop.getProperty("IRCTCHomePage.Lounge.XPath"));
		return this;
	}
	public Accommodation switchtoAccommodation() {
		switchToLastWindow();
		return new Accommodation(driver,test);
	}
}
