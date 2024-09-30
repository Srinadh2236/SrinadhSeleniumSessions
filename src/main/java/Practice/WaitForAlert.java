package Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());// only js alerts is there are not
//		System.out.println(alert.getText());
//		alert.accept();

	}

	public static String getAlertText(int timeOut) {
	     return	waitForAlertAndSwitch(timeOut).getText();
	}
	
	public static void acceptAlert(int timeOut) {
		
		waitForAlertAndSwitch(timeOut).accept();
	}
	
	public static void dismissAlert(int timeOut) {
		waitForAlertAndSwitch(timeOut).dismiss();
	}
	
	public void enterValueOnAlert(int timeOut,String value) {
		waitForAlertAndSwitch(timeOut).sendKeys(value);
	}
	
	public static Alert waitForAlertAndSwitch(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());

	}
	
	//Wait for frame:
	
	public static WebDriver waitForFrameUsingLocatorAndSwitchToIt(int timeOut,By frameLocator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
	public static WebDriver waitForFrameUsingLocatorAndSwitchToIt(String idOrName,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}
	
	public static WebDriver waitForFrameUsingLocatorAndSwitchToIt(int frameIndex,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	
	public static WebDriver waitForFrameUsingLocatorAndSwitchToIt(WebElement frameElement,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
}
