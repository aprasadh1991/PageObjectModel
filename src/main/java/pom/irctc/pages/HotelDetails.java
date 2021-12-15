package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelDetails extends GenericWrappers{
	
	public static String hotelName,hotelPrice;
	public 	HotelDetails(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test= test;
	}
	
	public HotelDetails switchToHotelDetailsPage() {
		switchToLastWindow();
		return this;
	}
	public HotelDetails waitTime() {
		waitProperty(3000);
		return this;
	}
	public HotelDetails displayHotelName() {
		getTextByXpath("IRCTCOTPValidation.HotelName.Xpath");
		return this;
	}
	public HotelDetails displayPrice() {
		getTextByXpath("IRCTCOTPValidation.HotelPrice.Xpath");
		return this;
	}
	public PassengerDetails clickonBook() {
		clickByXpath(prop.getProperty("IRCTCOTPValidation.Book.Xpath"));
		return new PassengerDetails(driver, test);
	}
	
}
