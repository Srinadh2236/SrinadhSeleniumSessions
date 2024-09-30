package acctionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazonTabing {

	public static void main(String[] args) throws InterruptedException {

		
		//amazon search feild entering buy using only TAB
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.in");
//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.TAB)
//			.pause(400)
//			.sendKeys(Keys.TAB)
//			.pause(400)
//			.sendKeys(Keys.TAB)
//			.pause(400)
//			.sendKeys(Keys.TAB)
//			.pause(400)
//			.sendKeys(Keys.TAB)
//			.pause(400)
//			.sendKeys("macbook")
//			.pause(400)
//			.sendKeys(Keys.ENTER)
//			.build()
//			.perform();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
	 act.sendKeys(Keys.TAB)
		.pause(400)
		.sendKeys(Keys.TAB)
		.pause(400)
		.sendKeys(Keys.TAB)
		.pause(400)
		.sendKeys("macbook pro")
		.pause(400)
		.sendKeys(Keys.ENTER)
		.build()
		.perform();
		
		
	}

}
