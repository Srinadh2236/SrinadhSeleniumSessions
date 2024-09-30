package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsAlerts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//
//		Alert alert = driver.switchTo().alert();
//
//		String alertText = alert.getText();
//		System.out.println(alertText);
//		alert.accept();// to accept the alert
		// alert.dismiss(); // to escape the alert/or cancel the alert

		// driver will come to the automatically come back the page.

//confirmation alert:
		//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		//
		//		Alert alert = driver.switchTo().alert();
		//		System.out.println(alert.getText());
		//		alert.accept();
		
//prompt alert:
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
			Alert alert=	driver.switchTo().alert();
			alert.sendKeys("admin");
			//alert.accept();
			alert.dismiss(); // it will cancel the alert
			
			// if alert is not there then it will throw the exception as:"noAlertPresentExcepton"
			
//Basic authentication:
			WebDriver driver = new ChromeDriver();
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			
			//admin:admin@ supply the in url username and passwords

			
//file upload:
			
			
			
	}

}
