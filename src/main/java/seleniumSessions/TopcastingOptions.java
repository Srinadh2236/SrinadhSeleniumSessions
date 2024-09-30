package seleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.firefox.FirefoxDriver;import org.openqa.selenium.remote.RemoteWebDriver;

public class TopcastingOptions {

	public static void main(String[] args) {

		//*****IMP
		//2  and 3 topCasting are best and valid topCasting 
			//2. for local execution 
		    //3. remote machines executions
		

		//1.
		//ChromeDriver driver = new ChromeDriver();
		
		//2.top casting:Recommended and valid ----- browser launch in local machine
//		WebDriver driver = new ChromeDriver();
//				  driver = new ChromeDriver();
//		
		//3.recommended and valid: remote machine(cloud ,AWS, server,machine)--GRID
		//WebDriver driver = new RemoteWebDriver( RemoteAddress, capabilities);
		
		//4.valid but not recommended
//		SearchContext driver = new ChromeDriver();
//		driver.findElement(null);
//		driver.findElements(null); --- only two methods can access
//		
		//5.recommended and valid
		//RemoteWebDriver driver = new ChromeDriver();
						//	driver = new FirefoxDriver();
							
		// every method can access in this top casting
		
		//6.not valid : only can access chromium methods
		//ChromiumDriver driver = new ChromeDriver();
		
		//7.valid but not recommended.
		//SearchContext driver =  new RemoteWebDriver( RemoteAddress, capabilities);
		
		
		
	}

}
