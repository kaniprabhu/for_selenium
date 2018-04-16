package week1.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TrainTicketWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Contact Us").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> arrayList = new ArrayList<String>();
		arrayList.addAll(allWindows);
		driver.switchTo().window(arrayList.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.findElementByXPath("//*[@class='content-ele']/p[2]").getText());
		
//		System.out.println(driver.findElementByXPath("//*[text()[contains(.,'Fax no. : ')]]").getText());
		driver.close();
		driver.switchTo().window(arrayList.get(0));
		driver.findElementById("usernameId").sendKeys("aaaaa");
	}

}
