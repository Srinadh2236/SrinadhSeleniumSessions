import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webElement.ElementUtil;

public class ExplicitWaitPollingTime {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId=By.id("input-email");
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));//this is default polling time 500milli sec
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));// here polling time is 2 sec
		wait.until(ExpectedConditions.visibilityOfElementLocated(emailId)).sendKeys("Naveem@gmail.com");
		
		driver.findElement(By.id("input-password")).sendKeys("Naveem@1223");
		By login= By.xpath("//input[@value='Login']");
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.waitForElementAndClick(login, 5);
	}

}
