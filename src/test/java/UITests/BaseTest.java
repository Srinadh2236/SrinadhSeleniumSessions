package UITests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import webElement.ElementUtil;
import webElement.FrameWorkException;

public class BaseTest {
	WebDriver driver;
	ChromeOptions co;
	ElementUtil eUtil;

	@BeforeTest
	public void setUp() {
		 co= new ChromeOptions();
		driver = new ChromeDriver(co);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public boolean doSearch(By searchField, By suggestions, String SourceFrom)
			throws InterruptedException {

		// driver.findElement(searchField).sendKeys(searchKey);
		boolean flag = false;
		doSendkeys(searchField, SourceFrom);

		Thread.sleep(3000);

		// List<WebElement> SuggList = driver.findElements(suggestions);
		List<WebElement> suggList = getElements(suggestions);
		int totalSuggestions = suggList.size();

		if (totalSuggestions == 0) {
			System.out.println("No suggestions found......");
			throw new FrameWorkException("==================No Suggestions Found============");
		}

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(SourceFrom)) {
				e.click();
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(SourceFrom + " is found");
			return true;
		} else {
			System.out.println(SourceFrom + " is not found");
			return false;
		}

	}
	
	public void doSendkeys(By locator, String value) {

		getElement(locator).sendKeys(value);
	}
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public WebElement getElement(By loactor) {
		return driver.findElement(loactor);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
