package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHangLink {

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/en/30-day-free-trial");

		By country = By.id("Form_getForm_Country");

		WebElement countryEle = driver.findElement(country);

		Select select = new Select(countryEle);

//		
//	select.selectByVisibleText("India");
//	select.selectByIndex(5);//index used when it drop down is constant like months and weeks and days
//	select.selectByValue("India");//some times value could be different in inspect code .ind is value and visible txt is India;
//	

//		selectDropDownByVisbleText(country, "India");
//		selectDropDownByIndex(country, 5);
//		selectDropDownByValue(country, "Brazil");
//		

//		List<WebElement> optionsList = select.getOptions();
//		System.out.println(optionsList.size());

		int count = getDropDownOptionsCount(country);
		System.out.println(count);
	}

	static WebDriver driver;

	public static int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));

		return select.getOptions().size();

	}

	public static void selectDropDownByVisbleText(By locator, String visibleTxt) {

		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleTxt);

	}

	public static void selectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void selectDropDownByValue(By locator, String value) {

		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);

	}

	public static WebElement getElement(By loactor) {
		return driver.findElement(loactor);
	}

}
