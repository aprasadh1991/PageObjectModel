package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;


import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To verify to Book Your Coach";
		author="Arun";
		category="Smoke";
		browserName="Chrome";
		appName="IRCTC";
	}
	
	@org.testng.annotations.Test
	public void BookYourCoach() {
		
		new CovidAlertPage(driver, test)
		.clickOnOk()
		.mouseHoveronHolidays()
		.mouseHoveronStays()
		.clickOnLongue()
		.switchtoAccommodation()
		.waitTime()
		.clickonMenuIcon()
		.waitTime()
		.clickOnBookYourCoach()
		.switchtoFtrNewUser()
		.clickOnNewUser()
		.swithchToFtrNewUser()
		.enterUserId("aprasadh1991")
		.enterPassword("Arsenal_1991")
		.enterConfrimPassword("Arsenal_1991")
		.selectSecurityQuestion(2)
		.enterSecurityAnswer("Dollar")
		.clickonDOB()
		.selectMonth("0")
		.selectYear("1991")
		.waitTime()
		.clickonDate("25")
		.clickonGender("M")
		.clickonMartialStatus("UnMarried")
		.enterEmail("joearunprasadh@gmail.com")
		.selectOccupation("Professional")
		.enterFirstName("Arun")
		.enterMiddleName("Siga")
		.pageScrollDown()
		.enterLastName("Prasadh")
		.selectNationality("94")
		.enterFlatNo("10/4")
		.enterStreet("5th Street")
		.enterArea("Saibaba colony")
		.selectCountry("94")
		.enterMobileNumber("9600512082")
		.enterPincode("641038")
		.waitTime()
		.pageScrollDown()
		//.selectCity("Coimbatore")
		//.selectState(4)
		//.selectPostOffice(5)
		.clickonSameResidentialAddress("No")
		.pageScrollDown()
		.enterOfficeFlatNo("No 15")
		.enterOfficeStreet("5th Street")
		.enterOfficeArea("Saibaba Colony")
		.selectOfficeCountry("94")
		.enterOfficeMobileNumber("9600512082")
		.enterOfficePinCode("600096")
		.waitTime()
		.pageScrollDown()
		.selectOfficeCity("Kanchipuram")
		//.selectOfficeState(5)
		//.selectOfficePostOffice(1);
		.closeallBrowsers();
	}


}
