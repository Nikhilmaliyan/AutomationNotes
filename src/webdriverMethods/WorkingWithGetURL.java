package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetURL {
	public static void main(String[] args) {
		// launching browser
		WebDriver driver = new ChromeDriver();
		
		// launching webapplication using get(string url) method
		driver.get("https://www.facebook.com");
	}

}
