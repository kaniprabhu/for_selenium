package week1.day1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TrainTicket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.findElementById("userRegistrationForm:userName").sendKeys("sivasubramanian_g");
		driver.findElementById("userRegistrationForm:password").sendKeys("anishkarthik");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("anishkarthik");
		WebElement securityQ = driver.findElementById("userRegistrationForm:securityQ");
		Select securityQObj=new Select(securityQ);
		securityQObj.selectByVisibleText("Who was your Childhood hero?");
		driver.findElementById("userRegistrationForm:securityAnswer");
		WebElement prefLang = driver.findElementById("userRegistrationForm:prelan");
		Select prefLangObj=new Select(prefLang);
		prefLangObj.selectByValue("en");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Sivasubramanian");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Gnanapandian");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		WebElement dobDay = driver.findElementById("userRegistrationForm:dobDay");
		Select dobDayObj=new Select(dobDay);
		dobDayObj.selectByValue("31");
		WebElement dobMonth = driver.findElementById("userRegistrationForm:dobMonth");
		Select dobMonthObj=new Select(dobMonth);
		dobMonthObj.selectByValue("01");
		Thread.sleep(3000);
		WebElement dateOfBirth = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dateOfBirthObj=new Select(dateOfBirth);
		dateOfBirthObj.selectByVisibleText("1973");
		Thread.sleep(3000);
		WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
		Select occupationObj=new Select(occupation);
		occupationObj.selectByVisibleText("Professional");
		Thread.sleep(3000);
		driver.findElementById("userRegistrationForm:uidno").sendKeys("123456789012");
		driver.findElementById("userRegistrationForm:idno").sendKeys("ALTPS3059P");
		WebElement countries = driver.findElementById("userRegistrationForm:countries");
		Select countriesObj=new Select(countries);
		countriesObj.selectByVisibleText("India");
		Thread.sleep(3000);
		driver.findElementById("userRegistrationForm:email").sendKeys("subramaniangsiva@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("8610720247");
		driver.findElementByXPath("//select[@id='userRegistrationForm:countries']/option[starts-with(text(),'E')]/following-sibling::option[1]").click();
/*		WebElement nationalityId = driver.findElementById("userRegistrationForm:nationalityId");
		Select nationalityIdObj=new Select(nationalityId);
		nationalityIdObj.selectByVisibleText("India");
*/		Thread.sleep(3000);
		driver.findElementById("userRegistrationForm:address").sendKeys("1/101");
		driver.findElementById("userRegistrationForm:street").sendKeys("Gandhi Street");
		driver.findElementById("userRegistrationForm:area").sendKeys("Taambaram");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600100",Keys.TAB);
		Thread.sleep(5000);
		WebElement cityName = driver.findElementById("userRegistrationForm:cityName");
		Select cityNameObj=new Select(cityName);
		cityNameObj.selectByVisibleText("Kanchipuram");
		Thread.sleep(5000);
		WebElement postofficeName = driver.findElementById("userRegistrationForm:postofficeName");
		Select postofficeNameObj=new Select(postofficeName);
		List<WebElement> postofficeNameAllOptions = postofficeNameObj.getOptions();
		postofficeNameObj.selectByIndex(postofficeNameAllOptions.size()-1);
		driver.findElementById("userRegistrationForm:landline").sendKeys("044 12345678");
		Thread.sleep(3000);
	}

}
