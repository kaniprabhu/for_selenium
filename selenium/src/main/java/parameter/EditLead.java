package parameter;

import org.testng.annotations.*;
import wdMethods.ProjMethods;

public class EditLead extends ProjMethods {

//	@Test(groups="smoke",priority=1)
//	@Test
	@Test(dependsOnMethods= {"testcases.CreateLead.createLead"})
	public void editLead() throws InterruptedException {
		
//		login();		
		click(locateElement("linktext", "Find Leads"));
		type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[2]"),"an");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(50);
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		getTitle();
		click(locateElement("linktext","Edit"));
		clear(locateElement("id", "updateLeadForm_companyName"));
		type(locateElement("id", "updateLeadForm_companyName"),"Testing");
		click(locateElement("xpath", "//input[@name='submitButton' and @value='Update']"));
		getText(locateElement("xpath", "//span[@id='viewLead_companyName_sp']"));
	//	closeBrowser();
	}

}
