package week1.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://leafground.com/pages/Dropdown.html");
	WebElement selectOption = driver.findElementById("dropdown1");
	Select valueOption=new Select(selectOption);
	List<WebElement> selectAllOptions = valueOption.getOptions();
	valueOption.selectByIndex(selectAllOptions.size()-1);
	}

}
