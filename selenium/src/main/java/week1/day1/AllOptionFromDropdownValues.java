package week1.day1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionFromDropdownValues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		WebElement countries = driver.findElementById("userRegistrationForm:countries");
		Select countriesObj=new Select(countries);
		countriesObj.selectByVisibleText("India");
		List<WebElement> allOptionValueDisplay = countriesObj.getOptions();
		for(int i=0;i<allOptionValueDisplay.size();i++)
		{
			System.out.println(allOptionValueDisplay.get(i).getText());
		}
		Thread.sleep(3000);
		
	}

}
