package acctionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v126.dom.DOM.GetElementByRelationRelation;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {

	public static void main(String[] args) throws InterruptedException {
	
	 driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	
//	By addOns =By.xpath("//div[text()='Add-ons']");
//	By visaServices= By.xpath("(//div[text()='Visa Services'])[1]");
//
//	Actions act = new Actions(driver);
//	act.moveToElement(driver.findElement(addOns)).perform();
//	Thread.sleep(1500);
//
//	driver.findElement(visaServices).click();
	
	//parentChildMenu("Add-ons", "Visa Services");
	//parentChildMenu("SpiceClub", "Benefits");
	
	By addOns =By.xpath("//div[text()='Add-ons']");
	By visaServices= By.xpath("(//div[text()='Visa Services'])[1]");

	parentChildMenu(addOns, visaServices);
	
	}
	static WebDriver driver;
	
	public static void parentChildMenu(String parentMenu,String childMenu) throws InterruptedException {
		
//		By addOns =By.xpath("//div[text()='Add-ons']");
//		By visaServices= By.xpath("(//div[text()='Visa Services'])[1]");

		Actions act = new Actions(driver);
		act.moveToElement(getElement(By.xpath("//*[text()='"+parentMenu+"']"))).perform();
		Thread.sleep(1500);

		//driver.findElement(visaServices).click();	
		getElement(By.xpath("(//*[text()='"+childMenu+"'])[1]")).click();
	}
	//OverLoad method by locators
	public static void parentChildMenu(By parentMenu,By childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(1500);
		getElement(childMenu).click();
	}
	public static WebElement getElement(By loactor) {
	 return	driver.findElement(loactor);
	}

}
