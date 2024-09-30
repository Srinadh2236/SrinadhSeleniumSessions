package acctionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {

	public static void main(String[] args) {

		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(By.id("input-firstname")), "Naveen").perform();
		
		act.click(driver.findElement(By.xpath("//input[@name='agree']"))).perform();
		
		
		//WebElement -- sendkeys
		// Actions -----move----click----sendkeys
		
		//WE.click();----click
		//AC.click();---move-click
		
		//in actions class it move fitst and click then will perfom what ever sendkeys or click
		
		
		
		
	}
	
	static WebDriver driver;
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	public static void doActionSendkeys(By locator ,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
