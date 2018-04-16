package week1.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MergeLead {

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
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//*[@alt='Lookup'])[1]").click();
		Set<String> fromWindow = driver.getWindowHandles();
		List<String> fromWindowList = new ArrayList<String>();
		fromWindowList.addAll(fromWindow);
		driver.switchTo().window(fromWindowList.get(1));
		driver.findElementByName("id").sendKeys("10528");
		driver.findElementByXPath("//*[text()='Find Leads' and @type='button']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//*[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(fromWindowList.get(0));
		driver.findElementByXPath("(//*[@alt='Lookup'])[2]").click();
		Set<String> toWindow = driver.getWindowHandles();
		List<String> toWindowList = new ArrayList<String>();
		toWindowList.addAll(toWindow);
		driver.switchTo().window(toWindowList.get(1));
		driver.findElementByName("id").sendKeys("10526");
		driver.findElementByXPath("//*[text()='Find Leads' and @type='button']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//*[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(toWindowList.get(0));
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys("10528");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		WebElement getMessage = driver.findElementByXPath("//*[@class='x-paging-info']");
		String getMessageDetails=getMessage.getText();
		System.out.println(getMessageDetails);
//		driver.close();
		
	}

}
