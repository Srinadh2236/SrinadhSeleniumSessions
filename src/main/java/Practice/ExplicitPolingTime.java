package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webElement.ElementUtil;

public class ExplicitPolingTime {

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// default polling time is 500 milli secs or sleep time other name
		// wait for 10 secs and polling time is 2s it means every 2s it will hit the
		// request (if not found again every 2s will send the request )
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email"))).sendKeys("Naveen@123");

		driver.findElement(By.id("input-password")).sendKeys("naveen@123");

		// ElementToBeClickable:

		waitForElementAndClick(By.linkText("Terms & Conditions"), 10);
 	}

	static WebDriver driver;
	//An expectation for checking an element is visible and enabled such that you can click it.

	public static void waitForElementAndClick(By locator, int TimeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

}
