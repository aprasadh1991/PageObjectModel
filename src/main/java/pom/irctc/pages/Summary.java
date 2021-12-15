package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class Summary extends GenericWrappers{

	public Summary (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public Summary compareHotelName() {
		String hotelCompare = getTextByXpath("//h5");
		return this;
	}
	public Summary compareTotalAmount() {
		String hotelTotalAmount = getTextByXpath("//div[@class='faredetails-in faredetails-in-total']");
		return this;
	}
	public Summary clickonIAgree() {
		clickByXpath("//span[@class='checkmark']");
		return this;
	}
	
	public OTP clickonMakePayment() {
		clickByXpath("//button[text()='Make Payment']");
		return new OTP(driver,test);
	}
}
