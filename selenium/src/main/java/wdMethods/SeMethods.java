package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

//import okhttp3.internal.cache.DiskLruCache.Snapshot;

public class SeMethods implements WdMethods{

	RemoteWebDriver driver = null;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			//Maximize the browser
			driver.manage().window().maximize();
			//Load the URL
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The "+browser+" browser launched successfully");
//			takeSnap();
		} catch (NullPointerException e) {
			System.err.println("Element not found");
			e.printStackTrace();
		}catch(WebDriverException e) {
			System.err.println("WebDriver Exception occurred");
			e.printStackTrace();
		}catch(Exception e) {
			System.err.println("Exception occurred");
			e.printStackTrace();
		}
		finally {
			takeSnap();
		}
	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		try {
			switch (locator) {
			case "id":
				ele = driver.findElementById(locValue);
				break;
			case "class":
				ele = driver.findElementByClassName(locValue);
				break;
			case "linktext":
				ele = driver.findElementByLinkText(locValue);
				break;
			case "xpath":
				ele = driver.findElementByXPath(locValue);
				break;
			case "name":
				ele = driver.findElementByName(locValue);
				break;
			}
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
		return ele;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("The given value is entered "+data);
			takeSnap();
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The element is clicked successfully");
			takeSnap();
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
	}
	public void clickWithoutSnap(WebElement ele)
	{
		try {
			ele.click();
			System.out.println("The element is clicked successfully");
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
	}
	
	public void clear(WebElement ele)
	{
		try {
			ele.clear();
			System.out.println("Content is cleared successfully");
			takeSnap();
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
	}

	public String getText(WebElement ele) {
		String text="";
		try {
			text = ele.getText();
			System.out.println("The element text is "+text);
			takeSnap();
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
		return text;
	}
	public String getTitle()
	{
		try {
			System.out.println(driver.getTitle());
			System.out.println("The title of the page is retrieved successfully");
			takeSnap();
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
		return driver.getTitle();
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select select = new Select(ele);
			select.selectByVisibleText(value);
			System.out.println("Selected drop down text is ");
			takeSnap();
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			Select select = new Select(ele);
			select.selectByIndex(index);
			System.out.println("Selected drop down index value is ");
			takeSnap();
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
	}

	public boolean verifyTitle(String expectedTitle) {
		try {
			String title=driver.getTitle();
			if(title.equals(expectedTitle))
				System.out.println("Verified Title and Expected title is ");
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			if(ele.getText().equals(expectedText))
			{
				System.out.println("The text "+ele.getText()+" is matched with "+expectedText);
			}
			else
			{
				System.out.println("The text is not match");
			}
			takeSnap();
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		try {
			if(ele.getText().contains(expectedText))
			{
				System.out.println("The text "+ele.getText()+" is matched with "+expectedText);
			}
			else
			{
				System.out.println("The text is not match");
			}
			takeSnap();
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		try {
			if(ele.getAttribute(attribute).equals(value))
			{
				System.out.println("Attribute is matched");
			}
			else
			{
				System.out.println("Attribute is not matched");
			}
			takeSnap();
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
			if(ele.getAttribute(attribute).contains(value))
			{
				System.out.println("Attribute is matched");
			}
			else
			{
				System.out.println("Attribute is not matched");
			}
			takeSnap();
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
	}

	public void verifySelected(WebElement ele) {
		try {
			if(ele.isSelected())
			{
				System.out.println("Element is selected");
			}
			else
			{
				System.out.println("Element is not selected");
			}
			takeSnap();
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
	}

	public void verifyDisplayed(WebElement ele) {
		try {
			if(ele.isDisplayed())
			{
				System.out.println("Element is visibile");
			}
			else
			{
				System.out.println("Element is not visible");
			}
			takeSnap();
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
	}


	public void switchToWindow(int index) {
		try {
			Set<String> fromWindow = driver.getWindowHandles();
			List<String> fromWindowList = new ArrayList<String>();
			fromWindowList.addAll(fromWindow);
			driver.switchTo().window(fromWindowList.get(index));
			System.out.println("Switch to window successfully");
		} catch (NoSuchWindowException e) {
			System.err.println("Window not found");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.err.println("WebDriver Exception occured");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
	}

	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
			System.out.println("Switch to Frame successfully");
			takeSnap();
		} catch (NoSuchFrameException e) {
			System.err.println("Frame not found");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.err.println("WebDriver Exception occured");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
			System.out.println("ACCEPT alert successfully");
		} catch (UnhandledAlertException e) {
			System.err.println("Alert not handled");
			e.printStackTrace();
		}catch (NoAlertPresentException e) {
			System.err.println("Alert not Present");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.err.println("WebDriver Exception occured");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}

	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("DISMISS alert successfully");
		} catch (UnhandledAlertException e) {
			System.out.println("Alert not handled");
			e.printStackTrace();
		}catch (NoAlertPresentException e) {
			System.err.println("Alert not Present");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.err.println("WebDriver Exception occured");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}

	}

	public String getAlertText() {
		String alertText="";
		try {
			alertText = driver.switchTo().alert().getText();
			System.out.println("Captured alert message successfully");
		} catch (UnhandledAlertException e) {
			System.out.println("Alert not handled");
			e.printStackTrace();
		}catch (NoAlertPresentException e) {
			System.err.println("Alert not Present");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.err.println("WebDriver Exception occured");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}
		return alertText;
	}

	int i =1;
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		try {
			driver.close();
			System.out.println("Successfully closed current browser");
		} catch (NoSuchWindowException e) {
			System.out.println("Window not found");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.err.println("WebDriver Exception occured");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}

	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			System.out.println("Successfully closed all browsers");
		} catch (NoSuchWindowException e) {
			System.err.println("Window not found");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.err.println("WebDriver Exception occured");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception occured");
			e.printStackTrace();
		}

	}

}
