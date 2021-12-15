package pom.usvisaapplication.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC010";
		testCaseDescription="To verify USVisaApplication";
		author="Arun";
		category="Smoke";
		appName="USVisa";
		browserName="Chrome";		
	}

	@Test
	public void USVisaApplication() {
		new pom.usvisa.pages.USVisaApplication(driver,test)
		.enterGivenName("Arun")
		.enterSurnames("Sigamani")
		.enterFullName("ArunPrasadh")
		.clickonOtherNames()
		.enterOtherSurnames("Tinku")
		.enterOtherGivenNames("Arsenal")
		.enterEmail("joearunprasadh@gmail.com")
		.enterConfirmEmail("joearunprasadh@gmail.com")
		.clickonOtherEmail()
		.enterAdditionalEmail("arunprasadh1991@gmail.com")
		.clickonSex("Male")
		.pageScrollDown()
		.waitTime()
		.clickonDOB()
		.waitTime()
		.selectYear("1991")
		.waitTime()
		.selectMonth("0")
		.waitTime()
		.selectDate()
		.waitTime()
		.enterCityOfBirth("Erode")
		.enterStateOfBirth("TamilNadu")
		.selectCountryOfBirth("India")
		.selectCountryOfOrgin("India")
		.clickonPremanentResident()
		.waitTime()
		.clickonNext()
		.enterStreetAddress1("10/4")
		.enterStreetAddress2("krishnan nagar")
		.enterCity("Coimbatore")
		.enterState("TamilNadu")
		.enterPostalCode("641038")
		.clickonPhoneNumber()
		.waitTime()
		//.clickPhoneCountryCode()
		.enterPhoneNumber("9600512082")
		.clickonAdditionalPhone()
		.enterAdditionalPhone1("4222431919")
		.selectCountryOfResidence("India")
		.selectStateOfResidence("Tamil Nadu")
		.pageScrollDown()
		.clickonNewMailingAddress()
		.enterNewStreet("123")
		.enterNewStreet2("Radhakrishnanan Street")
		.enterNewCity("Chennai")
		.enterNewState("TamilNadu")
		.enterMailingZip("641038")
		.selectNewCountry("India")
		.clickonNext2()
		.enterLanguages("English")
		.pageScrollDown()
		.clickonTribe()
		.enterClanName("Arsenal")
		.selectMaritalStatus("Single")
		.clickonPersonTravellingWithYou()
		.selectPurposeOfTravel("TOURISM/MEDICAL TREATMENT (B2)")
		.selectPreferredLanguage("Tamil")
		.clickonTermsAndConditions()
		.closeallBrowser();
	}
	
}
