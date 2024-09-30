package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalTextFields {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		List<WebElement> textFieldlist = driver.findElements(By.className("form-control"));

		int textFiledCount = textFieldlist.size();
		System.out.println(textFiledCount);

		for(WebElement e:textFieldlist) {// print the text fileds placeholder text means in text box suggetion to enter text need to capture
			String text =e.getAttribute("placeholder");
			System.out.println(text);
		}
		
		
	}

}
