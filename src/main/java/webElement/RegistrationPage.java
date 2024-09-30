package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.network.Header;

import seleniumSessions.BrowserUtil;

public class RegistrationPage {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil bUtil = new BrowserUtil();
		WebDriver driver = bUtil.launchBrowser("firefox");
		bUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		ElementUtil eUtil = new ElementUtil(driver);

		// Registration header 
		//tagName
		By head = By.tagName("h1");
		String header = eUtil.captureText(head);
		
		//Success header
		By captureHeader = By.tagName("h1");
	
		// Id
		By regFname = By.id("input-firstname");
		By regLname = By.id("input-lastname");
		// xpath
		By regEmailID = By.xpath("//*[@id=\"input-email\"]");
		// cssSelector
		By regTelephone = By.cssSelector("#input-telephone");
		By regContinue = By.cssSelector("input.btn");
		// Name
		By regPassword = By.name("password");
		By regConPassword = By.name("confirm");
		By regCheckBox = By.name("agree");

		if (header.equals("Register Account")) {

			System.out.println("header Success");
			eUtil.doSendkeys(regFname, "Srinad");
			eUtil.doSendkeys(regLname, "Maruboina");

			eUtil.doSendkeys(regEmailID, "srinad7@gmail.com");
			eUtil.doSendkeys(regTelephone, "9876543210");

			eUtil.doSendkeys(regPassword, "Srinadh@1234");
			eUtil.doSendkeys(regConPassword, "Srinadh@1234");
			eUtil.doClick(regCheckBox);

			Thread.sleep(2000);
			eUtil.doClick(regContinue);

			String SuccessHeader = eUtil.captureText(captureHeader);

			if (SuccessHeader.equals("Your Account Has Been Created!")) {

				System.out.println("Account Successfully created......");

			} else {
				
				System.out.println("Registration failed......");
			}

		} else {
			System.out.println(" Header Fail");
		}

	}

}
