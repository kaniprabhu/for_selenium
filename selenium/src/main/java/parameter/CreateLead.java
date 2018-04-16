package parameter;


import java.io.IOException;

import org.testng.annotations.*;
import wdMethods.ProjMethods;

public class CreateLead extends ProjMethods  {

	@Test(dataProvider="inputdata")
	public void createLead(String companyname, String firstname, String lastname) throws InterruptedException
	{
//		login();
		click(locateElement("linktext", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"),companyname);
		type(locateElement("id", "createLeadForm_firstName"),firstname);
		type(locateElement("id", "createLeadForm_lastName"),lastname);
		click(locateElement("name", "submitButton"));
//		closeBrowser();
	}
	
	@DataProvider(name="inputdata")
	public Object[][] getData() throws IOException {
		ExcelSheet rExcel=new ExcelSheet();
		Object[][] data = rExcel.excelSheet();
		/*	Object[][] data= new Object[2][3];
	data[0][0]="TestLeaf";
	data[0][1]="Anish";
	data[0][2]="Siva";

	data[1][0]="TestLeaf";
	data[1][1]="Puvi";
	data[1][2]="Siva";
		 */	
		return data;
	
	}

}
