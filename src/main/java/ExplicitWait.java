import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		//dynamic wait
		//2.1 	implicity wait
		//2.2   explicity wait
					//2.2.a:WebDriverWait
					//2.2.b:fluentWait
	
		//explicity wait : i can wait for specific element
		
		//wait(I)  until();-------FulentWait(C) until(){}+individual methods (){}--- extends--WebDriverWait(C)--no methods
									//parent-----------------------------------------extends--child
		
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		By emailId= By.id("input-email");
		By password =By.id("input-password");
		By loginBtn=By.xpath("//input[@value='Login']");
		
		
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10)); //10sec appliled for only one element
//		WebElement email_ele=	wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//		email_ele.sendKeys("Naveen@gmail.com");
//		driver.findElement(password).sendKeys("Naveen@123");
//		driver.findElement(loginBtn).click();
		
		
//				waitForElementPresence(emailId, 10).sendKeys("NaveenAuto@gmail.com");
//				getElement(password).sendKeys("Naveen@12333");
//				getElement(loginBtn).click();
//				
			waitForElementVisible(emailId, 10).sendKeys("Naveen@gmail.com");
			getElement(password).sendKeys("naveen@233");
			getElement(loginBtn).click();
	
	}
	
	static WebDriver driver;
	/**
	 * * An expectation for checking that an element is present on the DOM of a page. (Dom will be load first) 
	 * This does not necessarily mean that the element is visible on the page.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementPresence(By locator, int timeOut) {

		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			
	}
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible on the page also.
	 * Visibility means that the element is not only displayed but also has 
	 * a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
