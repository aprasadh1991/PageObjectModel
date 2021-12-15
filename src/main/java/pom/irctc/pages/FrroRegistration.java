package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FrroRegistration extends GenericWrappers{

	public FrroRegistration(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	public FrroRegistration enterUserId(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.UserId.XPath"), data);
		return this;
	}
	public FrroRegistration enterPassword(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.Password.XPath"), data);
		return this;
	}
	public FrroRegistration enterConfrimPassword(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.ConfrimPassword.XPath"), data);
		return this;
	}
	public FrroRegistration selectSecurityQuestion(int value) {
		selectIndexByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.SecurityQuestion.XPath"), value);
		return this;
	}
	public FrroRegistration enterSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.SecurityAnswer.XPath"), data);
		return this;
	}
	public FrroRegistration enterName(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.Name.XPath"), data);
		return this;
	}
	public FrroRegistration selectGender(String value) {
		selectVisibleTextbyXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.Gender.XPath"), value);
		return this;
	}
	public FrroRegistration enterDOB(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.DOB.XPath"), data);
		return this;
	}
	public FrroRegistration enterDesignation(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.Designation.XPath"), data);
		return this;
	}
	public FrroRegistration enterEmail(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.Email.XPath"), data);
		return this;
	}
	public FrroRegistration enterMobile(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.Mobile.XPath"), data);
		return this;
	}
	public FrroRegistration enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.PhoneNumber.XPath"), data);
		return this;
	}
	public FrroRegistration selectNationality(String value) {
		selectVisibleTextbyXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.Nationality.XPath"), value);
		return this;
	}
	public FrroRegistration enterGuestName(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.GuestName.XPath"), data);
		return this;
	}
	public FrroRegistration enterCapacity(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.Capacity.XPath"), data);
		return this;
	}
	public FrroRegistration enterAddress(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.Address.XPath"), data);
		return this;
	}
	public FrroRegistration pageScrollDown() {
		pageDown();
		return this;
	}
	public FrroRegistration waitTime() {
		waitProperty(3000);
		return this;
	}
	public FrroRegistration selectState(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.State.XPath"), value);
		return this;
	}
	public FrroRegistration selectCity(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.City.XPath"), value);
		return this;
	}
	public FrroRegistration selectAccomodationType(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.AccommodationType.XPath"),value);
		return this;
	}
	public FrroRegistration selectAccomodationGrade(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.AccommodationGrade.XPath"), value);
		return this;
	}
	public FrroRegistration enterEmailID(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.EmailID.XPath"), data);
		return this;
	}
	public FrroRegistration enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.MobileNumber.XPath"), data);
		return this;
	}
	public FrroRegistration enterPhoneNumbers(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.PhoneNumbers.XPath"), data);
		return this;
	}
	public FrroRegistration enterFirstGuestName(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.FirstGuestName.XPath"), data);
		return this;
	}
	public FrroRegistration enterFirstGuestAddress(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.FirstGuestAddress.XPath"), data);
		return this;
	}
	public FrroRegistration selectFirstGuestState(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.FirstGuestState.XPath"), value);
		return this;
	}
	public FrroRegistration selectFirstGuestCity(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.FirstGuestCity.XPath"), value);
		return this;
	}
	public FrroRegistration enterFirstGuestEmail(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.FirstGuestEmail.XPath"), data);
		return this;
	}
	public FrroRegistration enterFirstGuestPhoneNo(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.FirstGuestPhoneNo.XPath"), data);
		return this;
	}
	public FrroRegistration enterFirstGuestMobileNo(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.FirstGuestMobileNo.XPath"), data);
		return this;
	}
	public FrroRegistration clickonAdd() {
		clickByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.Add.XPath"));
		return this;
	}
	public FrroRegistration enterSecondGuestName(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.SecondGuestName.XPath"), data);
		return this;
	}
	public FrroRegistration enterSecondGuestAddress(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.SecondGuestAddress.XPath"), data);
		return this;
	}
	public FrroRegistration selectSecondGuestState(String data) {
		selectValuebyXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.SecondGuestState.XPath"), data);
		return this;
	}
	public FrroRegistration selectSecondGuestCity(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.SecondGuestCity.XPath"), value);
		return this;
	}
	public FrroRegistration enterSecondGuestEmail(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.SecondGuestEmail.XPath"), data);
		return this;
	}
	public FrroRegistration enterSecondGuestPhoneNo(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.SecondGuestPhoneNo.XPath"), data);
		return this;
	}
	public FrroRegistration enterSecondGuestMobileNo(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.SecondGuestMobileNo.XPath"), data);
		return this;
	}
	public FrroRegistration clickonAddAgain() {
		clickByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.AddAgain.XPath"));
		return this;
	}
	public FrroRegistration enterThirdGuestName(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.ThirdGuestName.XPath"), data);
		return this;
	}
	public FrroRegistration enterThirdGuestAddress(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.ThirdGuestAddress.XPath"), data);
		return this;
	}
	public FrroRegistration selectThirdGuestState(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.ThirdGuestState.XPath"), value);
		return this;
	}
	public FrroRegistration selectThirdGuestCity(String value) {
		selectValuebyXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.ThirdGuestCity.XPath"), value);
		return this;
	}
	public FrroRegistration enterThirdGuestEmailid(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.ThirdGuestEmailid.XPath"), data);
		return this;
	}
	public FrroRegistration enterThirdGuestPhoneNo(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.ThirdGuestPhoneNo.XPath"), data);
		return this;		
	}
	public FrroRegistration enterThirdGuestMobile(String data) {
		enterByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.ThirdGuestMobile.XPath"), data);
		return this;
	}
	public FrroRegistration clickonAddThrid() {
		clickByXpath(prop.getProperty("IRCTCIndianFrro.RegistrationPage.AddThrid.XPath"));
		return this;
	}
	public FrroRegistration closeallBrowser() {
		closeAllBrowsers();
		return this;
	}
	
	
	
}
