package pom.pan.testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.pan.pages.PanCardApplication;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="To verify Pan Card Application";
		author="Arun";
		category="Smoke";
		browserName="Chrome";
		appName="PanIndia";
	}
	@Test
	public void PanApplication() {
		
		new PanCardApplication(driver,test)
		.selectTitle("MR.")
		.enterFirstName("Arun")
		.enterMiddleName("Siga")
		.enterLastName("Prasadh")
		.enterFatherFirstName("Sigamani")
		.enterFatherMiddleName("Durai")
		.enterFatherLastName("Durairaj")
		.enterMobileNumber("9600512082")
		.enterEmail("joearunprasadh@gmail.com")
		.selectSourceOfIncome("2")
		.clickonAddressOfCommunication("office")
		.enterDOB("25011991")
		.enterResidenceHouseNo("10/4")
		.enterResidenceArea("Saibaba Colony")
		.pageScrollDown()
		.enterResidenceCity("Coimbatore")
		.selectResidenceState("Tamil Nadu")
		.enterResidencePinCode("641038")
		.waitTime()
		//.selectResidenceCountry("INDIA")
		.enterOfficeName("Amazon")
		.enterOfficeHouseNo("43")
		.enterOfficeArea("Saiabab colony")
		.enterOfficeCity("Tiruppur")
		.selectOfficeState("Tamil Nadu")
		.enterOfficePinCode("641000")
		.waitTime()
		.selectOfficeCountry("INDIA")
		.selectIdentityProof("16")
		.selectonAddressProof("6")
		.selectDOBProof("6")
		.selectAadharProof("Copy of Aadhaar Card/Letter")
		.selectOfficeAddressProof("2")
		.pageScrollDown()
		.clickonTermsAndConditions()
		.closeallBowser();
	}
}
