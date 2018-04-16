package week1.day1;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllTrainNames {

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
		List<WebElement> rows_table = table.findElements(By.tagName("tr"));
		int rows_count=rows_table.size();
		//Row count
		System.out.println(rows_count);

		for(int row=0;row<rows_count;row++)
		{
			List<WebElement> columns_row = rows_table.get(row).findElements(By.tagName("td"));
			int columns_count=columns_row.size();
			//				for(int column=0;column<columns_count;column++)
			//				{
			String celtext=columns_row.get(1).getText();
			//					String celtext=columns_row.get(column).getText();					
			//					 System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
			System.out.println(celtext);
			System.out.println("Columns Count "+columns_count);
			//	    	    }
			
		}
	}
}