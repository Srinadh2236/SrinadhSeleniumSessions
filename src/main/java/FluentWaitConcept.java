import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {

	public static void main(String[] args) {


		
			//wait(Until();)---->fluentWait(c):until(){} + individual methods(){};
									//  + WebDriverWait(C) : no methods
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
//		Wait<WebDriver>   wait = new FluentWait<WebDriver>(driver)
//								.withTimeout(Duration.ofSeconds(10))
//								.pollingEvery(Duration.ofSeconds(2))
//								.ignoring(NoSuchElementException.class)
//								.withMessage("============Element is not found=======");
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Form_getForm_Name"))).sendKeys("Naveen");
		
		
		//webDrverwait with fluent wait features   both are same (child inheritance the methods form parent the same way)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.ignoring(ElementNotInteractableException.class)
				.withMessage("=========element is not found=========");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Form_getForm_Name"))).sendKeys("Naveen");
		
		
	}

}
