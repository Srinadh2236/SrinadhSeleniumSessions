import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForWindowTab {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		WebElement executiveProfile=	driver.findElement(By.xpath("(//a[contains(text(),'Executive Profile')])[3]"));
	
		Actions act =  new Actions(driver);
		act.click(executiveProfile).perform();
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	boolean flag=	wait.until(ExpectedConditions.numberOfWindowsToBe(2));// expected windows is should be two one parent and other one is child
		
	System.out.println(flag);
	
	
	
	}

}
