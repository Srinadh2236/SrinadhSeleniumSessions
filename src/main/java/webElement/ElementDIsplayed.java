package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDIsplayed {

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// I want to check Logo displayed or not

//		Boolean flag = driver.findElement(By.className("img-responsive12")).isDisplayed();
//		System.out.println(flag);
//
//		if (flag) {
//			System.out.println("Logo present");
//		} else {
//			System.out.println("Logo Not present");
//		}

//		By logo=By.className("img-responsive");
//		
//		Boolean flg=isElementDisplayed(logo);
//		
//		System.out.println(flg);
//		
		By logo = By.className("img-responsive12");// which are not present in clasname wrong it should be false;

		Boolean flg = isElementDisplayed(logo);

		System.out.println(flg);

		if (flg) {
			System.out.println("Logo present");
		} else {
			System.out.println("Logo Not present");
		}

	}

	static WebDriver driver;

	public static boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("Element is not Displayed " + locator);
			return false;
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
