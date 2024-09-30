package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NullWithSendkeys {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//driver.findElement(By.id("input-email")).sendKeys(null);
		//IllegalArgumentException: Keys to send should be a not null CharSequence
		
		String len ="";
		System.out.println(len.length());
		driver.findElement(By.id("input-email")).sendKeys(len); //but error not comming
		//IllegalArgumentException: Keys to send should be a not null CharSequence

		
		
	}

}
