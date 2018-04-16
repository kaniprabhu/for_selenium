package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	public static ChromeDriver driver;
	
	@Before
	public void before(Scenario sc)
	{
		System.out.println(sc.getName());
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leaftaps.com/opentaps");
		
	}
/*	@Given("Open the Browser")
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
*/	
/*	@And("Load URL")
	public void openURL()
	{
		driver.get("http://www.leaftaps.com/opentaps");
	}
*/	
	@And ("Enter the UserName as(.*)")
	public void enterUserName(String uName)
	{
		driver.findElementById("username").sendKeys(uName);
	}
	
	@And ("Enter the Password as(.*)")
	public void enterPassword(String pwd)
	{
		driver.findElementById("password").sendKeys(pwd);
	}
	
	@And("Click on Login Button")
	public void clickLoginBtn()
	{
/*		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");*/
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And("Click on CRMS/SFA Link")
	public void clickCRMSFA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("Click on Leadbutton")
	public void clickOnLead()
	{
		driver.findElementByLinkText("Leads").click();
	}
	
	@And("Click on Create Lead Link")
	public void clickOnCreateleadbtn()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And ("Enter the CompanyName as(.*)")
	public void enterCompanyName(String companyName)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
	}
	
	@And ("Enter the FirstName as(.*)")
	public void enterFirstName(String firstName)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
	}
	
	@And("Enter the LastName as(.*)")
	public void enterLastName(String lastName)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);

	}
	
	@When("Click on Createlead button")
	public void clickOnCreateleadBtn()
	{
		driver.findElementByName("submitButton").click();
	}
	
	@Then("verify Create lead done successfully")
	public void verifyCreateLead()
	{
		System.out.println("Successfully created create lead ");
	}
	
	@After
	public void after(Scenario sc)
	{
		System.out.println(sc.getStatus());
		driver.close();
	}
}
