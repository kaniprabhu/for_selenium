package project;

import org.junit.Test;

import wdMethods.ProjMethods;
import wdMethods.SeMethods;

public class DeactivateAccount extends ProjMethods {
	
	@Test
	public void deactivateAccount() throws InterruptedException
	{
//		login();
		click(locateElement("xpath", "//a[text()='Accounts']"));
		click(locateElement("xpath", "//a[text()='Find Accounts']"));
		type(locateElement("xpath", "(//input[@name='accountName'])[2]"),"fancy");
		type(locateElement("xpath", "//input[@name='id']"),"11592");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		String accountId=getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a"));
		System.out.println(accountId);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		verifyTitle(getTitle());
		clickWithoutSnap(locateElement("xpath", "//a[text()='Deactivate Account']"));
		Thread.sleep(3000);
		getAlertText();

		acceptAlert();
		verifyPartialText(locateElement("xpath", "//span[@class='subSectionWarning']"), "This account was deactivated with");
		click(locateElement("xpath", "//a[text()='Find Accounts']"));
		type(locateElement("xpath", "(//input[@name='accountName'])[2]"),"fancy");
		type(locateElement("xpath", "//input[@name='id']"),"11592");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		Thread.sleep(3000);
		verifyExactText(locateElement("xpath", "//div[@class='x-paging-info']"), "No records to display");
//		closeBrowser();
		
		
	}

}
