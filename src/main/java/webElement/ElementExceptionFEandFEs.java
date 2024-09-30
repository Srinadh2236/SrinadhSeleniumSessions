package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementExceptionFEandFEs {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By logo = By.className("img-responsive11111"); //is not correct so that 
		
		//driver.findElement(logo).click();//NoSuchElementException 
		
		List<WebElement> logos =driver.findElements(logo); //returns blank list
		System.out.println(logos.size());
		

	}

}
