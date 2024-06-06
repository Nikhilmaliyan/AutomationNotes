package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetTitle {
	public static void main(String[] args) {
		// launching browser
		WebDriver driver = new ChromeDriver();
		
		// launching webapplication using get(string url) method
		driver.get("https://www.facebook.com");
		
		// it will return title of that particular webpage
		String s = driver.getTitle();
		 System.out.println("Title is "+s);
	}

}
