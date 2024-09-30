package seleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverBasics {

	public static void main(String[] args) {
	
// check google title is correct or not
		
		//Automation steps + validation === is called automation testing
		
		//1.open Browser
		//2.enter the URL
		//3.Get the title
		     //:test case is validating the title correct or not.
			//1.act/exp :validation / check point
		//4.close browser
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91996\\.cache\\selenium\\chromedriver\\win64\\Chromedriver.exe");
		
		//1.open Browser
		
		ChromeDriver driver = new ChromeDriver();
		  //FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		//SafariDriver driver = new SafariDriver();
		
		//2.enter the URL
		
		driver.get("https://www.Google.com");
		
		//3.Get the title
		
		String title=	driver.getTitle();
		
		System.out.println(title);
		
		//test case for title correct or not:
		
				//1.act/exp :validation / check point
		
		if(title.equals("Google")) {
			System.out.println("Correct title ---PASS");
		}
		else{
			System.out.println(" in Correct title ---FAIL");
		}
		
		
	
		//4.close browser
	//driver.quit();
	
		
		
	}

}
