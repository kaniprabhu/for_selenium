package week1.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLeaf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit' and @value='Login']").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByLinkText("Phone").click();
		driver.findElementByName("phoneCountryCode").clear();
		driver.findElementByName("phoneCountryCode").sendKeys("91");
		driver.findElementByName("phoneAreaCode").sendKeys("810");
		driver.findElementByName("phoneNumber").sendKeys("5830508");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		WebElement captureLeadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		String displayLeadId=captureLeadId.getText();
		System.out.println("Captured Lead ID is "+displayLeadId);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").click();
		driver.findElementByName("id").sendKeys(displayLeadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		WebElement errorMessage = driver.findElementByXPath("//div[@class='x-paging-info' and text()='No records to display']");
		String errorMessageDisplay=errorMessage.getText();
		System.out.println("Captured Error Message is "+errorMessageDisplay);
		driver.close();
	}

}
