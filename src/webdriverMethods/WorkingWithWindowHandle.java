package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		// launching browser
		WebDriver driver = new ChromeDriver();
		
		// launching webapplication using get(string url) method
		driver.get("https://www.facebook.com");
		
		//it will return the unique identifier it'll keep on change every time
		Thread.sleep(4000);
		 Set<String> s1 = driver.getWindowHandles();
		
		for(int i=1;i<s1.size();i++) {
		System.out.println(s1);
		}
	}

}
