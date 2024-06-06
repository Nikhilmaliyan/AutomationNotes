package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCloseMethod {
	public static void main(String[] args) throws InterruptedException {
		// launching browser
		WebDriver driver = new ChromeDriver();
		
		// launching webapplication using get(string url) method
		driver.get("https://www.facebook.com");
		
		//it will close the parent webpage
		Thread.sleep(4000);
		driver.close();
	}

}
