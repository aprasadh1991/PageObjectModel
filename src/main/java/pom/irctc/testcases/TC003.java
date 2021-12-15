package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To verify Saloon Mandatory check";
		author="Arun";
		category="Smoke";
		browserName="Chrome";
		appName="IRCTC";		
	}
	@Test
	public void SaloonCheck() {
		new CovidAlertPage(driver, test)
		.clickOnOk()
		.mouseHoveronHolidays()
		.mouseHoveronStays()
		.clickOnLongue()
		.switchtoAccommodation()
		.clickonMenuIcon()
		.clickonCharter()
		.switchToCharterWindow()
		.clickonBack()
		.waitTime()
		.clickonEnquiryForm()
		.enterNameOfApplicant("Arun")
		.enterNameOfOrganisation("Amazon")
		.enterAddress("10/4 Krishna Nagar")
		.enterMobile("96005120")
		.enterEmail("joearunprasadh@gmail.com")
		.selectRequestFor("Saloon Charter")
		.waitTime()
		.enterOriginatingStation("Chennai")
		.enterDestinationStation("Coimbatore")
		.clickonCheckInDate()
		.waitTime()
		.selectCheckInDate("16")
		.clickonReturnDate()
		.pageScrollDown()
		.waitTime()
		.selectonRetrunDate("20")
		.enterDurationOfTour("1")
		.enterCoachDetails("b4")
		.enterNumberOfPassengers1("3")
		.enterNumberOfPassengers2("3")
		.waitTime()
		.enterPurposeOfCharter("Tour")
		.enterAdditionalService("Food")
		.clickonSubmit()
		.verifyMobile("Mobile no. not valid")
		.closeallBrowser();
		
	}
	
}
