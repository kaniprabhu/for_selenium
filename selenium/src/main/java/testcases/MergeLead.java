package testcases;

import org.testng.annotations.Test;

import wdMethods.ProjMethods;

public class MergeLead extends ProjMethods  {

//	@Test(groups= {"sanity"},dependsOnGroups= "smoke")
	@Test(timeOut=20000)
	public void mergeLead() throws InterruptedException
	{
//		login();
		click(locateElement("linktext", "Merge Leads"));
		click(locateElement("xpath", "(//*[@alt='Lookup'])[1]"));
		switchToWindow(1);
//		type(locateElement("name", "id"), "10111");
		type(locateElement("name", "firstName"), "an");
		click(locateElement("xpath", "//*[text()='Find Leads' and @type='button']"));
		String captureText1=getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		System.out.println("Captured Lead ID is "+captureText1);
		clickWithoutSnap(locateElement("xpath", "(//*[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		click(locateElement("xpath", "(//*[@alt='Lookup'])[2]"));
		switchToWindow(1);
//		type(locateElement("name", "id"), "10066");
		type(locateElement("name", "firstName"), "b");
		click(locateElement("xpath", "//*[text()='Find Leads' and @type='button']"));
		String captureText2=getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		System.out.println("Captured Lead ID is "+captureText2);
		clickWithoutSnap(locateElement("xpath", "(//*[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		clickWithoutSnap(locateElement("linktext", "Merge"));
		acceptAlert();
		click(locateElement("linktext", "Find Leads"));
//		type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[1]"), "10111");
		type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[2]"),captureText1);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		String errorMessage=getText(locateElement("xpath", "//div[@class='x-paging-info']"));
		System.out.println("Captured Error Message is "+errorMessage);
//		closeBrowser();
	}

}
