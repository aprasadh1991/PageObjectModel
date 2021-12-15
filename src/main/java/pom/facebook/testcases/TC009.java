package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FacebookHome;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		
		testCaseName= "TC009";
		testCaseDescription= "To verify new Facebook SignUp";
		author= "Arun";
		category= "Smoke";
		browserName= "Chrome";
		appName= "Facebook";
	}
	@Test
	public void FacebookSignup() {
		new FacebookHome(driver,test)
		.clickonEnglish()
		.clickonCreateNewAccount()
		.enterFirstName("Arun")
		.enterSurname("Siga")
		.enterEmail("joearunprasadh@gmail.com")
		.enterConfirmEmail("joearunprasadh@gmail.com")
		.enterPassword("Coimbatore")
		.selectDayinDOB("25")
		.selectMonthinDOB(0)
		.selectYearinDOB("1991")
		.clickonSex("Male")
		.closeallBrowser();
	}
	
}
