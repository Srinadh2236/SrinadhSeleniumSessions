package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverAssign {
	
	public static void drivr(String str) {
		
		WebDriver driver = null;
		
		switch (str.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
//		case "Safari":
//			driver = new SafariDriver();
//			break;

		default:
			System.out.println("Please pass the valid Browser:"+str.trim().toLowerCase());
			throw new RuntimeException("================Invalid Browser================");
		
		}
		
		driver.get("https://www.abc.com");
		
		String title =driver.getTitle();
		
		System.out.println(title);
		
		if (title.equals("ABC Network - ABC.com")) {
			
			System.out.println("Correct title---Pass: "+str.trim().toLowerCase());
		}
		else
		{
			System.out.println("Incorrect title----Fail: "+str);
		}
		
		
		driver.quit();
		
	}
	
	public static void main(String[] args) {

		     drivr("chrome ");
		     drivr(" EDGE");
		     drivr(" Firefox");
		     
		    // drivr("chome");// Invalid entry
		
		
		
	}

}
