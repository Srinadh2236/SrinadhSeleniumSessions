package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toURL {

	public static void main(String[] args) {


		
		 WebDriver  driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 driver.navigate().to("https://www.amazon.com");
		 driver.navigate().to(new URL("https://www.abc.com"));
	}

}
