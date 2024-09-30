import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		//click one img
		driver.findElement(By.cssSelector(".details__form-image img")).click();
		
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Naveen automations labs");
		
		//need to come out of iframe
		driver.switchTo().defaultContent();
		String header=	driver.findElement(By.cssSelector(".details__form-preview-title")).getText();
	
	System.out.println(header);
	}

}
