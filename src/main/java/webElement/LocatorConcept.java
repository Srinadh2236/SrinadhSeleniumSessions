package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {

		//locators in selenium : to identifying the specific elements
		
		WebDriver	driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//1.ID:is an attribute :unique
//		driver.findElement(By.id("input-firstname")).sendKeys("Srinad");
//		driver.findElement(By.id("input-lastname")).sendKeys("automation");
//		
		//2.name: is an attribute  can be duplicate
//		driver.findElement(By.name("firstname")).sendKeys("Srinad");
		
		//3.ClassName: is an attribute , can be duplicate
//		driver.findElement(By.className("form-control")).sendKeys("Srinad");
		
		//4.xpath: is not attribute :address of the element  in DOM
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Srinadddddddddd");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("automation");
		//how to find xpath:inspect select element and go to the HTML code perticular element right click on it copy and copy the xpath.
		
		
		//5 cssSelector:it is not attribute 
		   //CSS:cascaded style sheet
		//how to find cssSelector:inspect select element and go to the HTML code perticular element right click on it copy and copy the selector.
		
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("ssrinadddd");
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Maruboina");
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		
		//6.linkText:only for links it can be duplicate
//		driver.findElement(By.linkText("Login")).click();
//		driver.findElement(By.linkText("Forgotten Password")).click();
		
		//7.partial text links:only for links it can be duplicate
//		driver.findElement(By.partialLinkText("Log")).click();// here im entering partial text ( half text).
//		driver.findElement(By.partialLinkText("Reg")).click();

		//8.tagName:
	String header=	driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
		if(header.equals("Register Account")) {
			System.out.println("Pass");
		}else {
			System.out.println("fail");
		}
	}

}
