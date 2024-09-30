import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());// it will automaticaly switch to the alert no need to swithc to alert.
		
		System.out.println(alert.getText());
		
		alert.accept();
		
	

	}

	static WebDriver driver;
	
	public static Alert waitForAlertAndSwitch(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
		
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
	
	public static void enterValueOnAlert(int timeOut,String value) {
		waitForAlertAndSwitch(timeOut).sendKeys(value);

	}
	
}
