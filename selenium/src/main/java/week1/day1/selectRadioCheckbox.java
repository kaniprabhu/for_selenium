package week1.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class selectRadioCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://leafground.com/pages/checkbox.html");
	System.out.println(driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/input").isSelected());
	System.out.println(driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/input[1]").isSelected());
	}

}
