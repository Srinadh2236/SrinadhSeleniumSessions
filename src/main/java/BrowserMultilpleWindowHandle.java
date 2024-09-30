import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrowserMultilpleWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		String parentWindowID = driver.getWindowHandle();

		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		WebElement csSupport = driver.findElement(By.xpath("//footer//a[contains(text(),'CS & Support')]"));
		WebElement pressReleases = driver.findElement(By.xpath("//footer//a[contains(text(),'Press Releases')]"));
		WebElement newsArticles = driver.findElement(By.xpath("//footer//a[contains(text(),'News Articles')]"));

		Actions actions = new Actions(driver);
		actions.click(executiveProfile).perform();
		actions.click(newsArticles).perform();
		actions.click(csSupport).perform();
		actions.click(pressReleases).perform();

		// 1.fetch window ids
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		while (it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			if (!windowID.equals(parentWindowID)) { // here i dnt wnat to close my parent window want to contine my work
				driver.close();
			}
			Thread.sleep(2000);
		}
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window title:" + driver.getTitle()); // to confirm wheather driver came to parent
																		// window id.
	}
}
