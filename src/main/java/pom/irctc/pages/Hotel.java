package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class Hotel extends GenericWrappers{

	
	public Hotel(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	public Hotel switchToHotel() {
		switchToLastWindow();
		return this;
	}	
	public Hotel clickonLogin() {
		clickByXpath(prop.getProperty("IRCTCOTPValidation.Login.Xpath"));
		return this;
	}
	public Hotel waitTime() {
		waitProperty(3000);
		return this;
	}
	public Hotel clickonGuestUserLogin() {
		clickByXpath(prop.getProperty("IRCTCOTPValidation.GuestUserLogin.Xpath"));
		return this;
	}
	public Hotel enterEmail(String data) {
		enterByXpath(prop.getProperty("IRCTCOTPValidation.FirstEmail.Xpath"), data);
		return this;
	}
	public Hotel enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("IRCTCOTPValidation.MobileNumber.Xpath"), data);
		return this;
	}
	public Hotel clickonLoginButton() {
		clickByXpath(prop.getProperty("IRCTCOTPValidation.LoginButton.Xpath"));
		return this;
	}
	public Hotel enterDestinationCity(String data) {
		enterByXpath(prop.getProperty("IRCTCOTPValidation.DestinationCity.Xpath"), data);
		return this;
	}
	public Hotel selectDestinationCity() {
		clickByXpath(prop.getProperty("IRCTCOTPValidation.selectDestinationCity.Xpath"));
		return this;
	}
	public Hotel clickonCheckInDate() {
		clickByXpath(prop.getProperty("IRCTCOTPValidation.clickCheckInDate.Xpath"));
		return this;
	}
	public Hotel selectCheckInDate(String option) {
		clickByXpath(prop.getProperty("IRCTCOTPValidation.selectCheckInDate.Xpath"),option);
		return this;
	}
	public Hotel clickonCheckOutDate() {
		clickByXpath(prop.getProperty("IRCTCOTPValidation.clickCheckOutDate.Xpath"));
		return this;
	}
	public Hotel selectCheckOutDate(String option) {
		clickByXpath(prop.getProperty("IRCTCOTPValidation.selectCheckOutDate.Xpath"),option);
		return this;
	}
	public Hotel clickonRoomAndGuest() {
		clickByXpath(prop.getProperty("IRCTCOTPValidation.RoomAndGuest.Xpath"));
		return this;
	}
	public Hotel selectRoom(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCOTPValidation.Room.Xpath"), value);
		return this;
	}
	public Hotel selectAdults(int value) {
		selectIndexByXpath(prop.getProperty("IRCTCOTPValidation.Adults.Xpath"), value);
		return this;
	}
	public Hotel clickonDone() {
		clickByXpath(prop.getProperty("IRCTCOTPValidation.Done.Xpath"));
		return this;
	}
	public HotelSearch clickonFindHotel() {
		clickByXpath(prop.getProperty("IRCTCOTPValidation.FindHotel.Xpath"));
		return new HotelSearch(driver,test);
	}
		
	
	
}
