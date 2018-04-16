package week1.day1;


	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class LearnWebTable {
		
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
			ChromeDriver driver = new ChromeDriver();	
			driver.get("https://erail.in/");		
			driver.manage().window().maximize();		
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementById("txtStationFrom").clear();
			driver.findElementById("txtStationFrom").sendKeys("MS", Keys.TAB);
			
			driver.findElementById("txtStationTo").clear();
			driver.findElementById("txtStationTo").sendKeys("SBC", Keys.TAB);
			driver.findElementById("chkSelectDateOnly").click();			
			WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			//Row count
			System.out.println(rows.size());
			for(int row=0;row<rows.size();row++)
			{
			List<WebElement> columns = rows.get(0).findElements(By.tagName("td"));
			//Column Count
			System.out.println(columns.size());
			System.out.println(columns.get(1).getText());
			for(int column=0;column<columns.size();column++)
			{
				System.out.println(columns.get(1).getText());
			}
			}
		}
	}
