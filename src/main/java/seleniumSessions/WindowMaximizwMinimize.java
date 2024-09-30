package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMaximizwMinimize {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		// i want to maximize thr window
		driver.manage().window().maximize();
		
		// now i want full screen
		
		driver.manage().window().fullscreen();
		
	// now i want to minimize
		
		driver.manage().window().minimize();
		
		
		
		
		
	}

}
