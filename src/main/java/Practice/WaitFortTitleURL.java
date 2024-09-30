package Practice;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFortTitleURL {

	public static void main(String[] args) {

		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		driver.getTitle();//loading.... checking.....null
		
		//we will wait for title and url also
		
		
		//good selenium programers always the get title waits
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.u)
//		boolean flag=false;
//		try {
//		 flag=	wait.until(ExpectedConditions.titleIs("30-Day Advanced Free Trial | OrangeHRM"));
//		 flag= true;
//		}
//		catch (TimeoutException e) {
//			System.out.println("title not matched");
//			flag=false;
//		}
//		
//		
//		if(flag) {  // if its true then it will get the title of the page
//		System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
		
		
		
		
		
	}
	
static	WebDriver driver;

	public static String getPageTitle(String expectedTitle, int timeOut) {
	 
		
		boolean flag=waitForTitleIs(expectedTitle, timeOut);
		if (flag) {
			return driver.getTitle();
		}
		else {
			return "-1";
		}
	}
		public static boolean waitForTitleIs(String expectedTitle, int timeOut) {
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		
		try {
		 return	wait.until(ExpectedConditions.titleIs(expectedTitle));
		
		}
		catch (TimeoutException e) {
			System.out.println("title not matched");
			return false;
		}
		
		
		
	}
		
		public static String getPageTitleContains(String fractionTitle, int timeOut) {
			 
			
			boolean flag=waitForTitleContains(fractionTitle, timeOut);
			if (flag) {
				return driver.getTitle();
			}
			else {
				return "-1";
			}
		}

		public static boolean waitForTitleContains(String fractionTitle, int timeOut) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			
			try {
			 return	wait.until(ExpectedConditions.titleContains(fractionTitle));
			
			}
			catch (TimeoutException e) {
				System.out.println("title not matched");
				return false;
			}
			
			
			
		}
		
public static String getPageURLContains(String fractionURL, int timeOut) {
			 
			
			boolean flag=waitForURLContains(fractionURL, timeOut);
			if (flag) {
				return driver.getCurrentUrl();
			}
			else {
				return "-1";
			}
		}

public static boolean waitForURLContains(String fractionURL, int timeOut) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			
			try {
			 return	wait.until(ExpectedConditions.urlContains(fractionURL));
			
			}
			catch (TimeoutException e) {
				System.out.println("URL not matched");
				return false;
			}
			
			
			
		}
}
