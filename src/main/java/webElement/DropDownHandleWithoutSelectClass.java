package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleWithoutSelectClass {

	public static void main(String[] args) {
		//Interview question.
		//get all options using select and with out select
		//select a country(India)
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");

		By country = By.xpath("//select[@id='Form_getForm_Country']/option");

//		List<WebElement> optionsList = driver.findElements(country);    /// rough work
//
//		for (WebElement e : optionsList) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.contains("India")) {
//				e.click();
//				break;
//			}
//
//		}
		slectDropDownValue(country, "Brazil");
	}
	
	static WebDriver driver ;
	public static void slectDropDownValue(By loactor,String value) {
		
		List<WebElement> optionsList = driver.findElements(loactor);

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(value)) {
				e.click();
				break;
			}

		}
	}

}
