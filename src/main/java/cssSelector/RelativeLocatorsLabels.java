package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsLabels {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		WebElement label = driver.findElement(By.xpath("//label[text()='E-Mail Address']")); // ---- base element
		driver.findElement(with(By.id("input-email")).below(label)).sendKeys("naveen@gmail.com");

		WebElement text = driver.findElement(By.id("input-email")); // ---------base element

		driver.findElement(with(By.id("input-password")).below(text)).sendKeys("Naveen@12300"); // -----by using bellow
																								// element entered

	}

}
