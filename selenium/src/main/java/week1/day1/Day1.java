package week1.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leaftaps.com/opentaps");
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	Thread.sleep(5000);
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
	driver.findElementById("createLeadForm_firstName").sendKeys("Anish");
	driver.findElementById("createLeadForm_lastName").sendKeys("karthik");
	
	WebElement sourceSelect = driver.findElementById("createLeadForm_dataSourceId");
	Select obj=new Select(sourceSelect);
	obj.selectByVisibleText("Employee");
	
	WebElement marketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
	Select obj2=new Select(marketingCampaign);
	List<WebElement> allOptions = obj2.getOptions();
	obj2.selectByIndex(allOptions.size()-1);
	
	
//	driver.findElementByName("submitButton").click();
	}

}
