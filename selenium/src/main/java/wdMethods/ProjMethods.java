package wdMethods;

import org.testng.annotations.*;

public class ProjMethods extends SeMethods {
/*	@BeforeMethod//(groups="all")
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
*/	
	@Parameters({"username","password","url"})
	@BeforeMethod//(groups="all")
	public void login(String username, String password, String url)
	{
		startApp("chrome", url);
		type(locateElement("id", "username"), username);
		type(locateElement("id", "password"), password);
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("linktext", "CRM/SFA"));
		click(locateElement("linktext", "Leads"));

	}
	@AfterMethod(groups="all")
	public void logout1()
	{
		closeAllBrowsers();
	}

/*	@AfterMethod()
	public void afterMethod()
	{
		System.out.println("After method");
	}
	

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Before Class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("After Class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Before Test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("After Test");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("Before Suite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("After Suite");
	  }
*/


}
