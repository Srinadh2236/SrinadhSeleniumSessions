import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessConcept {

	public static void main(String[] args) {

		// --headless means:no browser activity.. testing happen behind the scene
		// no browser visible
		// faster

		// chrome:ChromeOptions
		// Firefox:FirefoxOptions
		// Edge:EdgeOptions
		
// Firefox:FirefoxOptions		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		WebDriver driver = new FirefoxDriver(fo);
	
// Edge:EdgeOptions	
//		EdgeOptions eo= new EdgeOptions();
//		//eo.addArguments("--headless");
//		eo.addArguments("--Inprivate");
//		WebDriver driver = new EdgeDriver(eo);
		
//		// chrome:ChromeOptions:::::	 // these are switches --headless and --incognito are switches	
				ChromeOptions co = new ChromeOptions();
				//co.addArguments("--headless"); --- headless mode means no browser not open 
				co.addArguments("--incognito");
				WebDriver driver = new ChromeDriver(co);

		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();

		System.out.println("title of the login page  :" + driver.getTitle());

		driver.findElement(By.linkText("Forgotten Password")).click();
		System.out.println("forgot password page title :" + driver.getTitle());
		
	}

}
