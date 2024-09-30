package acctionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevel {

	public static void main(String[] args) throws InterruptedException {

		 driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");
 By level1=	By.xpath("(//span[text()='Shop by'])[2]");
	By level2=By.linkText("Beverages");
	By level3=By.linkText("Tea");
	By level4 =By.linkText("Green Tea");
//		Actions act = new Actions(driver);
//		
//		driver.findElement(level1).click();
//		Thread.sleep(1500);
//		act.moveToElement(driver.findElement(level2)).perform();
//		Thread.sleep(1500);
//		act.moveToElement(driver.findElement(level3)).perform();
//		Thread.sleep(1500);
//		driver.findElement(level4).click();
	
	parentChildMenu(level1, level2, level3, level4);
		
	}
	static WebDriver driver;
	public static void parentChildMenu(By level1,By level2,By level3,By level4) throws InterruptedException {
		Actions act = new Actions(driver);
		getElement(level1).click();
		Thread.sleep(1500);
		act.moveToElement(getElement(level2)).perform();
		Thread.sleep(1500);
		act.moveToElement(getElement(level3)).perform();
		Thread.sleep(1500);
		getElement(level4).click();
		
		
	}
	public static WebElement getElement(By loactor) {
		return driver.findElement(loactor);
	}

}
