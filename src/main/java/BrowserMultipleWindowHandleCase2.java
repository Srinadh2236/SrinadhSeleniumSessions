import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserMultipleWindowHandleCase2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");

		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		WebElement csSupport = driver.findElement(By.xpath("//footer//a[contains(text(),'CS & Support')]"));
		WebElement pressReleases = driver.findElement(By.xpath("//footer//a[contains(text(),'Press Releases')]"));
		WebElement newsArticles = driver.findElement(By.xpath("//footer//a[contains(text(),'News Articles')]"));

		Actions action = new Actions(driver);
		// child tab 1:
		action.click(executiveProfile).perform();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String PatentWindowID = it.next();
		String exeWindowID = it.next();

		driver.switchTo().window(exeWindowID);
		String exePageTitle = driver.getTitle();
		System.out.println(exePageTitle);
		Thread.sleep(1500);
		driver.close();
		driver.switchTo().window(PatentWindowID);
		// child tab 2:
		action.click(csSupport).perform();
		Set<String> cshandle = driver.getWindowHandles();

		Iterator<String> csIt = cshandle.iterator();
		String csParentWindowID = csIt.next();
		String csWindowID = csIt.next();
		driver.switchTo().window(csWindowID);
		System.out.println("CS support title: " + driver.getTitle());
		driver.close();

		driver.switchTo().window(csParentWindowID);
       //childwindow 3:
		action.click(pressReleases).perform();
		Set<String> pressHandles = driver.getWindowHandles();
		Iterator<String> pressIterator = pressHandles.iterator();
		String pressParentWindowID = pressIterator.next();
		String pressReleaseWindowID = pressIterator.next();

		driver.switchTo().window(pressReleaseWindowID);
		System.out.println("PressRelease Window title:" + driver.getTitle());
		driver.close();
		driver.switchTo().window(pressParentWindowID);
		
		//child window 4:
		action.click(newsArticles).perform();
		Set <String> newHandles =driver.getWindowHandles();
		 Iterator<String>NewsIterator=   newHandles.iterator();
		 String newsParentWindowID=	 NewsIterator.next();
		 String newsWindowID =NewsIterator.next();
		 
		 driver.switchTo().window(newsWindowID);
		 System.out.println(" News Article title :" +driver.getTitle());
		 driver.close();
		 driver.switchTo().window(newsParentWindowID);
		 

	}

}
