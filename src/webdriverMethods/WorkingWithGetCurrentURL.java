package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetCurrentURL {
	public static void main(String[] args) {
		// launching browser
		WebDriver driver = new ChromeDriver();
		
		// launching webapplication using get(string url) method
		driver.get("https://www.facebook.com");
		
		// it will return the current url[string] of that particular webPage
		String s = driver.getCurrentUrl();
		System.out.println("current url is "+s);
	}

}
