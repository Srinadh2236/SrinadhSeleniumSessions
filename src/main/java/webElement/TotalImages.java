package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		List<WebElement> listImages = driver.findElements(By.tagName("img"));

		int count = listImages.size();
		System.out.println("total Imaged in flipkart home page:"+count);
		
		for(WebElement e1:listImages) {
		String srcValue=	e1.getAttribute("src");
		System.out.println(srcValue);

		// capture all links
		// print the link text and href values:Web Scraping 

		List<WebElement> Linklist = driver.findElements(By.tagName("a"));// in array list it will store the all data 
		
		System.out.println(Linklist.size());// size of array list means count of array list.

		for (WebElement e : Linklist) { // printing the list of array one bye one
			String hrefValue = e.getAttribute("href");// getaattribute is will give links 
			String text = e.getText();// will give links of the  only text 
			System.out.println(text + "  :  " + hrefValue);

		}
	}

}}
