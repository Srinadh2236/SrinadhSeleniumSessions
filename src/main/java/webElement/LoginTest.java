package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumSessions.BrowserUtil;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {

//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.google.com");
//			
//		driver.manage().window().maximize();
//		
//		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		
//		driver.navigate().back();
//		
//		driver.navigate().forward();
//		
//		
//		driver.findElement(By.linkText("Register")).click();
//		
//		driver.findElement(By.name("agree")).click();
//		
		
		//BrowserUtil bUtil = new BrowserUtil();
		 // driver=bUtil.launchBrowser("chrome");
		driver = new ChromeDriver();  
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// ElementUtil eUtil = new ElementUtil(driver);
		
		By Lg=By.linkText("login");
		  By LR =By.linkText("Register");
		  
		 doClick(LR);
		 
		
	}

	static WebDriver driver;
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
}
