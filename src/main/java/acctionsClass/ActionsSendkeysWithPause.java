package acctionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendkeysWithPause {

	public static void main(String[] args) {

		 driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		Actions act = new Actions(driver);
//		WebElement fitstName=	driver.findElement(By.id("input-firstname"));
//		
//		String myName ="Naveen Automation Labs";
//		
//		char ch[]=myName.toCharArray();
//		
//		for(char c:ch) {
//			act.sendKeys(fitstName, String.valueOf(c)).pause(200).perform();
//		}
		
		By firstName = By.id("input-firstname");
		
		doActionsSendkeysWithPause(firstName, "Naveen Automation Labs", 100);
		
	}
	static WebDriver driver;
	public static void doActionsSendkeysWithPause(By locator,String value,long pauseTime) {
		Actions act = new Actions(driver);
		char ch[]=value.toCharArray();
		for(char c:ch) {
			act.sendKeys(getElement(locator), String.valueOf(c)).pause(pauseTime).perform();
		}
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
