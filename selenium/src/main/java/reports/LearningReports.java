package reports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearningReports {

	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter html =new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test = extent.createTest("TC001_CreateLead","Create a lead");
		test.assignAuthor("Kala");
		test.assignCategory("Regression");
		test.pass("Data DemoSalesManager entered sucessfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		test.pass("Data Crmsfa entered sucessfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		test.pass("login button clicked",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img3.png").build());
        extent.flush();
	}

}
