package mavenproject.project3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	public static WebDriver driver;
    public static void main( String[] args ) throws InterruptedException
    {
      System.setProperty("webdriver.chrome.driver", "/Users/hajramahmood/Desktop/eclipse-workspace/testng/drivers/chromedriver");
		driver=new ChromeDriver();  // opening browser	
		
		driver.get("https://www.facebook.com"); 
		Thread.sleep(5000);
		
//		List<WebElement> Links = driver.findElements(By.tagName("a"));  
		
//		for (int i=0; i<Links.size()-1; i++) {
//			System.out.println(Links.get(i).getAttribute("href"));
//		}
		
		List<WebElement> Links = driver.findElements(By.tagName("img"));   //example of all the links for an image
		
		for (int i=0; i<Links.size()-1; i++) {
			System.out.println(Links.get(i).getAttribute("src"));
		}
		
		
    }
}
