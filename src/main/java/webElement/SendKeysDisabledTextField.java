package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysDisabledTextField {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		//findElement(By.id("pass")).sendKeys("Naveen");//element cant intract because it is in disabled state
		 //ElementNotInteractableException: element not interactable
		
		
		driver.findElement(By.id("pass")).click();//no exception 
		
		
	}

}
