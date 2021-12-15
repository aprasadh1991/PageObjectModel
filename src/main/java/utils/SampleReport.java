package utils;



import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {


	@Test
	public void reports() {
		
		ExtentReports report = new ExtentReports("./reports/Result.html",false);
		
		ExtentTest test = report.startTest("TC001", "To Verify IRCTC Registration");
		
		test.assignAuthor("ArsenalArun");
		test.assignCategory("Smoke");
		
		test.log(LogStatus.PASS,"The Browser is launched sucessfully with given URL");
		test.log(LogStatus.PASS,"The Browser is launched sucessfully with given URL");
		test.log(LogStatus.PASS,"The Browser is launched sucessfully with given URL");
		test.log(LogStatus.PASS,"The Browser is launched sucessfully with given URL");
		test.log(LogStatus.FAIL,"The Browser is launched sucessfully with given URL");
		test.log(LogStatus.PASS,"The Browser is launched sucessfully with given URL");
		test.log(LogStatus.PASS,"The Browser is launched sucessfully with given URL");
		test.log(LogStatus.PASS,"The Browser is launched sucessfully with given URL");
		test.log(LogStatus.PASS,"The Browser is launched sucessfully with given URL");
		test.log(LogStatus.PASS,"The Browser is launched sucessfully with given URL");
		test.log(LogStatus.PASS,"The Browser is launched sucessfully with given URL");
		test.log(LogStatus.PASS,"The Browser is launched sucessfully with given URL");
		
		
		report.endTest(test);
		
		report.flush();
		
	}
	
}
