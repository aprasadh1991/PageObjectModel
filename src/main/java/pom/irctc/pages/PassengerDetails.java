package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PassengerDetails extends GenericWrappers{

	public PassengerDetails(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test=test;
	}

	public PassengerDetails switchToPassengerDetails() {
		switchToLastWindow();
		return this;
	}
	public PassengerDetails selectTitle(int value) {
		selectIndexByXpath(prop.getProperty("IRCTCOTPValidation.Title.Xpath"), value);
		return this;
	}
	public PassengerDetails enterFirstName(String data) {
		enterByXpath(prop.getProperty("IRCTCOTPValidation.FirstName.Xpath"), data);
		return this;
	}
	public PassengerDetails enterLastName(String data) {
		enterByXpath(prop.getProperty("IRCTCOTPValidation.LastName.Xpath"), data);
		return this;
	}
	public PassengerDetails selectCountry(String value) {
	selectVisibleTextbyXpath(prop.getProperty("IRCTCOTPValidation.Country.Xpath"), value);
		return this;
	}
	public PassengerDetails selectState(String value) {
		selectVisibleTextbyXpath(prop.getProperty("IRCTCOTPValidation.State.Xpath"), value);
		return this;
	}
	public PassengerDetails enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("IRCTCOTPValidation.MobileNumber.Xpath="), data);
		return this;
	}
	public PassengerDetails enterEmail(String data) {
		enterByXpath(prop.getProperty("IRCTCOTPValidation.Email.Xpath"), data);
		return this;
	}
	public PassengerDetails selectGST(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCOTPValidation.GST.Xpath"), value);
		return this;
	}
	public PassengerDetails waitTime() {
		waitProperty(3000);
		return this;
	}
	public PassengerDetails enterCompanyName(String data) {
		enterByXpath(prop.getProperty("IRCTCGSTValidation.CompanyName.Xpath"), data);
		return this;
	}
	public PassengerDetails enterCompanyAddress(String data) {
		enterByXpath(prop.getProperty("IRCTCGSTValidation.CompanyAddress.Xpath"), data);
		return this;
	}
	public PassengerDetails clickonContinue(){
		clickByXpath(prop.getProperty("IRCTCGSTValidation.Continue.Xpath"));
		return this;
	}
	public PassengerDetails compareHotelName(String text) {
		verifyTextByXpath(prop.getProperty("IRCTCOTPValidation.compareHotelName.Xpath"), text);
		return this;
	}
	public PassengerDetails compareHotelPrice(String text) {
		verifyTextByXpath(prop.getProperty("IRCTCOTPValidation.compareHotelPrice.Xpath"), text);
		return this;
	}	
	public PassengerDetails clickonIAgree() {
		clickByXpath(prop.getProperty("IRCTCOTPValidation.IAgree.Xpath"));
		return this;
	}	
	public PassengerDetails clickonMakePayment() {
		clickByXpath(prop.getProperty("IRCTCOTPValidation.MakePayment.Xpath"));
		return this;
	}
	public PassengerDetails clickonVerifyOTP() {
		clickByXpath(prop.getProperty("IRCTCOTPValidation.VerifyOTP.Xpath"));
		return this;
	}	
	public PassengerDetails displayOTPMessage() {
	verifyTextByXpath("//span[text()='otp is required.']","Mobile no. not valid");
		return this;
	}	
	public PassengerDetails dispalyGSTErrorMessage() {
		verifyTextByXpath("(//span[@class='ERR2'])[12]","gstNumber is required.");
		return this;		
	}
	

}
