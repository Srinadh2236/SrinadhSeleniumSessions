package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//****
		    //get and navigate().to both are same to method calling the get(URL) method only.
		
		

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

		Thread.sleep(1000); // pause 1sec
		driver.navigate().to("https://www.amazon.com");// both are same.
		//driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());


		Thread.sleep(1000);

		driver.navigate().back();// back arrow to go back google.
		System.out.println(driver.getTitle());


		Thread.sleep(1000);

		driver.navigate().forward();
		System.out.println(driver.getTitle());


		Thread.sleep(1000);

		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		driver.navigate().refresh();// dnt use refersh 
		
		driver.quit();
		
		
	}

}
