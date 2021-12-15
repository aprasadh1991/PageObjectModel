package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrNewUser extends GenericWrappers{

	public FtrNewUser(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	
	public FtrNewUser enterUserId(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.UserId.XPath"), data);
		return this;
	}
	public FtrNewUser enterPassword(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.Password.XPath"), data);
		return this;
	}
	public FtrNewUser enterConfrimPassword(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.ConfrimPassword.XPath"), data);
		return this;
	}
	public FtrNewUser selectSecurityQuestion(int value) {
		selectIndexByXpath(prop.getProperty("IRCTCFtrNewUserPage.SecurityQuestion.XPath"), value);
		return this;
	}
	public FtrNewUser enterSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.SecurityAnswer.XPath"), data);
		return this;
	}
	public FtrNewUser clickonDOB() {
		clickByXpath(prop.getProperty("IRCTCFtrNewUserPage.DOB.XPath"));
		return this;
	}	
	public FtrNewUser selectMonth(String data) {
		selectValuebyXpath(prop.getProperty("IRCTCFtrNewUserPage.Month.XPath"), data);
		return this;
	}
	public FtrNewUser selectYear(String data) {
		selectValuebyXpath(prop.getProperty("IRCTCFtrNewUserPage.Year.XPath"), data);
		return this;
	}
	public FtrNewUser waitTime() {
		waitProperty(3000);
		return this;
	}
	public FtrNewUser clickonDate(String option) {
		clickByXpath(prop.getProperty("IRCTCFtrNewUserPage.Date.XPath"),option);
		return this;
	}
	public FtrNewUser clickonGender(String option) {
		clickByXpath(prop.getProperty("IRCTCFtrNewUserPage.Gender.XPath"),option);
		return this;
	}
	public FtrNewUser clickonMartialStatus(String option) {
		clickByXpath(prop.getProperty("IRCTCFtrNewUserPage.MartialStatus.XPath"),option);
		return this;
	}
	public FtrNewUser enterEmail(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.Email.XPath"), data);
		return this;
	}
	public FtrNewUser selectOccupation(String value) {
		selectVisibleTextbyXpath(prop.getProperty("IRCTCFtrNewUserPage.Occupation.XPath"), value);
		return this;
	}
	public FtrNewUser enterFirstName(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.FirstName.XPath"), data);
		return this;
	}
	public FtrNewUser enterMiddleName(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.MiddleName.XPath"), data);
		return this;
	}
	public FtrNewUser pageScrollDown() {
		pageDown();
		return this;
	}
	public FtrNewUser enterLastName(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.LastName.XPath"), data);
		return this;
	}
	public FtrNewUser selectNationality(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCFtrNewUserPage.Nationality.XPath"), value);
		return this;
	}
	public FtrNewUser enterFlatNo(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.FlatNo.XPath"), data);
		return this;
	}
	public FtrNewUser enterStreet(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.Street.XPath"), data);
		return this;
	}
	public FtrNewUser enterArea(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.Area.XPath"), data);
		return this;
	}
	public FtrNewUser selectCountry(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCFtrNewUserPage.Country.XPath"), value);
		return this;
	}
	public FtrNewUser enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.MobileNumber.XPath"), data);
		return this;
	}
	public FtrNewUser enterPincode(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.Pincode.XPath"), data);
		return this;
	}
	public FtrNewUser selectCity(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCFtrNewUserPage.City.XPath"), value);
		return this;
	}
	public FtrNewUser selectState(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCFtrNewUserPage.State.XPath"), value);
		return this;
	}
	public FtrNewUser selectPostOffice(int value) {
		selectbyXpath(prop.getProperty("IRCTCFtrNewUserPage.PostOffice.XPath"), value);
		return this;
	}
	public FtrNewUser clickonSameResidentialAddress(String option) {
		clickByXpath(prop.getProperty("IRCTCFtrNewUserPage.SameResidentialAddress.XPath"),option);
		return this;
	}
	public FtrNewUser enterOfficeFlatNo(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.OfficeFlatNo.XPath"), data);
		return this;
	}
	public FtrNewUser enterOfficeStreet(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.OfficeStreet.XPath"), data);
		return this;
	}
	public FtrNewUser enterOfficeArea(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.OfficeArea.XPath"), data);
		return this;
	}
	public FtrNewUser selectOfficeCountry(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCFtrNewUserPage.OfficeCountry.XPath"), value);
		return this;
	}
	public FtrNewUser enterOfficeMobileNumber(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.OfficeMobileNumber.XPath"), data);
		return this;
	}
	public FtrNewUser enterOfficePinCode(String data) {
		enterByXpath(prop.getProperty("IRCTCFtrNewUserPage.OfficePinCode.XPath"), data);
		return this;
	}
	public FtrNewUser selectOfficeCity(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCFtrNewUserPage.OfficeCity.XPath"), value);
		return this;
	}
	public FtrNewUser selectOfficeState(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCFtrNewUserPage.OfficeState.XPath"), value);
		return this;
	}
	public FtrNewUser selectOfficePostOffice(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCFtrNewUserPage.OfficePostOffice.XPath"), value);
		return this;
	}
	public FtrNewUser closeallBrowsers() {
		closeAllBrowsers();
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
