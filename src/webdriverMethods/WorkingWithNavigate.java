package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigate {
	public static void main(String[] args) throws InterruptedException {
		// launching browser
		WebDriver driver = new ChromeDriver();
		
		//it will return navigation interface
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
		//it will navigate to web page
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		//it will move back 
		Thread.sleep(2000);
		driver.navigate().back();
		//it will move forward
		Thread.sleep(2000);
		driver.navigate().forward();
		//it will refresh the webpage
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
