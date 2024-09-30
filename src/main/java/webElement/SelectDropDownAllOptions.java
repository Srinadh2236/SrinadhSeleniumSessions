package webElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		// By country =By.id("Form_getForm_Country");
		By country = By.xpath("//select[@name='Country']");
//		Select select = new Select(driver.findElement(country)); // method implemented.
//
//		List<WebElement> countList = select.getOptions();
//		System.out.println(countList.size());
//		for (WebElement e : countList) {
//			String text = e.getText();
//			System.out.println(text);
////			if(text.contains("India")) {
////				e.click();
////				break;
////			}
//		}
		
		
	//List<String> listOptions=	getDropDownOptionsTextList(country);
		//single country validation
	if(getDropDownOptionsTextList(country).contains("India")) {
		System.out.println("PASS");
	}
	
	//multiple countries validations:Must be there in list so at time check like this
	List<String>expectedCoutryList=Arrays.asList("India","Brazil","Austria");
	
	if(getDropDownOptionsTextList(country).containsAll(expectedCoutryList)) {
		System.out.println("PASS");
	}
	}

	static WebDriver driver;

	public static WebElement getElement(By loactor) {
		return driver.findElement(loactor);
	}

	public static List<String> getDropDownOptionsTextList(By loactor) {

		Select select = new Select(getElement(loactor));

		List<WebElement> countList = select.getOptions();
		List<String> optionsTextList = new ArrayList<String>();
		System.out.println(countList.size());
		for (WebElement e : countList) {
			String text = e.getText();
			optionsTextList.add(text);

		}
		return optionsTextList;
	}
}
