package pom.usvisa.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class USVisaApplication extends GenericWrappers{
	
	public USVisaApplication (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public USVisaApplication enterGivenName(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.GivenName.XPath"), data);
		return this;
	}
	public USVisaApplication enterSurnames(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.Surnames.XPath"), data);
		return this;
	}
	public USVisaApplication enterFullName(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.FullName.XPath"), data);
		return this;
	}
	public USVisaApplication clickonOtherNames() {
		clickByXpath(prop.getProperty("USVisaApplication.OtherNames.XPath"));
		return this;
	}
	public USVisaApplication enterOtherSurnames(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.OtherSurnames.XPath"), data);
		return this;
	}
	public USVisaApplication enterOtherGivenNames(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.OtherGivenNames.XPath"), data);
		return this;
	}
	public USVisaApplication enterEmail(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.Email.XPath"), data);
		return this;
	}
	public USVisaApplication enterConfirmEmail(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.ConfirmEmail.XPath"), data);
		return this;
	}
	public USVisaApplication clickonOtherEmail() {
		clickByXpath(prop.getProperty("USVisaApplication.OtherEmail.XPath"));
		return this;
	}
	public USVisaApplication enterAdditionalEmail(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.AdditionalEmail.XPath"), data);
		return this;
	}
	public USVisaApplication clickonSex(String data) {
		clickByXpath(prop.getProperty("USVisaApplication.Sex.XPath"));
		return this;
	}
	public USVisaApplication pageScrollDown() {
		pageDown();
		return this;		
	}
	public USVisaApplication waitTime() {
		waitProperty(3000);
		return this;
	}
	public USVisaApplication clickonDOB() {
		clickByXpath(prop.getProperty("USVisaApplication.DOB.XPath"));
		return this;
	}
	public USVisaApplication selectYear(String value) {
		selectValuebyXpath(prop.getProperty("USVisaApplication.Year.XPath"),value);
		return this;
	}
	public USVisaApplication selectMonth(String value) {
		selectValuebyXpath(prop.getProperty("USVisaApplication.Month.XPath"), value);
		return this;
	}
	public USVisaApplication selectDate() {
		clickByXpath(prop.getProperty("USVisaApplication.Date.XPath"));
		return this;
	}
	public USVisaApplication enterCityOfBirth(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.CityOfBirth.XPath"), data);
		return this;
	}
	public USVisaApplication enterStateOfBirth(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.StateOfBirth.XPath"), data);
		return this;
	}
	public USVisaApplication selectCountryOfBirth(String value) {
		selectValuebyXpath(prop.getProperty("USVisaApplication.CountryOfBirth.XPath"), value);
		return this;
	}
	public USVisaApplication selectCountryOfOrgin(String value) {
		selectValuebyXpath(prop.getProperty("USVisaApplication.CountryOfOrgin.XPath"), value);
		return this;
	}
	public USVisaApplication clickonPremanentResident() {
		clickByXpath(prop.getProperty("USVisaApplication.PremanentResident.XPath"));
		return this;
	}
	public USVisaApplication clickonNext() {
		clickByXpath(prop.getProperty("USVisaApplication.Next.XPath"));
		return this;
	}
	public USVisaApplication enterStreetAddress1(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.StreetAddress1.XPath"), data);
		return this;
	}
	public USVisaApplication enterStreetAddress2(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.StreetAddress2.XPath"), data);
		return this;
	}
	public USVisaApplication enterCity(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.City.XPath"), data);
		return this;
	}
	public USVisaApplication enterState(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.State.XPath"), data);
		return this;
	}
	public USVisaApplication enterPostalCode(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.PostalCode.XPath"), data);
		return this;
	}
	public USVisaApplication clickonPhoneNumber() {
		clickByXpath(prop.getProperty("USVisaApplication.PhoneNumber.XPath"));
		return this;
	}
	public USVisaApplication clickPhoneCountryCode() {
		clickByXpath(prop.getProperty("USVisaApplication.PhoneCountryCode.XPath"));
		return this;
	}
	public USVisaApplication enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.PhoneNumber.XPath"), data);
		return this;
	}
	public USVisaApplication clickonAdditionalPhone() {
		clickByXpath(prop.getProperty("USVisaApplication.AdditionalPhone.XPath"));
		return this;
	}
	public USVisaApplication enterAdditionalPhone1(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.AdditionalPhone1.XPath"), data);
		return this;
	}
	public USVisaApplication selectCountryOfResidence(String value) {
		selectValuebyXpath(prop.getProperty("USVisaApplication.CountryOfResidence.XPath"), value);
		return this;
	}
	public USVisaApplication selectStateOfResidence(String value) {
		selectValuebyXpath(prop.getProperty("USVisaApplication.StateOfResidence.XPath"), value);
		return this;
	}
	public USVisaApplication clickonNewMailingAddress() {
		clickByXpath(prop.getProperty("USVisaApplication.NewMailingAddress.XPath"));
		return this;
	}
	public USVisaApplication enterNewStreet(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.NewStreet.XPath"), data);
		return this;
	}
	public USVisaApplication enterNewStreet2(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.NewStreet2.XPath"), data);
		return this;
	}
	public USVisaApplication enterNewCity(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.NewCity.XPath"), data);
		return this;
	}
	public USVisaApplication enterNewState(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.NewState.XPath"), data);
		return this;
	}
	public USVisaApplication enterMailingZip(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.MailingZip.XPath"), data);
		return this;
	}
	public USVisaApplication selectNewCountry(String value) {
		selectValuebyXpath(prop.getProperty("USVisaApplication.NewCountry.XPath"), value);
		return this;
	}
	public USVisaApplication clickonNext2() {
		clickByXpath(prop.getProperty("USVisaApplication.Next2.XPath"));
		return this;
	}
	public USVisaApplication enterLanguages(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.Languages.XPath"), data);
		return this;
	}
	public USVisaApplication clickonTribe() {
		clickByXpath(prop.getProperty("USVisaApplication.Tribe.XPath"));
		return this;
	}
	public USVisaApplication enterClanName(String data) {
		enterByXpath(prop.getProperty("USVisaApplication.ClanName.XPath"), data);
		return this;
	}
	public USVisaApplication selectMaritalStatus(String value) {
		selectValuebyXpath(prop.getProperty("USVisaApplication.MaritalStatus.XPath"), value);
		return this;
	}
	public USVisaApplication clickonPersonTravellingWithYou() {
		clickByXpath(prop.getProperty("USVisaApplication.PersonTravellingWithYou.XPath"));
		return this;
	}
	public USVisaApplication selectPurposeOfTravel(String value) {
		selectValuebyXpath(prop.getProperty("USVisaApplication.PurposeOfTravel.XPath"), value);
		return this;
	}
	public USVisaApplication selectPreferredLanguage(String value) {
		selectValuebyXpath(prop.getProperty("USVisaApplication.PreferredLanguage.XPath"), value);
		return this;
	}
	public USVisaApplication clickonTermsAndConditions() {
		clickByXpath(prop.getProperty("USVisaApplication.TermsAndConditions.XPath"));
		return this;
	}
	public USVisaApplication closeallBrowser() {
		closeAllBrowsers();
		return this;
	}
	
	
}
