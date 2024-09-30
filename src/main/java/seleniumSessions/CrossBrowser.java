package seleniumSessions;

import javax.management.RuntimeErrorException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {

	public static void main(String[] args) {

		String browser = "chrome";

		WebDriver driver = null;

		switch (browser.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the valid browser :" + browser);
			throw new BrowserException("==============Inavlid Browser=================");
		
		}

		driver.get("https://naveenautomationlabs.com/opencart/");
		String title = driver.getTitle();
		System.out.println("title of the page :"+title);

		String currentURL = driver.getCurrentUrl();

		System.out.println("Current page URL :"+currentURL);

		driver.quit();
	}

}
