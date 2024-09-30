package seleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	WebDriver driver;

	/**
	 * this method launch the browser on the basis of given browser name
	 * 
	 * @param browserName
	 * @return this returns the driver
	 */
	public WebDriver launchBrowser(String browserName) {

		System.out.println(browserName + ": Browser Launched");

		switch (browserName.trim().toLowerCase()) {
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
			System.out.println("Please pass the valid browser :" + browserName);
			throw new BrowserException("======Invalid Browser========");

		}

		return driver;

	}
	/**
	 * launchingUrl
	 * @param url
	 */
	public void launchURL(String url) {// https://www.google.com
										// indexOf(http) it will check both http and https will give index is 0
										// if https is missing so index of value given -1;
		if (url.indexOf("http") != 0 || url.length() == 0) { // length of url is nothig
			throw new BrowserException("http(s) is missing in the URL");
		}

		driver.get(url);
	}

	/**
	 * overload method 
	 * @param url
	 */
	public void launchURL(URL url) {
		driver.navigate().to(url);
	}

	/**
	 * getpageTitle
	 * @return the String
	 */
	public String getPageTitle() {

		return driver.getTitle();
	}

	/**
	 * getpageUrl
	 * @return the current page Url
	 */
	public String getPageUrl() {

		return driver.getCurrentUrl();
	}

	/**
	 * quiting the brower
	 */
	public void quitBrowser() {

		driver.quit();
	}
	/**
	 * closing the browser
	 */
	public void closeBrowser() {

		driver.close();
	}

}
