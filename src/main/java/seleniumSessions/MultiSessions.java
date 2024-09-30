package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiSessions {

	public static void main(String[] args) {
			
		//**** interview points
		
		WebDriver driver = new ChromeDriver(); //123
		driver = new ChromeDriver();//456
		driver = new ChromeDriver();//789 // how many browser will be open? and how many session will be created?
									//  3 browser will be open and 3 diffrent session id will  be created.
		driver = new FirefoxDriver();//211
		driver.get("https://www.google.com");//211
		String title =driver.getTitle();
		System.out.println(title);
		driver.quit();// firefox browser will be closed here.
		
	}

}
