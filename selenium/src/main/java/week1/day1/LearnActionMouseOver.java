package week1.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnActionMouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		Actions builder=new Actions(driver);
				
		WebElement appliance = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement cooler = driver.findElementByXPath("//span[text()='Air Coolers']");
		WebElement ac = driver.findElementByXPath("(//span[text()='Air Conditioners'])[2]");
		builder.moveToElement(appliance).perform();
		Thread.sleep(3000);
		builder.click(cooler).perform();
//		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(appliance));
		builder.moveToElement(appliance).perform();
		Thread.sleep(3000);
		builder.click(ac).perform();
	}

}
