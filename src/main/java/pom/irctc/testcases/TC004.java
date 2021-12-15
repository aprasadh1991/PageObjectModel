package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import pom.irctc.pages.HotelDetails;
import pom.irctc.pages.PassengerDetails;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC004";
		testCaseDescription="To verify OTP Validation";
		author="Arun";
		category="Smoke";
		browserName="Chrome";
		appName="IRCTC";
	}

	@Test
	public void otpValidation(){
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoveronHolidays()
		.mouseHoveronStays()
		.clickOnLongue()
		.switchtoAccommodation()
		.waitTime()
		.clickonHotel()
		.switchToHotel()
		.waitTime()
		.clickonLogin()
		.waitTime()
		.clickonGuestUserLogin()
		.waitTime()
		.enterEmail("joearunprasadh@gmail.com")
		.enterMobileNumber("8667880877")
		.waitTime()
		.clickonLoginButton()
		.waitTime()
		.enterDestinationCity("Chennai")
		.waitTime()
		.selectDestinationCity()
		.waitTime()
		.clickonCheckInDate()
		.waitTime()
		.selectCheckInDate("16")
		.waitTime()
		.clickonCheckOutDate()
		.waitTime()
		.selectCheckOutDate("19")
		.waitTime()
		.clickonRoomAndGuest()
		.waitTime()
		.selectRoom("0")
		.selectAdults(2)
		.clickonDone()
		.waitTime()
		.clickonFindHotel()
		.switchToHotelSearch()
		.clickonHotel()
		.switchToHotelDetailsPage()
		.waitTime()
		.displayHotelName()
		.waitTime()
		.displayPrice()
		.waitTime()
		.clickonBook()
		.selectTitle(1)
		.enterFirstName("Arun")
		.enterLastName("Prasadh")
		.selectCountry("India")
		.selectState("TAMIL NADU")
		.enterMobileNumber("9600512082")
		.enterEmail("joearunprasadh@gmail.com")
		.selectGST("No")
		.compareHotelName(HotelDetails.hotelName)
		.compareHotelPrice(HotelDetails.hotelPrice)
		.clickonIAgree()
		.clickonMakePayment()
		.clickonVerifyOTP()		
		.displayOTPMessage()
		.closeAllBrowsers();
		
		
	}
	
}
