package pom.irctc.pages;


import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{

	public RegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	public RegistrationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.UserName.XPath"),data);
		return this;	
	}
	public RegistrationPage pageScrollDown() {
		pageDown();
		return this;
	}
	public RegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.Password.XPath"), data);
		return this;
	}
	public RegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.ConfirmPassword.XPath"), data);
		return this;
	}
	public RegistrationPage clickOnLanguage() {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.Language.XPath"));
		return this;
	}
	public RegistrationPage waitTime() {
		waitProperty(3000);
		return this;
	}
	public RegistrationPage clickOnLanguageOption(String option) {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.LanguageOption.XPath"),option);
		return this;
	}
	public RegistrationPage clickonSecurityQuestion() {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.SecurityQuestion.XPath"));
		return this;
	}
	public RegistrationPage clickSecurityQuestionOption(String option) {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.SecurityQuestionOption.XPath"),option);
		return this;
	}
	public RegistrationPage enterSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.SecurityAnswer.XPath"), data);
		return this;
	}
	public RegistrationPage clickonContinue() {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.Continue.XPath"));
		return this;
	}
	public RegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.FirstName.XPath"), data);
		return this;
	}
	public RegistrationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.MiddleName.XPath"), data);
		return this;
	}
	public RegistrationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.LastName.XPath"), data);
		return this;
	}
	public RegistrationPage clickonOccupation() {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.Occupation.XPath"));
		return this;
	}
	public RegistrationPage clickOccupationType(String option) {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.OccupationType.XPath"),option);
		return this;
	}
	public RegistrationPage clickonDOB() {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.DOB.XPath"));
		return this;
	}
	public RegistrationPage selectMonth(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCRegistrationPage.Month.XPath"), value);
		return this;
	}
	public RegistrationPage selectYear(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCRegistrationPage.Year.XPath"), value);
		return this;
	}
	public RegistrationPage clickonDate(String option) {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.Date.XPath"),option);
		return this;
	}
	public RegistrationPage clickOnMarriedStatus(String option) {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.MarriedStatus.XPath"),option);
		return this;
	}
	public RegistrationPage selectCountry(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCRegistrationPage.Country.XPath"),value);
		return this;
	}
	public RegistrationPage clickOnGender(String option) {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.Gender.XPath"),option);
		return this;
	}
	public RegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.Email.XPath"), data);
		return this;
	}
	public RegistrationPage enterMobile(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.Mobile.XPath"), data);
		return this;
	}
	public RegistrationPage selectNationality(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCRegistrationPage.Nationality.XPath"), value);;
		return this;
	}
	public RegistrationPage clickContinue1() {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.Continue1.XPath"));
		return this;
	}
	public RegistrationPage enterFlatNo(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.FlatNo.XPath"), data);
		return this;
	}
	public RegistrationPage enterStreet(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.Street.XPath"), data);
		return this;
	}
	public RegistrationPage enterArea(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.Area.XPath"), data);
		return this;
	}
	public RegistrationPage enterPincode(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.Pincode.XPath"), data);
		return this;
	}
	public RegistrationPage enterState(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.State.XPath"), data);
		return this;
	}
	public RegistrationPage selectResiCity(String value) {
		selectVisibleTextbyXpath(prop.getProperty("IRCTCRegistrationPage.ResiCity.XPath"), value);
		return this;
	}
	public RegistrationPage selectResPostOffice(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCRegistrationPage.ResPostOffice.XPath"), value);
		return this;
	}
	public RegistrationPage enterPhone(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.Phone.XPath"), data);
		return this;
	}
	public RegistrationPage clickOnCopyOfAddress(String option) {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.CopyOfAddress.XPath"),option);
		return this;
	}
	public RegistrationPage enterOfficeFlatNo(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.OfficeFlatNo.XPath"), data);
		return this;
	}
	public RegistrationPage enterOfficeStreet(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.OfficeStreet.XPath"), data);
		return this;
	}
	public RegistrationPage enterOfficeArea(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.OfficeArea.XPath"), data);
		return this;
	}
	public RegistrationPage clickonOfficeCountry() {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.OfficeCountry.XPath"));
		return this;
	}
	public RegistrationPage selectOfficeCountryOption() {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.CountryOption.XPath"));
		return this;
	}
	public RegistrationPage enterOfficePincode(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.OfficePincode.XPath"), data);
		return this;
	}
	public RegistrationPage enterOfficeState(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.OfficeState.XPath"), data);
		return this;
	}
	public RegistrationPage enterOfficeCity(String value) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.OfficeCity.XPath"), value);
		return this;
	}
	public RegistrationPage enterOfficePostOffice(String value) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.OfficePostOffice.XPath"), value);
		return this;
	}
	public RegistrationPage enterOfficeMobile(String data) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.OfficeMobile.XPath"), data);
		return this;
	}
	public RegistrationPage clickOnTermsAndConition() {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.TermsAndConition.XPath"));
		return this;
	}
	public RegistrationPage closeAllBrowser() {
		closeAllBrowsers();
		return this;
	}
	
	
}




























