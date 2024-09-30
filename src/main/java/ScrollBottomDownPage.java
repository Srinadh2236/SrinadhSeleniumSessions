import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBottomDownPage {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();

	driver.get("https://www.orangehrm.com/en/30-day-free-trial");

		JavaScriptUtil jutil = new JavaScriptUtil(driver);
		jutil.scrollBottomPage();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Executive Profile")).click();
		
		
	}

}
