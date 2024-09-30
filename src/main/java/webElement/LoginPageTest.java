package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumSessions.BrowserUtil;

public class LoginPageTest {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil bUtil = new BrowserUtil();
		WebDriver driver = bUtil.launchBrowser("chrome");
		driver.manage().window().maximize();
		bUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		ElementUtil eUtil = new ElementUtil(driver);

		By emaiID = By.id("input-email");
		By password = By.id("input-password");

		eUtil.doSendkeys(emaiID, "Srinadh@gmail.com");
		eUtil.doSendkeys(password, "Srinadh@12345");

		// Navigating the loginPage to RegisterPage
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By regFName = By.id("input-firstname");
		By regLName = By.id("input-lastname");
		By regEmaiID = By.id("input-email");
		By regTPhone = By.id("input-telephone");
		By regPassword = By.id("input-password");
		By regConPassowd = By.id("input-confirm");

		eUtil.doSendkeys(regFName, "Srinad");
		Thread.sleep(1000);
		eUtil.doSendkeys(regLName, "Maruboina");
		Thread.sleep(1000);
		eUtil.doSendkeys(regEmaiID, "Srinadh@gmail.com");
		Thread.sleep(1000);
		eUtil.doSendkeys(regTPhone, "9876543210");
		Thread.sleep(1000);
		eUtil.doSendkeys(regPassword, "Srinad@1234");
		Thread.sleep(1000);
		eUtil.doSendkeys(regConPassowd, "Srinadh@1234");
		Thread.sleep(3000);

		bUtil.quitBrowser();
		
		

	}

}
