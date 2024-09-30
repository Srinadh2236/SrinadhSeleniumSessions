package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsActionsPratice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	List<WebElement> linkList=	driver.findElements(By.tagName("a"));
	
	int s =linkList.size();
	System.out.println(s);
	
	for(WebElement e:linkList) {
		String links =e.getAttribute("href");
		String text =e.getText();
		System.out.println(text+" = "+links);
		
		
		
	}
		
	}

}
