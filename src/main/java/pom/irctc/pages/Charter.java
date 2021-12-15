package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class Charter extends GenericWrappers{

	public Charter(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public Charter switchToCharterWindow() {
		switchToLastWindow();
		return this;
	}	
	public Charter clickonBack() {
		clickByXpath(prop.getProperty("IRCTCCharterPage.Back.XPath"));
		return this;		
	}
	public Charter clickonEnquiryForm() {
		clickByXpath(prop.getProperty("IRCTCCharterPage.EnquiryForm.XPath"));
		return this;
	}
	public Charter enterNameOfApplicant(String data) {
		enterByXpath(prop.getProperty("IRCTCCharterPage.NameOfApplicant.XPath"), data);
		return this;
	}
	public Charter enterNameOfOrganisation(String data) {
		enterByXpath(prop.getProperty("IRCTCCharterPage.NameOfOrganisation.XPath"), data);
		return this;
	}
	public Charter enterAddress(String data) {
		enterByXpath(prop.getProperty("IRCTCCharterPage.Address.XPath"), data);
		return this;
	}
	public Charter enterMobile(String data) {
		enterByXpath(prop.getProperty("IRCTCCharterPage.Mobile.XPath"), data);
		return this;
	}
	public Charter enterEmail(String data) {
		enterByXpath(prop.getProperty("IRCTCCharterPage.Email.XPath"), data);
		return this;
	}
	public Charter selectRequestFor(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCCharterPage.RequestFor.XPath"), value);
		return this;
	}
	public Charter waitTime() {
		waitProperty(3000);
		return this;
	}
	public Charter enterOriginatingStation(String data) {
		enterByXpath(prop.getProperty("IRCTCCharterPage.OriginatingStation.XPath"), data);
		return this;
	}
	public Charter enterDestinationStation(String data) {
		enterByXpath(prop.getProperty("IRCTCCharterPage.DestinationStation.XPath"), data);
		return this;
	}
	public Charter clickonCheckInDate() {
		clickByXpath(prop.getProperty("IRCTCCharterPage.CheckInDate.XPath"));
		return this;
	}
	public Charter selectCheckInDate(String option) {
		clickByXpath(prop.getProperty("IRCTCCharterPage.selectCheckInDate.XPath"),option);
		return this;
	}
	public Charter clickonReturnDate() {
		clickByXpath(prop.getProperty("IRCTCCharterPage.ReturnDate.XPath"));
		return this;
	}
	public Charter selectonRetrunDate(String option) {
		clickByXpath(prop.getProperty("IRCTCCharterPage.selectonRetrunDate.XPath"),option);
		return this;
	}
	public Charter pageScrollDown() {
		pageDown();
		return this;
	}
	public Charter enterDurationOfTour(String data) {
		enterByXpath(prop.getProperty("IRCTCCharterPage.DurationOfTour.XPath"), data);
		return this;
	}
	public Charter enterCoachDetails(String data) {
		enterByXpath(prop.getProperty("IRCTCCharterPage.CoachDetails.XPath"), data);
		return this;
	}
	public Charter enterNumberOfPassengers1(String data) {
		enterByXpath(prop.getProperty("IRCTCCharterPage.NumberOfPassengers1.XPath"), data);
		return this;
	}
	public Charter enterNumberOfPassengers2(String data) {
		enterByXpath(prop.getProperty("IRCTCCharterPage.NumberOfPassengers2.XPath"), data);
		return this;
	}
	public Charter enterPurposeOfCharter(String data) {
		enterByXpath(prop.getProperty("IRCTCCharterPage.PurposeOfCharter.XPath"), data);
		return this;
	}
	public Charter enterAdditionalService(String data) {
		enterByXpath(prop.getProperty("IRCTCCharterPage.AdditionalService.XPath"), data);
		return this;
	}
	public Charter clickonSubmit() {
		clickByXpath(prop.getProperty("IRCTCCharterPage.Submit.XPath"));
		return this;
	}
	public Charter verifyMobile(String data) {
		verifyTextByXpath(prop.getProperty("IRCTCCharterPage.verifyMobile.XPath"), data);
		return this;
	}
	public Charter closeallBrowser() {
		closeAllBrowsers();
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
