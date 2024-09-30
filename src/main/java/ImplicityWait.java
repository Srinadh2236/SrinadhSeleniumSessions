import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWait {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //selenium 3.x its deprecated from selenium
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
		
		// there are global waits:
		//it will applied on every element 10sec wait by default
		// it cant be applied for specific web elements
		// it cant be applied for non webElements :title ,url,windows,popup's
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("Naveen@gmail.com");// it will wait for 10sec
		// 10sec :2 sec :2sec
		// 10sec :12 sec : noSuchElementException time Out
		// 10 sec : 5 sec :5 sec
		
		driver.findElement(By.id("input-password")).sendKeys("naveen@123");// it will wait for 10sec
		driver.findElement(By.xpath("//input[@value='Login']")).click();// it will wait for 10sec 
		
		//home page:20 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//20 sec
		
		
		//again going to login page:10sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//10sec
		
		//registerPage:5sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//5sec


		

		
		
		
		

	}

}
