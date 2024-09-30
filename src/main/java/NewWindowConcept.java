import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		driver.switchTo().newWindow(WindowType.TAB);// it will open new blank tab and driver will be on new tab 
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login"); 
		
		driver.switchTo().newWindow(WindowType.WINDOW);// it will open new window and opend url
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		driver.close(); //new window closed.
		
	String parentWindowID=	driver.getWindowHandle();
	driver.switchTo().window(parentWindowID);
	String parentWindowTitle =driver.getTitle();
	System.out.println(parentWindowTitle);
	
	
	}

}
