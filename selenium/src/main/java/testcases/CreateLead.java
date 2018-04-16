package testcases;


import org.testng.annotations.*;
import wdMethods.ProjMethods;

public class CreateLead extends ProjMethods  {

//	@Test(groups="smoke",priority=0)
	@Test(invocationCount=2)
	public void createLead() throws InterruptedException
	{
//		login();
		click(locateElement("linktext", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"),"TestLeaf");
		type(locateElement("id", "createLeadForm_firstName"),"AAA");
		selectDropDownUsingText(locateElement("id","createLeadForm_dataSourceId"),"Employee");
		type(locateElement("id", "createLeadForm_firstNameLocal"),"BBB");
		type(locateElement("id", "createLeadForm_personalTitle"),"CCC");
		type(locateElement("id", "createLeadForm_generalProfTitle"),"TESTINGGG");
		type(locateElement("id", "createLeadForm_annualRevenue"),"300000");
		selectDropDownUsingText(locateElement("id", "createLeadForm_industryEnumId"), "Computer Software");
		selectDropDownUsingText(locateElement("id", "createLeadForm_ownershipEnumId"), "Partnership");
		type(locateElement("id", "createLeadForm_sicCode"),"111");
		type(locateElement("id", "createLeadForm_description"),"Create a record");
		type(locateElement("id", "createLeadForm_importantNote"),"To create test lead");
		type(locateElement("id", "createLeadForm_lastName"),"DDD");
		selectDropDownUsingText(locateElement("id", "createLeadForm_marketingCampaignId"), "eCommerce Site Internal Campaign");
		type(locateElement("id", "createLeadForm_lastNameLocal"),"ddd");
		type(locateElement("id", "createLeadForm_departmentName"),"QA Dept");
		selectDropDownUsingText(locateElement("id", "createLeadForm_currencyUomId"), "INR - Indian Rupee");
		type(locateElement("id", "createLeadForm_numberEmployees"),"2000");
		type(locateElement("id", "createLeadForm_tickerSymbol"),"FGR");
		click(locateElement("name", "submitButton"));
//		closeBrowser();
	}

}
