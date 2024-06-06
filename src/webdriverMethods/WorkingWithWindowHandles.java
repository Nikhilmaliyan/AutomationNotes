package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		// launching browser
		WebDriver driver = new ChromeDriver();
		
		// launching webapplication using get(string url) method
		driver.get("https://www.facebook.com");
		
		//it will return the unique identifier it'll keep on change every time
		Thread.sleep(4000);
		String s1 = driver.getWindowHandle();
		
		System.out.println(s1);
		
	}

}
