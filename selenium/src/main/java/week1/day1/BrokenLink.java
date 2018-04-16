package week1.day1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink  {
	@Test
	public void brokenLink() throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        List<WebElement> links = driver.findElements(By.tagName("a"));    
        System.out.println("Total links are "+links.size());    
        for(int i=0; i<links.size(); i++) {
            WebElement element = links.get(i);
            String url=element.getAttribute("href");
            verifyLink(url);     
        }
        driver.close();
    }
 

      public  void verifyLink(String urlLink) {
         try {
             URL link = new URL(urlLink);
             HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
             httpConn.setConnectTimeout(2000);
             httpConn.connect();
                 if(httpConn.getResponseCode()== 200) {  
                    System.out.println(urlLink+" - "+httpConn.getResponseMessage());
                }
                if(httpConn.getResponseCode()== 404) {
                    System.out.println(urlLink+" - "+httpConn.getResponseMessage());
                }
            }
         catch (Exception e) {
            e.printStackTrace();
         
        }
    } 
}
