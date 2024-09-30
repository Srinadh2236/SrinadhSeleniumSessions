package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RelativeLocatorConceptPractice {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.spicejet.com/");
		
//		By addons=By.xpath("//div[text()='Add-ons']");
//		By visaServices =By.xpath("//div[text()='Visa Services']");
//		
//		Actions act= new Actions(driver);
//		act.moveToElement(driver.findElement(addons)).perform();
//		
//		driver.findElement(visaServices).click();
//
//		driver.get("https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-T4&gad_source=1&gclid=CjwKCAjwodC2BhAHEiwAE67hJHKy8d4oSBiKyieiZ4OAf2ARE_248HPXsPwDsQm2eUbySHwueboqXhoCv1sQAvD_BwE");
//		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.linkText("Beverages"))).perform();
//		Thread.sleep(2000);
//			act.moveToElement(driver.findElement(By.linkText("Tea"))).perform();
//			Thread.sleep(2000);
//			driver.findElement(By.linkText("Tea Bags")).click();
		
//		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//		Actions act = new Actions(driver);
//		act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
//		
//		driver.findElement(By.xpath("//span[text()='Paste']")).click();
		
		
		//actions sendkey with pause
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	WebElement  id=	driver.findElement(By.id("input-firstname"));
//		Actions act = new Actions(driver);
//		String name = "Naveen";
//	char ch[]=	name.toCharArray();
//	
//	for(char c :ch) {
//		
//		act.sendKeys(id, String.valueOf(c)).pause(200).perform();
//
//	}
	
		driver.get("");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();//-- partial page down
		act.sendKeys(Keys.PAGE_UP).perform();
		
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();///bottom of the page
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		
//tab 		
			act.sendKeys(id, "Naveen")
			.sendKeys(Keys.TAB)
			.pause(200)
			.sendKeys("automations")
			.sendKeys(Keys.TAB)
			.pause(200)
			.sendKeys("selenium");
			
		
//scroll to element		
		act.scrollToElement(driver.findElement(By.linkText("privacy policy"))).click(driver.findElement(By.linkText("privacy policy"))).perform();
		
		
		
		
		
		
		
	}
}
