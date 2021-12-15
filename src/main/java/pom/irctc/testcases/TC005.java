package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="To verify GST Validation";
		author="Arun";
		category="Smoke";
		browserName="Chrome";
		appName="IRCTC";
		
	}
	
	@Test
	public void gstValidation() {
		
		new CovidAlertPage(driver, test)
		.clickOnOk()
		.mouseHoveronHolidays()
		.mouseHoveronStays()
		.clickOnLongue()
		.switchtoAccommodation()
		.clickonHotel()
		.switchToHotel()
		.waitTime()
		.clickonLogin()
		.waitTime()
		.clickonGuestUserLogin()
		.enterEmail("joearunprasadh@gmail.com")
		.enterMobileNumber("9600512082")
		.waitTime()
		.clickonLoginButton()
		.waitTime()
		.enterDestinationCity("Chennai")
		.waitTime()
		.selectDestinationCity()
		.waitTime()
		.clickonCheckInDate()
		.waitTime()
		.selectCheckInDate("19")
		.waitTime()
		.clickonCheckOutDate()
		.waitTime()
		.selectCheckOutDate("21")
		.waitTime()
		.clickonRoomAndGuest()
		.waitTime()
		.selectRoom("1")
		.selectAdults(2)
		.clickonDone()
		.clickonFindHotel()
		.switchToHotelSearch()
		.clickonHotel()
		.switchToHotelDetailsPage()
		.displayHotelName()
		.displayPrice()
		.clickonBook()
		.switchToPassengerDetails()
		.selectTitle(1)
		.enterFirstName("Arun")
		.enterLastName("Prasadh")
		//.selectCountry("")
		.selectState("TAMIL NADU")
		.selectGST("Yes")
		.waitTime()
		.enterCompanyName("Amazon")
		.enterCompanyAddress("10/4")
		.clickonContinue()
		.dispalyGSTErrorMessage()
		.closeAllBrowsers();
	
	}
	
	
}
