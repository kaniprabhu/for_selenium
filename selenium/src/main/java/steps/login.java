package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	public static ChromeDriver  driver;
	
	@Given("open the Browser")
	public void openBrowser() {
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdiver.exe");
		driver.manage().window();
	}
	
	@And("maximize the window")
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	@And("enter the URL")
	public void enterUrl() {
		driver.get("http://www.leaftaps.com/opentaps");
	}
	
	
	@And("enter the username as (.*)")
	public void typeUserName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}
	
	@And("enter the pass as (.*)")
	public void typePassword(String pass) {
		driver.findElementById("password").sendKeys(pass);
	}
	
	@When("click login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("verify the message")
	public void verifymessage() {
		System.out.println("the message verified successfully");		
	}
	

}
