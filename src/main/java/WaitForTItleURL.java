import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webElement.ElementUtil;

public class WaitForTItleURL {

	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		//driver.get("https://classic.crmpro.com/");
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		 
		 driver.findElement(By.linkText("Login")).click();// clicking into the login url to check urlcontain method
		//if sometime applications may be slow at that time
//		driver.getTitle();// loading... // checking....//null
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		//title returing the booolen stred in flag
//		boolean flag= false;
//	try 
//	{
//		 flag=	wait.until(ExpectedConditions.titleIs("Free CRM software for customer relationship management, sales, and support."));
//		flag=true;
//	}
//	catch (TimeoutException e) {
//		System.out.println("title is not matched");
//	}
////		if(flag) {
////			System.out.println(driver.getTitle());
////		}
////		else {// if title given wrong it wnt come to else part because it will throw the exception so improving the code by try catch blcock
////			System.out.println("title is not matched");
////		}
////		
//	if(flag) {
//		System.out.println("Pass");
//	}
//	else
//	{
//		System.out.println("Fail");
//	}
	
//	String title=getPageTitleIs("Free CRM software for customer relationship management, sales, and support", 5);
//	System.out.println(title);
		
//	String title=	getPageTitleContains("Free CRM software ", 5);
//	System.out.println(title);
	
	ElementUtil util = new ElementUtil(driver);
	String url=util.getPageURLContains("route=account/login", 5);
	System.out.println(url);
	
	
	
}
	static WebDriver driver;
	
	public static String getPageTitleIs(String expectedTitle,int timeOut) {
	if(	waitForTitle(expectedTitle, timeOut)) {
		return driver.getTitle();
	}
	else
	{
		return "-1";
	}
	}
	
	public static String getPageTitleContains(String expectedTitle,int timeOut) {
		if(	waitForTitleContains(expectedTitle, timeOut)) {
			return driver.getTitle();
		}
		else
		{
			return "-1";
		}
		}
	
	public static boolean waitForTitle(String expectedTitle,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		//boolean flag= false;
		try 
		{
		return wait.until(ExpectedConditions.titleIs(expectedTitle));// if title not matched it will throw timeout exception, if matched return true 
		}
		catch (TimeoutException e) {
			System.out.println("title is not matched");
			return false;
		}
	}
	public static boolean waitForTitleContains(String frationTitle,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		//boolean flag= false;
		try 
		{
		return wait.until(ExpectedConditions.titleContains(frationTitle));// if title not matched it will throw timeout exception, if matched return true 
		}
		catch (TimeoutException e) {
			System.out.println("title is not matched");
			return false;
		}
	}
}
