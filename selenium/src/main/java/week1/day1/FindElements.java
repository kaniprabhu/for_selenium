package week1.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.google.co.in/");
	driver.findElementById("lst-ib").sendKeys("Kala",Keys.ENTER);
	List<WebElement> allOptions = driver.findElementsByXPath("//a[contains(text(),'Kala')]");
	System.out.println(allOptions.size());
	
	
	}

}
