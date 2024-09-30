package acctionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//driver.get("https://www.amazon.in");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		//partial Scrolling
		Actions act = new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.PAGE_UP).build().perform();
//		//
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();//-------------page bottom
//		
//		Thread.sleep(2000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();// -------------page top
//		
		
		//scroll to element
		
		act.scrollToElement(driver.findElement(By.linkText("About Us")))
				.pause(500) //wait for half second before clicking 
					.click(driver.findElement(By.linkText("About Us")))	
						.build().perform();
	}

}
