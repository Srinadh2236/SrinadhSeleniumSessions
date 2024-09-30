package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckFindELementPresent {

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By logo = By.className("img-responsive");
		
		By rightPanelLinks=	By.xpath("//div[@class='list-group']/a");
		
		By Naveen =By.id("test");//dummy locator i dont want to presenet 

		By forgotPwdLink=By.linkText("Forgotten Password");
		
		int logoCount = driver.findElements(logo).size();
		// System.out.println(logoCount);
//
//		if (logoCount == 1) {
//			System.out.println("logo is present");
//
//		} else {
//			System.out.println("logo is not present");
//		}

		
		System.out.println(isElementPresent(logo));
		
		System.out.println(isElementPresent(logo, 1));
		System.out.println(isElementPresent(logo, logoCount));
		
		System.out.println(isElementPresent(rightPanelLinks, 13));
		System.out.println(getElemetnsCunt(rightPanelLinks));
		
		System.out.println(isElementPresent(Naveen, 0));//element should not be there so expectedcount is zero it reeturn true.
		
	System.out.println(isElementPresentMultipleTimes(forgotPwdLink));//should be there more than one so it return true
		
	}

	static WebDriver driver;
	
	public static boolean isElementNotPresent(By locator) {
	if(	getElemetnsCunt(locator)==0) {
		return true;
	}
	else {
		return false;
	}
	}
	public static boolean isElementPresentMultipleTimes(By locator) {//should be there more than one so it return true
		
		if(	getElemetnsCunt(locator)>1) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static boolean isElementPresent(By locator) {
		// getElemetnsCunt(locator); calling count method retuns the count based on
		// checking .
		if (getElemetnsCunt(locator) == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isElementPresent(By locator, int expectedElementCount) {
		if (getElemetnsCunt(locator) == expectedElementCount) {
			return true;
		} else {
			return false;
		}
	}
	public static List<WebElement> getElements(By loactor) {
		return driver.findElements(loactor);
	}

	public static int getElemetnsCunt(By locator) {
		return getElements(locator).size();
	}

}
