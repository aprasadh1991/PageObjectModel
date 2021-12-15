package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FacebookSignUp extends GenericWrappers{

	
	public FacebookSignUp(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	public FacebookSignUp enterFirstName(String data) {
		enterByXpath(prop.getProperty("FacebookSignUpPage.FirstName.XPath"), data);
		return this;
	}
	public FacebookSignUp enterSurname(String data) {
		enterByXpath(prop.getProperty("FacebookSignUpPage.LastName.XPath"), data);
		return this;
	}
	public FacebookSignUp enterEmail(String data) {
		enterByXpath(prop.getProperty("FacebookSignUpPage.Email.XPath"), data);
		return this;
	}
	public FacebookSignUp enterConfirmEmail(String data) {
		enterByXpath(prop.getProperty("FacebookSignUpPage.ConfirmEmail.XPath"), data);
		return this;
	}	
	public FacebookSignUp enterPassword(String data) {
		enterByXpath(prop.getProperty("FacebookSignUpPage.Password.XPath"), data);
		return this;
	}
	public FacebookSignUp selectDayinDOB(String value) {
		selectValuebyXpath(prop.getProperty("FacebookSignUpPage.Date.XPath"), value);
		return this;
	}
	public FacebookSignUp selectMonthinDOB(int value) {
		selectIndexbyXpath(prop.getProperty("FacebookSignUpPage.Month.XPath"), value);
		return this;
	}
	public FacebookSignUp selectYearinDOB(String value) {
		selectVisibleTextbyXpath(prop.getProperty("FacebookSignUpPage.Year.XPath"),value);
		return this;
	}
	public FacebookSignUp clickonSex(String option) {
		clickByXpath(prop.getProperty("FacebookSignUpPage.Sex.XPath"),option);
		return this;
	}
	public FacebookSignUp closeallBrowser() {
		closeAllBrowsers();
		return this;
	}
}
