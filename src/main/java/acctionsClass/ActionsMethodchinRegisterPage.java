package acctionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodchinRegisterPage {

	public static void main(String[] args) {

		// by using TAB key to enter all field for the registration page
		//accessbility testing tab sequence is working or not
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By fstName = By.id("input-firstname");
		WebElement name = driver.findElement(fstName);
		Actions act = new Actions(driver);
		act.sendKeys(name, "Naveen")
			.sendKeys(Keys.TAB)
			.pause(300)
			.sendKeys("autimation")
			.sendKeys(Keys.TAB)
			.pause(300)
			.sendKeys("Naveewn@gmail.com")
			.sendKeys(Keys.TAB)
			.pause(300)
			.sendKeys("9858965866")
			.sendKeys(Keys.TAB)
			.pause(300)
			.sendKeys("Naveen@123")
			.sendKeys(Keys.TAB)
			.pause(300)
			.sendKeys("Naveen@123")
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.SPACE)
			.click()
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.ENTER)
			.build()
			.perform();
		
			
			
	}

}
