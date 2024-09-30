package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClick {

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// driver.manage().window().maximize();
		windowMax();
		
		// clicking login link and register links
		// driver.findElement(By.linkText("Login")).click();
		// driver.findElement(By.linkText("Register")).click();
		// check box in reg page.
		// driver.findElement(By.name("agree")).click();

		//By locators
		By regFname = By.id("input-firstname");
		By regLname =By.id("input-lastname");
		//driver.findElement(regFname).sendKeys("Sinadh");//direct use
	
		//	doSendkeys(regFname, "Srinadh");//  by using methods
		
		//by locators for links and check box
		By loginLink = By.linkText("Login");
		By regLink = By.linkText("Register");
		By checkB = By.name("agree");
		by.

		// method calling to click login and regsiter links
		doClick(loginLink);
		doClick(regLink);
		
		// sending key by using dosendkeys methods in textbox. and clicking the checkbox
		
		doSendkeys(regFname, "Srinad");
		doSendkeys(regLname, "Maruboina");
		doClick(checkB);

	}

	//utility's methods to use generic methods 
	static WebDriver driver;
	
	public static void windowMax() { // to maximize the window big
		driver.manage().window().maximize();
	}

	public static void doSendkeys(By locator, String value) {// to passthe values in textbox by using sendkeys

		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {// to click links and buttons and images 
		getElement(locator).click();
	}

	public static WebElement getElement(By locator) {// to create  webElement(FE) findElements
		return driver.findElement(locator);
	}

}
