package webdriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithFindElemt {
	public static void main(String[] args) throws InterruptedException {
		// launching browser
		WebDriver driver = new ChromeDriver();
		
		// launching webapplication using get(string url) method
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//it locate or identify the webelements of that particular webpage
//		Thread.sleep(6000);
		WebElement Username = driver.findElement(By.xpath("//input[@name='email']"));
		Username.sendKeys("Nikhil");
	}

}
