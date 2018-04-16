package testcases;

import org.testng.annotations.*;
import wdMethods.ProjMethods;

public class DeleteLead extends ProjMethods{

//	@Test(groups= {"sanity"},dependsOnGroups= "smoke")
//	@Test
	@Test(dependsOnMethods= {"testcases.CreateLead.createLead"})
	public void deleteLead() throws InterruptedException {
//		login();
		click(locateElement("linktext", "Find Leads"));
/*		click(locateElement("linktext", "Phone"));
		clear(locateElement("name", "phoneCountryCode"));
		type(locateElement("name", "phoneCountryCode"),"91");
		type(locateElement("name", "phoneAreaCode"),"810");
		type(locateElement("name", "phoneNumber"),"5830508");
*/		
		type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[2]"),"an");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(3000);
		String captureText=getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		System.out.println("Captured Lead ID is "+captureText);
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("linktext", "Delete"));
		click(locateElement("linktext", "Find Leads"));
		click(locateElement("name", "id"));
		type(locateElement("name", "id"),captureText);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		String errorMessage=getText(locateElement("xpath", "//div[@class='x-paging-info']"));
		System.out.println("Captured Error Message is "+errorMessage);
//		System.exit(0);
//		closeBrowser();
//		System.exit(0);

	}

}
