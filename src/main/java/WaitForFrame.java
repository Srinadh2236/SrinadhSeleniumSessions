import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webElement.ElementUtil;

public class WaitForFrame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");

		By frameLocator = By.name("main");
		ElementUtil eUtil = new ElementUtil(driver);

		eUtil.waitForFrameUsingLocatorAndSwitchToIt(10, frameLocator);

		String header = driver.findElement(By.tagName("h2")).getText();

		System.out.println(header);
	}

}
