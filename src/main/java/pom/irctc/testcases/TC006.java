package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.IndianFrro;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	
		@BeforeClass
		public void beforeClass() {
			testCaseName="TC006";
			testCaseDescription="To verify FormC";
			author="Arun";
			category="Smoke";
			browserName="Chrome";
			appName="IndianFro";
		}

		@Test
		public void indianFrroPage() {
			new IndianFrro(driver,test)
			.clickonSignUp()
			.enterUserId("aprasadh1991")
			.enterPassword("Aprasadh_1991")
			.enterConfrimPassword("Aprasadh_1991")
			.selectSecurityQuestion(3)
			.enterSecurityAnswer("Five Point Something")
			.enterName("Arun")
			.selectGender("Male")
			.enterDOB("25/01/1991")
			.enterDesignation("Associate")
			.enterEmail("joerunprasadh@gmail.com")
			.enterMobile("9600512082")
			.enterPhoneNumber("4222431913")
			.waitTime()
			//.selectNationality("INDIA")
			.enterGuestName("ArsenalArun")
			.enterCapacity("3")
			.enterAddress("10/4, Krishna Nagar, K.K. Pudur")
			.pageScrollDown()
			.selectState("28")
			.waitTime()
			.selectCity("3D")
			//.waitTime()
			//.selectFrroData("")
			.waitTime()
			.selectAccomodationType("GH")
			.waitTime()
			.selectAccomodationGrade("5s")
			.waitTime()
			.enterEmailID("joearunprasadh@gmail.com")
			.enterMobileNumber("9600512082")
			.enterPhoneNumbers("4222431913")
			.waitTime()
			.enterFirstGuestName("Arsenal")
			.enterFirstGuestAddress("Krishna Nagar")
			.waitTime()
			.selectFirstGuestState("28")
			.waitTime()
			.selectFirstGuestCity("2D")
			.waitTime()
			.enterFirstGuestEmail("abc@gmail.com")
			.enterFirstGuestPhoneNo("4222431912")
			.enterFirstGuestMobileNo("8667880877")
			.clickonAdd()
			.waitTime()
			.enterSecondGuestName("Prasadh")
			.enterSecondGuestAddress("SaibabaColony")
			.waitTime()
			.selectSecondGuestState("28")
			.waitTime()
			.selectSecondGuestCity("2D")
			.waitTime()
			.enterSecondGuestEmail("aprasadh1991@gmail.com")
			.enterSecondGuestPhoneNo("4232431914")
			.enterSecondGuestMobileNo("9600512089")
			.clickonAddAgain()
			.waitTime()
			.enterThirdGuestName("Arvind")
			.enterThirdGuestAddress("Ramanathapuram")
			.waitTime()
			.selectThirdGuestState("15")
			.waitTime()
			.selectThirdGuestCity("27D")
			.waitTime()
			.enterThirdGuestEmailid("Arun1991@gmail.com")
			.enterThirdGuestPhoneNo("4222431913")
			.enterThirdGuestMobile("8667880899")
			.clickonAddThrid()
			.closeallBrowser();			
			
		}
		
	}


