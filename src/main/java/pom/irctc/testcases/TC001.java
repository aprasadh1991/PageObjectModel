package pom.irctc.testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC001";
		testCaseDescription="To verify IRCTC Registration for the new User;";
		author="Arun";
		category="Smoke";
		browserName="Chrome";
		appName="IRCTC";
	}
	@Test
	public void irctcRegistration() {
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.clickonRegister()
		.enterUserName("aprasadh1991")
		.enterPassword("Coimbatore1991")
		.enterConfirmPassword("Coimbatore1991")
		.clickOnLanguage()
		.waitTime()
		.clickOnLanguageOption("English")
		.clickonSecurityQuestion()
		.clickSecurityQuestionOption("What is your all time favorite sports team?")
		.enterSecurityAnswer("Arsenal")
		.clickonContinue()
		.enterFirstName("Arun")
		.enterMiddleName("Sigamani")
		.enterLastName("Prasadh")
		.clickonOccupation()
		.waitTime()
		.clickOccupationType("PRIVATE")
		.clickonDOB()
		.waitTime()
		.selectYear("1991")
		.selectMonth("0")
		.clickonDate("25")
		.clickOnMarriedStatus("U")
		.selectCountry("94")
		.clickOnGender("Female")
		.enterEmail("aprasadh@amazon.com")
		.enterMobile("8220507777")
		.selectNationality("94")
		.clickContinue1()
		.enterFlatNo("NO 25")
		.enterStreet("1st Street")
		.enterArea("SaibabaColony")
		.enterPincode("641039")
		//.enterState("")
		.selectResiCity("Coimbatore")
		.selectResPostOffice("Telungupalayam S.O")
		.enterPhone("4222431913")
		.clickOnCopyOfAddress("No")
		.waitTime()
		.enterOfficeFlatNo("Door No 12")
		.enterOfficeStreet("1st Street")
		.enterOfficeArea("Saibaba Colony")
		.clickonOfficeCountry()
		.selectOfficeCountryOption()
		.enterOfficePincode("641038")
		.enterOfficeState("TAMIL NADU")
		.enterOfficeCity("Coimbatore")
		.enterOfficePostOffice("Kuppakonanpudur S.O")
		.enterOfficeMobile("9442103749")
		//.clickOnTermsAndConition()
		.closeBrowser();
	}
}
