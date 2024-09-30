import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserWindowHandlingConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		Thread.sleep(3000);

		// target="_blank" in DOM links present --> will open new tab

		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));

		//executiveProfile.click();// child window
		// got error ElementClickInterceptedException because element not visible have
		//to scroll to bottom then only it click able
		
		Actions action = new Actions(driver);
		action.click(executiveProfile).perform();// so it move to the element and then it will click the element
		
		 /////////         OR  Java Script scroll               ///////////////
//		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		jsUtil.scrollToElemet(executiveProfile); // by using javascript scroll moved to the element and then clicked.
//		Thread.sleep(2000);
//		executiveProfile.click();
//		
		
	// 1.fetch the window ids for parent and child windows
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator(); //it will be just above the  segment so if we use .next() it move to first segment parent and then child segment
		
		String parentWindowId = it.next(); // move to the first segment and fetch the parent window id
		System.out.println("Parent window ID is:" + parentWindowId);

		String childWindowId = it.next();
		System.out.println("Child window ID is: " + childWindowId);

		//2. switch to window 
		driver.switchTo().window(childWindowId);
		String childPageTitle=	driver.getTitle();
		System.out.println(childPageTitle);
		Thread.sleep(3000);
		driver.close(); // close the child window and driver lost so again back to the parent window
		driver.switchTo().window(parentWindowId);
	String parentPageTitle=	driver.getTitle();
		System.out.println(parentPageTitle);
		driver.quit();
		
		
	}
}
