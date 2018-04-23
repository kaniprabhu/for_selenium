package week1.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='✕']").click();
		driver.findElementByName("q").sendKeys("bags");
		driver.findElementByXPath("//button[@type='submit']").click();
		Thread.sleep(5000);
		//WebElement eleprice = driver.findElementByXPath("//div[@class='_1vC4OE']");
//		System.out.println(eleprice.getText());
		List<WebElement> allprice = driver.findElementsByXPath("//div[@class='_1vC4OE']");
		for (WebElement eachprice : allprice) {
			System.out.println(eachprice);
		}

	}
}
