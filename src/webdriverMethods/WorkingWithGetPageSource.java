package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetPageSource {
	public static void main(String[] args) {
		// launching browser
		WebDriver driver = new ChromeDriver();
		
		// launching webapplication using get(string url) method
		driver.get("https://www.facebook.com");
		
		//it will return the source code of that particular web page
		String s = driver.getPageSource();
		System.out.println("Souce Code is "+s);
	}

}
