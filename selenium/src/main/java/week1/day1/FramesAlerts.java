package week1.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//*[text()='Try it']").click();
		String str1="TestLeaf"; 
		driver.switchTo().alert().sendKeys(str1);
//		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		String str2=driver.findElementById("demo").getText();
		if(str2.contains(str1))
		{
			System.out.println("Content Found");
		}
		else
		{
			System.out.println("Content Not Found");
		}
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
		

	}

}
