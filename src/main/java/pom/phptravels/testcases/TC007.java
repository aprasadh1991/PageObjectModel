package pom.phptravels.testcases;

import org.testng.annotations.Test;

import pom.phptravels.pages.PhpTravelsRegistration;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{

	@org.testng.annotations.BeforeClass
	public void beforeClass() {
		
		testCaseName="TC007";
		testCaseDescription="To verify PHP login";
		category="Smoke";
		author="Arun";
		appName="PhpTravels";
		browserName="Chrome";		
	}
	
	@Test
	public void phpTravels() {
		new PhpTravelsRegistration(driver,test)
		.enterFirstName("Arun")
		.enterLastName("Prasadh")
		.enterEmail("joearunprasadh@gmail.com")
		.waitTime()
		.clickonPhoneNumber()
		.waitTime()
		.clickOnCountryCode()
		.waitTime()
		.enterPhoneNumber("9600512082")
		.selectCountry("IN")
		.enterCompanyName("Amazon")
		.enterStreetAddress("123")
		.enterStreetAddress2("6th Street")
		.enterCity("Coimbatore")
		.waitTime()
		.selectState("Tamil Nadu")
		.enterPostCode("641038")
		.pageScrollDown()
		.enterWhatsApp("9600512082")
		.enterPassword("Coimbatore")
		.enterConfirmPassword("Coimbatore")
		.closeallBrowsers();
	}
	
	
}
