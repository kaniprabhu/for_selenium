package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHome;
import pages.MyLeads;
import wdMethods.ProjectMethods;


public class CreateLeadTest extends ProjectMethods {
	
	@BeforeTest
	public void setdata(String testCaseName, String testDescription, String testNodes, String Category, String authors, String browsername, String dataSheetName ) {
		
		testCaseName = "Created Lead";
		testDescription = "Beefore Edit the Lead you may should create this edit lead";
		testNodes = "Lead";
		Category="Smoke";
		authors = "KANI PRABHU S";
		browsername = "Chrome";
		dataSheetName = "";				
	}

	@Test(dataProvider="fetchdata")
// 	@Test(dataProvider="fetchData")
	public void createlead(String uname, String pass, String cName, String fName, String lName ) {
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pass)
		.clickLogIn();
		new HomePage()
		.clickCrmsfa();
		new MyHome()
		.clickLeads();
		new MyLeads()
		.clickCreateLead();
		new CreateLead()
		.typeCname(cName)
		.typeFname(fName)
		.typelname(lName)
		.clickSubmitButton();
		
		
		
		 		
		
	}

}
