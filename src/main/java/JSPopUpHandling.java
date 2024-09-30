import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPopUpHandling {

	public static void main(String[] args) throws InterruptedException {

		// Js alerts are 3 types
		// 1.alert
		// 2.confirm
		// 3.prompt

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		1.alert:
//		By jsAlert = By.xpath("//button[text()='Click for JS Alert']");
//
//		driver.findElement(jsAlert).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//
//		String text = alert.getText();
//		System.out.println(text);
//		
//		//clicking on ok alert
//		alert.accept();//it means click on OK;
//		//alert.dismiss(); // it will cancel the popup;

//		2.JS confirm: ex:payment gateway method are asking are you sure want do payment popUp will come
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		//alert.accept(); //click on OK
//		alert.dismiss(); //click on cancel
//		
		// 3.PROMPT:
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click(); // NoAlertPresentException: no such alert if no popUP
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Naveen automations labs");
		Thread.sleep(2000);
		alert.accept();
		// alert.dismiss();
	}

}
