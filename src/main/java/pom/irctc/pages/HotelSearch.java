package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelSearch extends GenericWrappers{

	public HotelSearch(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public HotelSearch switchToHotelSearch() {
		switchToLastWindow();
		return this;
	}
	public HotelDetails clickonHotel() {
		clickByXpath(prop.getProperty("IRCTCOTPValidation.Hotel.Xpath"));
		return new HotelDetails(driver, test);
	}
	
}
