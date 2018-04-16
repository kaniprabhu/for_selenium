package project;

import org.junit.Test;

import wdMethods.ProjMethods;
import wdMethods.SeMethods;

public class MergeLead extends ProjMethods  {
	@Test
	public void mergeLead() throws InterruptedException
	{
//		login();
		click(locateElement("xpath", "//a[text()='Accounts']"));
		click(locateElement("xpath", "//a[text()='Merge Accounts']"));
		click(locateElement("xpath", "(//*[@alt='Lookup'])[1]"));
		switchToWindow(1);
		type(locateElement("xpath", "//input[@name='id']"), "11544");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		clickWithoutSnap(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		switchToWindow(0);
		click(locateElement("xpath", "(//*[@alt='Lookup'])[2]"));
		switchToWindow(1);
		type(locateElement("xpath", "//input[@name='id']"), "11522");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		clickWithoutSnap(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		switchToWindow(0);
		clickWithoutSnap(locateElement("xpath", "//a[@class='buttonDangerous']"));
		acceptAlert();
		click(locateElement("xpath", "//a[text()='Find Accounts']"));
		type(locateElement("xpath", "//input[@name='id']"), "11544");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		verifyExactText(locateElement("xpath", "//div[@class='x-paging-info']"), "No records to display");
//		closeBrowser();
	}

}
