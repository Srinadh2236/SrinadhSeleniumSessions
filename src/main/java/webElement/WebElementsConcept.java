package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsConcept {

	public static void main(String[] args) throws InterruptedException {
		
	   // BrowserUtil brutil = new BrowserUtil();
	   // WebDriver driver=  brutil.launchBrowser("chrome");

		 driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		//formula
		//create a WebElement (FE) + perform action (sendkeys ,click,getText,isDisplayed)
		
		//1.
//		driver.findElement(By.id("input-firstname")).sendKeys("Maruboina");
//		driver.findElement(By.id("input-lastname")).sendKeys("Srinadh");
//		driver.findElement(By.id("input-email")).sendKeys("Srinadh@gmail.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
//		driver.findElement(By.id("input-password")).sendKeys("Srinadh@123");
//		driver.findElement(By.id("input-confirm")).sendKeys("Srinadh@123");
//		
		
//		//2.
//		WebElement FName=	driver.findElement(By.id("input-firstname"));// returning the webelement 
//		WebElement LName = driver.findElement(By.id("input-lastname"));
//		
//		FName.sendKeys("Marboina");
//		LName.sendKeys("Srinadh"); // 
//		
//		FName.clear();// clearing the webelement
//		LName.clear(); 
//		
//		Thread.sleep(2000);// pause 2 sec
//		
//		FName.sendKeys("Srinadh"); // here reusabilaty 
//		LName.sendKeys("Maruboina");
//		
		//3.By locator
		
//		By FName=	By.id("input-firstname");// returing the by class reference so stoting the same class.
//		By LName= By.id("input-lastname");	
//	
//		// now create webelemnt
////		driver.findElement(FName).sendKeys("Srinadh");
////		driver.findElement(LName).sendKeys("Maruboina");
////		
//		//or
//		
//		WebElement fname=	driver.findElement(FName);
//		WebElement lname= driver.findElement(LName);
//		
//		fname.sendKeys("Srinad");
//		lname.sendKeys("Maruboina");
		
		//4. By locator + generic method for webelement
//		By Fname=By.id("input-firstname");
//		By Lname=By.id("input-lastname");
//		getElement(Fname).sendKeys("Srinadhhhhhhhhhhhhhhhh");
//		getElement(Lname).sendKeys("Maruboinaaaaaaaaaaaaaa");
//		
		//5.By locator + generic method for webelement And action(sendkeys)
//		
//		By FName =By.id("input-firstname");
//		By LName=	By.id("input-lastname");
//		
//	     doSendkeys(FName, "Srinadhhhh");
//	     doSendkeys(LName, "maruboina");
//		
		//6.By locator + generic method for webelement And action(sendkeys) and creating ElementUtility.
		
		
		By FName =By.id("input-firstname");
		By LName=	By.id("input-lastname");

		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendkeys(FName, "Srinaddddd");
		elUtil.doSendkeys(LName, "Maruboinaaaa");
		
	}
	
	static WebDriver  driver;
	
	public static void doSendkeys(By locator,String value) {
	
		getElement(locator).sendKeys(value);
	}

	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	

}
