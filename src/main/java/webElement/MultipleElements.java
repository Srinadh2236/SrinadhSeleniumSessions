package webElement;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) {

		// single Element--->FE--WebElement
		// Multiple Element---FEs--- List<WebElement>

		// get total links count in login page

		// print the text of each link and ignore the blank text

		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		List<WebElement> listLink = driver.findElements(By.tagName("a"));

		int totalLinks = listLink.size();
		System.out.println("totalLinks available in login page: " + totalLinks);
		int count = 0;
		for (int i = 0; i < totalLinks; i++) {

			String text = listLink.get(i).getText();
			if (text.length() != 0) {

				System.out.println(i + "=" + text);
				count++;
			}

		}
		
		System.out.println("total no of links non blank text :"+count);
		int count2=0;
		count2=totalLinks-count;
		System.out.println("total no of links  blank text :"+count2);
		
		//for each loop
		
		System.out.println("-----------------------------------");
		
		
		for (WebElement e:listLink) {
			String text =e.getText();
			if (text.length() != 0) {

				System.out.println(text);
				
			}
			
		}

	}

}
