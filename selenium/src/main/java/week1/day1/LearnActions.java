package week1.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		int x=item3.getLocation().getX();
		int y=item3.getLocation().getY();
		Actions builder=new Actions(driver);
		builder.clickAndHold(item1).dragAndDropBy(item1, x, y).release(item1).perform();
	}

}
