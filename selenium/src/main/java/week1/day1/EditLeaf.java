package week1.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditLeaf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit' and @value='Login']").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[2]").sendKeys("an");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		
		String findLeadTitle = driver.getTitle();
		System.out.println("Page Title is "+findLeadTitle);
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Test");
		driver.findElementByXPath("//input[@name='submitButton' and @value='Update']").click();
		WebElement getCompanyName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']");
		String confirmCompanyName=getCompanyName.getText();
		System.out.println(confirmCompanyName);
		driver.close();
		
	}

}
