package pom.pan.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PanCardApplication extends GenericWrappers{
	
	public PanCardApplication(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public PanCardApplication selectTitle(String value) {
		selectVisibleTextbyXpath(prop.getProperty("PanCardApplication.Title.XPath"), value);
		return this;
	}
	public PanCardApplication enterFirstName(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.FirsName.XPath"), data);
		return this;
	}
	public PanCardApplication enterMiddleName(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.MiddleName.XPath"), data);
		return this;
	}
	public PanCardApplication enterLastName(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.LastName.XPath"), data);
		return this;
	}
	public PanCardApplication enterFatherFirstName(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.FatherFirstName.XPath"), data);
		return this;
	}
	public PanCardApplication enterFatherMiddleName(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.FatherMiddleName.XPath"), data);
		return this;
	}
	public PanCardApplication enterFatherLastName(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.FatherLastName.XPath"), data);
		return this;
	}
	public PanCardApplication enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.MobileNumber.XPath"), data);
		return this;
	}
	public PanCardApplication enterEmail(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.Email.XPath"), data);
		return this;
	}
	public PanCardApplication selectSourceOfIncome(String data) {
		selectValuebyXpath(prop.getProperty("PanCardApplication.SourceOfIncome.XPath"), data);
		return this;
	}
	public PanCardApplication clickonAddressOfCommunication(String option) {
		clickByXpath(prop.getProperty("PanCardApplication.AddressOfCommunication.XPath"),option);
		return this;
	}
	public PanCardApplication enterDOB(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.DOB.XPath"), data);
		return this;
	}
	public PanCardApplication enterResidenceHouseNo(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.ResidenceHouseNo.XPath"), data);
		return this;
	}
	public PanCardApplication enterResidenceArea(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.ResidenceArea.XPath"), data);
		return this;
	}
	public PanCardApplication pageScrollDown() {
		pageDown();
		return this;
	}
	public PanCardApplication waitTime() {
		waitProperty(3);
		return this;
	}
	public PanCardApplication enterResidenceCity(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.ResidenceCity.XPath"), data);
		return this;
	}
	public PanCardApplication selectResidenceState(String value) {
		selectVisibleTextbyXpath(prop.getProperty("PanCardApplication.ResidenceState.XPath"), value);
		return this;
	}
	public PanCardApplication enterResidencePinCode(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.ResidencePinCode.XPath"), data);
		return this;
	}
	public PanCardApplication selectResidenceCountry(String value) {
		selectVisibleTextbyXpath(prop.getProperty("//select[@id='pan_country']"), value);
		return this;
	}
	public PanCardApplication enterOfficeName(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.OfficeName.XPath"), data);
		return this;
	}
	public PanCardApplication enterOfficeHouseNo(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.OfficeHouseNo.XPath"), data);
		return this;
	}
	public PanCardApplication enterOfficeArea(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.OfficeArea.XPath"), data);
		return this;
	}
	public PanCardApplication enterOfficeCity(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.OfficeCity.XPath"), data);
		return this;
	}
	public PanCardApplication selectOfficeState(String value) {
		selectValuebyXpath(prop.getProperty("PanCardApplication.OfficeState.XPath"), value);
		return this;
	}
	public PanCardApplication enterOfficePinCode(String data) {
		enterByXpath(prop.getProperty("PanCardApplication.OfficePinCode.XPath"), data);
		return this;
	}
	public PanCardApplication selectOfficeCountry(String value) {
		selectVisibleTextbyXpath(prop.getProperty("PanCardApplication.OfficeCountry.XPath"), value);
		return this;
	}
	public PanCardApplication selectIdentityProof(String value) {
		selectValuebyXpath(prop.getProperty("PanCardApplication.IdentityProof.XPath"), value);
		return this;
	}
	public PanCardApplication selectonAddressProof(String value) {
		selectValuebyXpath(prop.getProperty("PanCardApplication.AddressProof.XPath"), value);
		return this;
	}
	public PanCardApplication selectDOBProof(String value) {
		selectValuebyXpath(prop.getProperty("PanCardApplication.DOBProof.XPath"), value);
		return this;
	}
	public PanCardApplication selectAadharProof(String value) {
		selectValuebyXpath(prop.getProperty("PanCardApplication.AadharProof.XPath"), value);
		return this;
	}
	public PanCardApplication selectOfficeAddressProof(String value) {
		selectValuebyXpath(prop.getProperty("PanCardApplication.OfficeAddressProof.XPath"), value);
		return this;
	}
	public PanCardApplication clickonTermsAndConditions() {
		clickByXpath(prop.getProperty("PanCardApplication.TermsAndConditions.XPath"));
		return this;
	}
	public PanCardApplication closeallBowser() {
		closeAllBrowsers();
		return this;
	}
	
	
}
