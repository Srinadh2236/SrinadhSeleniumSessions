package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		List<WebElement> LanguageList =driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		System.out.println(LanguageList.size());
		
		for(WebElement e:LanguageList) {
		//System.out.println(e.getAttribute("href")); //links 
	String lanNames=e.getText();
		if(lanNames.contains("తెలుగు")) {
			e.click();
			break;
		}
		}
		
	}

}
