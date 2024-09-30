import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElements {

	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//wait for all footers
		
		By footer= By.xpath("//footer//div//ul/li");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> footerList=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footer));
	//An expectation for checking that all elements present on the web page that match the locator are visible.
		//Visibility means that the elements are not only displayed but also have a height and width that is greater than 0.

		System.out.println(footerList.size());
	}
	static WebDriver driver;
	
    public static List<WebElement> waitForElementsVisible(By locator, int timeOut) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
    return	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }
}
