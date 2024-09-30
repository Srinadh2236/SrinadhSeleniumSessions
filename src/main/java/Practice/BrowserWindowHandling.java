package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
	String parentWindowID=	driver.getWindowHandle();
	
	driver.switchTo().newWindow(WindowType.WINDOW);// blank windwow will be open and switched also
	driver.get("https://google.com");    //entered url also 
	driver.close();						// closed
	driver.switchTo().window(parentWindowID); // again back to parent driver
	driver.switchTo().newWindow(WindowType.TAB); // created new blank tab
	driver.get("https://www.abc.com");			// entered abc.com url
	driver.close();
	driver.switchTo().window(parentWindowID);   // back to the parent window the driver
	
	
		
	}

}
