package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetechTextfilesValues {

	public static void main(String[] args) {
		
		//Entering the values into the text filed and the capture the same values what your entred.

		// capture what i have entred.
		 driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		driver.findElement(By.id("input-email")).sendKeys("Srinad@gmail.com");
//		String textEmail = driver.findElement(By.id("input-email")).getAttribute("value");
//		System.out.println(textEmail);
//
//		driver.findElement(By.id("input-password")).sendKeys("Srinad@1234");
//		String textPwd = driver.findElement(By.id("input-password")).getAttribute("value");
//		System.out.println(textPwd);
//		
		
	By email=	By.id("input-email");
	By pwd=	By.id("input-password");
		doSendkeys(email, "Srinad@gmail.com");
		doSendkeys(pwd, "srinad@1234");
		String v1=doElementGetattribute(email, "value");
		String v2=doElementGetattribute(pwd, "value");
	By login =By.linkText("Login");
	System.out.println(doElementGetattribute(login, "href"));

		System.out.println(v1);
		System.out.println(v2);
	}
	
	static WebDriver driver;
	
	public static String doElementGetattribute(By locator,String attri) {
		
		return getElement(locator).getAttribute(attri);
	}
	
	public  static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	public static void doSendkeys(By locator, String value) {

		getElement(locator).sendKeys(value);
	}

	
	//creating the webElements
		//WE
		//Wes
	//Actions
		//text:getText();
		//to fill the data:sendkeys();
		//to click:click();
		//isDisplayed,isEnabled,isSelected
		//attribute:getAttribute();
	
	

}
