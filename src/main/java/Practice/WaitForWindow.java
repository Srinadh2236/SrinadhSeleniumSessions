package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		Actions act = new Actions(driver);
		act.click(driver.findElement(By.linkText("Executive Profile"))).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean flag=	wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		System.out.println(flag);
		
		
	}

}
