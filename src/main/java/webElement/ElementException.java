package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.id("input-email12")).sendKeys("Srinad@gmail.com");//Id not valid so it will throw exception
			// noSuchElemtnPrestn
		
	}

}
