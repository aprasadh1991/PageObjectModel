package pom.phptravels.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PhpTravelsRegistration extends GenericWrappers{

	public PhpTravelsRegistration(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	public PhpTravelsRegistration enterFirstName(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistration.FirstName.XPath"), data);
		return this;
	}
	public PhpTravelsRegistration enterLastName(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistration.LastName.XPath"), data);
		return this;
	}
	public PhpTravelsRegistration enterEmail(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistration.Email.XPath"), data);
		return this;
	}
	public PhpTravelsRegistration clickonPhoneNumber() {
		clickByXpath(prop.getProperty("PHPTravelsRegistration.CountryPhoneNumber.XPath"));
		return this;
	}
	public PhpTravelsRegistration waitTime() {
		waitProperty(3);
		return this;
	}
	public PhpTravelsRegistration clickOnCountryCode() {
		clickByXpath(prop.getProperty("PHPTravelsRegistration.CountryCode.XPath"));
		return this;
	}
	public PhpTravelsRegistration enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistration.PhoneNumber.XPath"), data);
		return this;
	}
	public PhpTravelsRegistration enterCompanyName(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistration.CompanyName.XPath"), data);
		return this;
	}
	public PhpTravelsRegistration enterStreetAddress(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistration.StreetAddress.XPath"), data);
		return this;
	}
	public PhpTravelsRegistration enterStreetAddress2(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistration.StreetAddress2.XPath"), data);
		return this;
	}
	public PhpTravelsRegistration enterCity(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistration.City.XPath"), data);
		return this;
	}
	public PhpTravelsRegistration selectState(String data) {
		selectVisibleTextbyXpath(prop.getProperty("PHPTravelsRegistration.State.XPath"), data);
		return this;
	}
	public PhpTravelsRegistration enterPostCode(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistration.PostCode.XPath"), data);
		return this;
	}
	public PhpTravelsRegistration selectCountry(String value) {
		selectValuebyXpath(prop.getProperty("PHPTravelsRegistration.Country.XPath"), value);
		return this;
	}
	public PhpTravelsRegistration pageScrollDown() {
		pageDown();
		return this;
	}
	public PhpTravelsRegistration enterWhatsApp(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistration.WhatsApp.XPath"), data);
		return this;
	}
	public PhpTravelsRegistration enterPassword(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistration.Password.XPath"), data);
		return this;
	}
	public PhpTravelsRegistration enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistration.ConfirmPassword.XPath"), data);
		return this;
	}
	public PhpTravelsRegistration closeallBrowsers() {
		closeAllBrowsers();
		return this;
	}
	
}
