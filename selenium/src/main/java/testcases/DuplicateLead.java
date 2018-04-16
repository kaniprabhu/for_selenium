package testcases;

import org.testng.annotations.Test;

import wdMethods.ProjMethods;


public class DuplicateLead extends ProjMethods {

//	@Test(groups= {"sanity"},dependsOnGroups="smoke")
	@Test(enabled=false)
	public void duplicateLead() throws InterruptedException {
		
//		login();		
		click(locateElement("linktext", "Find Leads"));
		type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[2]"),"an");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(3000);
		String captureText=getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		System.out.println("Captured Lead ID is "+captureText);
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("linktext","Duplicate Lead"));
		click(locateElement("linktext","Create Lead"));

	//	closeBrowser();
	}

}
